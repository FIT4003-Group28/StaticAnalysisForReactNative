package defpackage;

import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
/* compiled from: PG */
/* renamed from: fqa  reason: default package */
/* loaded from: classes3.dex */
public final class fqa implements airt, ynl {
    final /* synthetic */ TrailerOverlayPresenter a;

    public fqa(TrailerOverlayPresenter trailerOverlayPresenter) {
        this.a = trailerOverlayPresenter;
    }

    public final void a(ahhs ahhsVar) {
        fpm fpmVar = this.a.d;
        fpmVar.b = ahhsVar.a();
        fpmVar.a = true;
        fpmVar.g();
        fpmVar.Y(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahhw ahhwVar) {
        if (ahhwVar.c() == aika.NEW) {
            this.a.d.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a.d.f(false);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.al().aa(new fpz(this, 1), dzq.s), airwVar.ap().I().G(aypa.a()).aa(new fpz(this), dzq.s), airwVar.G().b.aa(new fpz(this, 2), dzq.s)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhk ahhkVar = (ahhk) obj;
                c();
                return null;
            } else if (i == 1) {
                a((ahhs) obj);
                return null;
            } else if (i == 2) {
                b((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhk.class, ahhs.class, ahhw.class};
    }
}
