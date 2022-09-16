package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iqd  reason: default package */
/* loaded from: classes3.dex */
public final class iqd implements afzf {
    final /* synthetic */ iqf a;

    public iqd(iqf iqfVar) {
        this.a = iqfVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        iqf iqfVar = this.a;
        iqfVar.al.b(iqfVar.a.b(cffVar), true);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aueb auebVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        apoj apojVar;
        arag aragVar6;
        asbf asbfVar = (asbf) obj;
        if ((asbfVar.b & 8) != 0) {
            iqf iqfVar = this.a;
            asbg asbgVar = asbfVar.e;
            if (asbgVar == null) {
                asbgVar = asbg.a;
            }
            if (asbgVar.b == 78398567) {
                auebVar = (aueb) asbgVar.c;
            } else {
                auebVar = aueb.a;
            }
            iqfVar.aj = fyv.i(auebVar);
            iqf iqfVar2 = this.a;
            final lrp lrpVar = iqfVar2.am;
            audx audxVar = iqfVar2.aj;
            lrpVar.r = audxVar;
            if (audxVar != null && (audxVar.b & 2) != 0) {
                lrpVar.c.setVisibility(0);
                lrpVar.b();
                audr audrVar = audxVar.d;
                if (audrVar == null) {
                    audrVar = audr.a;
                }
                SwitchCompat switchCompat = lrpVar.e;
                apoj apojVar2 = null;
                if ((audrVar.b & 2) != 0) {
                    aragVar = audrVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                switchCompat.setText(ajgl.b(aragVar));
                boolean z = !audrVar.d;
                lrpVar.p = z;
                lrpVar.e.setChecked(z);
                lrpVar.d(lrpVar.p);
                lrpVar.e.setOnCheckedChangeListener(new lrn(lrpVar));
                auds audsVar = audxVar.e;
                if (audsVar == null) {
                    audsVar = auds.a;
                }
                TextView textView = lrpVar.f;
                if ((audsVar.b & 2) != 0) {
                    aragVar2 = audsVar.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                textView.setText(ajgl.b(aragVar2));
                if (audsVar.c.size() == 0) {
                    lrpVar.f.setVisibility(0);
                    lrpVar.g.setVisibility(8);
                } else {
                    lrpVar.q.clear();
                    lrpVar.q.addAll(audsVar.c);
                    lrpVar.g.setVisibility(0);
                    lrpVar.f.setVisibility(8);
                }
                TextView textView2 = lrpVar.h;
                if ((audxVar.b & 128) != 0) {
                    aragVar3 = audxVar.f;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                textView2.setText(ajgl.b(aragVar3));
                TextView textView3 = lrpVar.i;
                audv audvVar = audxVar.g;
                if (audvVar == null) {
                    audvVar = audv.a;
                }
                apoj apojVar3 = audvVar.c;
                if (apojVar3 == null) {
                    apojVar3 = apoj.a;
                }
                if ((apojVar3.b & 256) != 0) {
                    audv audvVar2 = audxVar.g;
                    if (audvVar2 == null) {
                        audvVar2 = audv.a;
                    }
                    apoj apojVar4 = audvVar2.c;
                    if (apojVar4 == null) {
                        apojVar4 = apoj.a;
                    }
                    aragVar4 = apojVar4.i;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                } else {
                    aragVar4 = null;
                }
                textView3.setText(ajgl.b(aragVar4));
                lrpVar.i.setOnClickListener(new lrm(lrpVar));
                TextView textView4 = lrpVar.k;
                if ((audxVar.b & 8192) != 0) {
                    aragVar5 = audxVar.l;
                    if (aragVar5 == null) {
                        aragVar5 = arag.a;
                    }
                } else {
                    aragVar5 = null;
                }
                textView4.setText(ajgl.b(aragVar5));
                gga ggaVar = lrpVar.l;
                audv audvVar3 = audxVar.i;
                if (audvVar3 == null) {
                    audvVar3 = audv.a;
                }
                if ((audvVar3.b & 1) != 0) {
                    audv audvVar4 = audxVar.i;
                    if (audvVar4 == null) {
                        audvVar4 = audv.a;
                    }
                    apojVar = audvVar4.c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                } else {
                    apojVar = null;
                }
                ggaVar.b(apojVar, lrpVar.d);
                TextView textView5 = lrpVar.m;
                if ((audxVar.b & 512) != 0) {
                    aragVar6 = audxVar.h;
                    if (aragVar6 == null) {
                        aragVar6 = arag.a;
                    }
                } else {
                    aragVar6 = null;
                }
                textView5.setText(ajgl.b(aragVar6));
                audv audvVar5 = audxVar.j;
                if (audvVar5 == null) {
                    audvVar5 = audv.a;
                }
                if ((audvVar5.b & 1) != 0) {
                    audv audvVar6 = audxVar.j;
                    if (audvVar6 == null) {
                        audvVar6 = audv.a;
                    }
                    apojVar2 = audvVar6.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                }
                lrpVar.n.b(apojVar2, lrpVar.d);
                lrpVar.n.d = new akbi() { // from class: lrl
                    @Override // defpackage.akbi
                    public final void oL(aopc aopcVar) {
                        lrp.this.e(2);
                    }
                };
                audr audrVar2 = audxVar.d;
                if (audrVar2 == null) {
                    audrVar2 = audr.a;
                }
                if (!audrVar2.d && audxVar.k) {
                    lrpVar.i.performClick();
                }
            } else {
                if (audxVar != null && (audxVar.b & 2) == 0) {
                    zep.b("Missing PlaylistContributionState for playlist collaboration settings page to work.");
                }
                lrpVar.c.setVisibility(8);
            }
        }
        iqf iqfVar3 = this.a;
        iqfVar3.ak = iqfVar3.q();
        ((frv) this.a.ah.get()).j();
        this.a.al.a();
    }
}
