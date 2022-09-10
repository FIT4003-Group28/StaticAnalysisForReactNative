package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahwr  reason: default package */
/* loaded from: classes2.dex */
public final class ahwr extends afhx {
    private final dxio<ahwf> a;

    public ahwr(Intent intent, @dzsi String str, dxio<ahwf> dxioVar) {
        super(intent, str, afid.LOCATION_SHARING_FIX_MISCONFIGURATIONS);
        this.a = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("obfuscatedGaiaId");
        boolean booleanExtra = this.f.getBooleanExtra("shouldEnableReportingExtra", false);
        PendingIntent pendingIntent = (PendingIntent) this.f.getParcelableExtra("returnIntentExtra");
        dbsk.s(stringExtra);
        dbsk.s(pendingIntent);
        this.a.a().t(stringExtra, booleanExtra, pendingIntent);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return true;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
