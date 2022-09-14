package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: yws  reason: default package */
/* loaded from: classes7.dex */
public class yws implements yvs {
    private final String a;
    private final dcdc<yvt> b;
    @dzsi
    private final yvt c;
    private final dcdc<yvt> d;
    private cqtv e;
    private cqtv f;

    public yws(String str, List<yvt> list) {
        this(str, list, null);
    }

    @Override // defpackage.yvs
    public String a() {
        return this.a;
    }

    @Override // defpackage.yvs
    @dzsi
    public yvt b() {
        return this.c;
    }

    @Override // defpackage.yvs
    public List<yvt> c() {
        return this.d;
    }

    @Override // defpackage.yvs
    @dzsi
    public String d() {
        dcep L = dcep.L(dcft.i(dcft.o(this.b, ywq.a), ywr.a));
        if (L.size() == 1) {
            return (String) dcft.c(L);
        }
        return null;
    }

    @Override // defpackage.yvs
    @dzsi
    public CharSequence e() {
        yvt yvtVar = this.c;
        if (yvtVar == null) {
            return null;
        }
        return yvtVar.g();
    }

    @Override // defpackage.yvs
    @dzsi
    public cqtd f() {
        yvt yvtVar = this.c;
        if (yvtVar == null) {
            return null;
        }
        return yvtVar.t();
    }

    @Override // defpackage.yvs
    @dzsi
    public String g() {
        yvt yvtVar = this.c;
        if (yvtVar == null) {
            return null;
        }
        return yvtVar.w();
    }

    @Override // defpackage.yvs
    public cqkl h() {
        yvt yvtVar = this.c;
        return yvtVar != null ? yvtVar.m() : cqkl.a;
    }

    @Override // defpackage.yvs
    @dzsi
    public cjtd i() {
        yvt yvtVar = this.c;
        if (yvtVar == null) {
            return null;
        }
        return yvtVar.n();
    }

    @Override // defpackage.yvs
    @dzsi
    public zvb j() {
        return null;
    }

    @Override // defpackage.yvs
    public void k(cqtv cqtvVar) {
        this.e = cqtvVar;
    }

    @Override // defpackage.yvs
    public cqtv l() {
        return this.e;
    }

    @Override // defpackage.yvs
    public void m(cqtv cqtvVar) {
        this.f = cqtvVar;
        yvt yvtVar = this.c;
        if (yvtVar != null) {
            yvtVar.p(cqrp.d(9.0d));
        }
        if (!this.d.isEmpty()) {
            this.d.get(0).p(cqrp.d(9.0d));
        }
    }

    @Override // defpackage.yvs
    public cqtv n() {
        return this.f;
    }

    public yws(String str, List<yvt> list, @dzsi zvb zvbVar) {
        this.e = cqrp.d(9.0d);
        this.f = cqrp.d(67.0d);
        this.a = str;
        this.b = dcdc.r(list);
        this.c = (yvt) dcft.r(list, null);
        this.d = dcbg.b(list).w(1).z();
    }
}
