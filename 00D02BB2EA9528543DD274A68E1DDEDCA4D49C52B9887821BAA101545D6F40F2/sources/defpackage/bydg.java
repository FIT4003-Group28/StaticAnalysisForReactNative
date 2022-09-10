package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bydg  reason: default package */
/* loaded from: classes4.dex */
public final class bydg extends byec {
    public byef a;
    public byef b;
    public byea c;
    private byeb d;

    @Override // defpackage.byec
    public final void b(byeb byebVar) {
        if (byebVar != null) {
            this.d = byebVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.byec
    public final byed a() {
        String str = this.d == null ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bydh(this.d, this.a, this.b, this.c);
    }
}
