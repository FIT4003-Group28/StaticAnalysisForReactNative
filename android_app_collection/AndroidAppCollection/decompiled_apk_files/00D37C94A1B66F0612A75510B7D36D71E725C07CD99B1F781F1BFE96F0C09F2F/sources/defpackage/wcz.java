package defpackage;
/* compiled from: PG */
/* renamed from: wcz  reason: default package */
/* loaded from: classes4.dex */
public final class wcz implements wdc {
    @Override // defpackage.wcy
    public final boolean a() {
        return false;
    }

    @Override // defpackage.wdc
    public final void b(wda wdaVar) {
        zep.l("Fingerprint auth not available for pre M devices. Ignore fingerprint authenticate attempt");
        ((wbn) wdaVar).f();
    }

    @Override // defpackage.wdc
    public final void c() {
        zep.l("Fingerprint auth not available for pre M devices. Ignore fingerprint cancel attempt");
    }
}
