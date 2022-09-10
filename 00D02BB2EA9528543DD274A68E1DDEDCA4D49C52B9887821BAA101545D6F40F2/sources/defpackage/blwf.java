package defpackage;
/* compiled from: PG */
/* renamed from: blwf  reason: default package */
/* loaded from: classes3.dex */
public final class blwf extends cjua {
    private final String a;
    private final dbsg<dnee> b;
    private final String c;
    private final dbsg<dgci> d;
    private final String e;
    private final int f;

    public blwf(blvu blvuVar, dnee dneeVar, String str, cqat cqatVar, dbsg<dgci> dbsgVar, String str2) {
        super(cqatVar);
        this.a = blvuVar.a().c("UNKNOWN_QUESTION_IDENTITY");
        this.b = dbsg.i(dneeVar);
        this.f = 4;
        this.c = str;
        this.d = dbsgVar;
        this.e = str2;
    }

    @Override // defpackage.cjua
    protected final dvra a() {
        dvrv dvrvVar;
        dvqz bZ = dvra.f.bZ();
        dvrt bZ2 = dvrv.f.bZ();
        String str = this.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvrv dvrvVar2 = (dvrv) bZ2.b;
        str.getClass();
        int i = dvrvVar2.a | 1;
        dvrvVar2.a = i;
        dvrvVar2.b = str;
        String str2 = this.a;
        str2.getClass();
        int i2 = i | 2;
        dvrvVar2.a = i2;
        dvrvVar2.c = str2;
        dvrvVar2.d = this.f - 1;
        dvrvVar2.a = i2 | 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvra dvraVar = (dvra) bZ.b;
        dvrv bK = bZ2.bK();
        bK.getClass();
        dvraVar.c = bK;
        dvraVar.b = 3;
        if (this.b.a()) {
            try {
                dvra dvraVar2 = (dvra) bZ.b;
                if (dvraVar2.b == 3) {
                    dvrvVar = (dvrv) dvraVar2.c;
                } else {
                    dvrvVar = dvrv.f;
                }
                dsqp dsqpVar = (dsqp) dvrvVar.cu(5);
                dsqpVar.bC(dvrvVar);
                dvrt dvrtVar = (dvrt) dsqpVar;
                dvqt dvqtVar = (dvqt) dsqw.cq(dvqt.a, this.b.b().bS());
                if (dvrtVar.c) {
                    dvrtVar.bF();
                    dvrtVar.c = false;
                }
                dvrv dvrvVar3 = (dvrv) dvrtVar.b;
                dvqtVar.getClass();
                dvrvVar3.e = dvqtVar;
                dvrvVar3.a |= 8;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvra dvraVar3 = (dvra) bZ.b;
                dvrv bK2 = dvrtVar.bK();
                bK2.getClass();
                dvraVar3.c = bK2;
                dvraVar3.b = 3;
            } catch (dsrm e) {
                bvoo.f(new RuntimeException(e));
            }
        }
        if (this.d.a()) {
            dgci b = this.d.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvra dvraVar4 = (dvra) bZ.b;
            b.getClass();
            dvraVar4.d = b;
            dvraVar4.a |= 32;
        }
        String str3 = this.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvra dvraVar5 = (dvra) bZ.b;
        str3.getClass();
        dvraVar5.a |= 64;
        dvraVar5.e = str3;
        return bZ.bK();
    }

    public blwf(blvu blvuVar, int i, String str, cqat cqatVar, dbsg<dgci> dbsgVar, String str2) {
        super(cqatVar);
        this.a = blvuVar.a().c("UNKNOWN_QUESTION_IDENTITY");
        this.b = dbpy.a;
        this.f = i;
        this.c = str;
        this.d = dbsgVar;
        this.e = str2;
    }
}
