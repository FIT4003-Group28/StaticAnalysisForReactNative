package defpackage;
/* compiled from: PG */
/* renamed from: wgu  reason: default package */
/* loaded from: classes4.dex */
final class wgu implements afwa {
    final /* synthetic */ wgv a;

    public wgu(wgv wgvVar) {
        this.a = wgvVar;
    }

    @Override // defpackage.afwa
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.afwa
    public final void b() {
        wgv wgvVar = this.a;
        if (wgvVar.e) {
            wgvVar.e = false;
        }
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.a.c();
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage != null) {
            this.a.a.l(localizedMessage);
        }
    }
}
