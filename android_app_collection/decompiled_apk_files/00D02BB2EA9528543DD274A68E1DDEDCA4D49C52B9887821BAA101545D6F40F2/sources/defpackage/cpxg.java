package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
/* compiled from: PG */
/* renamed from: cpxg  reason: default package */
/* loaded from: classes5.dex */
public final class cpxg extends cqam {
    private final cpxf b;
    private final NfcAdapter c;
    private final IntentFilter[] d;
    private final PendingIntent e;
    private boolean f = false;
    public int a = 1;

    public cpxg(Context context, cpxf cpxfVar) {
        this.b = cpxfVar;
        this.c = NfcAdapter.getDefaultAdapter(context);
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        intentFilter.addDataScheme("google.assistant.drivingmode");
        this.d = new IntentFilter[]{intentFilter};
        this.e = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
    }

    private final boolean b(Activity activity) {
        cpxf cpxfVar = this.b;
        return cpxfVar != null && cpxfVar.b().a() && this.b.b().b() == activity;
    }

    public final void a() {
        dbsg<Activity> b = this.b.b();
        if (this.c == null || !b.a() || !this.f) {
            b.a();
        } else if (this.a == 5) {
            this.c.enableForegroundDispatch(b.b(), this.e, this.d, null);
        } else {
            this.c.disableForegroundDispatch(b.b());
        }
    }

    @Override // defpackage.cqam, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!b(activity)) {
            return;
        }
        this.f = false;
    }

    @Override // defpackage.cqam, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!b(activity)) {
            return;
        }
        this.f = true;
        a();
    }
}
