package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
/* compiled from: PG */
/* renamed from: jiz  reason: default package */
/* loaded from: classes7.dex */
public final class jiz extends ScrollView {
    @dzsi
    private jiy a;

    public jiz(Context context) {
        super(context);
        this.a = null;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        jiy jiyVar = this.a;
        if (jiyVar != null) {
            jiyVar.a(this);
        }
    }

    public void setScrollChangedListener(jiy jiyVar) {
        this.a = jiyVar;
    }

    public jiz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public jiz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
    }
}
