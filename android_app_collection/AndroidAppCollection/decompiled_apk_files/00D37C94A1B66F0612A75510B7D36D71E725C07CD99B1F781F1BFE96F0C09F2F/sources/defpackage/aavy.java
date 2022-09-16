package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
/* compiled from: PG */
/* renamed from: aavy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aavy implements aawb {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aavy b = new aavy(1);
    public static final /* synthetic */ aavy a = new aavy();

    private /* synthetic */ aavy() {
    }

    private /* synthetic */ aavy(int i) {
        this.c = i;
    }

    @Override // defpackage.aawb
    public final apzg a(apzg apzgVar, arrw arrwVar) {
        if (this.c == 0) {
            aawb aawbVar = aawd.a;
            return apzgVar;
        } else if (!apzgVar.qn(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)) {
            return apzgVar;
        } else {
            ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) apzgVar.qm(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
            aunk aunkVar = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
            if (aunkVar == null) {
                aunkVar = aunk.a;
            }
            if ((aunkVar.b & 1) == 0) {
                return apzgVar;
            }
            arro arroVar = null;
            if (arrwVar.c.size() > 0 && (((arrt) arrwVar.c.get(0)).b & 2) != 0) {
                arru arruVar = ((arrt) arrwVar.c.get(0)).d;
                if (arruVar == null) {
                    arruVar = arru.a;
                }
                if (arruVar.b == 106646784) {
                    arroVar = (arro) arruVar.c;
                } else {
                    arroVar = arro.a;
                }
            }
            if (arroVar == null) {
                return apzgVar;
            }
            aunk aunkVar2 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
            if (aunkVar2 == null) {
                aunkVar2 = aunk.a;
            }
            atpl atplVar = aunkVar2.c;
            if (atplVar == null) {
                atplVar = atpl.a;
            }
            aopc aopcVar = (aopc) atplVar.mo52toBuilder();
            aopcVar.e(atpk.b, arroVar);
            atpl atplVar2 = (atpl) aopcVar.mo39build();
            aopc aopcVar2 = (aopc) apzg.a.createBuilder();
            aopg aopgVar = ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction;
            aopa mo52toBuilder = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.mo52toBuilder();
            aunk aunkVar3 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
            if (aunkVar3 == null) {
                aunkVar3 = aunk.a;
            }
            aopa mo52toBuilder2 = aunkVar3.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aunk aunkVar4 = (aunk) mo52toBuilder2.instance;
            atplVar2.getClass();
            aunkVar4.c = atplVar2;
            aunkVar4.b |= 1;
            mo52toBuilder.copyOnWrite();
            ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction2 = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) mo52toBuilder.instance;
            aunk aunkVar5 = (aunk) mo52toBuilder2.mo39build();
            aunkVar5.getClass();
            replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.c = aunkVar5;
            replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.b |= 1;
            aopcVar2.e(aopgVar, (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) mo52toBuilder.mo39build());
            return (apzg) aopcVar2.mo39build();
        }
    }
}
