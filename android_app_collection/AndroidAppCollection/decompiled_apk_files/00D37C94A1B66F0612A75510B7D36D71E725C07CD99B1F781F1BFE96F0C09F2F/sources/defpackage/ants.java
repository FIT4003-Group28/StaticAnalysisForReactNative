package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ants  reason: default package */
/* loaded from: classes.dex */
public final class ants {
    final long[] a;
    final long[] b;
    final long[] c;

    public ants() {
        this(new long[10], new long[10], new long[10]);
    }

    public ants(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ants antsVar, antr antrVar) {
        anue.a(antsVar.a, antrVar.a.a, antrVar.b);
        long[] jArr = antsVar.b;
        ants antsVar2 = antrVar.a;
        anue.a(jArr, antsVar2.b, antsVar2.c);
        anue.a(antsVar.c, antrVar.a.c, antrVar.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = this.c;
        int i = anue.a;
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        anue.d(jArr5, jArr4);
        anue.d(jArr14, jArr5);
        anue.d(jArr13, jArr14);
        anue.a(jArr6, jArr13, jArr4);
        anue.a(jArr7, jArr6, jArr5);
        anue.d(jArr13, jArr7);
        anue.a(jArr8, jArr13, jArr6);
        anue.d(jArr13, jArr8);
        anue.d(jArr14, jArr13);
        anue.d(jArr13, jArr14);
        anue.d(jArr14, jArr13);
        anue.d(jArr13, jArr14);
        anue.a(jArr9, jArr13, jArr8);
        anue.d(jArr13, jArr9);
        anue.d(jArr14, jArr13);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            anue.d(jArr13, jArr14);
            anue.d(jArr14, jArr13);
        }
        anue.a(jArr10, jArr14, jArr9);
        anue.d(jArr13, jArr10);
        anue.d(jArr14, jArr13);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            anue.d(jArr13, jArr14);
            anue.d(jArr14, jArr13);
        }
        anue.a(jArr13, jArr14, jArr10);
        anue.d(jArr14, jArr13);
        anue.d(jArr13, jArr14);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            anue.d(jArr14, jArr13);
            anue.d(jArr13, jArr14);
        }
        anue.a(jArr11, jArr13, jArr9);
        anue.d(jArr13, jArr11);
        anue.d(jArr14, jArr13);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            anue.d(jArr13, jArr14);
            anue.d(jArr14, jArr13);
        }
        anue.a(jArr12, jArr14, jArr11);
        anue.d(jArr14, jArr12);
        anue.d(jArr13, jArr14);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            anue.d(jArr14, jArr13);
            anue.d(jArr13, jArr14);
        }
        anue.a(jArr14, jArr13, jArr12);
        anue.d(jArr13, jArr14);
        anue.d(jArr14, jArr13);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            anue.d(jArr13, jArr14);
            anue.d(jArr14, jArr13);
        }
        anue.a(jArr13, jArr14, jArr11);
        anue.d(jArr14, jArr13);
        anue.d(jArr13, jArr14);
        anue.d(jArr14, jArr13);
        anue.d(jArr13, jArr14);
        anue.d(jArr14, jArr13);
        anue.a(jArr, jArr14, jArr7);
        anue.a(jArr2, this.a, jArr);
        anue.a(jArr3, this.b, jArr);
        byte[] g = anue.g(jArr3);
        g[31] = (byte) ((antu.a(jArr2) << 7) ^ g[31]);
        return g;
    }

    public ants(antr antrVar) {
        this();
        b(this, antrVar);
    }

    public ants(ants antsVar) {
        this.a = Arrays.copyOf(antsVar.a, 10);
        this.b = Arrays.copyOf(antsVar.b, 10);
        this.c = Arrays.copyOf(antsVar.c, 10);
    }
}
