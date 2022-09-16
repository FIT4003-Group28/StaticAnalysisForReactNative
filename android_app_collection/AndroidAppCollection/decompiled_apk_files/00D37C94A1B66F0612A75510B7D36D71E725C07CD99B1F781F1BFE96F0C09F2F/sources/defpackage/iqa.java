package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.playlist.ui.OnAnimationEndRelativeLayout;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
/* compiled from: PG */
/* renamed from: iqa  reason: default package */
/* loaded from: classes3.dex */
public final class iqa extends ipc implements View.OnClickListener, nif, acth, ynl {
    private boolean aA;
    private ValueAnimator aB;
    public int ae;
    public int af;
    public int ag = 0;
    public View ah;
    public OnAnimationEndRelativeLayout ai;
    public View aj;
    public TopPeekingScrollView ak;
    public RecyclerView al;
    public ajsf am;
    public boolean an;
    public acti ao;
    public feu ap;
    public nih aq;
    public zhf ar;
    public fvi as;
    public yni at;
    public fud au;
    public fvf av;
    private int aw;
    private int ax;
    private dt ay;
    private String az;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        String str = ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint) aafr.b(this.m.getByteArray("navigation_endpoint")).qm(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)).b;
        nih nihVar = this.aq;
        dt dtVar = this.ay;
        azqb azqbVar = nihVar.a;
        yzj yzjVar = (yzj) nihVar.b.get();
        yzjVar.getClass();
        ajsg ajsgVar = (ajsg) nihVar.c.get();
        ajsgVar.getClass();
        akbn akbnVar = (akbn) nihVar.d.get();
        akbnVar.getClass();
        yni yniVar = (yni) nihVar.e.get();
        yniVar.getClass();
        aagi aagiVar = (aagi) nihVar.f.get();
        aagiVar.getClass();
        dtVar.getClass();
        str.getClass();
        nig nigVar = new nig(azqbVar, yzjVar, ajsgVar, akbnVar, yniVar, aagiVar, (nef) nihVar.g.get(), dtVar, this, str);
        abaz abazVar = (abaz) nigVar.a.get();
        abav abavVar = new abav(abazVar.e, abazVar.a.c());
        abavVar.a.add(nigVar.c);
        abavVar.i();
        ((abaz) nigVar.a.get()).c.e(abavVar, nigVar);
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.at.m(this);
        this.at.d(new ipz(false));
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.ap.b(this.az);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.az = this.ap.a();
    }

    public final void aI(boolean z) {
        ampq j;
        xo xoVar = this.al.m;
        if (xoVar != null) {
            ajqm ajqmVar = ((ajsf) xoVar).f;
            int a = ajqmVar.a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < ajqmVar.a()) {
                    if (ajqmVar.c(i) instanceof aucd) {
                        a = i;
                        break;
                    } else if (this.al.getChildAt(i) == null) {
                        j = amon.a;
                        break;
                    } else {
                        i2 += this.al.getChildAt(i).getHeight();
                        i++;
                    }
                } else {
                    break;
                }
            }
            View childAt = this.al.getChildAt(a);
            j = childAt == null ? amon.a : ampq.j(Integer.valueOf(i2 + (childAt.getHeight() * (this.al.m.b() - a))));
            int i3 = j.h() ? zew.i(rb().getResources().getDisplayMetrics(), 365) : Integer.MAX_VALUE;
            int intValue = ((Integer) j.e(Integer.MAX_VALUE)).intValue();
            int max = Math.max(0, (this.ah.getHeight() - this.ai.getHeight()) - Math.min(i3, intValue));
            final int min = Math.min(Math.max(intValue - i3, 0), max);
            TopPeekingScrollView topPeekingScrollView = this.ak;
            if (max == topPeekingScrollView.k) {
                return;
            }
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.aB = valueAnimator;
                valueAnimator.setIntValues(this.ak.k, max);
                this.aB.setInterpolator(new app());
                this.aB.setDuration(this.aw);
                this.aB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ips
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        iqa iqaVar = iqa.this;
                        iqaVar.ak.g(((Integer) valueAnimator2.getAnimatedValue()).intValue(), min, false);
                    }
                });
                this.aB.start();
                return;
            }
            topPeekingScrollView.g(max, min, true);
        }
    }

    public final void aJ() {
        if (this.am == null || this.aA) {
            return;
        }
        this.al.setVisibility(0);
        this.al.ad(this.am);
        this.am = null;
        this.al.getViewTreeObserver().addOnGlobalLayoutListener(new ipy(this));
    }

    @Override // defpackage.nif
    public final void aK(boolean z) {
        if (z) {
            dismiss();
        } else {
            super.ku();
        }
    }

    @Override // defpackage.dh
    public final void dismiss() {
        this.aj.animate().alpha(0.0f).setDuration(this.af).start();
        this.ai.animate().translationY(this.ai.getHeight()).setDuration(this.ae).setStartDelay(this.ax).setInterpolator(new LinearInterpolator()).setListener(new ipw(this)).start();
        ValueAnimator valueAnimator = this.aB;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.aA = true;
        ViewPropertyAnimator animate = this.ak.animate();
        int height = this.ah.getHeight();
        int i = this.ak.k;
        animate.translationY(((height - i) - this.ai.getHeight()) + this.ak.getScrollY()).setDuration(this.ax).setInterpolator(new LinearInterpolator()).start();
    }

    @Override // defpackage.ipc, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        this.ay = (dt) context;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aabj aabjVar = (aabj) obj;
                if (!aabjVar.e().h()) {
                    return null;
                }
                this.av.i(this.as.a((atoo) aabjVar.e().c(), null).b());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aabj.class};
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, this.ar.a);
        this.at.g(this);
        this.at.d(new ipz(true));
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Window window = this.d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.playlist_add_to_fragment, viewGroup, false);
        this.ah = inflate;
        this.aj = inflate.findViewById(R.id.overlay);
        this.ak = (TopPeekingScrollView) this.ah.findViewById(R.id.top_peeking_scroll_view);
        RecyclerView recyclerView = (RecyclerView) this.ah.findViewById(R.id.list);
        this.al = recyclerView;
        recyclerView.ag(new LinearLayoutManager());
        this.al.setVisibility(4);
        this.ai = (OnAnimationEndRelativeLayout) this.ah.findViewById(R.id.add_to_playlist_bottom_sheet_close_button);
        int dimensionPixelSize = this.ah.getResources().getDimensionPixelSize(R.dimen.add_to_playlist_close_button_width);
        if (dimensionPixelSize > 0) {
            zgd.t(this.ai, zgd.r(dimensionPixelSize), ViewGroup.LayoutParams.class);
        }
        this.ai.setOnClickListener(new View.OnClickListener() { // from class: ipt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iqa.this.dismiss();
            }
        });
        this.ai.a = new Runnable() { // from class: ipu
            @Override // java.lang.Runnable
            public final void run() {
                iqa iqaVar = iqa.this;
                iqaVar.an = true;
                iqaVar.aJ();
            }
        };
        OnAnimationEndRelativeLayout onAnimationEndRelativeLayout = this.ai;
        zag.k(onAnimationEndRelativeLayout, onAnimationEndRelativeLayout.getBackground());
        this.ah.setOnApplyWindowInsetsListener(new ipv(this));
        this.aj.setOnClickListener(this);
        this.ak.f(rb().getResources().getDisplayMetrics().heightPixels - this.ag);
        TopPeekingScrollView topPeekingScrollView = this.ak;
        topPeekingScrollView.l = this.aj;
        topPeekingScrollView.m = this.al;
        this.aw = rh().getInteger(R.integer.abc_config_activityDefaultDur);
        this.ax = rh().getInteger(R.integer.abc_config_activityShortDur);
        this.ae = rh().getInteger(R.integer.abc_config_activityShortDur);
        this.af = rh().getInteger(17694720);
        this.au.d((BottomUiContainer) this.ah.findViewById(R.id.bottom_ui_container));
        this.ah.getViewTreeObserver().addOnGlobalLayoutListener(new ipy(this, 1));
        return this.ah;
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.ao;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.aj) {
            dismiss();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ah.addOnLayoutChangeListener(new ipx(this, this.ah.getHeight()));
    }
}
