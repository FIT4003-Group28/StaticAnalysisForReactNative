package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuon  reason: default package */
/* loaded from: classes5.dex */
public final class cuon extends cupl {
    private Integer a;
    private String b;
    private dcdc<cuqd> c;

    @Override // defpackage.cupl
    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cupl
    public final void c(dcdc<cuqd> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null cards");
    }

    @Override // defpackage.cupl
    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null jsonSource");
    }

    @Override // defpackage.cupl
    public final cupm a() {
        String str = this.a == null ? " cardWidth" : "";
        if (this.b == null) {
            str = str.concat(" jsonSource");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" cards");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuoo(this.a.intValue(), this.b, this.c);
    }
}
