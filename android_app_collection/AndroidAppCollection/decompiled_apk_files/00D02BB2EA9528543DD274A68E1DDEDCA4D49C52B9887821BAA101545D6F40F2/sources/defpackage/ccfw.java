package defpackage;
/* compiled from: PG */
/* renamed from: ccfw  reason: default package */
/* loaded from: classes4.dex */
final class ccfw implements akey {
    final /* synthetic */ drry a;
    final /* synthetic */ deig b;
    final /* synthetic */ ccfx c;

    public ccfw(ccfx ccfxVar, drry drryVar, deig deigVar) {
        this.c = ccfxVar;
        this.a = drryVar;
        this.b = deigVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (!this.c.d.b() || this.c.e.j() == null) {
            return;
        }
        this.c.i.p(false);
        this.c.l(this.a, this.b);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
