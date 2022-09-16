package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: lzv  reason: default package */
/* loaded from: classes3.dex */
final class lzv implements View.OnClickListener {
    final /* synthetic */ wxc a;
    final /* synthetic */ aafo b;
    final /* synthetic */ lzw c;

    public lzv(lzw lzwVar, wxc wxcVar, aafo aafoVar) {
        this.c = lzwVar;
        this.a = wxcVar;
        this.b = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqfg aqfgVar = this.c.a;
        if (aqfgVar == null || (aqfgVar.b & 4) == 0 || this.a.d(aqfgVar)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c.a);
        aafo aafoVar = this.b;
        apzg apzgVar = this.c.a.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, hashMap);
    }
}
