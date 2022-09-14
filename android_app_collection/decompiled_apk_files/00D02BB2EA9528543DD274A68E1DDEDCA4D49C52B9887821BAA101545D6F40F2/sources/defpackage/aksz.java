package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aksz  reason: default package */
/* loaded from: classes.dex */
public final class aksz {
    private static final aksy f = aksy.WORLD;
    public final akra a;
    public final akse b;
    public aksy c;
    public float d;
    public final akra e;

    public aksz() {
        akra akraVar = new akra();
        aksy aksyVar = f;
        akra akraVar2 = new akra();
        akse akseVar = new akse(1.0f, 1.0f);
        this.b = akseVar;
        this.a = new akra(akraVar);
        akseVar.r(1.0f, 1.0f);
        this.c = aksyVar;
        this.d = 0.0f;
        this.e = new akra(akraVar2);
    }

    public final void a(aksz akszVar) {
        this.a.aa(akszVar.a);
        this.b.s(akszVar.b);
        this.c = akszVar.c;
        this.d = akszVar.d;
        this.e.aa(akszVar.e);
    }

    public final void b(akra akraVar) {
        this.a.aa(akraVar);
    }

    public final void c(float f2, aksy aksyVar) {
        this.b.r(f2, f2);
        this.c = aksyVar;
    }

    public final void d(float f2, akra akraVar) {
        this.d = f2;
        this.e.aa(akraVar);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof aksz) {
            aksz akszVar = (aksz) obj;
            if (this.a.equals(akszVar.a) && this.b.equals(akszVar.b) && this.c.equals(akszVar.c) && Float.compare(this.d, akszVar.d) == 0 && this.e.equals(akszVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Float.valueOf(this.d), this.e});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("position", this.a);
        b.b("scale", this.b);
        b.b("scaleType", this.c);
        b.e("rotationDegrees", this.d);
        b.b("rotationOrigin", this.e);
        return b.toString();
    }
}
