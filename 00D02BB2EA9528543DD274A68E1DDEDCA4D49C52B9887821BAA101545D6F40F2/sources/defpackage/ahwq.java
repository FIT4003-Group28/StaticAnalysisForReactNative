package defpackage;
/* compiled from: PG */
/* renamed from: ahwq  reason: default package */
/* loaded from: classes2.dex */
public final class ahwq implements dbsl<afga> {
    private final btvo a;

    public ahwq(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        afga afgaVar2 = afgaVar;
        dkof dkofVar = this.a.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        return !dkofVar.r && this.a.getLocationSharingParameters().b && this.a.getLocationSharingParameters().c && afgaVar2.a().endsWith("LocationShareFixConfigIntentActivity") && afgaVar2.a.hasExtra("obfuscatedGaiaId") && afgaVar2.a.hasExtra("shouldEnableReportingExtra") && afgaVar2.a.hasExtra("returnIntentExtra");
    }
}
