package defpackage;
/* compiled from: PG */
/* renamed from: aopf  reason: default package */
/* loaded from: classes.dex */
public final class aopf implements Comparable {
    final aopn a;
    public final int b;
    public final aosj c;
    public final boolean d;
    public final boolean e;

    public aopf(aopn aopnVar, int i, aosj aosjVar, boolean z, boolean z2) {
        this.a = aopnVar;
        this.b = i;
        this.c = aosjVar;
        this.d = z;
        this.e = z2;
    }

    public final aosk a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((aopf) obj).b;
    }
}
