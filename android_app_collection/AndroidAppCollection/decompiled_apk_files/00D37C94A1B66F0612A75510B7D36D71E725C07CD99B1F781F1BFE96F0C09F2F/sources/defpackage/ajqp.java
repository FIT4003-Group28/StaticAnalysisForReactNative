package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: ajqp  reason: default package */
/* loaded from: classes.dex */
final class ajqp extends ajqi {
    public ajqp(Context context, ajsa ajsaVar) {
        super(context, ajsaVar);
    }

    @Override // defpackage.ajqi
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        return frameLayout;
    }
}
