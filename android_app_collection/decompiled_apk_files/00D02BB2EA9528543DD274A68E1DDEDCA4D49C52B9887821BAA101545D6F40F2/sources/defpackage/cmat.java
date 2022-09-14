package defpackage;
/* compiled from: PG */
/* renamed from: cmat  reason: default package */
/* loaded from: classes5.dex */
final class cmat {
    public final int a;
    public final long b;

    private cmat(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static cmat a(cluk clukVar, cmnk cmnkVar) {
        clukVar.f(cmnkVar.a, 0, 8);
        cmnkVar.f(0);
        return new cmat(cmnkVar.r(), cmnkVar.q());
    }
}
