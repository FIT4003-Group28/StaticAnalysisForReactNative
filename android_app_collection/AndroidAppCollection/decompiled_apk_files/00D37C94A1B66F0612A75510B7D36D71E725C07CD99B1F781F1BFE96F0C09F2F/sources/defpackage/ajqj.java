package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ajqj  reason: default package */
/* loaded from: classes.dex */
final class ajqj extends ajqi {
    public ajqj(Context context, ajsa ajsaVar) {
        super(context, ajsaVar);
    }

    @Override // defpackage.ajqi
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new br(0));
        frameLayout.setId(View.generateViewId());
        return frameLayout;
    }
}
