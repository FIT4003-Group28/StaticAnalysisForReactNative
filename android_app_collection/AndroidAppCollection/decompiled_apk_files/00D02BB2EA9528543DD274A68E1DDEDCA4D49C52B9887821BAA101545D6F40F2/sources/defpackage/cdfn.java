package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdfn  reason: default package */
/* loaded from: classes4.dex */
public final class cdfn implements akey {
    final /* synthetic */ dwyd a;
    final /* synthetic */ cdfv b;
    final /* synthetic */ dspd c;
    final /* synthetic */ cdfs d;

    public cdfn(cdfs cdfsVar, dwyd dwydVar, cdfv cdfvVar, dspd dspdVar) {
        this.d = cdfsVar;
        this.a = dwydVar;
        this.b = cdfvVar;
        this.c = dspdVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        cdfs cdfsVar = this.d;
        if (!cdfsVar.a.aZ || cdfsVar.b.a().j() == null) {
            return;
        }
        this.d.c.p(false);
        this.d.f(this.a, this.b, this.c);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
