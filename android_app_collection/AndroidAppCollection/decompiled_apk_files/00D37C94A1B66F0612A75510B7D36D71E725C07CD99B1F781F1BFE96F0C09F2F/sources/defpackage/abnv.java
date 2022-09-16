package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnv  reason: default package */
/* loaded from: classes.dex */
public final class abnv extends abmv {
    private final RelativeLayout f;

    public abnv(Context context, ajmr ajmrVar, acth acthVar, aafo aafoVar, ajod ajodVar, zhf zhfVar) {
        super(context, ajmrVar, acthVar, aafoVar, ajodVar, zhfVar);
        this.f = (RelativeLayout) this.c.findViewById(R.id.live_chat_sticker_background);
    }

    @Override // defpackage.abmv
    public final int f() {
        return R.layout.live_chat_paid_sticker;
    }

    @Override // defpackage.abmv, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.c.setBackgroundColor(0);
        ((GradientDrawable) this.f.getBackground()).setColor(0);
    }
}
