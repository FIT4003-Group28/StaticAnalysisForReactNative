package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: antp  reason: default package */
/* loaded from: classes.dex */
public class antp {
    final long[] a;
    final long[] b;
    final long[] c;

    antp() {
        this(new long[10], new long[10], new long[10]);
    }

    public antp(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(antp antpVar, int i) {
        antz.l(this.a, antpVar.a, i);
        antz.l(this.b, antpVar.b, i);
        antz.l(this.c, antpVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public antp(antp antpVar) {
        this.a = Arrays.copyOf(antpVar.a, 10);
        this.b = Arrays.copyOf(antpVar.b, 10);
        this.c = Arrays.copyOf(antpVar.c, 10);
    }
}
