package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxz  reason: default package */
/* loaded from: classes4.dex */
public class cgxz extends chal implements cgvp {
    private final bbut a;
    private final bbtk b;
    private final ges c;
    private List<cgvo> d;
    private List<bbtj> e;

    public cgxz(bbut bbutVar, bbtk bbtkVar, cgum cgumVar, cgsk cgskVar, bwrs<ilo> bwrsVar, ges gesVar, List<dwrg> list, dwql dwqlVar, chak chakVar) {
        super(cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.a = bbutVar;
        this.b = bbtkVar;
        this.c = gesVar;
        this.e = new ArrayList();
        this.d = new ArrayList();
    }

    @Override // defpackage.cgwg
    public void B() {
        this.e = new ArrayList();
        this.d = new ArrayList();
        cqkx.p(this);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        return Boolean.valueOf(!this.e.isEmpty());
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
        dbsk.a(obj instanceof ArrayList);
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            dbsk.a(obj2 instanceof bbtm);
            List<bbtj> list = this.e;
            bbtk bbtkVar = this.b;
            dbsk.s(obj2);
            bbtm bbtmVar = (bbtm) obj2;
            list.add(bbtkVar.b(bbtmVar));
            List<cgvo> list2 = this.d;
            dbsk.s(obj2);
            list2.add(new cgxy(this, bbtmVar));
        }
        cqkx.p(this);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean J() {
        return true;
    }

    @Override // defpackage.cgwg
    public void K() {
        a();
    }

    @Override // defpackage.cgvp
    public cqkl a() {
        if (t() == cgwf.EDITABLE) {
            bbuz m = bbve.m();
            m.e(dwyd.UGC_TASK_SETS);
            ((bbsu) m).b = this.k.c();
            ArrayList<bbtm> D = D();
            if (D != null) {
                m.i(D);
            }
            this.a.k(m.a(), this.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.cgvp
    public List<bbtj> b() {
        return this.e;
    }

    @Override // defpackage.cgvp
    public List<cgvo> c() {
        return this.d;
    }

    @Override // defpackage.cgvp
    public Boolean d() {
        return Boolean.valueOf(this.e.isEmpty());
    }

    public void e(bbuf bbufVar) {
        this.e = new ArrayList();
        this.d = new ArrayList();
        for (bbtm bbtmVar : bbufVar.a()) {
            this.e.add(this.b.b(bbtmVar));
            this.d.add(new cgxy(this, bbtmVar));
        }
        z(!this.e.isEmpty());
        cqkx.p(this);
    }

    @Override // defpackage.cgwg
    @dzsi
    /* renamed from: f */
    public ArrayList<bbtm> D() {
        if (!C().booleanValue()) {
            return null;
        }
        return dchl.c(dcbg.b(this.e).s(cgxx.a));
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgid(), this);
    }
}
