package defpackage;
/* compiled from: PG */
/* renamed from: chka  reason: default package */
/* loaded from: classes4.dex */
public class chka implements chmk, amfq {
    private final String a;
    private final String b;
    @dzsi
    private cqtd c;

    public chka(dqee dqeeVar, cqhn cqhnVar, amfi amfiVar) {
        this.a = dqeeVar.b;
        this.b = dqeeVar.c;
        this.c = null;
        if (!dqeeVar.a.isEmpty()) {
            this.c = amfiVar.a(dqeeVar.a, "PointsItemViewModelImpl", this).j();
        }
    }

    @Override // defpackage.amfq
    public void a(amfu amfuVar) {
        this.c = amfuVar.j();
        cqkx.p(this);
    }

    @Override // defpackage.chmk
    public String b() {
        return this.a;
    }

    @Override // defpackage.chmk
    public String c() {
        return this.b;
    }

    @Override // defpackage.chmk
    @dzsi
    public cqtd d() {
        return this.c;
    }
}
