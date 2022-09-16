package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCameraRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
/* compiled from: PG */
/* renamed from: hpa  reason: default package */
/* loaded from: classes3.dex */
final class hpa implements afzf {
    final /* synthetic */ hpb a;

    public hpa(hpb hpbVar) {
        this.a = hpbVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (this.a.c.get()) {
            return;
        }
        zep.d("Failed to get camera info", cffVar);
        this.a.b.sendEmptyMessage(2);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        avyp avypVar;
        avef avefVar;
        artt arttVar = (artt) obj;
        if (this.a.c.get() || arttVar == null || (arttVar.b & 2) == 0) {
            return;
        }
        aunb aunbVar = arttVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aukv aukvVar = (aukv) aunbVar.qm(ReelCameraRendererOuterClass.reelCameraRenderer);
        this.a.a.aQ((aukvVar.b & 128) != 0 ? aukvVar.g : true);
        if ((aukvVar.b & 1) == 0) {
            return;
        }
        aunb aunbVar2 = aukvVar.f;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
            aunb aunbVar3 = aukvVar.f;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            this.a.a.aX((aqft) aunbVar3.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer));
        }
        int i = aukvVar.c;
        avyp avypVar2 = null;
        if (i == 2) {
            avypVar = (avyp) aukvVar.d;
            avefVar = null;
        } else if (i == 6) {
            avefVar = (avef) aukvVar.d;
            avypVar = null;
        } else {
            avypVar = null;
            avefVar = null;
        }
        apzg apzgVar = aukvVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aunb aunbVar4 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) apzgVar.qm(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        if ((((aula) aunbVar4.qm(ReelEditVideoRendererOuterClass.reelEditVideoRenderer)).b & 1) != 0) {
            aunb aunbVar5 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) apzgVar.qm(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            avypVar2 = ((aula) aunbVar5.qm(ReelEditVideoRendererOuterClass.reelEditVideoRenderer)).c;
            if (avypVar2 == null) {
                avypVar2 = avyp.a;
            }
        }
        this.a.a.aF(avefVar, avypVar, avypVar2);
        Handler handler = this.a.b;
        handler.sendMessage(handler.obtainMessage(1, apzgVar));
    }
}
