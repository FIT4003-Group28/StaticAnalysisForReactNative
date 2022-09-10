package defpackage;
/* compiled from: PG */
/* renamed from: caxn  reason: default package */
/* loaded from: classes4.dex */
public class caxn {
    public final boolean a;
    private final bvjj b;

    public caxn(bvjj bvjjVar, btvo btvoVar) {
        this.b = bvjjVar;
        dkyr ugcParameters = btvoVar.getUgcParameters();
        dzvx.b(ugcParameters, "clientParameters.ugcParameters");
        this.a = ugcParameters.bp() == 2;
    }

    public final boolean a(caxa caxaVar) {
        dzvx.c(caxaVar, "contributionType");
        return this.b.m(caxaVar.g, false);
    }

    public final void b(caxa caxaVar) {
        this.b.S(caxaVar.g, true);
    }
}
