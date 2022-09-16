package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: mgk  reason: default package */
/* loaded from: classes3.dex */
public final class mgk extends ajsl implements mbx, fzq, geq, ynl {
    private final fgz A;
    private final InlinePlaybackController B;
    private final mbz C;
    private final InlinePlaybackLifecycleController D;
    private mke E;
    private akbm F;
    private mby G;
    private final mkc H;
    public final Context a;
    public final int b;
    public final int c;
    public final yni d;
    public final ggk e;
    public final ajsm f;
    public final ajmy g;
    public final mgd h;
    final TextView i;
    final mgg j = new mgg(this);
    final ajzi k;
    public acti l;
    int m;
    ndj n;
    public apqk o;
    public int p;
    public boolean q;
    Runnable r;
    final FrameLayout s;
    final SnappyRecyclerView t;
    final SnappyLinearLayoutManager u;
    private final View v;
    private final mgr x;
    private final akbn y;
    private final mgc z;

    public mgk(Context context, ScheduledExecutorService scheduledExecutorService, snc sncVar, mgr mgrVar, mkc mkcVar, yni yniVar, ggk ggkVar, mbz mbzVar, InlinePlaybackController inlinePlaybackController, akbn akbnVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ajmy ajmyVar) {
        this.a = context;
        this.H = mkcVar;
        this.x = mgrVar;
        this.d = yniVar;
        this.e = ggkVar;
        this.y = akbnVar;
        this.z = new mgc(this, sncVar, scheduledExecutorService);
        this.C = mbzVar;
        this.D = inlinePlaybackLifecycleController;
        this.g = ajmyVar;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.carousel_item_layout, (ViewGroup) null);
        this.s = frameLayout;
        SnappyRecyclerView snappyRecyclerView = (SnappyRecyclerView) frameLayout.findViewById(R.id.carousel_items);
        this.t = snappyRecyclerView;
        this.v = frameLayout.findViewById(R.id.divider);
        this.i = (TextView) frameLayout.findViewById(R.id.dismiss_button);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.horizontal_list_buttons_height);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.promo_panel_text_layout_top_bottom_margin);
        mgrVar.h = snappyRecyclerView;
        mgrVar.f = new mgl(mgrVar.h, mgrVar.c, mgrVar.d, mgrVar.e);
        mgrVar.h.ag(mgrVar.b);
        mgrVar.h.setNestedScrollingEnabled(false);
        mgrVar.h.W = new yzq(snappyRecyclerView);
        this.u = mgrVar.b;
        ajzi ajziVar = mgrVar.f;
        this.k = ajziVar;
        this.f = ajziVar.a;
        fgz fgzVar = new fgz();
        this.A = fgzVar;
        snappyRecyclerView.o = fgzVar;
        this.B = inlinePlaybackController;
        this.h = new mgf(this, frameLayout);
        snappyRecyclerView.af(new mga());
        frameLayout.addOnLayoutChangeListener(new mgb(this, 1));
    }

    public static void n(View view, int i) {
        zgd.t(view, zgd.e(i), ViewGroup.MarginLayoutParams.class);
    }

    public static final boolean r(apqk apqkVar) {
        apqm apqmVar = apqkVar.d;
        if (apqmVar == null) {
            apqmVar = apqm.a;
        }
        return apqmVar.b == 141960765;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.s;
    }

    @Override // defpackage.mbx
    public final synchronized void c() {
        this.z.a();
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        argq argqVar;
        int J2;
        ndj ndjVar = (ndj) obj;
        this.d.g(this);
        zag.o(this.s, true);
        this.n = ndjVar;
        this.o = ndjVar.a;
        this.l = ajrsVar.a;
        if (this.G == null && (J2 = almu.J(this.o.e)) != 0 && J2 == 3) {
            mbz mbzVar = this.C;
            SnappyRecyclerView snappyRecyclerView = this.t;
            ajsf ajsfVar = this.k.b;
            ajsm ajsmVar = this.f;
            fgz fgzVar = this.A;
            ScrollSelectionController scrollSelectionController = (ScrollSelectionController) mbzVar.a.get();
            scrollSelectionController.getClass();
            fyy fyyVar = (fyy) mbzVar.b.get();
            fyyVar.getClass();
            mbw mbwVar = (mbw) mbzVar.c.get();
            mbwVar.getClass();
            yni yniVar = (yni) mbzVar.d.get();
            yniVar.getClass();
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController) mbzVar.e.get();
            inlinePlaybackLifecycleController.getClass();
            zah zahVar = (zah) mbzVar.f.get();
            zahVar.getClass();
            snappyRecyclerView.getClass();
            ajsmVar.getClass();
            fgzVar.getClass();
            this.G = new mby(scrollSelectionController, fyyVar, mbwVar, yniVar, inlinePlaybackLifecycleController, zahVar, snappyRecyclerView, ajsfVar, ajsmVar, fgzVar);
        }
        if (this.s.getLayoutParams() != null && this.o.c.size() != 0) {
            zgd.t(this.s, zgd.h(((apql) this.o.c.get(0)).b != 86135402 ? -2 : -1), ViewGroup.LayoutParams.class);
        }
        this.k.b.rZ(new mfw(this, 1));
        this.k.b(this.o.c);
        for (apql apqlVar : (List) this.o.qm(apqi.d)) {
            if (!akzj.f(apqlVar, apql.a)) {
                this.f.remove(aakr.b(apqlVar));
                this.f.l();
            }
        }
        ajsf ajsfVar2 = this.k.b;
        ajsfVar2.rZ(new mfw(this));
        ajsfVar2.rZ(new mfw(this, 2));
        ajsfVar2.rZ(new mfw(this, 3));
        if (this.o.qn(apqi.b)) {
            aoqu b = aakr.b((apql) this.o.qm(apqi.b));
            int i = 0;
            while (true) {
                if (i >= this.f.size()) {
                    break;
                } else if (b == this.f.get(i)) {
                    this.m = i;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            this.m = 0;
        }
        this.t.ab(this.m);
        q();
        if (!r(this.o)) {
            zag.o(this.v, false);
        } else {
            if (this.E == null) {
                mke b2 = this.H.b(this.s);
                this.E = b2;
                RecyclerView recyclerView = b2.a;
                this.s.addView(recyclerView);
                zgd.t(recyclerView, zgd.g(8388691), FrameLayout.LayoutParams.class);
            }
            mke mkeVar = this.E;
            apqm apqmVar = this.o.d;
            if (apqmVar == null) {
                apqmVar = apqm.a;
            }
            if (apqmVar.b == 141960765) {
                argqVar = (argq) apqmVar.c;
            } else {
                argqVar = argq.a;
            }
            mkeVar.oK(ajrsVar, argqVar);
            this.k.b.rZ(new mfw(this, 4));
            zag.o(this.v, true);
            n(this.v, this.b);
        }
        p();
        aunb aunbVar = this.o.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        aunb aunbVar2 = this.o.g;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (!aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer) || apojVar.h || zdg.e(this.a)) {
            zag.o(this.i, false);
        } else {
            if (this.F == null) {
                akbm a = this.y.a(this.i);
                this.F = a;
                a.d = new akbi() { // from class: mfx
                    @Override // defpackage.akbi
                    public final void oL(aopc aopcVar) {
                        mgk.this.e.a();
                    }
                };
            }
            this.F.b(apojVar, this.l);
        }
        mby mbyVar = this.G;
        if (mbyVar != null) {
            this.B.t(mbyVar);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ndj) obj).a.h.I();
    }

    @Override // defpackage.fzq
    public final View g() {
        return this.s;
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        mgr mgrVar = this.x;
        int i4 = this.m;
        int width = this.s.getWidth();
        int height = this.s.getHeight();
        ajzi ajziVar = mgrVar.f;
        if (ajziVar == null) {
            return;
        }
        mgn mgnVar = mgrVar.g;
        ajsm ajsmVar = ajziVar.a;
        if (mgnVar.e == null || ajsmVar.size() != mgnVar.e.length || mgnVar.d != height || mgnVar.c != width) {
            mgnVar.e = new boolean[ajsmVar.size()];
        }
        mgnVar.d = height;
        mgnVar.c = width;
        if (i4 == 0) {
            i3 = 0;
            i2 = 2;
        } else {
            if (i4 == ajsmVar.size() - 1) {
                i = i4 - 2;
            } else {
                i = i4 - 2;
                i4 += 2;
            }
            int i5 = i;
            i2 = i4;
            i3 = i5;
        }
        while (i3 < ajsmVar.size() && i3 <= i2) {
            if (i3 >= 0) {
                boolean[] zArr = mgnVar.e;
                if (!zArr[i3]) {
                    zArr[i3] = true;
                    Object obj = ajsmVar.get(i3);
                    if (obj instanceof aqlb) {
                        Context context = mgnVar.a;
                        ajmy ajmyVar = mgnVar.b;
                        aqlb aqlbVar = (aqlb) obj;
                        avhn n = mim.n(context, aqlbVar);
                        if (n != null) {
                            ajmyVar.n(n, width, height);
                        }
                        avhn m = mim.m(aqlbVar);
                        if (m != null) {
                            int h = mim.h(context, height);
                            ajmyVar.n(m, h, h);
                        }
                        avhn avhnVar = aqlbVar.j;
                        if (avhnVar == null) {
                            avhnVar = avhn.a;
                        }
                        jj k = mim.k(context, avhnVar, context.getResources().getDimensionPixelSize(R.dimen.promo_panel_foreground_image_max_height));
                        if (k != null) {
                            avhn avhnVar2 = aqlbVar.j;
                            if (avhnVar2 == null) {
                                avhnVar2 = avhn.a;
                            }
                            ajmyVar.n(avhnVar2, ((Integer) k.a).intValue(), ((Integer) k.b).intValue());
                        }
                    } else if (obj instanceof asku) {
                        Context context2 = mgnVar.a;
                        ajmy ajmyVar2 = mgnVar.b;
                        avhn d = yee.d((asku) obj, yih.d(context2.getResources().getConfiguration().orientation));
                        if (d != null) {
                            ajmyVar2.n(d, width, height);
                        }
                    }
                }
            }
            i3++;
        }
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    public final void k() {
        if (lj.am(this.s)) {
            boolean z = true;
            if (lj.e(this.s) != 1) {
                z = false;
            }
            m(z);
            return;
        }
        this.s.addOnLayoutChangeListener(new mgb(this));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        ndj ndjVar;
        ndj ndjVar2;
        if (i != -1) {
            if (i == 0) {
                Object b = ((aabk) obj).b();
                if (!(b instanceof asku) && !(b instanceof aqlb)) {
                    return null;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= this.o.c.size()) {
                        break;
                    } else if (b == aakr.b((apql) this.o.c.get(i2))) {
                        ArrayList arrayList = new ArrayList((Collection) this.o.qm(apqi.d));
                        if (arrayList.size() <= i2) {
                            for (int size = arrayList.size(); size < i2; size++) {
                                arrayList.add(apql.a);
                            }
                            arrayList.add((apql) this.o.c.get(i2));
                        } else {
                            arrayList.set(i2, (apql) this.o.c.get(i2));
                        }
                        aopc aopcVar = (aopc) this.o.mo52toBuilder();
                        aopcVar.e(apqi.d, arrayList);
                        o((apqk) aopcVar.mo39build());
                    } else {
                        i2++;
                    }
                }
                if (this.f.size() != 1 || this.f.get(0) != b || (ndjVar2 = this.n) == null) {
                    int i3 = this.m;
                    int size2 = this.f.size() - 1;
                    this.f.remove(b);
                    if (!this.f.isEmpty() || (ndjVar = this.n) == null) {
                        if (i3 == size2) {
                            this.m = 0;
                        }
                        this.t.ab(this.m);
                        p();
                        return null;
                    }
                    this.d.d(aabk.a(ndjVar));
                    return null;
                }
                this.d.d(aabk.a(ndjVar2));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aabk.class};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        int i;
        if (z) {
            i = (this.f.size() - this.m) - 1;
        } else {
            i = this.m;
        }
        this.h.c(i);
    }

    public final void o(apqk apqkVar) {
        ndj ndjVar = this.n;
        if (ndjVar == null) {
            return;
        }
        apqkVar.getClass();
        ndjVar.a = apqkVar;
        this.o = apqkVar;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        if (i == 0) {
            return aynr.f();
        }
        return this.D.k();
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        if (geqVar instanceof mgk) {
            return akzj.f(((mgk) geqVar).o, this.o);
        }
        return false;
    }

    public final void p() {
        this.t.aG(this.j);
        if (this.f.size() <= 1) {
            this.h.d(false);
            return;
        }
        this.h.b(this.o);
        k();
        this.t.aE(this.j);
    }

    public final void q() {
        apqk apqkVar = this.o;
        if ((apqkVar == null || !((Boolean) apqkVar.qm(apqi.c)).booleanValue()) && this.f.size() > 1) {
            Object obj = this.f.get(this.m);
            if (!(obj instanceof aqlb)) {
                return;
            }
            aqlb aqlbVar = (aqlb) obj;
            mgc mgcVar = this.z;
            int i = aqlbVar.v;
            int i2 = aqlbVar.w;
            mgcVar.b(i);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.m(this);
        apqk apqkVar = this.o;
        if (apqkVar != null && apqkVar.c.size() != 0) {
            int i = this.m;
            if (i < 0 || i >= this.f.size()) {
                aopc aopcVar = (aopc) this.o.mo52toBuilder();
                aopcVar.d(apqi.b);
                o((apqk) aopcVar.mo39build());
            } else {
                Object obj = this.f.get(this.m);
                Iterator it = this.o.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    apql apqlVar = (apql) it.next();
                    if (aakr.b(apqlVar) == obj) {
                        aopc aopcVar2 = (aopc) this.o.mo52toBuilder();
                        aopcVar2.e(apqi.b, apqlVar);
                        o((apqk) aopcVar2.mo39build());
                        break;
                    }
                }
            }
        }
        this.x.g.e = null;
        this.j.a.clear();
        this.f.clear();
        zag.o(this.s, false);
        mke mkeVar = this.E;
        if (mkeVar != null) {
            mkeVar.qZ(ajsaVar);
        }
        mby mbyVar = this.G;
        if (mbyVar != null) {
            this.B.v(mbyVar);
        }
        this.G = null;
        this.o = null;
        this.n = null;
    }
}
