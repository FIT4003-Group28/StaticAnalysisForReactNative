package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: cuty  reason: default package */
/* loaded from: classes5.dex */
public final class cuty extends FrameLayout implements cuww, cuvv {
    public final LayoutInflater a;

    public cuty(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuww
    public final void b() {
        removeAllViews();
    }

    public void setPresenter(cvdk cvdkVar) {
    }

    @Override // defpackage.cuvv
    public /* bridge */ /* synthetic */ void setPresenter(Object obj) {
        cvdk cvdkVar = (cvdk) obj;
    }

    public cuty(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cuty(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = LayoutInflater.from(context);
    }
}
