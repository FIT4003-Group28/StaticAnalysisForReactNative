package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements aafl {
    private final oor a;

    public c(oor oorVar) {
        this.a = oorVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arag aragVar;
        AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction) apzgVar.qm(AddToToastActionOuterClass$AddToToastAction.addToToastAction);
        apbx apbxVar = addToToastActionOuterClass$AddToToastAction.b;
        if (apbxVar == null) {
            apbxVar = apbx.a;
        }
        if ((apbxVar.b & 2) != 0) {
            apbx apbxVar2 = addToToastActionOuterClass$AddToToastAction.b;
            if (apbxVar2 == null) {
                apbxVar2 = apbx.a;
            }
            atoo atooVar = apbxVar2.d;
            if (atooVar == null) {
                atooVar = atoo.a;
            }
            aragVar = atooVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            apbx apbxVar3 = addToToastActionOuterClass$AddToToastAction.b;
            if (apbxVar3 == null) {
                apbxVar3 = apbx.a;
            }
            atpl atplVar = apbxVar3.c;
            if (atplVar == null) {
                atplVar = atpl.a;
            }
            aragVar = atplVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        }
        oor oorVar = this.a;
        oorVar.a.s(ajgl.b(aragVar).toString());
    }
}
