package defpackage;
/* compiled from: PG */
/* renamed from: auoa  reason: default package */
/* loaded from: classes2.dex */
public final class auoa extends auod {
    public auhx a;
    public int e;
    private Integer f;
    private CharSequence g;
    private Boolean i;
    private dbsg<ip> h = dbpy.a;
    public dbsg<ddcu> b = dbpy.a;
    public dbsg<String> c = dbpy.a;
    public dbsg<Integer> d = dbpy.a;
    private final dbsg<cjtd> j = dbpy.a;

    @Override // defpackage.auod
    public final void b(int i) {
        this.e = i;
    }

    @Override // defpackage.auod
    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.auod
    public final void d(auhx auhxVar) {
        this.a = auhxVar;
    }

    @Override // defpackage.auod
    public final void e(ip ipVar) {
        this.h = dbsg.i(ipVar);
    }

    @Override // defpackage.auod
    public final void f(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.auod
    public final void g(CharSequence charSequence) {
        if (charSequence != null) {
            this.g = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.auod
    public final auoe a() {
        String str = this.e == 0 ? " genericNotificationActionPosition" : "";
        if (this.f == null) {
            str = str.concat(" icon");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" title");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" intentWithType");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" shouldDismissNotification");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new auob(this.e, this.f.intValue(), this.g, this.h, this.a, this.i.booleanValue(), this.b, this.c, this.d, this.j);
    }
}
