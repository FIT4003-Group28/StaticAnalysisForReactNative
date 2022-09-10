package defpackage;

import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
/* compiled from: PG */
/* renamed from: arbj  reason: default package */
/* loaded from: classes.dex */
public final class arbj<T> extends btrh<T> {
    private final int d;

    public arbj(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        boolean z;
        int a;
        switch (this.d) {
            case 0:
                crhp crhpVar = (crhp) obj;
                aray arayVar = ((arbf) this.a).a.k;
                String str = crhpVar.b() ? crhpVar.c().b : null;
                arayVar.q = str;
                if (arayVar.i == null) {
                    return;
                }
                if (arayVar.k != ardz.NAVIGATION || str == null) {
                    arayVar.i.e = null;
                    return;
                } else {
                    arayVar.i.e = str;
                    return;
                }
            case 1:
                crhr crhrVar = (crhr) obj;
                aray arayVar2 = ((arbf) this.a).a.k;
                if (arayVar2.i == null || !arayVar2.m) {
                    arayVar2.s = true;
                    return;
                } else {
                    arayVar2.i.e();
                    return;
                }
            case 2:
                crmk crmkVar = (crmk) obj;
                aray arayVar3 = ((arbf) this.a).a.k;
                if (arayVar3.i == null) {
                    return;
                }
                arayVar3.i.d = true;
                return;
            case 3:
                ((arbf) this.a).a((amqo) obj);
                return;
            case 4:
                arbf arbfVar = (arbf) this.a;
                ahlc ahlcVar = (ahlc) obj;
                arbi arbiVar = arbfVar.a;
                int i = ahlcVar.a;
                int i2 = arbiVar.v;
                if (i2 == 0 && arbiVar.w && i == -1) {
                    i = -1;
                    z = true;
                } else {
                    z = false;
                }
                arbiVar.w = false;
                if (!arbiVar.b.m || i2 != 1) {
                    if (arbiVar.x != i && !z) {
                        arbiVar.x = i;
                        arbiVar.k.e(i);
                        arbi arbiVar2 = arbfVar.a;
                        arbo arboVar = arbiVar2.i;
                        int i3 = arbiVar2.x;
                        ckcw ckcwVar = arboVar.a;
                        if (ckcwVar != null) {
                            ckco ckcoVar = (ckco) ckcwVar.a(ckgh.aN);
                            if (i3 == 0) {
                                a = arbn.a(4);
                            } else if (i3 == 1) {
                                a = arbn.a(3);
                            } else if (i3 == 2) {
                                a = arbn.a(2);
                            } else if (i3 != 3) {
                                a = i3 != 4 ? arbn.a(5) : arbn.a(6);
                            } else {
                                a = arbn.a(1);
                            }
                            ckcoVar.a(a);
                        }
                    }
                } else {
                    arbiVar.x = 3;
                    arbiVar.k.e(3);
                }
                arbfVar.a.e.k(ahlcVar);
                return;
            case 5:
                arbf arbfVar2 = (arbf) this.a;
                ahkz ahkzVar = (ahkz) obj;
                arbfVar2.a.z();
                arbfVar2.a.y();
                return;
            case 6:
                arbt arbtVar = (arbt) obj;
                ((arbf) this.a).a.z();
                return;
            case 7:
                arbf arbfVar3 = (arbf) this.a;
                CarHeadingEvent carHeadingEvent = (CarHeadingEvent) obj;
                arbi arbiVar3 = arbfVar3.a;
                if (!arbiVar3.j || !arbiVar3.p.j(carHeadingEvent)) {
                    return;
                }
                synchronized (arbfVar3.a.o) {
                    arbi arbiVar4 = arbfVar3.a;
                    if (arbiVar4.o.t) {
                        arbiVar4.y();
                    }
                }
                return;
            case 8:
                ((arbf) this.a).a.p.i((AndroidLocationEvent) obj);
                return;
            case 9:
                arbf arbfVar4 = (arbf) this.a;
                ahju ahjuVar = (ahju) obj;
                aray arayVar4 = arbfVar4.a.k;
                boolean z2 = ahjuVar.b;
                boolean z3 = ahjuVar.c;
                arayVar4.o = z2;
                arayVar4.p = z3;
                if (arayVar4.i != null) {
                    ardh ardhVar = arayVar4.i;
                    ardhVar.c = z2;
                    if (!z2) {
                        ardhVar.g = null;
                    }
                }
                arbfVar4.a.y();
                return;
            default:
                arbf arbfVar5 = (arbf) this.a;
                aray arayVar5 = arbfVar5.a.k;
                boolean a2 = ((afwq) obj).a(afwm.SATELLITE);
                arde ardeVar = arayVar5.h;
                if (ardeVar != null) {
                    ardeVar.b.c.c = a2;
                }
                arbfVar5.a.z();
                arbfVar5.a.y();
                return;
        }
    }
}
