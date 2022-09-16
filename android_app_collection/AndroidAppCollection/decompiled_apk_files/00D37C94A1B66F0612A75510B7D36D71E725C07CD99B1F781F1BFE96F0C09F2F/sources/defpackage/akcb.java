package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: akcb  reason: default package */
/* loaded from: classes.dex */
final class akcb extends ajqi {
    public akcb(Context context, ajsa ajsaVar) {
        super(context, ajsaVar);
    }

    @Override // defpackage.ajqi
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return frameLayout;
    }
}
