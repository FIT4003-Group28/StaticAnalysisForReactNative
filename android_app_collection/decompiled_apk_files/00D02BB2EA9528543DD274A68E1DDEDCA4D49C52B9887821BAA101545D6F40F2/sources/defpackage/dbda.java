package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dbda  reason: default package */
/* loaded from: classes5.dex */
public class dbda extends dbcm {
    public final HashMap<String, dbcy> a = new HashMap<>();
    public final dbdz b = new dbdz();
    private final dbeb x = new dbeb();
    private final dbeb y = new dbeb();
    private final dbea z = new dbea();
    final dbcz c = new dbcz(this);
    public boolean d = false;

    private final void I(int i, dbcy dbcyVar) {
        dbhl dbhlVar;
        dbhx z = z();
        if (z == null || (dbhlVar = this.p) == null) {
            return;
        }
        z.a(i, this.b);
        dbdz e = dbhlVar.e();
        if (e != null) {
            dbdz dbdzVar = this.b;
            dbdz.h(e, dbdzVar, dbdzVar);
        }
        dbcm dbcmVar = dbcyVar.a;
        dbcm dbcmVar2 = dbcmVar.f;
        if (dbcmVar2 != null && dbcmVar2 != this) {
            dbdz E = super.E();
            dbdz dbdzVar2 = this.b;
            dbdz.h(E, dbdzVar2, dbdzVar2);
            dbdz B = dbcmVar2.B();
            dbdz dbdzVar3 = this.b;
            dbdz.h(B, dbdzVar3, dbdzVar3);
        }
        this.b.b(this.x);
        this.b.c(this.y);
        this.b.d(this.y, this.z);
        boolean z2 = this.d;
        dbcmVar.n(this.x);
        dbcmVar.o(this.z);
        dbcmVar.p(this.y);
        dbcyVar.b = false;
        this.d = z2;
    }

    private final void b() {
        dbgt e = e();
        if (e == null || z() == null) {
            return;
        }
        for (int i = 0; i < e.b(); i++) {
            dbcy dbcyVar = this.a.get(e.a(i));
            if (dbcyVar != null && dbcyVar.a.n) {
                I(i, dbcyVar);
            }
        }
        this.d = false;
    }

    @Override // defpackage.dbcm
    public void a(dbci dbciVar) {
        dbhx z;
        dbgt e = e();
        if (e == null || (z = z()) == null || !z.b(e)) {
            return;
        }
        b();
    }

    public final void c(String str, dbcm dbcmVar) {
        int i;
        dbjb.d(str, "Parameter \"boneName\" was null.");
        dbcy remove = this.a.remove(str);
        if (remove != null) {
            remove.a.t.remove(remove);
        }
        if (dbcmVar != null) {
            dbcy dbcyVar = new dbcy(this, dbcmVar);
            this.a.put(str, dbcyVar);
            dbgt e = e();
            if (e != null) {
                i = 0;
                while (i < e.b()) {
                    if (e.a(i).equals(str)) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i == -1) {
                return;
            }
            I(i, dbcyVar);
        }
    }

    public final void d(dbhe dbheVar) {
        dbix.a();
        dbhl dbhlVar = this.p;
        if (dbhlVar == null || dbhlVar.b != dbheVar) {
            if (dbhlVar != null) {
                if (this.n) {
                    dbhlVar.d();
                }
                this.p = null;
            }
            if (dbheVar != null) {
                dbhl j = dbheVar.j(this);
                if (this.n && this.e != null) {
                    j.c(super.G());
                }
                this.p = j;
                this.o = dbheVar.j.a;
            } else {
                this.o = 0;
            }
            super.D();
        }
        b();
        dbhl dbhlVar2 = this.p;
        if (dbhlVar2 != null) {
            dbhlVar2.e = this.c;
        }
    }

    public final dbgt e() {
        dbhe u = u();
        if (u instanceof dbgt) {
            return (dbgt) u;
        }
        return null;
    }
}
