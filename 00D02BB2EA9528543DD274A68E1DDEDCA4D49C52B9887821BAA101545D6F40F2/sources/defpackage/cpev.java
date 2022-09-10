package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.SettingDisplayInfo;
/* compiled from: PG */
/* renamed from: cpev  reason: default package */
/* loaded from: classes5.dex */
final class cpev extends cpeu implements cpdr {
    private final SettingDisplayInfo a;

    public cpev(Status status, PendingIntent pendingIntent, SettingDisplayInfo settingDisplayInfo) {
        super(status, pendingIntent);
        this.a = settingDisplayInfo;
    }

    @Override // defpackage.cpdr
    public final SettingDisplayInfo d() {
        return this.a;
    }
}
