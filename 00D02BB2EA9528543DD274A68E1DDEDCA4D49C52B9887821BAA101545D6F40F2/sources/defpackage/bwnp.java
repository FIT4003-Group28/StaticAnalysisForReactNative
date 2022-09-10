package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bwnp  reason: default package */
/* loaded from: classes4.dex */
public final class bwnp {
    @dzsi
    public dtja a;
    @dzsi
    public dtnh b;
    @dzsi
    public bttq c;
    public boolean d;
    public List<dtmr> e;
    public boolean f;
    private bwnl g = bwnl.a;
    @dzsi
    private String h;
    private boolean i;
    @dzsi
    private dtjs j;

    public bwnp() {
        dtiy dtiyVar = dtiy.FETCH_ON_DEMAND;
        this.e = dcdc.e();
    }

    public final bwnq a() {
        dbsk.s(this.a);
        return new bwnq(this.g, this.a, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(bwno bwnoVar) {
        bwnl bwnlVar;
        String str;
        dtnd dtndVar = bwnoVar.a.b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        if ((dtndVar.a & 1024) != 0) {
            bwnlVar = new bwnl(dtndVar.i);
        } else {
            bwnlVar = bwnl.a;
        }
        this.g = bwnlVar;
        dtjb dtjbVar = dtndVar.e;
        if (dtjbVar == null) {
            dtjbVar = dtjb.h;
        }
        int i = dtjbVar.d;
        dtiy dtiyVar = dtiy.FETCH_ON_DEMAND;
        dtjb dtjbVar2 = dtndVar.e;
        if (dtjbVar2 == null) {
            dtjbVar2 = dtjb.h;
        }
        if ((dtjbVar2.a & 4) != 0) {
            dtjb dtjbVar3 = dtndVar.e;
            if (dtjbVar3 == null) {
                dtjbVar3 = dtjb.h;
            }
            str = dtjbVar3.e;
        } else {
            str = null;
        }
        this.h = str;
        this.i = bwnoVar.b;
        this.j = bwnoVar.d;
    }
}
