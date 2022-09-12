package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cweo  reason: default package */
/* loaded from: classes5.dex */
public final class cweo extends cwef {
    @Override // defpackage.cwef
    public final int a() {
        return R.string.og_turn_on_incognito_mode;
    }

    @Override // defpackage.cwef
    public final int b() {
        return R.string.og_turn_off_incognito_mode;
    }

    @Override // defpackage.cwef
    public final int c() {
        return R.string.og_incognito_disc;
    }

    @Override // defpackage.cwef
    public final Drawable d(Context context, cwgf cwgfVar) {
        return cwiz.b(cwiz.c(context, R.drawable.ic_incognito_circle_without_margins_black_24dp), cwgfVar.b);
    }

    @Override // defpackage.cwef
    public final Drawable e(Context context) {
        return cwiz.c(context, R.drawable.quantum_ic_incognito_vd_theme_24);
    }
}
