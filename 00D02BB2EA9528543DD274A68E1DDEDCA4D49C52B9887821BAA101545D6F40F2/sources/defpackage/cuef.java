package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuef  reason: default package */
/* loaded from: classes5.dex */
public final class cuef extends cuhw {
    private cuhv a;

    @Override // defpackage.cuhw
    public final void b(cuhv cuhvVar) {
        if (cuhvVar != null) {
            this.a = cuhvVar;
            return;
        }
        throw new NullPointerException("Null content");
    }

    @Override // defpackage.cuhw
    public final cuhx a() {
        String str = this.a == null ? " content" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cueg(this.a);
    }
}
