package defpackage;
/* compiled from: PG */
/* renamed from: cver  reason: default package */
/* loaded from: classes5.dex */
final class cver implements degu<dcdc<cved>> {
    final /* synthetic */ boolean a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ cves c;

    public cver(cves cvesVar, boolean z, dcdc dcdcVar) {
        this.c = cvesVar;
        this.a = z;
        this.b = dcdcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cves cvesVar = this.c;
        cvesVar.e.a(this.a, cvesVar.e(this.b));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<cved> dcdcVar) {
        cves cvesVar = this.c;
        cvesVar.e.a(this.a, cvesVar.e(dcdcVar));
    }
}
