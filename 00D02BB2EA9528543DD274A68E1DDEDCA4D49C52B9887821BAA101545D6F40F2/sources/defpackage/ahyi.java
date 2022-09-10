package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyi  reason: default package */
/* loaded from: classes2.dex */
public final class ahyi extends afhx {
    private final ahwf a;

    public ahyi(Intent intent, @dzsi String str, ahwf ahwfVar) {
        super(intent, str, afid.LOCATION_SHARES_FOR_PERSONAL_SAFETY_SHORTCUT);
        this.a = ahwfVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.a.m(dbsg.j(this.f.getStringExtra("com.google.android.apps.gmm.locationsharing.intent.LocationSharesForPersonalSafetyShortcutIntent.obfuscatedGaiaId")), ahwe.PERSONAL_SAFETY_OUTLINK);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_LOCATION_SHARING;
    }
}
