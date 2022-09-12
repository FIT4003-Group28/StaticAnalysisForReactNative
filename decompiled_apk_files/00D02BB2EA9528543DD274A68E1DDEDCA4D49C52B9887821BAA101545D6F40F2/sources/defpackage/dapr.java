package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.ProgressBar;
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* renamed from: dapr  reason: default package */
/* loaded from: classes5.dex */
public final class dapr implements daoz {
    public final TemplateLayout a;
    public ColorStateList b;

    public dapr(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final ProgressBar a() {
        return (ProgressBar) this.a.findViewById(R.id.sud_layout_progress);
    }

    public final void b(ColorStateList colorStateList) {
        this.b = colorStateList;
        ProgressBar a = a();
        if (a != null) {
            a.setIndeterminateTintList(colorStateList);
            if (Build.VERSION.SDK_INT < 23 && colorStateList == null) {
                return;
            }
            a.setProgressBackgroundTintList(colorStateList);
        }
    }
}
