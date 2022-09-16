package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: jvr  reason: default package */
/* loaded from: classes3.dex */
public final class jvr implements jwl, fqc, ezb, airt, ynl {
    private final fer a;
    private final azqb b;
    private final yni c;
    private final ezh d;
    private final ezd e;
    private final airw f;
    private final aypf g = new aypf();
    private boolean h;
    private boolean i;
    private aika j;
    private final aacz k;

    public jvr(fer ferVar, azqb azqbVar, yni yniVar, ezh ezhVar, ezd ezdVar, airw airwVar, aacz aaczVar) {
        this.a = ferVar;
        this.b = azqbVar;
        this.c = yniVar;
        this.d = ezhVar;
        this.e = ezdVar;
        this.f = airwVar;
        this.k = aaczVar;
    }

    @Override // defpackage.fqc
    public final void a() {
        if (eog.aq(this.k)) {
            this.g.c();
        } else {
            this.c.m(this);
        }
        i();
    }

    @Override // defpackage.fqc
    public final void b() {
        if (eog.aq(this.k)) {
            this.g.g(g(this.f));
        } else {
            this.c.g(this);
        }
    }

    public final void c(ahgn ahgnVar) {
        this.h = ahgnVar.d() == aijs.REMOTE;
    }

    public final void d(ahhw ahhwVar) {
        this.j = ahhwVar.c();
        PlayerResponseModel b = ahhwVar.b();
        boolean z = false;
        if (b != null && b.F()) {
            z = true;
        }
        this.i = z;
    }

    public final void e(ahia ahiaVar) {
        if (!ahiaVar.e()) {
            return;
        }
        i();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new jvq(this), ick.r), airwVar.G().j.aa(new jvq(this, 2), ick.r), airwVar.s().b.aa(new jvq(this, 1), ick.r)};
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        if (ezwVar != null) {
            return;
        }
        this.i = false;
        this.j = null;
    }

    @Override // defpackage.jwl
    public final void i() {
        ezw a = this.e.a();
        if (this.h || !this.d.g().c() || a == null || TextUtils.isEmpty(a.c()) || this.j == null) {
            return;
        }
        String c = a.c();
        fep b = this.a.b(c);
        long j = 0;
        if (this.j == aika.INTERSTITIAL_PLAYING) {
            fer ferVar = this.a;
            if (b != null) {
                j = b.a;
            }
            ferVar.d(c, j);
        } else if (!this.j.c(aika.VIDEO_PLAYING)) {
        } else {
            if (b != null) {
                j = b.a;
            }
            long i = ((airr) this.b.get()).i();
            long h = ((airr) this.b.get()).h();
            if (Math.abs(j - i) < 500) {
                return;
            }
            if (this.i || i < h) {
                this.a.d(c, i);
                return;
            }
            fer ferVar2 = this.a;
            ferVar2.b.remove(c);
            ferVar2.c.remove(c);
            ferVar2.a.f(new feq(c, null));
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                c((ahgn) obj);
                return null;
            } else if (i == 1) {
                d((ahhw) obj);
                return null;
            } else if (i == 2) {
                e((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhw.class, ahia.class};
    }
}
