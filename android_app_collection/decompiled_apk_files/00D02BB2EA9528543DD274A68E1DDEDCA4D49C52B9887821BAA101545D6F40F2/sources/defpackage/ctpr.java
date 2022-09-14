package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ctpr  reason: default package */
/* loaded from: classes5.dex */
public final class ctpr extends ctqt {
    private String f;
    private String i;
    private dcdn<String, byte[]> j;
    private dcdc<cugf> k;
    private dcdc<cugf> l;
    public dbsg<String> a = dbpy.a;
    private dbsg<String> g = dbpy.a;
    private dbsg<byte[]> h = dbpy.a;
    public dbsg<ctqq> b = dbpy.a;
    public dbsg<cugh> c = dbpy.a;
    public dbsg<cufx> d = dbpy.a;
    public dbsg<Long> e = dbpy.a;

    @Override // defpackage.ctqt
    public final void b(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    @Override // defpackage.ctqt
    public final void c(String str) {
        this.g = dbsg.i(str);
    }

    @Override // defpackage.ctqt
    public final void d(dcdc<cugf> dcdcVar) {
        if (dcdcVar != null) {
            this.k = dcdcVar;
            return;
        }
        throw new NullPointerException("Null menuItems");
    }

    @Override // defpackage.ctqt
    public final void e(Map<String, byte[]> map) {
        this.j = dcdn.r(map);
    }

    @Override // defpackage.ctqt
    public final void f(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.ctqt
    public final void g(byte[] bArr) {
        this.h = dbsg.i(bArr);
    }

    @Override // defpackage.ctqt
    public final void h(dcdc<cugf> dcdcVar) {
        if (dcdcVar != null) {
            this.l = dcdcVar;
            return;
        }
        throw new NullPointerException("Null toolbarButtons");
    }

    @Override // defpackage.ctqt
    public final ctqu a() {
        String str = this.f == null ? " name" : "";
        if (this.i == null) {
            str = str.concat(" contentType");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" menuItems");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" toolbarButtons");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctps(this.f, this.a, this.g, this.h, this.i, this.b, this.j, this.k, this.l, this.c, this.d, this.e);
    }
}
