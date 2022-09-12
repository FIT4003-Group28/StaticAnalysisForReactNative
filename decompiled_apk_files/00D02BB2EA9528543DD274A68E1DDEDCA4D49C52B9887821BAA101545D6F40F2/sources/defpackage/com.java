package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: com  reason: default package */
/* loaded from: classes5.dex */
public final class com extends FrameLayout {
    private int a;

    public com(Context context) {
        this(context, null, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.a == 1) {
            if (i != 33 && i != 130 && i != 17) {
                if (i == 66) {
                    i = 66;
                }
            }
            arrayList.add(this);
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.a == 1) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(262144);
            boolean requestFocus = super.requestFocus(i, rect);
            setDescendantFocusability(descendantFocusability);
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public void setForceFieldType(con conVar) {
        col.a(this, conVar);
    }

    public void setRequestFocusDescendantFocusability(int i) {
        this.a = i;
    }

    public com(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
    }

    public com(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public com(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cox.a, i, 0);
        try {
            con a = con.a(obtainStyledAttributes.getInteger(0, 0), con.NONE);
            int integer = obtainStyledAttributes.getInteger(1, 0);
            if (integer != 0 && integer != 1) {
                throw new IllegalArgumentException("Could not resolve requestFocusDescendantFocusability");
            }
            this.a = integer;
            obtainStyledAttributes.recycle();
            col.a(this, a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
