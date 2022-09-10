package defpackage;
/* compiled from: PG */
/* renamed from: uim  reason: default package */
/* loaded from: classes.dex */
public final class uim implements qbv {
    private final btvo a;

    public uim(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.qbv
    public final boolean a() {
        return b();
    }

    @Override // defpackage.qbv
    public final boolean b() {
        return this.a.getEnableFeatureParameters().bi;
    }

    @Override // defpackage.qbv
    public final boolean c() {
        return this.a.getPassiveAssistParameters().a().al;
    }

    @Override // defpackage.qbv
    public final boolean d() {
        return false;
    }

    @Override // defpackage.qbv
    public final boolean e() {
        return false;
    }
}
