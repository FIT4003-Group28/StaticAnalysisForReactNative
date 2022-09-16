package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kjj  reason: default package */
/* loaded from: classes3.dex */
public final class kjj implements airt, ynl {
    final /* synthetic */ kjk a;

    public kjj(kjk kjkVar) {
        this.a = kjkVar;
    }

    public final void a(ahgn ahgnVar) {
        kjk kjkVar = this.a;
        boolean z = kjkVar.e;
        kjkVar.e = ahgnVar.d() == aijs.REMOTE;
        kjk kjkVar2 = this.a;
        if (kjkVar2.e == z) {
            return;
        }
        kjkVar2.h();
    }

    public final void b(ahhm ahhmVar) {
        if (!ahhmVar.c().b(aijx.VIDEO_PLAYBACK_LOADED) || ahhmVar.b() == null) {
            return;
        }
        kjk kjkVar = this.a;
        PlayerResponseModel b = ahhmVar.b();
        kjkVar.d = new kjf(b.B(), b.b().e());
        this.a.g();
    }

    public final void c(ahhu ahhuVar) {
        kjk kjkVar = this.a;
        boolean z = kjkVar.f;
        boolean z2 = true;
        if (ahhuVar.a() != aijz.IS_UAO && !ahhuVar.b()) {
            z2 = false;
        }
        kjkVar.f = z2;
        kjk kjkVar2 = this.a;
        if (z != kjkVar2.f) {
            kjkVar2.h();
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.s().a.aa(new kji(this, 2), jww.u), airwVar.ao().I().G(aypa.a()).aa(new kji(this), jww.u), airwVar.s().b.aa(new kji(this, 1), jww.u)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahgn) obj);
                return null;
            } else if (i == 1) {
                b((ahhm) obj);
                return null;
            } else if (i == 2) {
                c((ahhu) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhm.class, ahhu.class};
    }
}
