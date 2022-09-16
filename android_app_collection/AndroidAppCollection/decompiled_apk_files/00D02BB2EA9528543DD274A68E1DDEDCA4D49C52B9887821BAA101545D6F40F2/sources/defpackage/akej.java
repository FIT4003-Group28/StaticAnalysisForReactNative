package defpackage;
/* compiled from: PG */
/* renamed from: akej  reason: default package */
/* loaded from: classes2.dex */
public final class akej extends akep {
    public akeo a;
    public dbsg<cqiw<cqkp>> b = dbpy.a;
    private aken c;
    private akeu d;

    @Override // defpackage.akep
    public final aken a() {
        if (this.c == null) {
            this.c = akeu.k();
        }
        return this.c;
    }

    @Override // defpackage.akep
    public final akeq b() {
        aken akenVar = this.c;
        if (akenVar != null) {
            this.d = akenVar.j();
        } else if (this.d == null) {
            this.d = akeu.k().j();
        }
        String str = this.a == null ? " ensuredAccountCallback" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new akek(this.a, this.b, this.d);
    }
}
