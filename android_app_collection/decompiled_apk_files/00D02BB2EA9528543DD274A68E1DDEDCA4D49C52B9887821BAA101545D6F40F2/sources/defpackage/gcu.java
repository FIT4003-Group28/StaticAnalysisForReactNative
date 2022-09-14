package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: PG */
/* renamed from: gcu  reason: default package */
/* loaded from: classes6.dex */
public final class gcu {
    public static boolean a(Context context) {
        Activity b = b(context);
        rb rbVar = b instanceof rb ? (rb) b : null;
        if (b == null || b.isFinishing() || (rbVar != null && !rbVar.g.a.a(j.CREATED))) {
            dcqe.b.v(dcqz.MEDIUM);
            return false;
        } else if (rbVar != null && rbVar.g.a.a(j.STARTED)) {
            return true;
        } else {
            dcqe.b.v(dcqz.MEDIUM);
            return true;
        }
    }

    @dzsi
    public static Activity b(Context context) {
        while (context instanceof ContextWrapper) {
            if (!(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}
