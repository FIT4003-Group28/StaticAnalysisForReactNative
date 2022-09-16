package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: annk  reason: default package */
/* loaded from: classes2.dex */
public final class annk implements Runnable {
    final /* synthetic */ dnsc a;
    final /* synthetic */ anhu b;
    final /* synthetic */ String c;
    final /* synthetic */ annl d;

    public annk(annl annlVar, dnsc dnscVar, anhu anhuVar, String str) {
        this.d = annlVar;
        this.a = dnscVar;
        this.b = anhuVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dnic dnicVar = this.a.d;
        if (dnicVar == null) {
            dnicVar = dnic.f;
        }
        dnhz dnhzVar = dnicVar.c;
        if (dnhzVar == null) {
            dnhzVar = dnhz.e;
        }
        anhq p = anhy.p();
        p.m(dnhzVar.d);
        dnib dnibVar = dnhzVar.c;
        if (dnibVar == null) {
            dnibVar = dnib.e;
        }
        p.l(dnibVar.c);
        p.e(this.b);
        p.f(anhu.NO);
        p.g(anhw.DAY_VIEW);
        ((angm) p).d = this.c.isEmpty() ? dbpy.a : dbsg.i(this.c);
        this.d.a.D(p.k());
    }
}
