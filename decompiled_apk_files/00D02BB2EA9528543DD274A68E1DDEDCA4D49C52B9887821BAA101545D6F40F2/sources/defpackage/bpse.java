package defpackage;
/* compiled from: PG */
/* renamed from: bpse  reason: default package */
/* loaded from: classes4.dex */
final class bpse extends bpso {
    public dbsg<alad> a = dbpy.a;
    private dbsg<Boolean> b = dbpy.a;

    @Override // defpackage.bpso
    public final bpsp a() {
        return new bpsf(this.a, this.b);
    }

    @Override // defpackage.bpso
    public final void b(boolean z) {
        this.b = dbsg.i(Boolean.valueOf(z));
    }
}
