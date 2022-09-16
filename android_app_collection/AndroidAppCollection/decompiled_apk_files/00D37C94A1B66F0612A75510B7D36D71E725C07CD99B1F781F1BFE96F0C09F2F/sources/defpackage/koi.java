package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: koi  reason: default package */
/* loaded from: classes3.dex */
public final class koi extends fdm implements kol, airt, ynl {
    private int A;
    private float B;
    private float C;
    private boolean D;
    private boolean E;
    private Rect F;
    private ezx G;
    private final jvo H;
    private final aacz I;
    public final koc a;
    public koo b;
    public float c;
    private final yni d;
    private final aadd e;
    private final azqb f;
    private final boolean g;
    private final boolean h;
    private final azqb i;
    private final acti j;
    private final koh k;
    private final Set l;
    private final airw m;
    private final yve n;
    private final kjg o;
    private final aypf p;
    private kor q;
    private ValueAnimator r;
    private boolean s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private float y;
    private int z;

    public koi(jvo jvoVar, yni yniVar, aacz aaczVar, aadd aaddVar, azqb azqbVar, azqb azqbVar2, acti actiVar, airw airwVar, feh fehVar, ezh ezhVar, ahqb ahqbVar, yve yveVar, kjg kjgVar) {
        super(fehVar);
        koc kodVar;
        this.G = ezx.NONE;
        this.H = jvoVar;
        this.d = yniVar;
        this.I = aaczVar;
        this.e = aaddVar;
        this.f = azqbVar;
        this.i = azqbVar2;
        this.j = actiVar;
        this.n = yveVar;
        this.l = new afy();
        this.m = airwVar;
        this.o = kjgVar;
        this.p = new aypf();
        asxj asxjVar = aaczVar.b().e;
        awbj awbjVar = (asxjVar == null ? asxj.a : asxjVar).v;
        this.g = (awbjVar == null ? awbj.a : awbjVar).f;
        this.h = eog.aq(aaczVar);
        int bk = eog.bk(aaczVar) - 1;
        if (bk == 1) {
            kodVar = new kod(aaczVar);
        } else if (bk == 2) {
            kodVar = new koe(aaczVar);
        } else {
            kodVar = new kod(aaczVar);
        }
        this.a = kodVar;
        this.k = new koh(this);
        r();
        ezhVar.i(this);
        ahqbVar.a(this);
    }

    private final void A(int i) {
        this.w = i;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            i = 3;
        }
        this.v = i;
    }

    private final void r() {
        if ((((fgu) this.n.c()).b & 1) == 0 || !((fgu) this.n.c()).c) {
            this.t = -1.0f;
            A(0);
            return;
        }
        this.t = this.B;
        A(3);
    }

    private final void v() {
        w();
        p(1.0f);
    }

    private final void w() {
        this.b.c = false;
        this.q.d();
        kor korVar = this.q;
        akgc akgcVar = korVar.g;
        if (akgcVar == null || !akgcVar.i()) {
            return;
        }
        korVar.g.b(0);
    }

    private final void x(boolean z) {
        if (eog.x(this.e) || !z) {
            p(1.0f);
        } else {
            z(1.0f);
        }
        int i = this.w;
        if (i == 0) {
            return;
        }
        if (z) {
            if (i == 2) {
                this.q.b();
            } else if (this.v != 0) {
                kor korVar = this.q;
                korVar.c();
                korVar.c.setVisibility(8);
                korVar.d.setText(R.string.video_zoom_normal_title);
                korVar.a(korVar.d, R.animator.video_zoom_snap_flash_title, korVar.f);
                korVar.d.sendAccessibilityEvent(8);
                this.j.H(3, new acte(actj.VIDEO_ZOOM_SNAPPED_TO_FIT), null);
            }
        }
        A(0);
    }

    private final void y(boolean z) {
        if (eog.x(this.e) || !z) {
            p(this.B);
        } else {
            z(this.B);
        }
        if (this.w == 3) {
            return;
        }
        if (z && this.v != 3) {
            kor korVar = this.q;
            korVar.c();
            korVar.a(korVar.c, R.animator.video_zoom_snap_flash_indicator, korVar.e);
            korVar.d.setText(R.string.video_zoom_snapped_title);
            korVar.a(korVar.d, R.animator.video_zoom_snap_flash_title, korVar.f);
            korVar.d.sendAccessibilityEvent(8);
            this.j.H(3, new acte(actj.VIDEO_ZOOM_SNAPPED_TO_FILL), null);
        }
        A(3);
    }

    private final void z(float f) {
        float f2 = this.t;
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.r = ofFloat;
            ofFloat.setInterpolator(akef.a);
            this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kof
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    koi.this.p(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        } else {
            valueAnimator.setFloatValues(f2, f);
        }
        int i = 300;
        int min = Math.min(300, ((int) (Math.abs(f2 - f) * 500.0f)) + 100);
        if (min < 100) {
            afus.b(1, 25, String.format(Locale.US, "SnapZoom animation duration=%d (possible int overflow); use default=%d instead. currentState=%d lastSettledState=%d playerViewAspectRatio=%s videoAspectRatio=%s videoWidth=%d videoHeight=%d start(currentScale)=%s end(snappedScale)=%s", Integer.valueOf(min), 300, Integer.valueOf(this.w), Integer.valueOf(this.v), Float.valueOf(this.c), Float.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Float.valueOf(f2), Float.valueOf(f)));
        } else {
            i = min;
        }
        this.r.setDuration(i);
        this.r.cancel();
        this.r.start();
    }

    @Override // defpackage.nxc
    public final Rect a(Rect rect) {
        if (this.E || this.y <= 0.0f) {
            return rect;
        }
        float f = this.t;
        if (f < 0.0f || Float.isNaN(f)) {
            return rect;
        }
        if (this.F == null) {
            this.F = new Rect();
        }
        etk.m(this.y, rect, this.F);
        Rect rect2 = this.F;
        etk.k(rect2, this.t, rect2);
        return this.F;
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        if (this.z == i && this.A == i2) {
            return;
        }
        this.z = i;
        this.A = i2;
        float f = i / i2;
        this.y = f;
        this.a.b = f;
        q();
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        boolean z = false;
        if (!c.h() && c.c(aika.READY) && c != aika.ENDED) {
            z = true;
        }
        if (this.x == z) {
            return;
        }
        this.x = z;
        this.a.e = z;
        q();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new kog(this, 1), kjt.h), airwVar.G().j.aa(new kog(this), kjt.h)};
    }

    @Override // defpackage.nxc
    public final void i(nws nwsVar) {
        this.l.add(nwsVar);
    }

    @Override // defpackage.nxc
    public final void j(nws nwsVar) {
        this.l.remove(nwsVar);
    }

    @Override // defpackage.kol
    public final void k(kor korVar, koo kooVar) {
        this.s = true;
        this.q = korVar;
        this.b = kooVar;
        kooVar.e(this);
        ((aizb) this.f.get()).a(this);
        w();
    }

    @Override // defpackage.feg
    public final void kF() {
        if (this.h) {
            this.p.c();
        } else {
            this.d.m(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.H.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.removeOnLayoutChangeListener(this.k);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                e((ahhw) obj);
                return null;
            } else if (i == 1) {
                ahia ahiaVar = (ahia) obj;
                q();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahia.class};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.H.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.p.requestLayout();
        }
        for (nws nwsVar : this.l) {
            nwsVar.a();
        }
    }

    @Override // defpackage.feg
    public final void nr() {
        if (this.G == ezx.NONE) {
            r();
        }
        if (this.h) {
            this.p.c();
            this.p.g(g(this.m));
        } else {
            this.d.g(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.H.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.addOnLayoutChangeListener(this.k);
        }
        q();
    }

    @Override // defpackage.ahqa
    public final void oh(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        this.a.d = z;
        q();
    }

    public final void p(float f) {
        if (this.t == f) {
            return;
        }
        this.t = f;
        m();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        this.G = ezxVar;
        if (ezxVar == ezx.NONE) {
            r();
        }
        boolean z = this.D;
        boolean z2 = ezxVar == ezx.WATCH_WHILE_FULLSCREEN;
        this.D = z2;
        this.a.c = z2;
        if (z == z2) {
            return;
        }
        q();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final void q() {
        if (!this.s || this.G.l()) {
            return;
        }
        if (this.o.V().k()) {
            v();
        } else if (this.a.a()) {
            float f = this.c / this.y;
            if (f <= 1.0f) {
                f = 1.0f / f;
            }
            this.B = f;
            this.C = ((f - 1.0f) * 0.33f) + 1.0f;
            this.b.c = true;
            int i = this.w;
            if (i == 0) {
                x(false);
                if (this.g && ((((fgu) this.n.c()).b & 2) == 0 || !((fgu) this.n.c()).d)) {
                    kor korVar = this.q;
                    if (korVar.g == null) {
                        korVar.c();
                        korVar.g = new akgc(View.inflate(korVar.a, R.layout.video_zoom_user_education, null), korVar.b, 4, 3);
                    }
                    if (!korVar.g.i()) {
                        Resources resources = korVar.a.getResources();
                        Rect rect = new Rect();
                        rect.offsetTo(resources.getDimensionPixelSize(R.dimen.video_zoom_user_education_left_offset), resources.getDimensionPixelSize(R.dimen.video_zoom_user_education_top_offset));
                        korVar.g.g(rect);
                    }
                    ylx.m(this.n.b(jvb.r), jou.o);
                }
            } else if (i == 3) {
                y(false);
            } else {
                x(false);
            }
            this.j.n(new acte(actj.VIDEO_ZOOM_SNAPPED_TO_FILL));
            this.j.n(new acte(actj.VIDEO_ZOOM_SNAPPED_TO_FIT));
        } else {
            v();
        }
    }

    @Override // defpackage.kon
    public final void s() {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.r.cancel();
        }
        ((aaar) this.i.get()).r();
    }

    @Override // defpackage.kon
    public final void t(boolean z) {
        if (z) {
            if (this.u > 1.0f) {
                y(true);
                return;
            } else {
                x(true);
                return;
            }
        }
        int i = this.w;
        if (i == 1) {
            x(true);
        } else if (i != 2) {
        } else {
            y(true);
        }
    }

    @Override // defpackage.kon
    public final void u(float f) {
        if (eog.x(this.e)) {
            if ((-1.0f) + f > 0.01f) {
                y(false);
                return;
            } else if (1.0f - f <= 0.01f) {
                return;
            } else {
                x(false);
                return;
            }
        }
        float max = Math.max(Math.min(this.t * f, this.B + 0.02f), 0.98f);
        this.u = f;
        if (max >= this.C) {
            p(max);
            if (this.w == 2) {
                return;
            }
            if (this.v != 3) {
                kor korVar = this.q;
                korVar.c();
                korVar.a(korVar.c, R.animator.video_zoom_snap_threshold_indicator_show, null);
                korVar.d.setVisibility(8);
            }
            A(2);
            return;
        }
        p(max);
        int i = this.w;
        if (i == 1) {
            return;
        }
        if (i == 2 && this.v != 3) {
            this.q.b();
        }
        A(1);
    }
}
