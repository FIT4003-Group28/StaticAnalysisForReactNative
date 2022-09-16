package com.google.android.libraries.youtube.mdx.handoff;

import com.google.android.libraries.youtube.mdx.handoff.HandoffCoordinator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class HandoffCoordinator implements f {
    public final adcm a;
    public final adcr b;
    public final adoa c;
    public final adcs d;
    public final adce e;
    public aypf f;
    public aypg g;
    private final acwn h;

    static {
        zep.a("HandoffCoordinator");
    }

    public HandoffCoordinator(adcm adcmVar, adcr adcrVar, adoa adoaVar, acwn acwnVar, adcs adcsVar, adce adceVar) {
        this.a = adcmVar;
        this.b = adcrVar;
        this.c = adoaVar;
        this.h = acwnVar;
        this.d = adcsVar;
        this.e = adceVar;
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        aypf aypfVar = new aypf();
        this.f = aypfVar;
        aypfVar.d(this.h.h().B().as(new ayqb() { // from class: adck
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final HandoffCoordinator handoffCoordinator = HandoffCoordinator.this;
                final adct adctVar = (adct) obj;
                String.format("Received autoconnect enabled update=%s", adctVar);
                if (adctVar.d) {
                    if (handoffCoordinator.c.e() != null || handoffCoordinator.e.d()) {
                        return;
                    }
                    aypg aypgVar = handoffCoordinator.g;
                    if (aypgVar == null || aypgVar.e()) {
                        handoffCoordinator.g = handoffCoordinator.d.a.as(new ayqb() { // from class: adcl
                            @Override // defpackage.ayqb
                            public final void a(Object obj2) {
                                String str;
                                HandoffCoordinator handoffCoordinator2 = HandoffCoordinator.this;
                                adct adctVar2 = adctVar;
                                adcv adcvVar = (adcv) obj2;
                                Object[] objArr = new Object[3];
                                int i = adcvVar.c;
                                switch (i) {
                                    case 1:
                                        str = "HANDOFF_FEATURE_TYPE_UNKNOWN";
                                        break;
                                    case 2:
                                        str = "HANDOFF_FEATURE_TYPE_YTV_LR_PURCHASE";
                                        break;
                                    case 3:
                                        str = "HANDOFF_FEATURE_TYPE_YTC_LR_PURCHASE";
                                        break;
                                    case 4:
                                        str = "HANDOFF_FEATURE_TYPE_ALC_TWO_FACTOR_LOCATION";
                                        break;
                                    case 5:
                                        str = "HANDOFF_FEATURE_TYPE_CALL_TO_ACTION";
                                        break;
                                    case 6:
                                        str = "HANDOFF_FEATURE_TYPE_LR_AUTOCONNECT";
                                        break;
                                    default:
                                        str = "null";
                                        break;
                                }
                                if (i != 0) {
                                    objArr[0] = str;
                                    objArr[1] = adcvVar.a;
                                    int i2 = adcvVar.b;
                                    String ad = akel.ad(i2);
                                    if (i2 == 0) {
                                        throw null;
                                    }
                                    objArr[2] = ad;
                                    String.format("Marking handoff action[feature=%s][id=%s] as [%s]", objArr);
                                    adcm adcmVar = handoffCoordinator2.a;
                                    aopa createBuilder = arfq.a.createBuilder();
                                    createBuilder.copyOnWrite();
                                    arfq arfqVar = (arfq) createBuilder.instance;
                                    arfqVar.d = 7;
                                    arfqVar.b = 2 | arfqVar.b;
                                    String str2 = adcvVar.a;
                                    createBuilder.copyOnWrite();
                                    arfq arfqVar2 = (arfq) createBuilder.instance;
                                    str2.getClass();
                                    arfqVar2.b = 1 | arfqVar2.b;
                                    arfqVar2.c = str2;
                                    int i3 = adcvVar.c;
                                    createBuilder.copyOnWrite();
                                    arfq arfqVar3 = (arfq) createBuilder.instance;
                                    int i4 = i3 - 1;
                                    if (i3 == 0) {
                                        throw null;
                                    }
                                    arfqVar3.e = i4;
                                    arfqVar3.b |= 4;
                                    int i5 = adcvVar.b;
                                    createBuilder.copyOnWrite();
                                    arfq arfqVar4 = (arfq) createBuilder.instance;
                                    int i6 = i5 - 1;
                                    if (i5 == 0) {
                                        throw null;
                                    }
                                    arfqVar4.f = i6;
                                    arfqVar4.b |= 16;
                                    ylx.i(adcmVar.a((arfq) createBuilder.mo39build()), new adcj(handoffCoordinator2, adctVar2));
                                    return;
                                }
                                throw null;
                            }
                        });
                        handoffCoordinator.f.d(handoffCoordinator.g);
                    }
                    adcm adcmVar = handoffCoordinator.a;
                    aopa createBuilder = arfq.a.createBuilder();
                    createBuilder.copyOnWrite();
                    arfq arfqVar = (arfq) createBuilder.instance;
                    arfqVar.d = 5;
                    arfqVar.b |= 2;
                    createBuilder.copyOnWrite();
                    arfq arfqVar2 = (arfq) createBuilder.instance;
                    arfqVar2.e = 5;
                    arfqVar2.b |= 4;
                    createBuilder.copyOnWrite();
                    arfq arfqVar3 = (arfq) createBuilder.instance;
                    arfqVar3.f = 1;
                    arfqVar3.b |= 16;
                    ylx.i(adcmVar.a((arfq) createBuilder.mo39build()), new adcj(handoffCoordinator, adctVar, 1));
                    return;
                }
                aypg aypgVar2 = handoffCoordinator.g;
                if (aypgVar2 == null || aypgVar2.e()) {
                    return;
                }
                ayqi.c((AtomicReference) handoffCoordinator.g);
            }
        }));
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.f.qr();
        this.f.c();
        adcr adcrVar = this.b;
        adbb adbbVar = adcrVar.f;
        if (adbbVar == null) {
            return;
        }
        adcrVar.b.f(adbbVar);
        adcrVar.f = null;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
