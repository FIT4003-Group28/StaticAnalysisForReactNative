package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: lzq  reason: default package */
/* loaded from: classes3.dex */
final class lzq implements View.OnClickListener {
    final /* synthetic */ lzr a;

    public lzq(lzr lzrVar) {
        this.a = lzrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lzr lzrVar = this.a;
        aqdm aqdmVar = lzrVar.d;
        if (aqdmVar == null || (aqdmVar.b & 16) == 0 || lzrVar.b.d(aqdmVar)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a.d);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{this.a.c});
        lzr lzrVar2 = this.a;
        aafo aafoVar = lzrVar2.a;
        apzg apzgVar = lzrVar2.d.g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, hashMap);
    }
}
