package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cudm  reason: default package */
/* loaded from: classes5.dex */
public final class cudm extends cugc {
    private byte[] a;
    private Integer b;
    private Integer c;
    private dbsg<Integer> d = dbpy.a;
    private String e;

    @Override // defpackage.cugc
    public final void b(int i) {
        this.d = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.cugc
    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cugc
    public final void d(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    @Override // defpackage.cugc
    public final void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null talkBackDescription");
    }

    @Override // defpackage.cugc
    public final void f(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cugc
    public final cugd a() {
        String str = this.a == null ? " icon" : "";
        if (this.b == null) {
            str = str.concat(" width");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" talkBackDescription");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudn(this.a, this.b.intValue(), this.c.intValue(), this.d, this.e);
    }
}
