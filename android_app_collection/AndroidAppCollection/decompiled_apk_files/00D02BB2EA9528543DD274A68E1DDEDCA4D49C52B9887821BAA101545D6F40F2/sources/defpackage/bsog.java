package defpackage;
/* compiled from: PG */
/* renamed from: bsog  reason: default package */
/* loaded from: classes4.dex */
public final class bsog implements degu<ghs<brve>> {
    final /* synthetic */ int a;
    final /* synthetic */ bssu b;
    final /* synthetic */ brwk c;
    final /* synthetic */ bsoh d;

    public bsog(bsoh bsohVar, int i, bssu bssuVar, brwk brwkVar) {
        this.d = bsohVar;
        this.a = i;
        this.b = bssuVar;
        this.c = brwkVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.d.a.b(bsnp.e(this.a, this.b, this.c, dbpy.a));
        th.getCause();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(ghs<brve> ghsVar) {
        this.d.a.b(bsnp.e(this.a, this.b, this.c, dbsg.i(ghsVar)));
    }
}
