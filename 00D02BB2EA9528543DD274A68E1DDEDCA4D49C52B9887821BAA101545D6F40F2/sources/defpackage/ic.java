package defpackage;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: ic  reason: default package */
/* loaded from: classes6.dex */
public final class ic extends ih {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.widget.RemoteViews h(android.widget.RemoteViews r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic.h(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
    }

    @Override // defpackage.ih
    protected final String a() {
        return "android.support.v4.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // defpackage.ih
    public final void b(hw hwVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((ii) hwVar).a.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    @Override // defpackage.ih
    public final RemoteViews m() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        ib ibVar = this.d;
        RemoteViews remoteViews = ibVar.F;
        if (remoteViews == null) {
            remoteViews = ibVar.E;
        }
        if (remoteViews != null) {
            return h(remoteViews, true);
        }
        return null;
    }

    @Override // defpackage.ih
    public final RemoteViews n() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT < 24 && (remoteViews = this.d.E) != null) {
            return h(remoteViews, false);
        }
        return null;
    }

    @Override // defpackage.ih
    public final RemoteViews o() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        RemoteViews remoteViews = this.d.E;
        return null;
    }
}
