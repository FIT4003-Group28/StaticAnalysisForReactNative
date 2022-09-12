package defpackage;
/* compiled from: PG */
@btsb
/* renamed from: crhp  reason: default package */
/* loaded from: classes.dex */
public final class crhp {
    @dzsi
    private final crqf a;
    @dzsi
    private final crqd b;

    public crhp(@dzsi crqf crqfVar, @dzsi crqd crqdVar) {
        boolean z = true;
        if (crqfVar != null && crqdVar != null) {
            z = false;
        }
        dbsk.a(z);
        this.a = crqfVar;
        this.b = crqdVar;
    }

    public static crhp a() {
        return new crhp(null, null);
    }

    public final boolean b() {
        return f() || d();
    }

    public final crpx c() {
        crpx crpxVar = d() ? this.a : this.b;
        dbsk.s(crpxVar);
        return crpxVar;
    }

    public final boolean d() {
        return this.a != null;
    }

    public final crqf e() {
        crqf crqfVar = this.a;
        dbsk.s(crqfVar);
        return crqfVar;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final crqd g() {
        crqd crqdVar = this.b;
        dbsk.s(crqdVar);
        return crqdVar;
    }
}
