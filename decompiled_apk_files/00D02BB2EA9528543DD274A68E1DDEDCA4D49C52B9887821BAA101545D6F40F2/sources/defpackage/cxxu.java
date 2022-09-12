package defpackage;
/* compiled from: PG */
/* renamed from: cxxu  reason: default package */
/* loaded from: classes5.dex */
public final class cxxu extends cxzv {
    public int a;
    private Boolean b;
    private Boolean c;

    @Override // defpackage.cxzv
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cxzv
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.cxzv
    public final cxzw a() {
        String str = this.b == null ? " returnContactsWithProfileIdOnly" : "";
        if (this.c == null) {
            str = str.concat(" restrictLookupToCache");
        }
        if (this.a == 0) {
            str = String.valueOf(str).concat(" personMask");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxxv(this.b.booleanValue(), this.c.booleanValue(), this.a);
    }
}
