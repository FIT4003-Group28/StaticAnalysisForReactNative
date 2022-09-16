package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: fzl  reason: default package */
/* loaded from: classes3.dex */
public final class fzl extends fdm implements nxc, feg, ezg, aiza, airt, fze, ynl {
    public float a;
    public Rect b;
    private final yni c;
    private final boolean d;
    private final fzk e;
    private final Set f;
    private final airw g;
    private final aypf h;
    private float i;
    private boolean j;
    private float k;
    private int l;
    private int m;
    private Rect n;
    private ezx o;
    private boolean p;
    private final jvo q;

    public fzl(jvo jvoVar, aacz aaczVar, yni yniVar, azqb azqbVar, airw airwVar, feh fehVar, ezh ezhVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        super(fehVar);
        this.b = new Rect();
        this.o = ezx.NONE;
        this.q = jvoVar;
        this.c = yniVar;
        this.f = new afy();
        this.g = airwVar;
        this.h = new aypf();
        this.d = eog.aq(aaczVar);
        this.e = new fzk(this);
        m();
        ezhVar.i(this);
        ((aizb) azqbVar.get()).a(this);
        inlinePlaybackLifecycleController.l(this);
    }

    private final void k() {
        View view;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.q.get()).aT;
        if (youTubePlayerViewNotForReflection != null && (view = youTubePlayerViewNotForReflection.p) != null) {
            view.requestLayout();
        }
        for (nws nwsVar : this.f) {
            nwsVar.a();
        }
    }

    private final void m() {
        this.i = -1.0f;
        this.o = ezx.NONE;
        this.n = null;
        this.k = 0.0f;
        this.l = 0;
        this.m = 0;
    }

    private final void p(float f) {
        if (this.i == f) {
            return;
        }
        this.i = f;
        k();
    }

    @Override // defpackage.nxc
    public final Rect a(Rect rect) {
        if (!this.p || this.k <= 0.0f) {
            return rect;
        }
        float f = this.i;
        if (f <= 0.0f || Float.isNaN(f)) {
            return rect;
        }
        if (this.n == null) {
            this.n = new Rect();
        }
        etk.m(this.k, rect, this.n);
        Rect rect2 = this.n;
        etk.k(rect2, this.i, rect2);
        return this.n;
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            this.k = 0.0f;
            this.l = 0;
            this.m = 0;
        } else if (this.l == i && this.m == i2) {
        } else {
            this.l = i;
            this.m = i2;
            this.k = i / i2;
            h();
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        boolean z = false;
        if (!c.h() && c.c(aika.READY) && c != aika.ENDED) {
            z = true;
        }
        if (this.j == z) {
            return;
        }
        this.j = z;
        h();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: fzj
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                fzl.this.e((ahhw) obj);
            }
        }, fzc.d)};
    }

    public final void h() {
        if (this.o.d()) {
            float f = this.a;
            if (f <= 0.0f) {
                return;
            }
            float f2 = this.k;
            if (f2 <= 0.0f) {
                return;
            }
            if (this.p) {
                float f3 = f / f2;
                if (f3 <= 1.0f) {
                    f3 = 1.0f / f3;
                }
                p(f3);
                return;
            }
            p(1.0f);
        }
    }

    @Override // defpackage.nxc
    public final void i(nws nwsVar) {
        this.f.add(nwsVar);
    }

    @Override // defpackage.nxc
    public final void j(nws nwsVar) {
        this.f.remove(nwsVar);
    }

    @Override // defpackage.feg
    public final void kF() {
        if (this.d) {
            this.h.c();
        } else {
            this.c.m(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.q.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.removeOnLayoutChangeListener(this.e);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                e((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        boolean h;
        if (i == 0) {
            h = false;
        } else if (i != 1) {
            return;
        } else {
            h = fypVar.b.h();
        }
        this.p = h;
    }

    @Override // defpackage.feg
    public final void nr() {
        if (this.d) {
            this.h.c();
            this.h.g(g(this.g));
        } else {
            this.c.g(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.q.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.addOnLayoutChangeListener(this.e);
        }
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar != ezx.INLINE_MINIMAL) {
            m();
            return;
        }
        this.o = ezxVar;
        h();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
