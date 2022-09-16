package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: irg  reason: default package */
/* loaded from: classes3.dex */
public final class irg implements afzf {
    final /* synthetic */ irh a;

    public irg(irh irhVar) {
        this.a = irhVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.ak.e(cffVar);
        this.a.dismiss();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        awja awjaVar;
        atec atecVar;
        avlq avlqVar;
        final awid awidVar;
        aqft aqftVar;
        arag aragVar;
        arag aragVar2;
        ashr ashrVar = (ashr) obj;
        final irh irhVar = this.a;
        irhVar.ai.oi().D(new acte(ashrVar.g));
        if (!ashrVar.f.isEmpty()) {
            irhVar.af.b(ashrVar.f);
            irhVar.dismiss();
        } else if ((ashrVar.b & 2) != 0) {
            ashh ashhVar = ashrVar.d;
            if (ashhVar == null) {
                ashhVar = ashh.a;
            }
            arag aragVar3 = null;
            if ((ashhVar.b & 128) != 0) {
                ashh ashhVar2 = ashrVar.d;
                if (ashhVar2 == null) {
                    ashhVar2 = ashh.a;
                }
                awjaVar = ashhVar2.e;
                if (awjaVar == null) {
                    awjaVar = awja.a;
                }
            } else {
                awjaVar = null;
            }
            ashh ashhVar3 = ashrVar.d;
            if (ashhVar3 == null) {
                ashhVar3 = ashh.a;
            }
            if (ashhVar3.c == 94946882) {
                ashh ashhVar4 = ashrVar.d;
                if (ashhVar4 == null) {
                    ashhVar4 = ashh.a;
                }
                if (ashhVar4.c == 94946882) {
                    atecVar = (atec) ashhVar4.d;
                } else {
                    atecVar = atec.a;
                }
            } else {
                atecVar = null;
            }
            ashh ashhVar5 = ashrVar.d;
            if (ashhVar5 == null) {
                ashhVar5 = ashh.a;
            }
            if (ashhVar5.c == 161497951) {
                ashh ashhVar6 = ashrVar.d;
                if (ashhVar6 == null) {
                    ashhVar6 = ashh.a;
                }
                if (ashhVar6.c == 161497951) {
                    avlqVar = (avlq) ashhVar6.d;
                } else {
                    avlqVar = avlq.a;
                }
            } else {
                avlqVar = null;
            }
            if (atecVar != null) {
                irhVar.aJ();
                irhVar.aH();
                irhVar.aL("");
                irhVar.az.add(atecVar);
            } else if (avlqVar == null) {
                ashh ashhVar7 = ashrVar.d;
                if (ashhVar7 == null) {
                    ashhVar7 = ashh.a;
                }
                if (ashhVar7.c == 58521717) {
                    ashh ashhVar8 = ashrVar.d;
                    if (ashhVar8 == null) {
                        ashhVar8 = ashh.a;
                    }
                    if (ashhVar8.c == 58521717) {
                        awidVar = (awid) ashhVar8.d;
                    } else {
                        awidVar = awid.a;
                    }
                } else {
                    awidVar = null;
                }
                ashu ashuVar = ashrVar.e;
                if (ashuVar == null) {
                    ashuVar = ashu.a;
                }
                if (ashuVar.b == 64099105) {
                    ashu ashuVar2 = ashrVar.e;
                    if (ashuVar2 == null) {
                        ashuVar2 = ashu.a;
                    }
                    if (ashuVar2.b == 64099105) {
                        aqftVar = (aqft) ashuVar2.c;
                    } else {
                        aqftVar = aqft.a;
                    }
                } else {
                    aqftVar = null;
                }
                if (awidVar == null) {
                    if (awjaVar != null) {
                        irhVar.aG().a(yic.i(awjaVar));
                    }
                    irhVar.dismiss();
                    return;
                }
                if (aqftVar != null) {
                    if (irhVar.ay == null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(irhVar.ae);
                        if ((aqftVar.b & 1) != 0) {
                            aragVar = aqftVar.c;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        AlertDialog.Builder message = builder.setTitle(ajgl.b(aragVar)).setMessage(ajjh.j(aqftVar, null));
                        if ((aqftVar.b & 2097152) != 0) {
                            aragVar2 = aqftVar.p;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        AlertDialog.Builder positiveButton = message.setPositiveButton(ajgl.b(aragVar2), new DialogInterface.OnClickListener() { // from class: irb
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                irh.this.aM(awidVar);
                            }
                        });
                        if ((aqftVar.b & 4194304) != 0 && (aragVar3 = aqftVar.q) == null) {
                            aragVar3 = arag.a;
                        }
                        irhVar.ay = positiveButton.setNegativeButton(ajgl.b(aragVar3), new ira(irhVar)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iqz
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                irh.this.dismiss();
                            }
                        }).create();
                    }
                    irhVar.ay.show();
                } else {
                    irhVar.aM(awidVar);
                }
                if (awjaVar == null) {
                    return;
                }
                irhVar.aG().a.d(yic.i(awjaVar).toString());
            } else {
                irhVar.aJ();
                irhVar.az.l();
                irhVar.aH();
                irhVar.aL("");
                irhVar.az.add(avlqVar);
            }
        } else {
            irhVar.dismiss();
        }
    }
}
