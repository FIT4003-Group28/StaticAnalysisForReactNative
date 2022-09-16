package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: antr  reason: default package */
/* loaded from: classes.dex */
final class antr {
    final ants a;
    final long[] b;

    public antr() {
        this(new ants(), new long[10]);
    }

    public antr(ants antsVar, long[] jArr) {
        this.a = antsVar;
        this.b = jArr;
    }

    public antr(antr antrVar) {
        this.a = new ants(antrVar.a);
        this.b = Arrays.copyOf(antrVar.b, 10);
    }
}
