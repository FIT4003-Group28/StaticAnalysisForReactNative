package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btha  reason: default package */
/* loaded from: classes4.dex */
public final class btha extends bthq {
    public ddho a;
    private String b;
    private String c;
    private dbsg<String> d = dbpy.a;
    private String e;
    private bthr f;
    private cjtd g;

    @Override // defpackage.bthq
    public final void b(String str) {
        this.d = dbsg.i(str);
    }

    @Override // defpackage.bthq
    public final void c(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null confirmButtonText");
    }

    @Override // defpackage.bthq
    public final void d(cjtd cjtdVar) {
        this.g = cjtdVar;
    }

    @Override // defpackage.bthq
    public final void e(bthr bthrVar) {
        if (bthrVar != null) {
            this.f = bthrVar;
            return;
        }
        throw new NullPointerException("Null listener");
    }

    @Override // defpackage.bthq
    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null message");
    }

    @Override // defpackage.bthq
    public final void g(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.bthq
    public final bths a() {
        String str = this.b == null ? " title" : "";
        if (this.c == null) {
            str = str.concat(" message");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" confirmButtonText");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" visualElementType");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" listener");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" confirmLoggingParams");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bthb(this.b, this.c, this.d, this.e, this.a, this.f, this.g);
    }
}
