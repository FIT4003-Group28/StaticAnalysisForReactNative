package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: kkh  reason: default package */
/* loaded from: classes3.dex */
public final class kkh implements wlv, ynl {
    private static final List k;
    public final kke a;
    public final acti b;
    public final snc c;
    public final aadd d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public kkg i;
    public PlayerAd j;
    private final aafo l;
    private final wxc m;
    private final List n;
    private final aiji o;
    private final Handler p;
    private Object q;
    private int r;

    static {
        aopa createBuilder = aoym.a.createBuilder();
        createBuilder.copyOnWrite();
        aoym.a((aoym) createBuilder.instance);
        createBuilder.copyOnWrite();
        aoym aoymVar = (aoym) createBuilder.instance;
        aoymVar.c = 1;
        aoymVar.b = 1 | aoymVar.b;
        k = Arrays.asList((aoym) createBuilder.mo39build());
    }

    public kkh(kke kkeVar, aafo aafoVar, wxc wxcVar, acti actiVar, snc sncVar, aiji aijiVar, aadd aaddVar) {
        kkeVar.getClass();
        this.a = kkeVar;
        aafoVar.getClass();
        this.l = aafoVar;
        wxcVar.getClass();
        this.m = wxcVar;
        actiVar.getClass();
        this.b = actiVar;
        this.c = sncVar;
        aijiVar.getClass();
        this.o = aijiVar;
        aaddVar.getClass();
        this.d = aaddVar;
        kkeVar.a = this;
        this.p = new Handler(Looper.getMainLooper());
        this.n = new ArrayList();
        d();
    }

    private final void e(int i, boolean z) {
        this.p.post(new kkf(this, i, z));
    }

    public final void a(long j) {
        if (xrz.e(this.d)) {
            return;
        }
        this.h = j;
        boolean z = false;
        if (!this.e || !this.g || this.i == null || this.n.isEmpty()) {
            if (this.r == 3) {
                return;
            }
            this.r = 3;
            e(3, false);
            return;
        }
        int i = this.r;
        for (aoym aoymVar : this.n) {
            if (((float) this.h) >= aoymVar.d) {
                int i2 = this.r;
                int b = aoyt.b(aoymVar.c);
                if (b == 0) {
                    b = 1;
                }
                if (i2 == b) {
                    return;
                }
                int b2 = aoyt.b(aoymVar.c);
                if (b2 == 0) {
                    b2 = 1;
                }
                this.r = b2;
                if (b2 == 2 || i != 3) {
                    z = true;
                }
                e(b2, z);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
        r7.n.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.asaj r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkh.c(asaj):void");
    }

    public final void d() {
        Object obj = this.q;
        if (obj != null) {
            this.m.b(obj);
            this.q = null;
        }
        this.a.l();
        boolean z = true;
        this.r = 1;
        this.f = true;
        this.j = null;
        this.i = null;
        this.g = false;
        this.h = 0L;
        this.n.clear();
        if (this.o.g() != aijs.FULLSCREEN) {
            z = false;
        }
        this.e = z;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                wxr wxrVar = (wxr) obj;
                if (xrz.e(this.d)) {
                    return null;
                }
                wxq a = wxrVar.a();
                PlayerAd c = wxrVar.c();
                if (a.a() && c != null && !(c instanceof SurveyAd) && !VastAd.a.equalsIgnoreCase(c.l())) {
                    if (this.j == null) {
                        this.j = wxrVar.c();
                    }
                    PlayerAd playerAd = this.j;
                    if (playerAd != null && playerAd.g() != null) {
                        c(this.j.g().a);
                    }
                    if (a == wxq.AD_VIDEO_PLAYING) {
                        PlayerAd playerAd2 = this.j;
                        snc sncVar = this.c;
                        if (!(playerAd2 instanceof ForecastingAd) && !playerAd2.Z(sncVar)) {
                            this.g = true;
                        }
                    }
                }
                if (a != wxq.AD_VIDEO_ENDED) {
                    return null;
                }
                d();
                return null;
            } else if (i == 1) {
                ahgn ahgnVar = (ahgn) obj;
                if (xrz.e(this.d)) {
                    return null;
                }
                if (ahgnVar.d() == aijs.FULLSCREEN) {
                    z = true;
                }
                if (this.e == z) {
                    return null;
                }
                this.e = z;
                a(this.h);
                return null;
            } else if (i != 2) {
                if (i == 3) {
                    ahhx ahhxVar = (ahhx) obj;
                    if (xrz.e(this.d) || !this.g) {
                        return null;
                    }
                    a(ahhxVar.e());
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            } else {
                ahhw ahhwVar = (ahhw) obj;
                if (xrz.e(this.d)) {
                    return null;
                }
                PlayerResponseModel b = ahhwVar.b();
                aika c2 = ahhwVar.c();
                if (c2 == aika.VIDEO_PLAYING) {
                    c(b.a);
                    this.g = true;
                    return null;
                } else if (c2.h()) {
                    return null;
                } else {
                    d();
                    return null;
                }
            }
        }
        return new Class[]{wxr.class, ahgn.class, ahhw.class, ahhx.class};
    }

    @Override // defpackage.wlv
    public final void qL(Object obj, List list) {
        if (this.m.d(obj)) {
            if (!xrz.j(this.d)) {
                return;
            }
            afus.b(2, 1, "CTA Ctrl: click is blocked by debounce.");
            return;
        }
        this.q = obj;
        aafx.d(this.l, list, actk.h(obj, false));
    }
}
