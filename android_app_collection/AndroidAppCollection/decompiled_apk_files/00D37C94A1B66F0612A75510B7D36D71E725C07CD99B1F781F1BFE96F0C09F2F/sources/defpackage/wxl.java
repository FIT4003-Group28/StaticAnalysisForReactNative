package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: wxl  reason: default package */
/* loaded from: classes4.dex */
public final class wxl implements tct {
    private final aafo a;

    public wxl(aafo aafoVar) {
        aafoVar.getClass();
        this.a = aafoVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return aqmw.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        aqmw aqmwVar = (aqmw) obj;
        View view = tcsVar.a;
        tfi tfiVar = tcsVar.c;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Object obj2 = tcsVar.d;
        Object obj3 = null;
        if (obj2 instanceof ajjf) {
            ajjf ajjfVar = (ajjf) obj2;
            Object obj4 = ajjfVar.a;
            if (obj4 != null) {
                obj3 = obj4;
            }
            List list = ajjfVar.e;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        float f = view != null ? view.getResources().getDisplayMetrics().density : 0.0f;
        for (apzg apzgVar : aqmwVar.c) {
            hashMap.clear();
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (view != null) {
                wzi wziVar = new wzi(view);
                if (tfiVar != null) {
                    wziVar.d((int) (tfiVar.a / f), (int) (tfiVar.b / f));
                }
                arrayList2.add(wziVar);
            } else {
                afus.b(2, 23, "The command has no view set in its event data. Please use a command property that satisfies this. https://goto.google.com/cmdprops-android");
            }
            if (obj3 != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj3);
            }
            if (!arrayList2.isEmpty()) {
                hashMap.put("MacrosConverters.CustomConvertersKey", arrayList2.toArray(new afzn[arrayList2.size()]));
            }
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            ajna.d(aopcVar, tcsVar, view);
            ajna.c(hashMap, tcsVar);
            this.a.c((apzg) aopcVar.mo39build(), hashMap);
        }
        return aynr.f();
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
