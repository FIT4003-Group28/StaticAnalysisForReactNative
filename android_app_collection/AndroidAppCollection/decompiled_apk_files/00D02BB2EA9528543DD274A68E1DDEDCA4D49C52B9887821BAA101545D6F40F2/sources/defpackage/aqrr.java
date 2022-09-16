package defpackage;

import android.service.notification.StatusBarNotification;
/* compiled from: PG */
/* renamed from: aqrr  reason: default package */
/* loaded from: classes2.dex */
public final class aqrr {
    public final auhi a;

    public aqrr(auhi auhiVar) {
        this.a = auhiVar;
    }

    public final dbsg<StatusBarNotification> a(String str) {
        dbsg<StatusBarNotification> r = this.a.r(str, dpyv.BUSINESS_MESSAGE_FROM_MERCHANT.dm);
        return r.a() ? r : this.a.r(str, dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm);
    }
}
