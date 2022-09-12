package defpackage;
/* compiled from: PG */
/* renamed from: apzk  reason: default package */
/* loaded from: classes2.dex */
final class apzk extends apzo {
    private Boolean a;

    public apzk() {
    }

    public apzk(apzp apzpVar) {
        this.a = Boolean.valueOf(((apzl) apzpVar).a);
    }

    @Override // defpackage.apzo
    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.apzo
    public final apzp a() {
        String str = this.a == null ? " readReceiptsEnabled" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new apzl(this.a.booleanValue());
    }
}
