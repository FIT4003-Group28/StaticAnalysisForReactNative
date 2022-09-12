package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.SettingDisplayInfo;
/* compiled from: PG */
/* renamed from: cpen  reason: default package */
/* loaded from: classes5.dex */
public final class cpen extends cpei {
    final /* synthetic */ cpeo a;

    /* JADX INFO: Access modifiers changed from: protected */
    public cpen(cpeo cpeoVar) {
        this.a = cpeoVar;
    }

    @Override // defpackage.cpei, defpackage.cpea
    public final void b(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent) {
        this.a.p(new cpev(status, pendingIntent, settingDisplayInfo));
    }
}
