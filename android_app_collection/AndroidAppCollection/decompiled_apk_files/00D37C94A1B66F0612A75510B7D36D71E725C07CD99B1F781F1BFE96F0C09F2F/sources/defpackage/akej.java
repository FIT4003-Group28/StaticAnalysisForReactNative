package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
/* compiled from: PG */
/* renamed from: akej  reason: default package */
/* loaded from: classes.dex */
public final class akej {
    public int a;
    public Drawable b;
    private final Context c;
    private int d;

    private akej(Context context) {
        this.c = context;
    }

    public static akej a(Context context) {
        akej akejVar = new akej(context);
        akejVar.a = TouchFeedbackDrawable.a(context.getResources(), context.getTheme());
        akejVar.c(0);
        return akejVar;
    }

    public final TouchFeedbackDrawable b() {
        return new TouchFeedbackDrawable(this.a, zew.i(this.c.getResources().getDisplayMetrics(), 1), this.d, this.b, null);
    }

    public final void c(int i) {
        if (i != -1 && i != -2) {
            i = zew.i(this.c.getResources().getDisplayMetrics(), i);
        }
        this.d = i;
    }
}
