package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: oik  reason: default package */
/* loaded from: classes3.dex */
public final class oik implements fsc {
    public final frf a;
    public final ColorDrawable b;
    public final int c;
    public final int d;
    private final Activity e;
    private final oij f;

    public oik(Activity activity, oah oahVar, aynx aynxVar) {
        int d = zhn.d(activity, R.attr.ytBrandBackgroundSolid);
        this.c = d;
        this.d = ake.d(activity, R.color.yt_black_pure);
        ColorDrawable colorDrawable = new ColorDrawable(d);
        this.b = colorDrawable;
        final frf frfVar = new frf(colorDrawable, 0, 0);
        this.a = frfVar;
        frfVar.c(48);
        this.e = activity;
        oij oijVar = new oij();
        oijVar.b(fsb.BASE, 1.0f);
        oijVar.c(fsb.BASE, zhn.d(activity, R.attr.ytGeneralBackgroundA));
        oijVar.b(fsb.PLAYER, 0.0f);
        oijVar.c(fsb.PLAYER, ake.d(activity, R.color.yt_black_pure));
        this.f = oijVar;
        oahVar.a(new oih(this, 1));
        oahVar.a(new oih(this));
        activity.getWindow().setStatusBarColor(0);
        aynxVar.C(oav.i).Z(new ayqb() { // from class: oig
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                frf.this.d(((Integer) obj).intValue());
            }
        });
    }

    private final void c(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = this.e.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(zdb.c(i) > 0.8d ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        this.a.b(i);
    }

    @Override // defpackage.fsc
    public final void a(fsb fsbVar, float f) {
        this.f.b(fsbVar, f);
        c(this.f.a());
    }

    @Override // defpackage.fsc
    public final void b(fsb fsbVar, int i) {
        this.f.c(fsbVar, i);
        c(this.f.a());
    }
}
