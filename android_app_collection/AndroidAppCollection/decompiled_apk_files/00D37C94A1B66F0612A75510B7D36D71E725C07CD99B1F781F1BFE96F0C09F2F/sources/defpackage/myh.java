package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: myh  reason: default package */
/* loaded from: classes3.dex */
public final class myh implements ajru {
    private final myo a;

    /* JADX INFO: Access modifiers changed from: protected */
    public myh(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, boolean z, yni yniVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ezh ezhVar, fjn fjnVar, akem akemVar) {
        this.a = new myo(context, ajmyVar, aafoVar, ajxzVar, ajycVar, wwkVar, tjvVar, wxcVar, enmVar, z, yniVar, viewGroup, inlinePlaybackLifecycleController, ezhVar, fjnVar, akemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.l;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atng atngVar;
        auio auioVar = (auio) obj;
        myo myoVar = this.a;
        ajrsVar.getClass();
        auioVar.getClass();
        myoVar.l.removeAllViews();
        myoVar.d();
        myn mynVar = myoVar.n;
        auil auilVar = auioVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        mynVar.e = auilVar;
        auil auilVar2 = auioVar.c;
        if (auilVar2 == null) {
            auilVar2 = auil.a;
        }
        mynVar.f = (auilVar2.b & 8192) != 0;
        auil auilVar3 = auioVar.c;
        if (auilVar3 == null) {
            auilVar3 = auil.a;
        }
        mynVar.g = auilVar3.p;
        auif[] auifVarArr = (auif[]) auioVar.d.toArray(new auif[0]);
        String str = (auioVar.b & 64) != 0 ? auioVar.h : null;
        auil auilVar4 = auioVar.c;
        if (auilVar4 == null) {
            auilVar4 = auil.a;
        }
        auil auilVar5 = auilVar4;
        if ((auioVar.b & 2) != 0) {
            aunb aunbVar = auioVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        aozy aozyVar = auioVar.f;
        if (aozyVar == null) {
            aozyVar = aozy.a;
        }
        mynVar.a(ajrsVar, auioVar, str, auilVar5, auifVarArr, atngVar, aozyVar, auioVar.g.I());
        myoVar.l.addView(myoVar.n.d);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.qZ(ajsaVar);
    }
}
