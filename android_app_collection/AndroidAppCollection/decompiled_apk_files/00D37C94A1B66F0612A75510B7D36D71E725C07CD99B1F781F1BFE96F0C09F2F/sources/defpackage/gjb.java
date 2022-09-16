package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gjb  reason: default package */
/* loaded from: classes3.dex */
public final class gjb implements tct {
    private final aavc a;
    private final aaqf b;
    private final afvn c;
    private final aafo d;
    private final yzj e;
    private final Executor f;

    public gjb(aavc aavcVar, aaqf aaqfVar, afvn afvnVar, aafo aafoVar, yzj yzjVar, Executor executor) {
        this.a = aavcVar;
        this.b = aaqfVar;
        this.c = afvnVar;
        this.d = aafoVar;
        this.e = yzjVar;
        this.f = executor;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awsj.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        awsj awsjVar = (awsj) obj;
        if ((awsjVar.c & 1) != 0) {
            arny arnyVar = awsjVar.d;
            if (arnyVar == null) {
                arnyVar = arny.a;
            }
            aave aaveVar = new aave(this.b, this.c.c());
            int i = arnyVar.b;
            if ((i & 32) != 0) {
                aaveVar.s = arnyVar.h;
            }
            if ((i & 4) != 0) {
                aaveVar.t(arnyVar.g);
            }
            if ((arnyVar.b & 2) != 0) {
                aaveVar.u(arnyVar.f);
            }
            int i2 = arnyVar.c;
            if (i2 == 9) {
                arnk arnkVar = (arnk) arnyVar.d;
                if ((arnkVar.b & 1) != 0) {
                    aaveVar.b = arnkVar.c;
                }
                if ((arnkVar.b & 4) != 0) {
                    arif arifVar = (arnyVar.c == 9 ? (arnk) arnyVar.d : arnk.a).e;
                    if (arifVar == null) {
                        arifVar = arif.a;
                    }
                    aaveVar.u = arifVar;
                }
                if (((arnyVar.c == 9 ? (arnk) arnyVar.d : arnk.a).b & 2) != 0) {
                    aaveVar.t = (arnyVar.c == 9 ? (arnk) arnyVar.d : arnk.a).d;
                }
            } else if (i2 == 10) {
                arnl arnlVar = (arnl) arnyVar.d;
                if ((arnlVar.b & 1) != 0) {
                    aaveVar.d = arnlVar.c;
                }
            } else if (i2 == 8) {
                aaveVar.a = ((arnn) arnyVar.d).b;
            } else if (i2 == 7) {
                arnp arnpVar = (arnp) arnyVar.d;
                if ((arnpVar.b & 1) != 0) {
                    aaveVar.c = arnpVar.c;
                }
            } else if (i2 == 14) {
                aaveVar.v = (arnj) arnyVar.d;
            } else if (i2 == 15) {
                aaveVar.w = ((arno) arnyVar.d).c;
            }
            ankt d = this.a.d(aaveVar, this.f);
            anlz.A(d, new gja(this.d, this.e), anjk.a);
            return zhn.c(d);
        }
        return aynr.s(new Throwable("CreatePostElementCommand has no post request"));
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
