package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: afb  reason: default package */
/* loaded from: classes2.dex */
public final class afb {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (afe.b != null && afe.b.a == view) {
            afe.c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new afe(view, charSequence);
            return;
        }
        if (afe.c != null && afe.c.a == view) {
            afe.c.b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
