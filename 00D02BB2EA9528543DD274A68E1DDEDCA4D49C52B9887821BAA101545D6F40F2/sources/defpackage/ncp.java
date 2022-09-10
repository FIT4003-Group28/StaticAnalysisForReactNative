package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ncp  reason: default package */
/* loaded from: classes7.dex */
public final class ncp implements bwjw, btph {
    private static final long a;
    private static final btys b;
    private static final dcdn<bttq, nco> c;
    private final mfs d;
    private final mfw e;
    private final ckcw f;
    private final ckco g;
    private final ckco h;
    private final ahjq i;
    @dzsi
    private kcz<dcdc<ldm>> j;
    @dzsi
    private dcdc<ldm> k;
    @dzsi
    private ckcq l;

    static {
        long millis = TimeUnit.SECONDS.toMillis(15L);
        a = millis;
        btyr bZ = btys.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar = (btys) bZ.b;
        btysVar.a |= 2;
        btysVar.c = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar2 = (btys) bZ.b;
        btysVar2.a |= 4;
        btysVar2.d = millis;
        b = bZ.bK();
        c = dcdn.m(bttq.REQUEST_TIMEOUT, nco.FAILURE_REQUEST_TIMEOUT, bttq.NO_CONNECTIVITY, nco.FAILURE_NO_CONNECTIVITY, bttq.IO_ERROR, nco.FAILURE_IO_ERROR);
    }

    public ncp(mfs mfsVar, ckcw ckcwVar, ahjq ahjqVar, mfw mfwVar) {
        this.d = mfsVar;
        this.f = ckcwVar;
        this.i = ahjqVar;
        this.e = mfwVar;
        this.g = (ckco) ckcwVar.a(ckee.ad);
        this.h = (ckco) ckcwVar.a(ckee.ab);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    @Override // defpackage.bwjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.bwnq r33) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.a(bwnq):void");
    }

    @Override // defpackage.bwjw
    public final void b() {
        e();
    }

    public final void d(kcz<dcdc<ldm>> kczVar) {
        dbsk.s(kczVar);
        e();
        this.j = kczVar;
        this.d.d(dtja.CAR_SEARCH, dtiy.FETCH_ON_DEMAND, this, false, b);
    }

    public final void e() {
        kcz<dcdc<ldm>> kczVar = this.j;
        if (kczVar == null) {
            return;
        }
        this.j = null;
        this.k = null;
        this.l = null;
        kczVar.b();
        if (this.j != null) {
            throw new RuntimeException("Tried to start a search while it was being canceled.");
        }
    }
}
