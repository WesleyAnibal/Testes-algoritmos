package classeNquadrado;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class InsertionSortTest {
	InsertionSort sort;
	int[] V0;
	int[] V1;
	int[] V2;
	int[] V3;
	int[] V4;
	int[] V5;
	int[] V6;
	int[] V7;
	int[] V8;

	@Before
	public void test() {
		/*
		 * O algoritmo Insertion Sort,é da classe O(N²),no qual a cada interação
		 * o valor é colocado em seu local certo, de forma em que o valor é
		 * "arrastado" entre os outros valores até que encontre seu local
		 */
		this.sort = new InsertionSort();
		this.V0 = new int[] { 23, 3, 1, 6, 33, 2, 56, 5, 2 };
		this.V1 = new int[] { 2, 6, 9, 3, 5, -1, -4, -10 };
		this.V2 = new int[] { 5, 4, 3, 2, 1, 0 };
		this.V3 = new int[] { -3, -4, -1, -10, -2, -9 };
		this.V4 = new int[] { 4, 3, 5, 2, 3 };
		this.V5 = new int[] { 5, 3, 9, 9, 2 };
		this.V6 = new int[] {};
		this.V7 = new int[] { 2, 4, 2, 7, 5, 9, 8 };
		this.V8 = new int[5];

	}

	@Test
	public void insertionSortTest() {
		//Teste do Slide (EDA-04,slide 12)
		TesteSlide();
		// Teste para inteiros aleatorios
		testeSimples();
		// Teste para numeros ordenados de forma decrescente
		numerosInvertidos();
		// Teste para inteiros negativos
		numerosNegativos();
		// Teste para o menor numero do array duplicado
		menorNumeroDuplicado();
		// Teste para numeros entre o maior e o menor numero do array
		numerosCentroduplicados();
		// Teste para o maior numero do array duplicado
		maiorNumeroDuplicado();
		// Teste para array vazio
		arrayVazio();
		// Teste para array so instaciado com o tamanho, sem repassar valores
		semNumerosEspecificados();

	}

	private void TesteSlide() {
		sort.insertionSort(V0);
		assertEquals(Arrays.toString(V0), "[1, 2, 2, 3, 5, 6, 23, 33, 56]");
	}

	private void semNumerosEspecificados() {
		sort.insertionSort(V8);
		assertEquals(Arrays.toString(V8), "[0, 0, 0, 0, 0]");
	}

	private void menorNumeroDuplicado() {
		sort.insertionSort(V7);
		assertEquals(Arrays.toString(V7), "[2, 2, 4, 5, 7, 8, 9]");
	}

	private void testeSimples() {
		sort.insertionSort(V1);
		assertEquals(Arrays.toString(V1), "[-10, -4, -1, 2, 3, 5, 6, 9]");
	}

	private void arrayVazio() {
		sort.insertionSort(V6);
		assertEquals(Arrays.toString(V6), "[]");
	}

	private void maiorNumeroDuplicado() {
		sort.insertionSort(V5);
		assertEquals(Arrays.toString(V5), "[2, 3, 5, 9, 9]");
	}

	private void numerosCentroduplicados() {
		sort.insertionSort(V4);
		assertEquals(Arrays.toString(V4), "[2, 3, 3, 4, 5]");
	}

	private void numerosNegativos() {
		sort.insertionSort(V3);
		assertEquals(Arrays.toString(V3), "[-10, -9, -4, -3, -2, -1]");
	}

	private void numerosInvertidos() {
		sort.insertionSort(V2);
		assertEquals(Arrays.toString(V2), "[0, 1, 2, 3, 4, 5]");
	}
}
