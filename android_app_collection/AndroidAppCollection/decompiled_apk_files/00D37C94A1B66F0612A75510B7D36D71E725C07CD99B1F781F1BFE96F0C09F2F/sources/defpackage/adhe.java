package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adhe  reason: default package */
/* loaded from: classes.dex */
public final class adhe extends adgr {
    public azqb ag;

    @Override // defpackage.bfm
    public final bfl aE(Context context) {
        TypedValue typedValue = new TypedValue();
        boolean resolveAttribute = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true);
        int i = com.google.cardboard.sdk.R.style.Theme_AppCompat_Dialog;
        if (resolveAttribute && typedValue.data != 0) {
            i = com.google.cardboard.sdk.R.style.Theme_AppCompat_Light_Dialog;
        }
        return new adhd(context, i, this.ag);
    }
}
