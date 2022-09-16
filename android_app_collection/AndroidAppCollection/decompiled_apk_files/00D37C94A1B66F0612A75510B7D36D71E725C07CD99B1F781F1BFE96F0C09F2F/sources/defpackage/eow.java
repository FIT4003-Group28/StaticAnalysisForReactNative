package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eow  reason: default package */
/* loaded from: classes3.dex */
public final class eow implements aafl {
    private final Activity a;
    private final aafo b;
    private final yni c;
    private final ajgz d;

    public eow(Activity activity, aafo aafoVar, yni yniVar, ajgz ajgzVar) {
        this.a = activity;
        aafoVar.getClass();
        this.b = aafoVar;
        yniVar.getClass();
        this.c = yniVar;
        this.d = ajgzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        Activity activity = this.a;
        aoyq aoyqVar = ((AdFeedbackEndpointOuterClass$AdFeedbackEndpoint) apzgVar.qm(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint)).b;
        if (aoyqVar == null) {
            aoyqVar = aoyq.a;
        }
        aoys aoysVar = aoyqVar.b;
        if (aoysVar == null) {
            aoysVar = aoys.a;
        }
        aafo aafoVar = this.b;
        yni yniVar = this.c;
        ajgz ajgzVar = this.d;
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        xfi xfiVar = new xfi(activity, aoysVar, aafoVar, yniVar, ajgzVar, I);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        arag aragVar4 = null;
        if ((aoysVar.b & 1) != 0) {
            aragVar = aoysVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        builder.setTitle(ajgl.b(aragVar));
        if (aoysVar.g.size() > 0) {
            CharSequence[] charSequenceArr = new CharSequence[aoysVar.g.size()];
            for (int i = 0; i < aoysVar.g.size(); i++) {
                if ((((aoyr) aoysVar.g.get(i)).b & 1) != 0) {
                    aragVar3 = ((aoyr) aoysVar.g.get(i)).c;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                charSequenceArr[i] = ajgl.b(aragVar3);
            }
            builder.setSingleChoiceItems(charSequenceArr, -1, xfiVar);
        }
        if ((aoysVar.b & 4) != 0) {
            aragVar2 = aoysVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        builder.setNegativeButton(ajgl.b(aragVar2), xfiVar);
        if ((aoysVar.b & 2) != 0 && (aragVar4 = aoysVar.d) == null) {
            aragVar4 = arag.a;
        }
        builder.setPositiveButton(ajgl.b(aragVar4), xfiVar);
        builder.setCancelable(false);
        if ((aoysVar.b & 64) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", I);
            apzg apzgVar2 = aoysVar.i;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.c(apzgVar2, hashMap);
        }
        xfiVar.j(builder.create());
        xfiVar.k();
        xfiVar.i.getButton(-1).setEnabled(false);
    }
}
