package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hlr  reason: default package */
/* loaded from: classes3.dex */
public final class hlr extends zmf {
    private final zmb e;
    private final ImageView f;
    private final Context g;

    public hlr(Context context, zmb zmbVar, ImageView imageView, acti actiVar) {
        super(zmbVar, imageView, actiVar, null);
        this.e = zmbVar;
        this.f = imageView;
        this.g = context;
    }

    @Override // defpackage.zmf
    public final void g(boolean z, boolean z2, boolean z3) {
        if (this.e.K(z)) {
            this.f.setImageDrawable(this.g.getResources().getDrawable(true != z ? 2131232886 : 2131232887));
            if (z3) {
                i(z);
            }
            this.f.setContentDescription(this.g.getString(true != z ? R.string.accessibility_turn_flashlight_on_button : R.string.accessibility_turn_flashlight_off_button));
        }
    }
}
