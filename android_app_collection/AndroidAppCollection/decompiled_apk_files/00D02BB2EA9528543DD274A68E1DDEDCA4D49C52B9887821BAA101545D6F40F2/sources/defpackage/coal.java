package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: coal  reason: default package */
/* loaded from: classes5.dex */
public final class coal implements coai {
    private final coak a;
    private final dbmd b;
    private long c;
    private final cnxn d;

    public coal(coak coakVar) {
        cnxn cnxnVar = cnxn.a;
        this.a = coakVar;
        this.d = cnxnVar;
        this.b = dbmh.b.bZ();
        this.c = -1L;
    }

    @Override // defpackage.coai
    public final dbmh a() {
        return this.b.bK();
    }

    @Override // defpackage.coai
    public final void c(int i, coak coakVar) {
        if (coakVar == coak.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (coakVar.compareTo(this.a) > 0) {
            return;
        }
        dbme bZ = dbmg.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dbmg dbmgVar = (dbmg) bZ.b;
        dbmgVar.b = i - 1;
        dbmgVar.a |= 1;
        long nanoTime = System.nanoTime();
        if (this.c >= 0) {
            long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime - this.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbmg dbmgVar2 = (dbmg) bZ.b;
            dbmgVar2.a |= 2;
            dbmgVar2.c = millis;
        }
        this.c = nanoTime;
        dbmd dbmdVar = this.b;
        if (dbmdVar.c) {
            dbmdVar.bF();
            dbmdVar.c = false;
        }
        dbmh dbmhVar = (dbmh) dbmdVar.b;
        dbmg bK = bZ.bK();
        dbmh dbmhVar2 = dbmh.b;
        bK.getClass();
        dsrj<dbmg> dsrjVar = dbmhVar.a;
        if (!dsrjVar.a()) {
            dbmhVar.a = dsqw.cl(dsrjVar);
        }
        dbmhVar.a.add(bK);
    }

    @Override // defpackage.coai
    /* renamed from: d */
    public final coal clone() {
        return new coal(this);
    }

    private coal(coal coalVar) {
        this.a = coalVar.a;
        this.d = coalVar.d;
        this.b = coalVar.b.clone();
        this.c = coalVar.c;
    }
}
