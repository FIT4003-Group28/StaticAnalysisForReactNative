package defpackage;

import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: xlr  reason: default package */
/* loaded from: classes4.dex */
final class xlr implements afzf {
    final /* synthetic */ xmd a;
    final /* synthetic */ UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction b;
    final /* synthetic */ aufe c;
    final /* synthetic */ xlt d;

    public xlr(xlt xltVar, xmd xmdVar, UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction, aufe aufeVar) {
        this.d = xltVar;
        this.a = xmdVar;
        this.b = updateBackstagePollActionOuterClass$UpdateBackstagePollAction;
        this.c = aufeVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        aqav aqavVar;
        this.d.d.e(cffVar);
        aqbw a = this.a.a();
        xlt xltVar = this.d;
        aqax aqaxVar = a.c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b == 62285947) {
            aqavVar = (aqav) aqaxVar.c;
        } else {
            aqavVar = aqav.a;
        }
        xltVar.b(aqavVar.i, this.c, this.b);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aqav aqavVar;
        aqav aqavVar2;
        aufe aufeVar;
        aqav aqavVar3;
        aqbw a = this.a.a();
        for (arnh arnhVar : ((arnr) obj).c) {
            arni arniVar = arnhVar.g;
            if (arniVar == null) {
                arniVar = arni.a;
            }
            if (arniVar.b == 99391126) {
                xxx xxxVar = this.d.c;
                aqax aqaxVar = a.c;
                if (aqaxVar == null) {
                    aqaxVar = aqax.a;
                }
                if (aqaxVar.b == 62285947) {
                    aqavVar2 = (aqav) aqaxVar.c;
                } else {
                    aqavVar2 = aqav.a;
                }
                String str = aqavVar2.i;
                arni arniVar2 = arnhVar.g;
                if (arniVar2 == null) {
                    arniVar2 = arni.a;
                }
                if (arniVar2.b == 99391126) {
                    aufeVar = (aufe) arniVar2.c;
                } else {
                    aufeVar = aufe.a;
                }
                xxxVar.j(str, aufeVar);
                xxx xxxVar2 = this.d.c;
                aqax aqaxVar2 = a.c;
                if (aqaxVar2 == null) {
                    aqaxVar2 = aqax.a;
                }
                if (aqaxVar2.b == 62285947) {
                    aqavVar3 = (aqav) aqaxVar2.c;
                } else {
                    aqavVar3 = aqav.a;
                }
                String str2 = aqavVar3.i;
                long j = arnhVar.j;
                aqal b = aqal.b(arnhVar.i);
                if (b == null) {
                    b = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                }
                xxxVar2.k(str2, j, b);
            }
        }
        aqal b2 = aqal.b(this.b.c);
        if (b2 == null) {
            b2 = aqal.COMMENT_POLL_STATUS_UNKNOWN;
        }
        if (b2 == aqal.COMMENT_POLL_STATUS_VOTE_AND_COMMENT) {
            aqbo aqboVar = a.f;
            if (aqboVar == null) {
                aqboVar = aqbo.a;
            }
            xyb xybVar = this.d.e;
            aqav aqavVar4 = null;
            if (aqboVar != null && (aqboVar.b & 1) != 0) {
                aqbm aqbmVar = aqboVar.c;
                if (aqbmVar == null) {
                    aqbmVar = aqbm.a;
                }
                Iterator it = xybVar.a(aqbmVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aqax aqaxVar3 = (aqax) it.next();
                    if (aqaxVar3.b == 62285947) {
                        aqavVar = (aqav) aqaxVar3.c;
                    } else {
                        aqavVar = aqav.a;
                    }
                    if (aqavVar.o) {
                        if (aqaxVar3.b == 62285947) {
                            aqavVar4 = (aqav) aqaxVar3.c;
                        } else {
                            aqavVar4 = aqav.a;
                        }
                    }
                }
            }
            if (aqavVar4 == null) {
                return;
            }
            this.a.c(aqavVar4);
        }
    }
}
