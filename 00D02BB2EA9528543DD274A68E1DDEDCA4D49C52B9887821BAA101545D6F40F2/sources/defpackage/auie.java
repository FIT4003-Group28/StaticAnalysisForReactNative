package defpackage;
/* compiled from: PG */
/* renamed from: auie  reason: default package */
/* loaded from: classes.dex */
final class auie extends auis {
    public Integer a;
    private String b;
    private Integer c;
    private Boolean e;
    private Boolean f;
    private dbsg<Integer> d = dbpy.a;
    private dbsg<auit> g = dbpy.a;

    @Override // defpackage.auis
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null channelId");
    }

    @Override // defpackage.auis
    public final void c(int i) {
        this.d = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.auis
    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.auis
    public final void e(auit auitVar) {
        this.g = dbsg.i(auitVar);
    }

    @Override // defpackage.auis
    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.auis
    public final void g(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.auis
    public final auiu a() {
        String str = this.b == null ? " channelId" : "";
        if (this.a == null) {
            str = str.concat(" importance");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" nameResourceId");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" shouldVibrate");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" shouldUseSound");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new auif(this.b, this.a.intValue(), this.c.intValue(), this.d, this.e.booleanValue(), this.f.booleanValue(), this.g);
    }
}
