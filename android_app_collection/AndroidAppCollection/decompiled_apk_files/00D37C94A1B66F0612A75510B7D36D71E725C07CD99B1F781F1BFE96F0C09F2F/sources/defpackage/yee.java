package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yee  reason: default package */
/* loaded from: classes4.dex */
public final class yee implements ajru {
    public final ajmy a;
    public final Activity b;
    public final aafo c;
    public final ajwo d;
    public final akbn e;
    public final ViewGroup f;
    public final yel g;
    public final acth h;
    public final ajve i;
    public akbi j = null;
    public asku k;
    public int l;
    private final FrameLayout m;
    private final acuh n;
    private yed o;
    private yed p;
    private yed q;

    public yee(Activity activity, ajmy ajmyVar, akbn akbnVar, aafo aafoVar, ajwm ajwmVar, yel yelVar, acuh acuhVar, acth acthVar, ajve ajveVar, ViewGroup viewGroup) {
        this.b = activity;
        this.a = ajmyVar;
        this.c = aafoVar;
        this.e = akbnVar;
        this.f = viewGroup;
        this.g = yelVar;
        this.n = acuhVar;
        this.h = acthVar;
        this.i = ajveVar;
        int orElse = zhn.j(activity, R.attr.ytStaticWhite).orElse(0);
        ajwn ajwnVar = ajwmVar.a;
        ajwnVar.g(orElse);
        ajwnVar.e(orElse);
        this.d = ajwnVar.a();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.m = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public static avhn d(asku askuVar, boolean z) {
        if (askuVar.d == 14) {
            avht avhtVar = ((avhu) askuVar.e).c;
            if (avhtVar == null) {
                avhtVar = avht.a;
            }
            if (z) {
                avhn avhnVar = avhtVar.d;
                return avhnVar == null ? avhn.a : avhnVar;
            }
            avhn avhnVar2 = avhtVar.c;
            return avhnVar2 == null ? avhn.a : avhnVar2;
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        asku askuVar = this.k;
        return askuVar != null && !askuVar.p;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        asku askuVar = (asku) obj;
        this.k = askuVar;
        this.l = this.b.getResources().getConfiguration().orientation;
        int B = akzj.B(this.k.h);
        if (B == 0) {
            B = 1;
        }
        int i = B - 1;
        int i2 = i != 1 ? i != 2 ? R.layout.interstitial_promo_view : R.layout.interstitial_edunitube_view : R.layout.onboarding_interstitial_promo_view;
        if (this.j == null) {
            Object d = ajrsVar.d("overlay_controller_param", null);
            if (d instanceof akbi) {
                this.j = (akbi) d;
            }
        }
        this.m.removeAllViews();
        if (this.l == 1) {
            yed yedVar = this.q;
            if (yedVar == null || i2 != yedVar.b) {
                this.q = new yed(this, i2, this.n);
            }
            this.o = this.q;
        } else {
            yed yedVar2 = this.p;
            if (yedVar2 == null || i2 != yedVar2.b) {
                this.p = new yed(this, i2, this.n);
            }
            this.o = this.p;
        }
        this.o.d(askuVar);
        this.m.addView(this.o.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.k = null;
    }
}
