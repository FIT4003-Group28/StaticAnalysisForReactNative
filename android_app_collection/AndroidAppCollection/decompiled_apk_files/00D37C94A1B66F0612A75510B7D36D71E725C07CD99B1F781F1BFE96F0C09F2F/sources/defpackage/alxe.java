package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alxe  reason: default package */
/* loaded from: classes.dex */
public final class alxe implements alwk {
    public final TemplateLayout a;
    public final boolean b;

    public alxe(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, alwr.n, i, 0);
            z = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getBoolean(0, false) : z;
            obtainStyledAttributes.recycle();
            ProgressBar a = a();
            if (a != null) {
                a.setVisibility(true != this.b ? 8 : 4);
            }
        }
        this.b = z;
    }

    public final ProgressBar a() {
        return (ProgressBar) this.a.findViewById(true != this.b ? R.id.sud_layout_progress : R.id.sud_glif_progress_bar);
    }
}
