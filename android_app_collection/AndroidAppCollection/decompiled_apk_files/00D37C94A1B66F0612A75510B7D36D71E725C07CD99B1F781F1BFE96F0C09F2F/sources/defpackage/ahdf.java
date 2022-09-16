package defpackage;
/* compiled from: PG */
/* renamed from: ahdf  reason: default package */
/* loaded from: classes.dex */
public final class ahdf {
    public final aadd a;
    public final axwu b;
    public final aacz c;

    public ahdf(aadd aaddVar, aacz aaczVar, axwu axwuVar) {
        this.a = aaddVar;
        this.c = aaczVar;
        this.b = axwuVar;
    }

    public static boolean d(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null || (aaddVar.a().b & 512) == 0) {
            return false;
        }
        atqv atqvVar = aaddVar.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.q;
    }

    public static boolean h(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null || (aaddVar.a().b & 512) == 0) {
            return false;
        }
        atqv atqvVar = aaddVar.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.t;
    }

    public static boolean j(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null || (aaddVar.a().b & 512) == 0) {
            return false;
        }
        atqv atqvVar = aaddVar.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.v;
    }

    public static atqk n(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return null;
        }
        atqk atqkVar = aaczVar.b().m;
        return atqkVar == null ? atqk.a : atqkVar;
    }

    public static boolean o(aacz aaczVar) {
        atqk n = n(aaczVar);
        return n != null && n.f;
    }

    public final long a() {
        atqv atqvVar = this.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.G;
    }

    public final boolean b() {
        Boolean bool;
        aqxe aqxeVar = this.b.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353261L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353261L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353261L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean c() {
        atqv atqvVar = this.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.C;
    }

    public final boolean e() {
        Boolean bool;
        aqxe aqxeVar = this.b.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45357213L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357213L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357213L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean f() {
        Boolean bool;
        aqxe aqxeVar = this.b.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45356807L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356807L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356807L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean g() {
        atqv atqvVar = this.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.w;
    }

    public final boolean i() {
        atqv atqvVar = this.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.I;
    }

    public final boolean k() {
        atqv atqvVar = this.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.F;
    }

    public final boolean l() {
        Boolean bool;
        aqxe aqxeVar = this.b.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45354129L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354129L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354129L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean m() {
        atqv atqvVar = this.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        return atqvVar.r;
    }

    public final void p() {
        atqk atqkVar = this.c.b().m;
        if (atqkVar == null) {
            atqkVar = atqk.a;
        }
        boolean z = atqkVar.j;
    }
}
