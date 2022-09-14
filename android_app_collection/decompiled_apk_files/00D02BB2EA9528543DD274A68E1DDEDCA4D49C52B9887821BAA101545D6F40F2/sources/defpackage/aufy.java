package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aufy  reason: default package */
/* loaded from: classes2.dex */
public final class aufy extends auge {
    private Integer c;
    private CharSequence d;
    private auhx e;
    private Boolean f;
    private ddho g;
    public dbsg<ip> a = dbpy.a;
    private dbsg<String> h = dbpy.a;
    private dbsg<ddcu> i = dbpy.a;
    public dbsg<cjtd> b = dbpy.a;

    @Override // defpackage.auge
    public final void b(dbsg<ddcu> dbsgVar) {
        if (dbsgVar != null) {
            this.i = dbsgVar;
            return;
        }
        throw new NullPointerException("Null geoDataElementType");
    }

    @Override // defpackage.auge
    public final void c(ddho ddhoVar) {
        if (ddhoVar != null) {
            this.g = ddhoVar;
            return;
        }
        throw new NullPointerException("Null geoVisualElementType");
    }

    @Override // defpackage.auge
    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.auge
    public final void e(auhx auhxVar) {
        if (auhxVar != null) {
            this.e = auhxVar;
            return;
        }
        throw new NullPointerException("Null intentWithType");
    }

    @Override // defpackage.auge
    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.auge
    public final void g(CharSequence charSequence) {
        if (charSequence != null) {
            this.d = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.auge
    public final void h(dbsg<String> dbsgVar) {
        if (dbsgVar != null) {
            this.h = dbsgVar;
            return;
        }
        throw new NullPointerException("Null ved");
    }

    @Override // defpackage.auge
    public final augf a() {
        String str = this.c == null ? " icon" : "";
        if (this.d == null) {
            str = str.concat(" title");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" intentWithType");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" shouldDismissNotification");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" geoVisualElementType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aufz(this.c.intValue(), this.d, this.a, this.e, this.f.booleanValue(), this.g, this.h, this.i, this.b);
    }
}
