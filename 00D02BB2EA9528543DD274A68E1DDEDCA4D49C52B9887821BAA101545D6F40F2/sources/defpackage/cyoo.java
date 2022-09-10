package defpackage;
/* compiled from: PG */
/* renamed from: cyoo  reason: default package */
/* loaded from: classes5.dex */
public final class cyoo extends cype {
    public dbtp a;
    public Integer b;
    public cyfp c;
    private Integer d;
    private int e;
    private int f;
    private int g;

    @Override // defpackage.cype
    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cype
    public final void c(int i) {
        this.e = i;
    }

    @Override // defpackage.cype
    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.cype
    public final void e(int i) {
        if (i != 0) {
            this.g = i;
            return;
        }
        throw new NullPointerException("Null dataSource");
    }

    @Override // defpackage.cype
    public final cypf a() {
        String str = this.d == null ? " itemCount" : "";
        if (this.e == 0) {
            str = str.concat(" cacheStatusAtQuery");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" cacheStatusAtResult");
        }
        if (this.g == 0) {
            str = String.valueOf(str).concat(" dataSource");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyop(this.a, this.b, this.d.intValue(), this.e, this.f, this.g, this.c);
    }
}
