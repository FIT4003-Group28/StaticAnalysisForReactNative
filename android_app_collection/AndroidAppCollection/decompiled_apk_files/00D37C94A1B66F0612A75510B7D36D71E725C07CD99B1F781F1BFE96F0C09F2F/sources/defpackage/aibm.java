package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: aibm  reason: default package */
/* loaded from: classes.dex */
public final class aibm implements airt, ynl {
    public final aibj a;
    public Bitmap b;
    private final ajmy c;
    private final yiw d;
    private yiy e;
    private Uri f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public aibm(aibj aibjVar, ajmy ajmyVar) {
        this.a = aibjVar;
        ajmyVar.getClass();
        this.c = ajmyVar;
        this.d = yje.c(new Handler(), new aibl(this));
    }

    private final void d() {
        this.f = null;
        this.b = null;
        yiy yiyVar = this.e;
        if (yiyVar != null) {
            yiyVar.d();
            this.e = null;
        }
        this.a.nC();
    }

    private final void e() {
        if ((this.g && (this.i || this.j)) || !this.h) {
            if (this.b == null && this.f != null && this.e == null) {
                yiy c = yiy.c(this.d);
                this.e = c;
                this.c.l(this.f, c);
            }
            this.a.kU();
            return;
        }
        this.a.kT();
    }

    public final void a(ahgn ahgnVar) {
        this.j = ahgnVar.d() == aijs.REMOTE;
        e();
    }

    public final void b(ahhu ahhuVar) {
        this.i = ahhuVar.b();
        e();
    }

    public final void c(ahhw ahhwVar) {
        if (ahhwVar.c() == aika.NEW) {
            d();
        } else if (ahhwVar.c().c(aika.PLAYBACK_LOADED)) {
            aibj aibjVar = this.a;
            Uri uri = null;
            View kZ = aibjVar instanceof aizf ? ((aizf) aibjVar).kZ() : null;
            int width = kZ != null ? kZ.getWidth() : 480;
            int height = kZ != null ? kZ.getHeight() : 320;
            if (ahhwVar.b() != null) {
                aalc b = ahhwVar.b().b();
                if (b.f()) {
                    uri = b.b(width, height).a();
                }
                if (uri == null || !uri.equals(this.f)) {
                    d();
                }
                this.f = uri;
            }
        }
        this.g = ahhwVar.c().c(aika.PLAYBACK_LOADED);
        this.h = !ahhwVar.c().a(aika.PLAYBACK_LOADED, aika.PLAYBACK_INTERRUPTED, aika.READY, aika.ENDED);
        e();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 2097152L)).h(aiwv.l(1)).aa(new aibk(this, 2), aiax.d), airwVar.s().a.h(aiwv.n(airwVar.aB(), 2097152L)).h(aiwv.l(1)).aa(new aibk(this), aiax.d), airwVar.s().b.h(aiwv.n(airwVar.aB(), 2097152L)).h(aiwv.l(0)).aa(new aibk(this, 1), aiax.d)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahgn) obj);
                return null;
            } else if (i == 1) {
                b((ahhu) obj);
                return null;
            } else if (i == 2) {
                c((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhu.class, ahhw.class};
    }
}
