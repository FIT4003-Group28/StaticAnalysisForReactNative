package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.widget.RemoteViews;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ii  reason: default package */
/* loaded from: classes6.dex */
public final class ii implements hw {
    public final Notification.Builder a;
    public final ib b;
    public RemoteViews c;
    public RemoteViews d;
    public final Bundle e;
    public int f;

    /* JADX WARN: Removed duplicated region for block: B:133:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ii(defpackage.ib r19) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii.<init>(ib):void");
    }

    public static final void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
