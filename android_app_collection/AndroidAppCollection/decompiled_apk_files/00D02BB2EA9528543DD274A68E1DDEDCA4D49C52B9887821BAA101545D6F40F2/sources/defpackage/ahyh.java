package defpackage;
/* compiled from: PG */
/* renamed from: ahyh  reason: default package */
/* loaded from: classes2.dex */
public final class ahyh implements dbsl<afga> {
    private final btvo a;

    public ahyh(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        afga afgaVar2 = afgaVar;
        return this.a.getEnableFeatureParameters().z && afgaVar2.a().endsWith("LocationSharesForPersonalSafetyShortcutActivity") && afgaVar2.a.hasExtra("com.google.android.apps.gmm.locationsharing.intent.LocationSharesForPersonalSafetyShortcutIntent.obfuscatedGaiaId");
    }
}
