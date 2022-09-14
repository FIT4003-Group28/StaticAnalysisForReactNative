package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jfy  reason: default package */
/* loaded from: classes7.dex */
public final class jfy extends FrameLayout {
    public jfy(Context context) {
        super(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jfy.class, cqmpVarArr);
    }

    private final boolean b() {
        Boolean bool = (Boolean) getTag(R.id.is_hidden_after_clipped);
        return bool != null && bool.booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (b()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final int getImportantForAccessibility() {
        if (b()) {
            return 4;
        }
        return super.getImportantForAccessibility();
    }

    @Override // android.view.View
    public final boolean isImportantForAccessibility() {
        if (b()) {
            return false;
        }
        return super.isImportantForAccessibility();
    }

    public jfy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jfy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
