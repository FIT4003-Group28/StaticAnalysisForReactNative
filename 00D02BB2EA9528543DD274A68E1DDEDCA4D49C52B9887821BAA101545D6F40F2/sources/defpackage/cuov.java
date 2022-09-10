package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuov  reason: default package */
/* loaded from: classes5.dex */
public final class cuov extends cupt {
    private cukn a;
    private String b;
    private dspd c;
    private Integer d;
    private Integer e;
    private String f;

    @Override // defpackage.cupt
    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cupt
    public final void c(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null imageDescription");
    }

    @Override // defpackage.cupt
    public final void d(String str) {
        this.b = str;
    }

    @Override // defpackage.cupt
    public final void e(cukn cuknVar) {
        if (cuknVar != null) {
            this.a = cuknVar;
            return;
        }
        throw new NullPointerException("Null mediaId");
    }

    @Override // defpackage.cupt
    public final void f(dspd dspdVar) {
        this.c = dspdVar;
    }

    @Override // defpackage.cupt
    public final void g(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cupt
    public final cupu a() {
        String str = this.a == null ? " mediaId" : "";
        if (this.c == null) {
            str = str.concat(" thumbnail");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" width");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" imageDescription");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuow(this.a, this.b, this.c, this.d.intValue(), this.e.intValue(), this.f);
    }
}
