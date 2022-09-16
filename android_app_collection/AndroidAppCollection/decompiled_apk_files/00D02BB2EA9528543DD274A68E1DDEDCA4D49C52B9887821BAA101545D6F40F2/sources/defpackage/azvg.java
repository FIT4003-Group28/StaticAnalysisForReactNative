package defpackage;
/* compiled from: PG */
/* renamed from: azvg  reason: default package */
/* loaded from: classes3.dex */
final class azvg extends azwr {
    private String a;
    private String b;
    private dpuk c;

    @Override // defpackage.azwr
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null mid");
    }

    @Override // defpackage.azwr
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.azwr
    public final void d(dpuk dpukVar) {
        if (dpukVar != null) {
            this.c = dpukVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.azwr
    public final azws a() {
        String str = this.a == null ? " name" : "";
        if (this.b == null) {
            str = str.concat(" mid");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" type");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new azvh(this.a, this.b, this.c);
    }
}
