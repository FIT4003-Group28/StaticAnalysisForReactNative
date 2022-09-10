package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amqx  reason: default package */
/* loaded from: classes2.dex */
public final class amqx extends amrb {
    private aktc a;
    private amrl b;
    private amsb c;
    private Integer d;
    private dcdc<dmlo> e;

    @Override // defpackage.amrb
    public final void b(aktc aktcVar) {
        if (aktcVar != null) {
            this.a = aktcVar;
            return;
        }
        throw new NullPointerException("Null callout");
    }

    @Override // defpackage.amrb
    public final void c(amrl amrlVar) {
        if (amrlVar != null) {
            this.b = amrlVar;
            return;
        }
        throw new NullPointerException("Null positioner");
    }

    @Override // defpackage.amrb
    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.amrb
    public final void e(dcdc<dmlo> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null supportedAnchors");
    }

    @Override // defpackage.amrb
    public final void f(amsb amsbVar) {
        if (amsbVar != null) {
            this.c = amsbVar;
            return;
        }
        throw new NullPointerException("Null useCase");
    }

    @Override // defpackage.amrb
    public final amrc a() {
        String str = this.a == null ? " callout" : "";
        if (this.b == null) {
            str = str.concat(" positioner");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" useCase");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" priority");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" supportedAnchors");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new amqy(this.a, this.b, this.c, this.d.intValue(), this.e);
    }
}
