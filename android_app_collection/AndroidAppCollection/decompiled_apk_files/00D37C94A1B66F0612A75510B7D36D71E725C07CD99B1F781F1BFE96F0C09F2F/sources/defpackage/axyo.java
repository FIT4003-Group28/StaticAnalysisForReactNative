package defpackage;
/* compiled from: PG */
/* renamed from: axyo  reason: default package */
/* loaded from: classes2.dex */
public final class axyo {
    public final axyb a;
    public final axyd b;
    public final int c;
    public final boolean d;

    public axyo(axyb axybVar, axyd axydVar, int i, boolean z) {
        axybVar.getClass();
        this.a = axybVar;
        axydVar.getClass();
        this.b = axydVar;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("transportAttrs", this.a);
        c.b("callOptions", this.b);
        c.e("previousAttempts", this.c);
        c.g("isTransparentRetry", this.d);
        return c.toString();
    }
}
