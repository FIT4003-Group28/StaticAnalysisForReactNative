package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: xte  reason: default package */
/* loaded from: classes4.dex */
final class xte extends ajqi {
    public xte(Context context, ajsa ajsaVar) {
        super(context, ajsaVar);
    }

    @Override // defpackage.ajqi
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    public final View b(ajrs ajrsVar, aqav aqavVar, int i) {
        ajrs d = d(ajrsVar);
        d.f("replyIndex", Integer.valueOf(i));
        d.f("indentedComment", true);
        return c(d, aqavVar);
    }
}
