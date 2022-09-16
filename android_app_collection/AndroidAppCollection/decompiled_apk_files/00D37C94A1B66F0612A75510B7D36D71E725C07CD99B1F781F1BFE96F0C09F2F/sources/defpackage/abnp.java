package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnp  reason: default package */
/* loaded from: classes.dex */
public final class abnp extends abmg {
    public abnp(Context context, acth acthVar, ajmy ajmyVar, ajvm ajvmVar, aafo aafoVar, ajxz ajxzVar) {
        super(context, acthVar, ajmyVar, ajvmVar, aafoVar, ajxzVar);
    }

    @Override // defpackage.abmg
    protected final boolean d() {
        return true;
    }

    @Override // defpackage.abmg
    protected final int e() {
        return R.layout.live_chat_overlay_membership_item;
    }

    @Override // defpackage.abmg
    protected final Drawable f() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_overlay_paid_message_full_background);
    }

    @Override // defpackage.abmg
    protected final Drawable g() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_overlay_paid_message_top_background);
    }
}
