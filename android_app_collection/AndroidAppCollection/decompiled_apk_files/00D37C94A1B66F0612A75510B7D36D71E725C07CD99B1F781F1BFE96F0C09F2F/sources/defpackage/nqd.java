package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
/* compiled from: PG */
/* renamed from: nqd  reason: default package */
/* loaded from: classes3.dex */
final class nqd implements afzf {
    final /* synthetic */ nqe a;

    public nqd(nqe nqeVar) {
        this.a = nqeVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.e.e(cffVar);
        this.a.d();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        auyo auyoVar;
        ashr ashrVar = (ashr) obj;
        nqe nqeVar = this.a;
        if ((ashrVar.b & 2) != 0) {
            nqeVar.a.D(new acte(ashrVar.g));
            ashh ashhVar = ashrVar.d;
            if (ashhVar == null) {
                ashhVar = ashh.a;
            }
            if (ashhVar.c == 204280949) {
                ashh ashhVar2 = ashrVar.d;
                if (ashhVar2 == null) {
                    ashhVar2 = ashh.a;
                }
                if (ashhVar2.c == 204280949) {
                    auyoVar = (auyo) ashhVar2.d;
                } else {
                    auyoVar = auyo.a;
                }
            } else {
                auyoVar = null;
            }
            if (auyoVar != null) {
                if ((auyoVar.b & 8) != 0) {
                    aunb aunbVar = auyoVar.e;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    auyd auydVar = (auyd) ajjh.l(aunbVar, SponsorshipsRenderers.sponsorshipsAppBarRenderer);
                    if (auydVar != null && (auydVar.b & 2) != 0) {
                        aunb aunbVar2 = auydVar.d;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        nqeVar.n.q((atep) ajjh.l(aunbVar2, MenuRendererOuterClass.menuRenderer));
                    }
                }
                Context context = nqeVar.d;
                acti actiVar = nqeVar.a;
                ajsg ajsgVar = nqeVar.f;
                aari aariVar = nqeVar.g;
                yhh yhhVar = new yhh(context, actiVar, ajsgVar, aariVar, nqeVar.h, nqeVar.i.a(aariVar, actiVar), nqeVar.e, nqeVar.j, nqeVar.l, nqeVar.m);
                nqeVar.c().addView(yhhVar.a);
                yhhVar.oK(nqeVar.o, auyoVar);
            }
        }
        this.a.c().a();
    }
}
