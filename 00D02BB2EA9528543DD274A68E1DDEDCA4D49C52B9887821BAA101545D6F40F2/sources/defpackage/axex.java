package defpackage;
/* compiled from: PG */
/* renamed from: axex  reason: default package */
/* loaded from: classes3.dex */
final class axex extends axgf {
    private axgg a;
    private dimp b;
    private Boolean c;
    private Throwable d;

    public axex() {
    }

    public axex(axgh axghVar) {
        axey axeyVar = (axey) axghVar;
        this.a = axeyVar.a;
        this.b = axeyVar.b;
        this.c = Boolean.valueOf(axeyVar.c);
        this.d = axeyVar.d;
    }

    @Override // defpackage.axgf
    public final axgg a() {
        axgg axggVar = this.a;
        if (axggVar != null) {
            return axggVar;
        }
        throw new IllegalStateException("Property \"status\" has not been set");
    }

    @Override // defpackage.axgf
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.axgf
    public final void d(dimp dimpVar) {
        if (dimpVar != null) {
            this.b = dimpVar;
            return;
        }
        throw new NullPointerException("Null followList");
    }

    @Override // defpackage.axgf
    public final void e(axgg axggVar) {
        if (axggVar != null) {
            this.a = axggVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.axgf
    public final void f(@dzsi Throwable th) {
        this.d = th;
    }

    @Override // defpackage.axgf
    public final axgh b() {
        String str = this.a == null ? " status" : "";
        if (this.b == null) {
            str = str.concat(" followList");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" areFollowersRemovable");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new axey(this.a, this.b, this.c.booleanValue(), this.d);
    }
}
