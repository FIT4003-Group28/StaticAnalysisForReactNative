package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccrb  reason: default package */
/* loaded from: classes4.dex */
public final class ccrb extends ccsh {
    private ccwk a;
    private final dbsg<ccln> b = dbpy.a;
    private dcdc<bbtm> c;
    private Boolean d;
    private int e;
    private int f;

    @Override // defpackage.ccsh
    public final ccwk a() {
        ccwk ccwkVar = this.a;
        if (ccwkVar != null) {
            return ccwkVar;
        }
        throw new IllegalStateException("Property \"contribution\" has not been set");
    }

    @Override // defpackage.ccsh
    public final dbsg<ccln> b() {
        return this.b;
    }

    @Override // defpackage.ccsh
    public final void d(List<bbtm> list) {
        this.c = dcdc.r(list);
    }

    @Override // defpackage.ccsh
    public final void e(ccwk ccwkVar) {
        if (ccwkVar != null) {
            this.a = ccwkVar;
            return;
        }
        throw new NullPointerException("Null contribution");
    }

    @Override // defpackage.ccsh
    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.ccsh
    public final void g(int i) {
        this.e = i;
    }

    @Override // defpackage.ccsh
    public final int h() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"origin\" has not been set");
    }

    @Override // defpackage.ccsh
    public final void i(int i) {
        this.f = i;
    }

    @Override // defpackage.ccsh
    public final ccsi c() {
        String str = this.a == null ? " contribution" : "";
        if (this.c == null) {
            str = str.concat(" associatedMedia");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" requestThanksPage");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" origin");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" type");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ccrc(this.a, this.b, this.c, this.d.booleanValue(), this.f, this.e);
    }
}
