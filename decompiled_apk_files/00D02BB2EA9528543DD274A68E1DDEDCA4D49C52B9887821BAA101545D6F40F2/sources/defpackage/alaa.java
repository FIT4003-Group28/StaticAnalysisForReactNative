package defpackage;
/* compiled from: PG */
/* renamed from: alaa  reason: default package */
/* loaded from: classes.dex */
public final class alaa {
    @dzsi
    public akqq a;
    @dzsi
    public akra b;
    public float c;
    public float d;
    public float e;
    public alae f;

    public alaa() {
        this.f = alae.a;
    }

    public alaa(alad aladVar) {
        this.f = alae.a;
        this.a = aladVar.i;
        this.b = aladVar.j;
        this.c = aladVar.k;
        this.d = aladVar.l;
        this.e = aladVar.m;
        this.f = aladVar.n;
    }

    public final alad a() {
        return new alad(this.a, this.c, this.d, this.e, this.f);
    }

    public final void b(alad aladVar) {
        this.a = aladVar.i;
        this.b = aladVar.j;
        this.c = aladVar.k;
        this.d = aladVar.l;
        this.e = aladVar.m;
        this.f = aladVar.n;
    }

    public final void c(akqq akqqVar) {
        this.a = akqqVar;
        this.b = akqg.a(akqqVar);
    }

    public final void d(akra akraVar) {
        this.b = akraVar;
        this.a = akqg.b(akraVar);
    }

    @dzsi
    public final Object e(int i) {
        float f;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                f = this.c;
            } else if (i2 == 2) {
                f = this.d;
            } else if (i2 != 3) {
                return this.f;
            } else {
                f = this.e;
            }
            return Float.valueOf(f);
        }
        return this.b;
    }

    public final void f(int i, @dzsi Object obj) {
        if (obj != null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                d((akra) obj);
            } else if (i2 == 1) {
                this.c = ((Float) obj).floatValue();
            } else if (i2 == 2) {
                this.d = ((Float) obj).floatValue();
            } else if (i2 == 3) {
                this.e = ((Float) obj).floatValue();
            } else if (i2 == 4) {
                this.f = (alae) obj;
            } else {
                String a = alab.a(i);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33);
                sb.append("Invalid camera position property ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
