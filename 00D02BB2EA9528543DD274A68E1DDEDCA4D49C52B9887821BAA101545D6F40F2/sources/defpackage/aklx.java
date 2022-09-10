package defpackage;
/* compiled from: PG */
/* renamed from: aklx  reason: default package */
/* loaded from: classes2.dex */
public class aklx implements aklh {
    @dzsi
    private final jic a;
    @dzsi
    private final eik b;
    private final Boolean c;
    private final dqiz d;
    private final dqis e;
    private final int f;
    private final int g;
    private final dqiv h;

    private aklx(dqja dqjaVar, eiq eiqVar) {
        dqiz dqizVar;
        dqiw dqiwVar = dqjaVar.d;
        dqiwVar = dqiwVar == null ? dqiw.d : dqiwVar;
        dqiv b = dqiv.b(dqiwVar.a);
        jic jicVar = null;
        if ((b == null ? dqiv.UNKNOWN_FORMAT : b) == dqiv.LOTTIE && !dqiwVar.b.isEmpty()) {
            this.b = eiqVar.a(dqiwVar.b);
        } else {
            this.b = null;
        }
        dqiw dqiwVar2 = dqjaVar.d;
        this.c = Boolean.valueOf((dqiwVar2 == null ? dqiw.d : dqiwVar2).c);
        dqiw dqiwVar3 = dqjaVar.d;
        dqiv b2 = dqiv.b((dqiwVar3 == null ? dqiw.d : dqiwVar3).a);
        this.h = b2 == null ? dqiv.UNKNOWN_FORMAT : b2;
        ckql ckqlVar = new ckql();
        int i = 0;
        ckqlVar.e = false;
        this.a = !dqjaVar.e.isEmpty() ? new jic(dqjaVar.e, ckqc.FULLY_QUALIFIED, null, 0, null, ckqlVar) : jicVar;
        if (dqjaVar.a == 4) {
            dqizVar = dqiz.b(((Integer) dqjaVar.b).intValue());
            if (dqizVar == null) {
                dqizVar = dqiz.UNKNOWN_SCALE_TYPE;
            }
        } else {
            dqizVar = dqiz.UNKNOWN_SCALE_TYPE;
        }
        dqis b3 = dqis.b(dqjaVar.f);
        b3 = b3 == null ? dqis.UNKNOWN_ANCHOR : b3;
        int max = Math.max(dqjaVar.a == 5 ? ((Integer) dqjaVar.b).intValue() : 0, 0);
        i = max <= 0 ? Math.max(dqjaVar.a == 6 ? ((Integer) dqjaVar.b).intValue() : 0, 0) : i;
        if (max > 0 || i > 0) {
            dqizVar = dqiz.UNKNOWN_SCALE_TYPE;
        } else if (dqizVar == dqiz.UNKNOWN_SCALE_TYPE) {
            dqizVar = dqiz.SCALE;
        }
        b3 = (b3 == dqis.UNKNOWN_ANCHOR || dqizVar == dqiz.SCALE) ? dqis.CENTER : b3;
        if (dqizVar == dqiz.FIT_TOP) {
            dqizVar = dqiz.FIT_WIDTH;
            b3 = dqis.CENTER_TOP;
        } else if (dqizVar == dqiz.FIT_BOTTOM) {
            dqizVar = dqiz.FIT_WIDTH;
            b3 = dqis.CENTER_BOTTOM;
        }
        this.d = dqizVar;
        this.e = b3;
        this.f = max;
        this.g = i;
    }

    @dzsi
    public static aklx i(dqja dqjaVar, eiq eiqVar) {
        aklx aklxVar = new aklx(dqjaVar, eiqVar);
        if (aklxVar.d() == null && aklxVar.a() == null) {
            return null;
        }
        return aklxVar;
    }

    @Override // defpackage.aklh
    @dzsi
    public eik a() {
        return this.b;
    }

    @Override // defpackage.aklh
    public dqiv b() {
        return this.h;
    }

    @Override // defpackage.aklh
    public Boolean c() {
        return this.c;
    }

    @Override // defpackage.aklh
    @dzsi
    public jic d() {
        return this.a;
    }

    @Override // defpackage.aklh
    @dzsi
    public cqtv e() {
        int i = this.f;
        if (i > 0) {
            return cqrp.d(i);
        }
        return null;
    }

    @Override // defpackage.aklh
    @dzsi
    public cqtv f() {
        int i = this.g;
        if (i > 0) {
            return cqrp.d(i);
        }
        return null;
    }

    @Override // defpackage.aklh
    public dqiz g() {
        return this.d;
    }

    @Override // defpackage.aklh
    public dqis h() {
        return this.e;
    }
}
