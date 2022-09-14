package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected void c() {
        auy auyVar = this.k.f;
        if (auyVar != null) {
            auyVar.i(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kb.k(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avf.c, i, i2);
        String h = kb.h(obtainStyledAttributes, 9, 0);
        this.a = h;
        if (h == null) {
            this.a = u();
        }
        this.b = kb.h(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = kb.h(obtainStyledAttributes, 11, 3);
        this.e = kb.h(obtainStyledAttributes, 10, 4);
        this.f = kb.g(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
