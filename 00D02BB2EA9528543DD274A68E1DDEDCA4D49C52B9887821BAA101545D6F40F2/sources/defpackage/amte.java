package defpackage;

import android.content.Context;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: amte  reason: default package */
/* loaded from: classes2.dex */
public class amte implements Serializable {
    public static final /* synthetic */ int l = 0;
    private static final dcep<dqvj> m = dcep.G(dqvj.DRIVE, dqvj.BICYCLE, dqvj.WALK, dqvj.TRANSIT, dqvj.TAXI, dqvj.TWO_WHEELER, new dqvj[0]);
    static final long serialVersionUID = 451564227077576556L;
    public transient amsy a;
    public final dqvj b;
    public final amvh[] c;
    public final amvf[] d;
    public final bvrt<dwao> e;
    public final bvrt<duqc> f;
    public final long g;
    @dzsi
    public final bvrt<dwaw> h;
    public final int i;
    public final boolean j;
    public final boolean k;
    @dzsi
    private transient dcdc<amub> n;

    public amte(amtd amtdVar) {
        amsy amsyVar = amtdVar.a;
        dbsk.s(amsyVar);
        this.a = amsyVar;
        dqvj dqvjVar = amtdVar.b;
        dbsk.s(dqvjVar);
        this.b = dqvjVar;
        this.c = (amvh[]) ((amvh[]) dbsk.s(amtdVar.c)).clone();
        amvf[] amvfVarArr = amtdVar.d;
        this.d = amvfVarArr != null ? (amvf[]) amvfVarArr.clone() : new amvf[0];
        bvrt<dwao> bvrtVar = amtdVar.e;
        this.e = bvrtVar == null ? bvrt.b(dwao.R) : bvrtVar;
        bvrt<duqc> bvrtVar2 = amtdVar.f;
        this.f = bvrtVar2 == null ? bvrt.b(duqc.f) : bvrtVar2;
        this.g = amtdVar.g;
        this.h = amtdVar.h;
        this.i = amtdVar.i;
        this.j = amtdVar.j;
        this.k = false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new amsy((dwbc) dwbc.ct(dwbc.g, objectInputStream));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        this.a.a.bU(objectOutputStream);
    }

    public final synchronized List<amub> a(Context context) {
        int i;
        if (this.n == null) {
            int n = this.a.n();
            dccx F = dcdc.F();
            int i2 = 0;
            while (i2 < n) {
                boolean z = true;
                dbsk.a(i2 >= 0);
                if (i2 >= this.a.n()) {
                    z = false;
                }
                dbsk.a(z);
                amsy amsyVar = this.a;
                amub amubVar = null;
                if (amsyVar == null) {
                    i = i2;
                } else {
                    i = i2;
                    amtx c = amub.c(amsyVar, this.g, this.j ? this.g : 0L, i2, context, null, this.c, this.d, false, i());
                    if (c != null) {
                        c.O = false;
                        amubVar = c.a();
                    }
                }
                amub amubVar2 = amubVar;
                if (amubVar2 != null) {
                    F.g(amubVar2);
                }
                i2 = i + 1;
            }
            this.n = F.f();
        }
        return this.n;
    }

    @dzsi
    public final amub b(int i, Context context) {
        for (amub amubVar : a(context)) {
            if (amubVar.c == i) {
                return amubVar;
            }
        }
        return null;
    }

    @dzsi
    public final dqvj c(int i) {
        amsy amsyVar = this.a;
        if (amsyVar == null || i >= amsyVar.n()) {
            return null;
        }
        dqvj c = dqvj.c(this.a.m(i).b().b);
        return c == null ? dqvj.DRIVE : c;
    }

    public final dqvj d() {
        dovh B;
        amsy amsyVar = this.a;
        int i = 1;
        if (amsyVar != null && (B = amsyVar.B()) != null) {
            dove doveVar = B.b;
            if (doveVar == null) {
                doveVar = dove.c;
            }
            if ((doveVar.a & 1) != 0) {
                dove doveVar2 = B.b;
                if (doveVar2 == null) {
                    doveVar2 = dove.c;
                }
                dqvj c = dqvj.c(doveVar2.b);
                return c == null ? dqvj.DRIVE : c;
            }
        }
        dphq dphqVar = i().e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        int a = dpho.a(dphqVar.c);
        if (a == 0 || a != 2) {
            return this.b;
        }
        dqvj c2 = c(0);
        if (c2 == dqvj.WALK) {
            while (true) {
                if (i >= this.a.n()) {
                    break;
                } else if (c(i) == dqvj.TRANSIT) {
                    c2 = dqvj.TRANSIT;
                    break;
                } else {
                    i++;
                }
            }
        }
        return (c2 == null || !m.contains(c2)) ? this.b : c2;
    }

    public final amvh e() {
        return this.c[0];
    }

    public final amvh f() {
        return this.c[1];
    }

    public final amvh g() {
        amvh[] amvhVarArr = this.c;
        return amvhVarArr[amvhVarArr.length - 1];
    }

    public final boolean h() {
        return this.c.length > 2;
    }

    public final dwao i() {
        return this.e.e((dssr) dwao.R.cu(7), dwao.R);
    }

    public final duqc j() {
        return this.f.e((dssr) duqc.f.cu(7), duqc.f);
    }

    public final List<dvxl> k() {
        return this.a.a.c;
    }
}
