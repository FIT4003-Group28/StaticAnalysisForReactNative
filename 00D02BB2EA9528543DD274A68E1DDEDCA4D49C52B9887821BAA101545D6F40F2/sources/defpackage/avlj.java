package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: avlj  reason: default package */
/* loaded from: classes3.dex */
public final class avlj {
    private static final dbty<avlj> a = dbud.a(avlh.a);
    private final avlc b;

    public avlj(avlc avlcVar) {
        this.b = avlcVar;
    }

    public static avlj f() {
        return a.a();
    }

    public static avli g() {
        return new avli();
    }

    public final dlrl a() {
        avla avlaVar = this.b.b;
        if (avlaVar == null) {
            avlaVar = avla.d;
        }
        dlrl dlrlVar = avlaVar.b;
        return dlrlVar == null ? dlrl.d : dlrlVar;
    }

    public final dlua b() {
        dlua dluaVar = this.b.c;
        return dluaVar == null ? dlua.h : dluaVar;
    }

    public final boolean c() {
        return this.b.d;
    }

    public final boolean d() {
        return this.b.f;
    }

    @dzsi
    public final String e() {
        avlc avlcVar = this.b;
        if ((avlcVar.a & 8) != 0) {
            return avlcVar.e;
        }
        return null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof avlj)) {
            return false;
        }
        return this.b.equals(((avlj) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        dbsb c = dbsc.c(avlj.class);
        c.b("syncStateProto", this.b);
        return c.toString();
    }
}
