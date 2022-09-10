package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuep  reason: default package */
/* loaded from: classes5.dex */
public final class cuep extends cuic {
    private String a;
    private dcdc<cuie> b;

    @Override // defpackage.cuic
    public final void b(dcdc<cuie> dcdcVar) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null replacements");
    }

    @Override // defpackage.cuic
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    @Override // defpackage.cuic
    public final cuif a() {
        String str = this.a == null ? " url" : "";
        if (this.b == null) {
            str = str.concat(" replacements");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cueq(this.a, this.b);
    }
}
