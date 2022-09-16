package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: nls  reason: default package */
/* loaded from: classes3.dex */
final class nls extends FrameLayout {
    final /* synthetic */ nlu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nls(nlu nluVar, Context context) {
        super(context);
        this.a = nluVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.a.a();
    }
}
