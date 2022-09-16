package defpackage;

import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
/* compiled from: PG */
/* renamed from: ahuv  reason: default package */
/* loaded from: classes.dex */
public final class ahuv implements airt, ynl {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    public ahuv(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahgn ahgnVar) {
        ahvm ahvmVar;
        aijs aijsVar = aijs.DEFAULT;
        aika aikaVar = aika.NEW;
        int ordinal = ahgnVar.d().ordinal();
        if ((ordinal == 0 || ordinal == 2) && !this.a.h.isEmpty() && (ahvmVar = this.a.l) != null) {
            ahvmVar.f = ahgnVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahhw ahhwVar) {
        this.a.n = ahhwVar.e();
        this.a.o = ahhwVar.k();
        aijs aijsVar = aijs.DEFAULT;
        aika aikaVar = aika.NEW;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 0) {
            this.a.q();
        } else if (ordinal == 5) {
            this.a.p(ahhwVar.d(), ahhwVar.a());
        } else if (ordinal == 8) {
            this.a.p(ahhwVar.d(), ahhwVar.b());
        } else if (ordinal != 9) {
        } else {
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.a;
            if (!creatorEndscreenOverlayPresenter.i) {
                return;
            }
            creatorEndscreenOverlayPresenter.i = false;
            creatorEndscreenOverlayPresenter.s();
            this.a.l(false);
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 1024L)).h(aiwv.l(1)).aa(new ahuu(this), ahqs.f), airwVar.s().b.h(aiwv.n(airwVar.aB(), 1024L)).h(aiwv.l(0)).aa(new ahuu(this, 1), ahqs.f)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahgn) obj);
                return null;
            } else if (i == 1) {
                b((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhw.class};
    }
}
