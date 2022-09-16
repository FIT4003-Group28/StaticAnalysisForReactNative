package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mfo  reason: default package */
/* loaded from: classes3.dex */
public final class mfo extends ajsl {
    public final Context a;
    public final ajxz b;
    public final ajve c;
    public final akbn d;
    public final gfu e;
    private final ViewGroup f;
    private final ajmy g;
    private mfn h;
    private mfn i;
    private final int j;

    public mfo(Context context, frv frvVar, ajxz ajxzVar, ajve ajveVar, akbn akbnVar, ajmy ajmyVar, gfu gfuVar) {
        this.a = context;
        this.b = ajxzVar;
        this.f = new FrameLayout(context);
        this.c = ajveVar;
        this.d = akbnVar;
        this.g = ajmyVar;
        this.e = gfuVar;
        this.j = frvVar.c();
    }

    public static int f(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600 ? R.dimen.background_promo_default_padding_sw600dp : (context.getResources().getConfiguration().orientation != 2 || context.getResources().getConfiguration().screenWidthDp < 480) ? R.dimen.background_promo_default_padding : R.dimen.background_promo_default_padding_w480dp_land;
    }

    private static View g(apke apkeVar, Context context) {
        apkf apkfVar = apkeVar.j;
        if (apkfVar == null) {
            apkfVar = apkf.a;
        }
        int h = h(apkfVar);
        if (h == 4) {
            View inflate = View.inflate(context, R.layout.background_promo_zero_state, null);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(f(context));
            inflate.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return inflate;
        } else if (h == 5) {
            View inflate2 = View.inflate(context, R.layout.background_promo_empty_state, null);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(f(context));
            inflate2.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            return inflate2;
        } else {
            if (context.getResources().getConfiguration().orientation == 2) {
                if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                    return View.inflate(context, R.layout.background_promo_sw600dp_land, null);
                }
                if (context.getResources().getConfiguration().screenWidthDp >= 480) {
                    return View.inflate(context, R.layout.background_promo_w480dp_land, null);
                }
            }
            View inflate3 = View.inflate(context, R.layout.background_promo, null);
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(f(context));
            inflate3.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            return inflate3;
        }
    }

    private static int h(apkf apkfVar) {
        int o;
        if (apkfVar == null || (o = akpq.o(apkfVar.c)) == 0) {
            return 1;
        }
        return o;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfo.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apke) obj).k.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mfn mfnVar = this.h;
        if (mfnVar != null) {
            mfnVar.a();
        }
        mfn mfnVar2 = this.i;
        if (mfnVar2 != null) {
            mfnVar2.a();
        }
        this.h = null;
        this.i = null;
    }
}
