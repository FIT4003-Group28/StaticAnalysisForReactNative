package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajck  reason: default package */
/* loaded from: classes2.dex */
final class ajck implements ajds {
    public final ajcl a;
    private final cjmt b;

    public ajck(cjmt cjmtVar, ajcl ajclVar) {
        this.b = cjmtVar;
        this.a = ajclVar;
    }

    public final boolean a(View view, Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            if ((b(context) - ((int) (context.getResources().getDisplayMetrics().density * 64.0f))) - ajcl.b(view) >= ajcl.a(view)) {
                return true;
            }
        }
        return false;
    }

    public final int b(Context context) {
        return (context.getResources().getDisplayMetrics().heightPixels - this.b.e()) - this.b.h();
    }
}
