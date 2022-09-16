package defpackage;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Property;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ahiq  reason: default package */
/* loaded from: classes.dex */
public class ahiq implements ahig, ahit, ahir, airt, ynl {
    private static final ahil a = new ahil();
    private static final Property i = new ahij(Long.class);
    public final ahih b;
    public final ahip c;
    public final yni d;
    public final Set e;
    public int f;
    public auaz g;
    public Animator h;
    private final ahiu j;
    private final aafo k;
    private final acti l;
    private final aire m;
    private final zah n;
    private final yrj o;
    private final Handler p;
    private final Runnable q;
    private final Set r;
    private final azqb s;
    private String t;
    private boolean u;
    private int v;
    private boolean w;
    private final ahik x;
    private aijs y;
    private final feu z;

    public ahiq(ahih ahihVar, ahiu ahiuVar, feu feuVar, aafo aafoVar, acti actiVar, aire aireVar, zah zahVar, yrj yrjVar, yni yniVar, azqb azqbVar) {
        ahihVar.getClass();
        this.b = ahihVar;
        ahiuVar.getClass();
        this.j = ahiuVar;
        feuVar.getClass();
        this.z = feuVar;
        aafoVar.getClass();
        this.k = aafoVar;
        actiVar.getClass();
        this.l = actiVar;
        this.m = aireVar;
        zahVar.getClass();
        this.n = zahVar;
        yrjVar.getClass();
        this.o = yrjVar;
        yniVar.getClass();
        this.d = yniVar;
        this.c = new ahip();
        ahiuVar.d(this);
        feuVar.a.add(this);
        this.x = new ahik(this);
        this.p = new Handler(Looper.getMainLooper());
        this.f = 0;
        this.v = 0;
        this.q = new gda(this, 2);
        this.e = Collections.newSetFromMap(new WeakHashMap());
        this.r = Collections.newSetFromMap(new WeakHashMap());
        azqbVar.getClass();
        this.s = azqbVar;
    }

    private final void a() {
        this.b.kT();
        this.c.a(false);
    }

    private final void d() {
        this.p.removeCallbacks(this.q);
    }

    private final void e(boolean z) {
        this.u = z;
        for (ahim ahimVar : this.e) {
            ahimVar.F(this.u);
        }
    }

    private final void h(boolean z) {
        this.b.l(this.g, z);
        this.l.u(new acte(this.g.q.I()), null);
        this.c.a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        auaz auazVar = this.g;
        if (auazVar != null) {
            return auazVar.l;
        }
        return 0;
    }

    public void c(ahhw ahhwVar) {
        String B = ahhwVar.b() != null ? ahhwVar.b().B() : null;
        if (!TextUtils.equals(B, this.t)) {
            this.t = null;
            this.g = null;
            this.f = 0;
            y();
            this.t = B;
            e(false);
        }
        aika c = ahhwVar.c();
        if (c == aika.ENDED) {
            k();
        }
        if (this.f == 0 || c != aika.ENDED) {
            this.f = c.a(aika.READY, aika.PLAYBACK_LOADED, aika.VIDEO_PLAYING, aika.PLAYBACK_INTERRUPTED, aika.INTERSTITIAL_PLAYING) ? 1 : 0;
            e(false);
        } else if (this.f == 1) {
            this.f = 2;
        }
        y();
    }

    @Override // defpackage.airt
    public aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 2L)).h(aiwv.l(1)).aa(new ahii(this, 2), aaga.k), airwVar.ao().h(aiwv.n(airwVar.aB(), 2L)).h(aiwv.l(1)).aa(new ahii(this), aaga.k), airwVar.s().b.h(aiwv.n(airwVar.aB(), 2L)).h(aiwv.l(0)).aa(new ahii(this, 1), aaga.k), airwVar.ab().h(aiwv.n(airwVar.aB(), 2L)).h(aiwv.l(1)).aa(new ahii(this, 3), aaga.k), airwVar.V().h(aiwv.n(airwVar.aB(), 2L)).h(aiwv.l(1)).aa(new ahii(this, 3), aaga.k)};
    }

    protected void i(WatchNextResponseModel watchNextResponseModel) {
    }

    protected void j() {
    }

    protected void k() {
    }

    @Override // defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i2) {
        return ahfe.a(this, obj, i2);
    }

    protected boolean l() {
        return true;
    }

    protected boolean m() {
        return true;
    }

    @Override // defpackage.ahig
    public final void p() {
        apoj a2 = ahfc.a(this.g);
        if (a2 != null) {
            this.l.H(3, new acte(a2.t), null);
        }
        e(true);
        y();
    }

    @Override // defpackage.ahig
    public final void q(boolean z) {
        if (z) {
            if (!m()) {
                return;
            }
            for (ahio ahioVar : this.r) {
                ahioVar.a();
            }
            j();
            aiqj aiqjVar = aiqj.AUTONAV;
            aijo a2 = aijp.a();
            a2.a = (acvg) this.s.get();
            this.m.a(new aiqk(aiqjVar, null, a2.a()));
            return;
        }
        apoj b = ahfc.b(this.g);
        if (b == null) {
            return;
        }
        this.l.H(3, new acte(b.t), null);
        apzg apzgVar = b.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        w(apzgVar);
    }

    @Override // defpackage.ahit
    public final void r(boolean z) {
        y();
    }

    public final void s(ahin ahinVar) {
        this.c.a.add(ahinVar);
    }

    public final void t(ahgn ahgnVar) {
        this.y = ahgnVar.d();
        y();
    }

    public final void u(ahhm ahhmVar) {
        aube aubeVar;
        if (ahhmVar.a() == null) {
            return;
        }
        i(ahhmVar.a());
        asgt asgtVar = ahhmVar.a().a;
        asgf asgfVar = asgtVar.f;
        if (asgfVar == null) {
            asgfVar = asgf.a;
        }
        auaz auazVar = null;
        if (asgfVar.b == 78882851) {
            asgf asgfVar2 = asgtVar.f;
            if (asgfVar2 == null) {
                asgfVar2 = asgf.a;
            }
            if (asgfVar2.b == 78882851) {
                aubeVar = (aube) asgfVar2.c;
            } else {
                aubeVar = aube.a;
            }
        } else {
            aubeVar = null;
        }
        if (aubeVar == null) {
            return;
        }
        auba aubaVar = aubeVar.h;
        if (aubaVar == null) {
            aubaVar = auba.a;
        }
        if ((aubaVar.b & 1) != 0) {
            auba aubaVar2 = aubeVar.h;
            if (aubaVar2 == null) {
                aubaVar2 = auba.a;
            }
            auazVar = aubaVar2.c;
            if (auazVar == null) {
                auazVar = auaz.a;
            }
        }
        x(auazVar);
    }

    public final void v(ahic ahicVar) {
        this.w = ahicVar.a().a() == 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(apzg apzgVar) {
        this.k.a(this.l.f(apzgVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(auaz auazVar) {
        if (auazVar == null || ahfc.b(auazVar) == null || ahfc.a(auazVar) == null) {
            return;
        }
        this.g = auazVar;
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
        if (r10.n.a() >= java.util.concurrent.TimeUnit.MINUTES.toMillis(r0)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahiq.y():void");
    }

    @Override // defpackage.ahir
    public final void z() {
        y();
    }
}
