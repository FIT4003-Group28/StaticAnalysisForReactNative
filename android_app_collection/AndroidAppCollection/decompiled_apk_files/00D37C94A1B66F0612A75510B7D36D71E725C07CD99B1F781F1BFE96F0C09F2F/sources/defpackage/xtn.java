package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: xtn  reason: default package */
/* loaded from: classes4.dex */
public final class xtn extends ajqi {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ajsa] */
    public xtn(Context context, ajyi ajyiVar) {
        super(context, ajyiVar.get());
    }

    @Override // defpackage.ajqi
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
