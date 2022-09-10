package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xba  reason: default package */
/* loaded from: classes7.dex */
public class xba {
    public static final dcdc<dmlo> a = xbb.a;
    public final dxio<akto> b;
    public final Context c;
    protected final TextPaint d = new TextPaint();
    public final Map<dcdc<dpce>, Integer> e = new HashMap();
    public final SparseArray<aktg> f = new SparseArray<>(3);
    public final SparseArray<aktg> g = new SparseArray<>(3);
    public final Map<dcdc<dpce>, akuh> h = new HashMap();
    public final Map<dpyy, akuh> i = new HashMap();
    public final Map<cqtd, akuh> j = new HashMap();
    @dzsi
    public aktg k;
    @dzsi
    public aktg l;
    @dzsi
    public aktg m;
    @dzsi
    public aktg n;
    @dzsi
    public aktg o;
    @dzsi
    public aktg p;

    public xba(dxio<akto> dxioVar, Context context) {
        this.b = dxioVar;
        this.c = context;
    }

    public final void a(dmpe dmpeVar, List<dmpd> list) {
        if (bvox.c(this.c.getResources())) {
            Collections.reverse(list);
        }
        for (dmpd dmpdVar : list) {
            dmpeVar.c(dmpdVar);
        }
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar2 = (dmpd) dmpcVar.b;
        dmpdVar2.a |= 16;
        dmpdVar2.f = true;
        int a2 = c().a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar3 = (dmpd) dmpcVar.b;
        dmpdVar3.a |= 2;
        dmpdVar3.c = a2;
        dmpeVar.b(dmpcVar);
    }

    public final aktg b() {
        if (this.k == null) {
            this.k = k(ire.s().b(this.c), 1);
        }
        aktg aktgVar = this.k;
        dbsk.s(aktgVar);
        return aktgVar;
    }

    public final aktg c() {
        if (this.p == null) {
            akvz e = this.b.a().e();
            dmqt dmqtVar = (dmqt) dmqx.e.bZ();
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            dmopVar.a |= 1;
            dmopVar.b = 0;
            dmpq bZ = dmpv.s.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmpv dmpvVar = (dmpv) bZ.b;
            dmpvVar.a |= 1;
            dmpvVar.b = -16777216;
            dmoa bZ2 = dmob.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmob dmobVar = (dmob) bZ2.b;
            int i = dmobVar.a | 4;
            dmobVar.a = i;
            dmobVar.d = 100;
            dmobVar.a = i | 1;
            dmobVar.b = 11;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmpv dmpvVar2 = (dmpv) bZ.b;
            dmob bK = bZ2.bK();
            bK.getClass();
            dmpvVar2.e = bK;
            dmpvVar2.a |= 4;
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar2 = (dmop) dmooVar.b;
            dmpv bK2 = bZ.bK();
            bK2.getClass();
            dmopVar2.d = bK2;
            dmopVar2.a |= 4;
            dmqtVar.a(dmooVar);
            this.p = e.c((dmqx) dmqtVar.bK());
        }
        aktg aktgVar = this.p;
        dbsk.s(aktgVar);
        return aktgVar;
    }

    public final aktg d(int i) {
        if (this.g.get(i) == null) {
            this.g.put(i, k(i, 8));
        }
        return this.g.get(i);
    }

    public final akuh e(dcdc<dpce> dcdcVar) {
        akuh akuhVar = this.h.get(dcdcVar);
        if (akuhVar == null) {
            Context context = this.c;
            Bitmap a2 = new zua(context, dcdcVar, jmj.a(context, 16), new Rect(0, 0, 0, 0), jmj.a(this.c, 236)).a();
            this.e.put(dcdcVar, Integer.valueOf(a2.getWidth()));
            akuh d = this.b.a().e().d(a2);
            this.h.put(dcdcVar, d);
            return d;
        }
        return akuhVar;
    }

    public final aktg f(int i, int i2) {
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = i2;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i3 = dmobVar.a | 4;
        dmobVar.a = i3;
        dmobVar.d = 100;
        int i4 = i3 | 1;
        dmobVar.a = i4;
        dmobVar.b = i;
        dmobVar.a = i4 | 32;
        dmobVar.f = 8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        return this.b.a().e().c((dmqx) dmqtVar.bK());
    }

    public final float g(String str, float f) {
        this.d.setTextSize(f);
        return this.d.measureText(str);
    }

    public final dmpn h(dmpe dmpeVar, @dzsi akra akraVar) {
        dmlp bZ = dmlq.e.bZ();
        dmlo dmloVar = a.get(0);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        dmlqVar.c = dmloVar.j;
        int i = 2;
        dmlqVar.a |= 2;
        if (akraVar != null) {
            dmls a2 = akxh.a(akraVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar2 = (dmlq) bZ.b;
            a2.getClass();
            dmlqVar2.b = a2;
            dmlqVar2.a |= 1;
        }
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        if (bvox.c(this.c.getResources())) {
            i = 3;
        }
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmph dmphVar2 = dmph.f;
        dmphVar.e = i;
        dmphVar.a |= 4;
        if (this.o == null) {
            this.o = this.b.a().e().c(xbb.a(8, 7));
        }
        aktg aktgVar = this.o;
        dbsk.s(aktgVar);
        int a3 = aktgVar.a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar3 = (dmph) dmpeVar.b;
        dmphVar3.a |= 1;
        dmphVar3.c = a3;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar4 = (dmph) dmpeVar.bK();
        dmphVar4.getClass();
        dmpnVar.b = dmphVar4;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar2.d = bK;
        dmpnVar2.a |= 4;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        int i2 = dmpnVar3.a | 64;
        dmpnVar3.a = i2;
        dmpnVar3.h = 32767;
        dmpnVar3.a = i2 | 32;
        dmpnVar3.g = 3;
        dmpkVar.k(akvj.b, j().bK());
        int i3 = i() * 8;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmpnVar4.a |= 128;
        dmpnVar4.i = i3;
        return (dmpn) dmpkVar.bK();
    }

    protected int i() {
        return 13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public akui j() {
        akui bZ = akuj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akuj akujVar = (akuj) bZ.b;
        akujVar.a |= 4;
        akujVar.d = true;
        return bZ;
    }

    protected final aktg k(int i, int i2) {
        return this.b.a().e().c(xbb.b(i, i2));
    }

    public final String l(String str, float f) {
        float f2 = 244.0f - f;
        return g(str, 12.0f) > f2 ? TextUtils.ellipsize(str, this.d, f2, TextUtils.TruncateAt.END).toString() : str;
    }
}
