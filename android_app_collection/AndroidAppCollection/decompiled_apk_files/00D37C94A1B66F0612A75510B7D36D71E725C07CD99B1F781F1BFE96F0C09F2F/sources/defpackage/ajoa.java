package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajoa  reason: default package */
/* loaded from: classes.dex */
public final class ajoa {
    final /* synthetic */ ajod a;

    public ajoa(ajod ajodVar) {
        this.a = ajodVar;
    }

    public final cgg a(Context context) {
        try {
            return cfk.c(context);
        } catch (IllegalArgumentException e) {
            if (!((apfc) this.a.c.get()).h) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Failed to get RequestManager: ");
            if (context instanceof dt) {
                sb.append("FA");
            } else if (context instanceof Activity) {
                sb.append("A");
            } else if (context instanceof ContextWrapper) {
                sb.append("CW");
            }
            sb.append(" : ");
            sb.append(context.getClass().getName());
            afus.c(2, 16, sb.toString(), e);
            zep.d(sb.toString(), e);
            return null;
        }
    }
}
