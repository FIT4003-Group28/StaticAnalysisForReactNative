package defpackage;
/* compiled from: PG */
/* renamed from: ahyq  reason: default package */
/* loaded from: classes.dex */
public final class ahyq implements dbsl<afga> {
    private final btvo a;

    public ahyq(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        afga afgaVar2 = afgaVar;
        if (afgaVar2.a.getBooleanExtra("com.google.android.apps.gmm.locationsharing.waitForClientParameters", false) || this.a.getEnableFeatureParameters().z) {
            return (afgaVar2.a().endsWith("ShowSharedLocationsScreenActivity") && afgaVar2.a.hasExtra("selectionReason")) || afgaVar2.a().endsWith("LocationShareShortcutActivity");
        }
        return false;
    }
}
