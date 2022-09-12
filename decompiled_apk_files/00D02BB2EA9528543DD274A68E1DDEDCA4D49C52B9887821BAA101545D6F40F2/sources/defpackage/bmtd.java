package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmtd  reason: default package */
/* loaded from: classes3.dex */
public final class bmtd extends bmti {
    private eapg a;
    private String b;
    private String c;
    private String d;
    private dcdc<String> e;
    private String f;
    private Boolean g;

    @Override // defpackage.bmti
    public final void b(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null contentDescription");
    }

    @Override // defpackage.bmti
    public final void c(eapg eapgVar) {
        if (eapgVar != null) {
            this.a = eapgVar;
            return;
        }
        throw new NullPointerException("Null day");
    }

    @Override // defpackage.bmti
    public final void d(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null dayOfWeek");
    }

    @Override // defpackage.bmti
    public final void e(dcdc<String> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null extraLabels");
    }

    @Override // defpackage.bmti
    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.bmti
    public final void g(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null monthDay");
    }

    @Override // defpackage.bmti
    public final void h(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null year");
    }

    @Override // defpackage.bmti
    public final bmtj a() {
        String str = this.a == null ? " day" : "";
        if (this.b == null) {
            str = str.concat(" monthDay");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" year");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" dayOfWeek");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" extraLabels");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" contentDescription");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" isToday");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bmte(this.a, this.b, this.c, this.d, this.e, this.f, this.g.booleanValue());
    }
}
