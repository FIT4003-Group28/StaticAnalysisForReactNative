package defpackage;
/* compiled from: PG */
/* renamed from: bcnm  reason: default package */
/* loaded from: classes3.dex */
public class bcnm extends bcnv implements bcmc {
    private final cjtd a;
    private final cafi p;
    private final dxio<afha> q;
    private final boolean r;

    public bcnm(bcnu bcnuVar, cafi cafiVar, dxio<afha> dxioVar, dwfl dwflVar, int i, @dzsi ilo iloVar, boolean z, dwen dwenVar) {
        super(bcnuVar, dwflVar, i, iloVar, dwenVar);
        cjtd cjtdVar;
        this.p = cafiVar;
        this.q = dxioVar;
        this.r = true;
        if (u().booleanValue()) {
            this.o = Float.valueOf(Math.max(1.0f, Math.min(1.5f, this.o.floatValue())));
            cjta b = cjtd.b();
            b.d = dtxy.cf;
            b.b = dwflVar.b;
            b.g(dwflVar.c);
            b.i(i);
            cjtdVar = b.a();
        } else {
            cjtdVar = null;
        }
        this.a = cjtdVar;
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public void a(cqiv cqivVar) {
        if (this.m.c()) {
            cqivVar.a(new bchj(), this);
        } else if (u().booleanValue()) {
            cqivVar.a(new bcgw(), this);
        } else {
            cqivVar.a(new bcda(), this);
        }
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public Boolean h() {
        boolean z = true;
        if (!this.r && !u().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bcmc
    public cqkl m() {
        dwfl dwflVar = this.k;
        if (dwflVar == null) {
            return cqkl.a;
        }
        dwfh dwfhVar = dwflVar.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.c;
        if (dbsj.d(str)) {
            return cqkl.a;
        }
        bmek.b(this.j, this.p, this.q, str).run();
        return cqkl.a;
    }

    @Override // defpackage.bcmc
    public String n() {
        dwfl dwflVar = this.k;
        if (dwflVar == null) {
            return null;
        }
        dwfh dwfhVar = dwflVar.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        if ((dwfhVar.a & 2) == 0) {
            dwfh dwfhVar2 = this.k.k;
            if (dwfhVar2 == null) {
                dwfhVar2 = dwfh.d;
            }
            return dwfhVar2.b;
        }
        dwfh dwfhVar3 = this.k.k;
        if (dwfhVar3 == null) {
            dwfhVar3 = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar3.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.d;
    }

    @Override // defpackage.bcmc
    public Boolean o() {
        return Boolean.valueOf(!dbsj.d(n()));
    }

    @Override // defpackage.bcmc
    public String p() {
        dwfl dwflVar = this.k;
        if (dwflVar != null) {
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            diyt diytVar = dizhVar.e;
            if (diytVar == null) {
                diytVar = diyt.c;
            }
            if (diytVar.b.size() == 0) {
                return "";
            }
            dizh dizhVar2 = this.k.p;
            if (dizhVar2 == null) {
                dizhVar2 = dizh.j;
            }
            diyt diytVar2 = dizhVar2.e;
            if (diytVar2 == null) {
                diytVar2 = diyt.c;
            }
            return diytVar2.b.get(0).d;
        }
        return "";
    }

    @Override // defpackage.bcmc
    public Boolean q() {
        return Boolean.valueOf(!dbsj.d(p()));
    }

    @Override // defpackage.bcmc
    public String r() {
        String valueOf = String.valueOf(n());
        String valueOf2 = String.valueOf(p());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // defpackage.bcmc
    public cjtd s() {
        return this.a;
    }

    public Boolean u() {
        dwfl dwflVar = this.k;
        boolean z = false;
        if (dwflVar == null) {
            return false;
        }
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        dikg dikgVar = diisVar.g;
        if (dikgVar == null) {
            dikgVar = dikg.d;
        }
        dsrh dsrhVar = new dsrh(dikgVar.a, dikg.b);
        if (dsrhVar.contains(dikd.ATTRIB_LINK) && !dsrhVar.contains(dikd.UGC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
