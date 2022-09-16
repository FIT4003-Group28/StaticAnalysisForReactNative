package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cdel  reason: default package */
/* loaded from: classes4.dex */
public class cdel implements cdei {
    public final gga a;
    public final cdbb b;
    public final cdek c;
    private final cdai d;
    private final jam e = new cdej(this);

    public cdel(cdbb cdbbVar, cdek cdekVar, cdai cdaiVar, gga ggaVar) {
        this.b = cdbbVar;
        this.c = cdekVar;
        this.a = ggaVar;
        this.d = cdaiVar;
    }

    public static cdel a(cdem cdemVar, cdbb cdbbVar, cdai cdaiVar) {
        return cdemVar.a(cdbbVar, cdek.ERROR, cdaiVar);
    }

    public static cdel b(cdem cdemVar, cdbb cdbbVar, cdai cdaiVar) {
        return cdemVar.a(cdbbVar, cdek.REQUESTING, cdaiVar);
    }

    @Override // defpackage.cdei
    public Boolean c() {
        return false;
    }

    @Override // defpackage.cdei
    public Boolean d() {
        return false;
    }

    @Override // defpackage.cdei
    public List<cdfb> e() {
        return dcdc.e();
    }

    @Override // defpackage.cdei
    public Boolean f() {
        return Boolean.valueOf(this.c == cdek.REQUESTING);
    }

    @Override // defpackage.cdei
    public void g(int i) {
    }

    @Override // defpackage.cdei
    public jam h() {
        return this.e;
    }

    @Override // defpackage.cdei
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.cdei
    public jic j() {
        return new jic(null, ckqc.FIFE, 0);
    }

    @Override // defpackage.cdei
    public cqkl k() {
        return cqkl.a;
    }

    @Override // defpackage.cdei
    public cqkl l() {
        return cqkl.a;
    }

    @Override // defpackage.cdei
    public cqkl m() {
        return cqkl.a;
    }

    @Override // defpackage.cdei
    @dzsi
    public cqqw n() {
        return null;
    }

    @Override // defpackage.cdei
    @dzsi
    public cjtd o() {
        return null;
    }

    @Override // defpackage.cdei
    @dzsi
    public cjtd p() {
        return null;
    }

    @Override // defpackage.cdei
    @dzsi
    public cjtd q() {
        return null;
    }

    @Override // defpackage.cdei
    public Integer r() {
        return 8;
    }

    @Override // defpackage.cdei
    public cdai s() {
        return this.d;
    }

    @Override // defpackage.cdei
    @dzsi
    public cdeh t() {
        return null;
    }
}
