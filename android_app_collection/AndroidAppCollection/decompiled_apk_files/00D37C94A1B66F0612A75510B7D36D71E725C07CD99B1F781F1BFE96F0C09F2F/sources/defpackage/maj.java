package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: maj  reason: default package */
/* loaded from: classes3.dex */
final class maj implements View.OnClickListener {
    final /* synthetic */ man a;

    public maj(man manVar) {
        this.a = manVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        man manVar = this.a;
        aqfc aqfcVar = manVar.d;
        if (aqfcVar == null || (aqfcVar.b & 128) == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", manVar.d);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{manVar.c});
        aafo aafoVar = manVar.a;
        apzg apzgVar = manVar.d.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, hashMap);
    }
}
