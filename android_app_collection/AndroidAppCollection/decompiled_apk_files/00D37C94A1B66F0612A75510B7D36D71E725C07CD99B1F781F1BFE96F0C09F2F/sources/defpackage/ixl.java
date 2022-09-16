package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ixl  reason: default package */
/* loaded from: classes3.dex */
public final class ixl extends ixd {
    public azqb ag;
    public azqb ah;
    public azqb ai;
    public azqb aj;
    public acth ak;
    public yni al;
    public azqb am;
    public azqb an;

    public static int aH(Context context) {
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) || typedValue.data == 0) ? com.google.cardboard.sdk.R.style.Theme_AppCompat_Dialog : com.google.cardboard.sdk.R.style.Theme_AppCompat_Light_Dialog;
    }

    @Override // defpackage.bfm
    public final bfl aE(Context context) {
        return new ixk(context, aH(context), this.ag, this.ah, this.ai, this.aj, this.ak.oi(), this.al, this.am, this.an);
    }
}
