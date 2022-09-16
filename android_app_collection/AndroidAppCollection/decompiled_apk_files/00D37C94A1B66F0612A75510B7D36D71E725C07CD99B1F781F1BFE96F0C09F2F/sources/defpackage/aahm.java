package defpackage;
/* compiled from: PG */
/* renamed from: aahm  reason: default package */
/* loaded from: classes.dex */
public final class aahm {
    private final Class a;
    private final String b;
    private final amuf c = new amuf();
    private final amuf d = new amuf();

    public aahm(Class cls, String str) {
        this.a = cls;
        this.b = str;
    }

    public final aahn a() {
        return new aahn(this.b, this.a, this.c.g(), this.d.g());
    }

    public final void b(aaho aahoVar, aaho... aahoVarArr) {
        this.c.h(aahoVar);
        this.c.i(aahoVarArr);
    }
}
