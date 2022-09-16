package defpackage;

import android.os.Looper;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: szv  reason: default package */
/* loaded from: classes4.dex */
public final class szv implements tct {
    private final axnm a;
    private final ayor b;
    private final /* synthetic */ int c;

    public szv(axnm axnmVar, ayor ayorVar) {
        this.a = axnmVar;
        this.b = ayorVar;
    }

    public szv(axnm axnmVar, ayor ayorVar, int i) {
        this.c = i;
        this.a = axnmVar;
        this.b = ayorVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        if (this.c == 0) {
            return awof.b;
        }
        return awni.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        aynr f;
        if (this.c == 0) {
            final awof awofVar = (awof) obj;
            final tcu tcuVar = (tcu) this.a.get();
            if ((awofVar.c & 1) != 0) {
                awmt awmtVar = awofVar.d;
                if (awmtVar == null) {
                    awmtVar = awmt.a;
                }
                tcuVar.b(awmtVar, tcsVar).Q();
            }
            if ((awofVar.c & 2) != 0) {
                awmt awmtVar2 = awofVar.e;
                if (awmtVar2 == null) {
                    awmtVar2 = awmt.a;
                }
                azgz azgzVar = new azgz(tcuVar.d(awmtVar2, tcsVar, 1).E(this.b).N());
                azqc.i();
                return azgzVar.g(new ayqe() { // from class: szu
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        awof awofVar2 = awof.this;
                        tcu tcuVar2 = tcuVar;
                        tcs tcsVar2 = tcsVar;
                        if (((ayoh) obj2).b == null) {
                            if ((awofVar2.c & 4) != 0) {
                                awmt awmtVar3 = awofVar2.f;
                                if (awmtVar3 == null) {
                                    awmtVar3 = awmt.a;
                                }
                                return tcuVar2.d(awmtVar3, tcsVar2, 1);
                            }
                            return aynr.f();
                        } else if ((awofVar2.c & 8) != 0) {
                            awmt awmtVar4 = awofVar2.g;
                            if (awmtVar4 == null) {
                                awmtVar4 = awmt.a;
                            }
                            return tcuVar2.d(awmtVar4, tcsVar2, 1);
                        } else {
                            return aynr.f();
                        }
                    }
                });
            }
            return aynr.f();
        }
        awni awniVar = (awni) obj;
        if ((awniVar.c & 2) == 0) {
            f = aynr.f();
        } else {
            tcu tcuVar2 = (tcu) this.a.get();
            awmt awmtVar3 = awniVar.e;
            if (awmtVar3 == null) {
                awmtVar3 = awmt.a;
            }
            f = tcuVar2.d(awmtVar3, tcsVar, 1);
        }
        float f2 = awniVar.d;
        if (f2 <= 0.0f) {
            return f;
        }
        double d = f2;
        Double.isNaN(d);
        aynr c = aynr.G((long) (d * 1000000.0d), TimeUnit.MICROSECONDS, this.b).c(f);
        return Looper.myLooper() == Looper.getMainLooper() ? c.B(aypa.a()) : c;
    }
}
