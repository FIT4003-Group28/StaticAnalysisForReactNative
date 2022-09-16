package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: xth  reason: default package */
/* loaded from: classes4.dex */
final class xth extends ajqi {
    public xth(Context context, ajsa ajsaVar) {
        super(context, ajsaVar);
    }

    @Override // defpackage.ajqi
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
