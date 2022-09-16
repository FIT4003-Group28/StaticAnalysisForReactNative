package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvvz  reason: default package */
/* loaded from: classes4.dex */
public final class bvvz extends bvwi {
    private drtc a;
    private String b;

    @Override // defpackage.bvwi
    public final void b(drtc drtcVar) {
        if (drtcVar != null) {
            this.a = drtcVar;
            return;
        }
        throw new NullPointerException("Null statusCode");
    }

    @Override // defpackage.bvwi
    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null statusMessage");
    }

    @Override // defpackage.bvwi
    public final bvwj a() {
        String str = this.a == null ? " statusCode" : "";
        if (this.b == null) {
            str = str.concat(" statusMessage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bvwa(this.a, this.b);
    }
}
