package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
/* compiled from: PG */
/* renamed from: jix  reason: default package */
/* loaded from: classes7.dex */
public final class jix extends HorizontalScrollView {
    @dzsi
    private jiw a;

    public jix(Context context) {
        super(context);
        this.a = null;
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, jiw> cqlcVar) {
        return cqjv.f(iug.SCROLL_CHANGED_LISTENER, cqlcVar);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jix.class, cqmpVarArr);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        jiw jiwVar = this.a;
        if (jiwVar != null) {
            jiwVar.a(i);
        }
    }

    public void setScrollChangedListener(jiw jiwVar) {
        this.a = jiwVar;
    }

    public jix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public jix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
    }
}
