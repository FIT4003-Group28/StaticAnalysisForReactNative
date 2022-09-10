package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/* compiled from: PG */
/* renamed from: dbcm  reason: default package */
/* loaded from: classes5.dex */
public class dbcm extends dbcn implements dbdx {
    private final dbdz b;
    private final dbea c;
    private final dbeb d;
    public dbcs e;
    public dbcm f;
    dbcn g;
    public final dbeb j;
    public final dbeb k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public dbhl p;
    public dbfc q;
    public dbdq r;
    public final ArrayList<dbck> s;
    public final ArrayList<dbcy> t;
    public dbcl u;
    public dum v;
    private final dbdz x;
    private final dbdz y;
    private boolean z;
    private final String a = "Node";
    public final dbeb h = new dbeb();
    public final dbea i = new dbea();

    public dbcm() {
        dbeb dbebVar = new dbeb();
        this.j = dbebVar;
        this.b = new dbdz();
        this.k = new dbeb();
        this.c = new dbea();
        dbeb dbebVar2 = new dbeb();
        this.d = dbebVar2;
        this.x = new dbdz();
        this.y = new dbdz();
        this.l = 63;
        this.m = true;
        this.n = false;
        this.o = 0;
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        this.z = true;
        this.u = null;
        dbix.a();
        dbebVar.b(1.0f, 1.0f, 1.0f);
        dbebVar2.a(dbebVar);
    }

    private final dbea b() {
        if ((this.l & 16) == 16) {
            if (this.f != null) {
                E().d(F(), this.c);
            } else {
                this.c.a(this.i);
            }
            this.l &= -17;
        }
        return this.c;
    }

    public final dbdz A() {
        int i = this.l;
        if ((i & 1) == 1) {
            dbdz dbdzVar = this.b;
            dbeb dbebVar = this.h;
            dbea dbeaVar = this.i;
            dbeb dbebVar2 = this.j;
            float f = dbeaVar.a;
            float f2 = f + f;
            float f3 = 1.0f - (f * f2);
            float f4 = dbeaVar.b;
            float f5 = f4 * f4;
            float f6 = dbeaVar.c;
            float f7 = f6 + f6;
            float f8 = f7 * f6;
            float f9 = f2 * f6;
            float f10 = f4 + f4;
            float f11 = dbeaVar.d;
            float f12 = f10 * f11;
            float f13 = f4 * f2;
            float f14 = f7 * f11;
            float f15 = f2 * f11;
            float f16 = f10 * f6;
            float[] fArr = dbdzVar.b;
            float f17 = f5 + f5;
            float f18 = dbebVar2.a;
            fArr[0] = ((1.0f - f17) - f8) * f18;
            float f19 = dbebVar2.b;
            fArr[4] = (f13 - f14) * f19;
            float f20 = dbebVar2.c;
            fArr[8] = (f9 + f12) * f20;
            fArr[1] = (f13 + f14) * f18;
            fArr[5] = (f3 - f8) * f19;
            fArr[9] = (f16 - f15) * f20;
            fArr[2] = (f9 - f12) * f18;
            fArr[6] = (f16 + f15) * f19;
            fArr[10] = (f3 - f17) * f20;
            fArr[12] = dbebVar.a;
            fArr[13] = dbebVar.b;
            fArr[14] = dbebVar.c;
            fArr[15] = 1.0f;
            this.l = i & (-2);
        }
        return this.b;
    }

    public final dbdz B() {
        if ((this.l & 4) == 4) {
            dbdz.j(E(), this.y);
            this.l &= -5;
        }
        return this.y;
    }

    public final void D() {
        dbcs dbcsVar;
        dbhe u = u();
        dbdr dbdrVar = u != null ? u.i : null;
        if (dbdrVar == null) {
            dbdq dbdqVar = this.r;
            if (dbdqVar == null) {
                return;
            }
            dbdqVar.b(null);
            this.r = null;
            return;
        }
        dbdq dbdqVar2 = this.r;
        if (dbdqVar2 != null) {
            if (dbdqVar2.b == dbdrVar) {
                return;
            }
            dbdqVar2.a(dbdrVar);
            return;
        }
        dbdq dbdqVar3 = new dbdq(this, dbdrVar);
        this.r = dbdqVar3;
        if (!this.n || (dbcsVar = this.e) == null) {
            return;
        }
        dbdqVar3.b(dbcsVar.d);
    }

    public final dbdz E() {
        if ((this.l & 2) == 2) {
            dbcm dbcmVar = this.f;
            if (dbcmVar == null) {
                this.x.a(A().b);
            } else {
                dbdz.h(dbcmVar.E(), A(), this.x);
            }
            this.l &= -3;
        }
        return this.x;
    }

    public final dbeb F() {
        if ((this.l & 32) == 32) {
            if (this.f != null) {
                E().c(this.d);
            } else {
                this.d.a(this.j);
            }
            this.l &= -33;
        }
        return this.d;
    }

    public final dbhq G() {
        dbcs dbcsVar = this.e;
        if (dbcsVar != null) {
            dbhq dbhqVar = dbcsVar.b.f;
            dbjb.c(dbhqVar);
            return dbhqVar;
        }
        throw new IllegalStateException("Unable to get Renderer.");
    }

    public void a(dbci dbciVar) {
    }

    public final void f(dbcn dbcnVar) {
        dbix.a();
        dbcn dbcnVar2 = this.g;
        if (dbcnVar == dbcnVar2) {
            return;
        }
        this.z = false;
        if (dbcnVar != null) {
            dbix.a();
            if (this.g != dbcnVar) {
                StringBuilder sb = new StringBuilder();
                if (!dbcnVar.h(this, sb)) {
                    throw new IllegalArgumentException(sb.toString());
                }
                dbcnVar.i(this);
            }
        } else if (dbcnVar2 != null) {
            dbcnVar2.H(this);
        }
        this.z = true;
        k(62, this);
    }

    public final boolean g(dbcn dbcnVar) {
        dbcn dbcnVar2 = this.g;
        dbcm dbcmVar = this.f;
        while (dbcnVar2 != null) {
            if (dbcnVar2 == dbcnVar) {
                return true;
            }
            if (dbcmVar == null) {
                return false;
            }
            dbcnVar2 = dbcmVar.g;
            dbcmVar = dbcmVar.f;
        }
        return false;
    }

    @Override // defpackage.dbcn
    protected final boolean h(dbcm dbcmVar, StringBuilder sb) {
        if (!super.h(dbcmVar, sb)) {
            return false;
        }
        if (!g(dbcmVar)) {
            return true;
        }
        sb.append("Cannot add child: A node's parent cannot be one of its descendants.");
        return false;
    }

    @Override // defpackage.dbcn
    protected final void i(dbcm dbcmVar) {
        super.i(dbcmVar);
        dbcmVar.f = this;
        dbcmVar.k(62, dbcmVar);
        dbcmVar.y(this.e);
    }

    @Override // defpackage.dbcn
    protected final void j(dbcm dbcmVar) {
        super.j(dbcmVar);
        dbcmVar.f = null;
        dbcmVar.k(62, dbcmVar);
        dbcmVar.y(null);
    }

    public final void k(int i, dbcm dbcmVar) {
        boolean z;
        int i2 = this.l;
        if ((i2 & i) != i) {
            this.l = i2 | i;
            dbdq dbdqVar = this.r;
            if (dbdqVar != null) {
                dbdqVar.d = true;
            }
            z = true;
        } else {
            z = false;
        }
        if (dbcmVar.z) {
            for (int i3 = 0; i3 < this.t.size(); i3++) {
                dbcy dbcyVar = this.t.get(i3);
                dbda dbdaVar = dbcyVar.c;
                if ((dbcmVar != dbdaVar && !dbdaVar.g(dbcmVar)) || !g(dbcyVar.c)) {
                    dbcyVar.b = true;
                    dbcyVar.c.d = true;
                }
            }
        } else if (!z) {
            return;
        }
        List<dbcm> list = this.w;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).k(i, dbcmVar);
        }
    }

    public final dbeb l() {
        if ((this.l & 8) == 8) {
            if (this.f != null) {
                E().b(this.k);
            } else {
                this.k.a(this.h);
            }
            this.l &= -9;
        }
        return new dbeb(this.k);
    }

    public final dbea m() {
        return new dbea(b());
    }

    public final void n(dbeb dbebVar) {
        this.h.a(dbebVar);
        k(63, this);
    }

    public final void o(dbea dbeaVar) {
        this.i.a(dbeaVar);
        k(63, this);
    }

    public final void p(dbeb dbebVar) {
        this.j.a(dbebVar);
        k(63, this);
    }

    public final void q(dbea dbeaVar) {
        dbcm dbcmVar = this.f;
        if (dbcmVar == null) {
            this.i.a(dbeaVar);
        } else {
            dbea dbeaVar2 = this.i;
            dbea b = dbcmVar.b();
            dbeaVar2.a(dbea.c(new dbea(-b.a, -b.b, -b.c, b.d), dbeaVar));
        }
        k(63, this);
        this.c.a(dbeaVar);
        this.l &= -17;
    }

    public final dbeb r(dbeb dbebVar) {
        return B().i(dbebVar);
    }

    public final dbeb s(dbeb dbebVar) {
        return dbea.b(b(), dbebVar);
    }

    public final dbeb t() {
        return s(dbeb.n());
    }

    public final String toString() {
        String str = this.a;
        String obj = super.toString();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(obj).length());
        sb.append(str);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final dbhe u() {
        dbhl dbhlVar = this.p;
        if (dbhlVar == null) {
            return null;
        }
        return dbhlVar.b;
    }

    public final dbez v() {
        dbfc dbfcVar = this.q;
        if (dbfcVar != null) {
            return dbfcVar.b;
        }
        return null;
    }

    @Override // defpackage.dbdx
    public final dbdz w() {
        return E();
    }

    @Override // defpackage.dbcn
    public final void x(Consumer<dbcm> consumer) {
        consumer.accept(this);
        super.x(consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(dbcs dbcsVar) {
        dbix.a();
        this.e = dbcsVar;
        for (dbcm dbcmVar : this.w) {
            dbcmVar.y(dbcsVar);
        }
        C();
    }

    public final dbhx z() {
        dbhl dbhlVar = this.p;
        if (dbhlVar != null) {
            return dbhlVar.b();
        }
        return null;
    }

    public final void C() {
        dbcm dbcmVar;
        dbcs dbcsVar;
        dbhl dbhlVar;
        int i = 0;
        boolean z = this.m && this.e != null && ((dbcmVar = this.f) == null || dbcmVar.n);
        if (this.n != z) {
            if (!z) {
                dbix.a();
                if (this.n) {
                    this.n = false;
                    dbhl dbhlVar2 = this.p;
                    if (dbhlVar2 != null) {
                        dbhlVar2.d();
                    }
                    dbfc dbfcVar = this.q;
                    if (dbfcVar != null) {
                        dbfcVar.b();
                    }
                    dbdq dbdqVar = this.r;
                    if (dbdqVar != null) {
                        dbdqVar.b(null);
                    }
                    ArrayList<dbck> arrayList = this.s;
                    int size = arrayList.size();
                    while (i < size) {
                        arrayList.get(i).b();
                        i++;
                    }
                } else {
                    throw new AssertionError("Cannot call deactivate while already inactive.");
                }
            } else {
                dbix.a();
                if (!this.n) {
                    this.n = true;
                    if (this.e != null && (dbhlVar = this.p) != null) {
                        dbhlVar.c(G());
                    }
                    dbfc dbfcVar2 = this.q;
                    if (dbfcVar2 != null) {
                        dbfcVar2.a(G());
                    }
                    dbdq dbdqVar2 = this.r;
                    if (dbdqVar2 != null && (dbcsVar = this.e) != null) {
                        dbdqVar2.b(dbcsVar.d);
                    }
                    ArrayList<dbck> arrayList2 = this.s;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        arrayList2.get(i).a();
                        i++;
                    }
                } else {
                    throw new AssertionError("Cannot call activate while already active.");
                }
            }
        }
        for (dbcm dbcmVar2 : this.w) {
            dbcmVar2.C();
        }
    }
}
