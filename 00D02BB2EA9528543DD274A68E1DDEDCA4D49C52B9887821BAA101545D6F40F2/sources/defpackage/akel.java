package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akel  reason: default package */
/* loaded from: classes2.dex */
public final class akel extends aker {
    public aket a;
    private aken b;
    private akeu c;
    private dbsg<dktk> d = dbpy.a;
    private dbsg<Boolean> e = dbpy.a;

    @Override // defpackage.aker
    public final aken a() {
        if (this.b == null) {
            this.b = akeu.k();
        }
        return this.b;
    }

    @Override // defpackage.aker
    public final akes b() {
        aken akenVar = this.b;
        if (akenVar != null) {
            this.c = akenVar.j();
        } else if (this.c == null) {
            this.c = akeu.k().j();
        }
        String str = this.a == null ? " ensuredAccountCallback" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new akem(this.a, this.c, this.d, this.e);
    }

    @Override // defpackage.aker
    public final void c(dktk dktkVar) {
        this.d = dbsg.i(dktkVar);
    }

    @Override // defpackage.aker
    public final void d(boolean z) {
        this.e = dbsg.i(Boolean.valueOf(z));
    }
}
