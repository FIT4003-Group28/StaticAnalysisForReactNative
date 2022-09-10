package defpackage;
/* compiled from: PG */
/* renamed from: wqv  reason: default package */
/* loaded from: classes7.dex */
public class wqv implements wpr {
    public final boolean a;
    private final amub b;
    @dzsi
    private final eaol c;
    @dzsi
    private final wqu d;
    @dzsi
    private final wpp e;

    private wqv(amub amubVar, @dzsi dgaw dgawVar, @dzsi wqu wquVar, boolean z, @dzsi cqkn<wpr> cqknVar) {
        this.b = amubVar;
        this.c = vxs.a(dgawVar);
        this.d = wquVar;
        this.a = dbsd.a(amubVar.d.o(), dpht.CANCELLED);
        this.e = z ? new wqt(this, cqknVar) : null;
    }

    public static wqv e(amub amubVar, @dzsi dgaw dgawVar, @dzsi wqu wquVar, @dzsi cqkn<wpr> cqknVar) {
        return new wqv(amubVar, dgawVar, wquVar, true, cqknVar);
    }

    public static wqv f(amub amubVar, @dzsi dgaw dgawVar, @dzsi wqu wquVar) {
        return new wqv(amubVar, dgawVar, wquVar, false, null);
    }

    @Override // defpackage.wpr
    public amub a() {
        return this.b;
    }

    @Override // defpackage.wpr
    @dzsi
    public wpp b() {
        return this.e;
    }

    @Override // defpackage.wpr
    @dzsi
    public eapr c() {
        return this.c;
    }

    @Override // defpackage.wpr
    @dzsi
    public wpq d() {
        return this.d;
    }
}
