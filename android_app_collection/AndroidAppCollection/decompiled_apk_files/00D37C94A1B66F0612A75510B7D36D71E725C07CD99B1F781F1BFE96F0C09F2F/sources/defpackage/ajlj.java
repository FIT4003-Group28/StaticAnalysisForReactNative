package defpackage;

import android.content.DialogInterface;
import android.os.Looper;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: ajlj  reason: default package */
/* loaded from: classes.dex */
public class ajlj implements tct, srt {
    public final srv a;
    public final axnm b;
    private final acti c;
    private final akge d;

    public ajlj(srv srvVar, axnm axnmVar, acti actiVar, akge akgeVar) {
        this.a = srvVar;
        this.c = actiVar;
        this.b = axnmVar;
        this.d = akgeVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return auvh.b;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    /* renamed from: d */
    public aynr b(final auvh auvhVar, final tcs tcsVar) {
        final awnn awnnVar;
        if (!this.d.j()) {
            if ((auvhVar.c & 1) == 0) {
                aqsz aqszVar = auvhVar.e;
                if (aqszVar == null) {
                    aqszVar = aqsz.a;
                }
                if ((aqszVar.b & 1) == 0) {
                    aqsz aqszVar2 = auvhVar.e;
                    if (aqszVar2 == null) {
                        aqszVar2 = aqsz.a;
                    }
                    if ((aqszVar2.b & 8) != 0) {
                        aqsz aqszVar3 = auvhVar.e;
                        if (aqszVar3 == null) {
                            aqszVar3 = aqsz.a;
                        }
                        if ((aqszVar3.b & 4) != 0) {
                            g(auvhVar, true);
                            tcu tcuVar = (tcu) this.b.get();
                            aqsz aqszVar4 = auvhVar.e;
                            if (aqszVar4 == null) {
                                aqszVar4 = aqsz.a;
                            }
                            awmt awmtVar = aqszVar4.e;
                            if (awmtVar == null) {
                                awmtVar = awmt.a;
                            }
                            return tcuVar.b(awmtVar, tcsVar);
                        }
                    }
                    return aynr.f();
                }
            }
            final srs a = sru.a();
            if (auvhVar.g) {
                a.l = 2;
            } else {
                a.l = 3;
            }
            a.g = tcsVar;
            if (auvhVar.f) {
                a.b(1);
            }
            if ((auvhVar.c & 64) != 0) {
                a.h = new DialogInterface.OnKeyListener() { // from class: ajlh
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        ajlj ajljVar = ajlj.this;
                        auvh auvhVar2 = auvhVar;
                        tcs tcsVar2 = tcsVar;
                        if (i == 4 && keyEvent.getAction() == 1) {
                            tcu tcuVar2 = (tcu) ajljVar.b.get();
                            awmt awmtVar2 = auvhVar2.h;
                            if (awmtVar2 == null) {
                                awmtVar2 = awmt.a;
                            }
                            tcuVar2.b(awmtVar2, tcsVar2).Q();
                            return true;
                        }
                        return false;
                    }
                };
            }
            a.i = this;
            a.j = this.c;
            aqsz aqszVar5 = auvhVar.e;
            if (aqszVar5 == null) {
                aqszVar5 = aqsz.a;
            }
            if ((aqszVar5.b & 1) != 0) {
                aqsz aqszVar6 = auvhVar.e;
                if (aqszVar6 == null) {
                    aqszVar6 = aqsz.a;
                }
                awnnVar = aqszVar6.c;
                if (awnnVar == null) {
                    awnnVar = awnn.a;
                }
            } else {
                awnnVar = auvhVar.d;
                if (awnnVar == null) {
                    awnnVar = awnn.a;
                }
            }
            aynr t = aynr.t(new aypv() { // from class: ajli
                @Override // defpackage.aypv
                public final void a() {
                    ajlj ajljVar = ajlj.this;
                    auvh auvhVar2 = auvhVar;
                    awnn awnnVar2 = awnnVar;
                    srs srsVar = a;
                    ajljVar.g(auvhVar2, false);
                    ajljVar.a.b(awnnVar2, srsVar.a());
                }
            });
            return Looper.myLooper() == Looper.getMainLooper() ? t : t.E(aypa.a());
        }
        return aynr.f();
    }

    @Override // defpackage.srt
    public void e() {
    }

    @Override // defpackage.srt
    public void f() {
    }

    public final void g(auvh auvhVar, boolean z) {
        this.c.d(acuo.a(16906), null, null);
        aqsz aqszVar = auvhVar.e;
        if (aqszVar == null) {
            aqszVar = aqsz.a;
        }
        if ((aqszVar.b & 4) != 0) {
            aqsz aqszVar2 = auvhVar.e;
            if (aqszVar2 == null) {
                aqszVar2 = aqsz.a;
            }
            aoob aoobVar = aqszVar2.d;
            ((acsx) this.c).D(new acte(aoobVar));
            if (!z) {
                return;
            }
            this.c.u(new acte(aoobVar), null);
        }
    }
}
