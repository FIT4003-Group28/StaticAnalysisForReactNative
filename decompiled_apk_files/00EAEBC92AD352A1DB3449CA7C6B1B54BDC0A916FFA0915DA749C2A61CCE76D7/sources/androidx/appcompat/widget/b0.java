package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: b  reason: collision with root package name */
    private final y f1213b;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1213b = new y(this);
        this.f1213b.a(attributeSet, i);
    }
}
