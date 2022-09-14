package defpackage;
/* compiled from: PG */
/* renamed from: aulr  reason: default package */
/* loaded from: classes2.dex */
public final class aulr {
    public auuh a;
    public String b;
    public String c;
    public String d;
    public String e;
    private Boolean f;
    private dcdc<cjtd> g;
    private dcdc<String> h;

    public aulr() {
    }

    public aulr(aulu auluVar) {
        auls aulsVar = (auls) auluVar;
        this.a = aulsVar.a;
        this.b = aulsVar.b;
        this.c = aulsVar.c;
        this.f = Boolean.valueOf(aulsVar.d);
        this.d = aulsVar.e;
        this.e = aulsVar.f;
        this.g = aulsVar.g;
        this.h = aulsVar.h;
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(dcdc<cjtd> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null customContentButtonLoggingParams");
    }

    public final void d(dcdc<String> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null photoUris");
    }

    public final aulu a() {
        String str = this.a == null ? " key" : "";
        if (this.f == null) {
            str = str.concat(" contentUpdate");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" customContentButtonLoggingParams");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" photoUris");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new auls(this.a, this.b, this.c, this.f.booleanValue(), this.d, this.e, this.g, this.h);
    }
}
