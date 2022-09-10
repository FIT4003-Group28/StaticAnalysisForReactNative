package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuen  reason: default package */
/* loaded from: classes5.dex */
public final class cuen extends cuia {
    private String a;
    private String b;
    private dcdc<cuhz> c;
    private Integer d;
    private String e;

    public cuen() {
    }

    public cuen(cuib cuibVar) {
        cueo cueoVar = (cueo) cuibVar;
        this.a = cueoVar.a;
        this.b = cueoVar.b;
        this.c = cueoVar.c;
        this.d = Integer.valueOf(cueoVar.d);
        this.e = cueoVar.e;
    }

    @Override // defpackage.cuia
    public final void b(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null hintText");
    }

    @Override // defpackage.cuia
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.cuia
    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.cuia
    public final void e(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cuia
    public final void f(dcdc<cuhz> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null suggestions");
    }

    @Override // defpackage.cuia
    public final cuib a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" messageId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" suggestions");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" renderStyle");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" hintText");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cueo(this.a, this.b, this.c, this.d.intValue(), this.e);
    }
}
