package defpackage;
/* compiled from: PG */
/* renamed from: ctei  reason: default package */
/* loaded from: classes5.dex */
public final class ctei extends ctfg {
    public dbsg<ctqu> a = dbpy.a;
    public int b;

    @Override // defpackage.ctfg
    public final ctfh a() {
        String str = this.b == 0 ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new ctej(this.b, this.a);
    }
}
