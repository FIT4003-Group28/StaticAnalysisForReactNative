package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: agdo  reason: default package */
/* loaded from: classes.dex */
public final class agdo implements ageb {
    private final Context a;
    private final atps b;
    private final Intent c;
    private final Intent d;
    private final Intent e;
    private final ampq f;

    public agdo(Context context, aadd aaddVar, ampq ampqVar, Intent intent, Intent intent2, Intent intent3) {
        this.a = context;
        this.f = ampqVar;
        this.c = intent;
        this.d = intent2;
        this.e = intent3;
        this.b = agel.a(aaddVar);
    }

    private final void b(aypw aypwVar, aypx aypxVar, apgq apgqVar, apgp apgpVar, String str, aged agedVar, Intent intent, acti actiVar, fi fiVar) {
        int i;
        arag aragVar;
        try {
            Intent intent2 = new Intent(intent);
            agee.e(intent2, agedVar);
            if ((apgpVar.b & 8) != 0) {
                apzg apzgVar = apgpVar.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                ahfe.d(intent2, apzgVar);
            }
            if ((apgqVar.b & 32768) != 0) {
                ahfe.g(intent2, ((acsx) actiVar).i);
                intent2.putExtra("interaction_type", 1);
            }
            if ((apgqVar.b & 64) != 0) {
                aoxp aoxpVar = apgqVar.o;
                if (aoxpVar == null) {
                    aoxpVar = aoxp.a;
                }
                agec.d(intent2, aoxpVar);
            }
            if (!str.isEmpty()) {
                agel.l(intent2, str, this.b);
            }
            aypwVar.a(apgpVar, intent2);
            PendingIntent pendingIntent = (PendingIntent) aypxVar.a(this.a, intent2);
            if ((apgpVar.b & 1) != 0) {
                ajxz ajxzVar = (ajxz) ((ampv) this.f).a;
                arhs arhsVar = apgpVar.c;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                i = ajxzVar.a(b);
            } else {
                i = 0;
            }
            if ((apgpVar.b & 2) != 0) {
                aragVar = apgpVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            fiVar.f(new ff(i, ajgl.b(aragVar), pendingIntent));
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Exception while creating actions: ");
            sb.append(valueOf);
            zep.b(sb.toString());
        }
    }

    @Override // defpackage.ageb
    public final void a(final apgq apgqVar, final acti actiVar, aged agedVar, fi fiVar) {
        int i = 0;
        for (apgp apgpVar : apgqVar.k) {
            int i2 = i + 1;
            String str = (String) agcj.a.getOrDefault(Integer.valueOf(i), "");
            int i3 = apgpVar.b;
            if ((i3 & 16) != 0) {
                b(zhq.e, nti.r, apgqVar, apgpVar, str, agedVar, this.c, actiVar, fiVar);
            } else if ((i3 & 32) != 0) {
                b(zhq.d, nti.q, apgqVar, apgpVar, str, agedVar, this.e, actiVar, fiVar);
            } else if ((i3 & 4) != 0) {
                b(new aypw() { // from class: agdn
                    @Override // defpackage.aypw
                    public final void a(Object obj, Object obj2) {
                        acti actiVar2 = acti.this;
                        apgq apgqVar2 = apgqVar;
                        Intent intent = (Intent) obj2;
                        apzg apzgVar = ((apgp) obj).e;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        agec.a(intent, apzgVar, actiVar2, (apgqVar2.b & 32768) != 0);
                    }
                }, nti.q, apgqVar, apgpVar, str, agedVar, this.d, actiVar, fiVar);
                i = i2;
            }
            i = i2;
        }
    }
}
