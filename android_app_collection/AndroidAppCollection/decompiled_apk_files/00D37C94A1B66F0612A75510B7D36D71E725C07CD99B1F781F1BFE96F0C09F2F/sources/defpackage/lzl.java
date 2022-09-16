package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: lzl  reason: default package */
/* loaded from: classes3.dex */
final class lzl implements View.OnClickListener {
    final /* synthetic */ lzm a;
    private final /* synthetic */ int b;

    public lzl(lzm lzmVar) {
        this.a = lzmVar;
    }

    public lzl(lzm lzmVar, int i) {
        this.b = i;
        this.a = lzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            lzm lzmVar = this.a;
            auuk auukVar = lzmVar.f;
            if (auukVar == null || (auukVar.b & 512) == 0) {
                return;
            }
            aafo aafoVar = lzmVar.b;
            apzg apzgVar = auukVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return;
        }
        lzm lzmVar2 = this.a;
        auuk auukVar2 = lzmVar2.f;
        if (auukVar2 == null) {
            return;
        }
        if ((auukVar2.b & 64) != 0) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", lzmVar2.f);
            hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{lzmVar2.d});
            aafo aafoVar2 = lzmVar2.b;
            apzg apzgVar2 = lzmVar2.f.h;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, hashMap);
        }
        auuk auukVar3 = lzmVar2.f;
        if ((auukVar3.b & 32) != 0) {
            lzmVar2.c.H(3, new acte(auukVar3.g.I()), null);
        }
        aaar aaarVar = lzmVar2.e;
        if (aaarVar == null) {
            return;
        }
        if (lzmVar2.h) {
            aaarVar.o();
        } else if (lzmVar2.g) {
            aaarVar.j(-1, true);
        } else {
            aaarVar.k(-1);
        }
    }
}
