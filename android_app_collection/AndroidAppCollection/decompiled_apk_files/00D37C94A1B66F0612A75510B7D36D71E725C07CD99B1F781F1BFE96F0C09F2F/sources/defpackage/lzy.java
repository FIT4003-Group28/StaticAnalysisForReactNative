package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: lzy  reason: default package */
/* loaded from: classes3.dex */
final class lzy implements View.OnClickListener {
    final /* synthetic */ wxc a;
    final /* synthetic */ aafo b;
    final /* synthetic */ maa c;

    public lzy(maa maaVar, wxc wxcVar, aafo aafoVar) {
        this.c = maaVar;
        this.a = wxcVar;
        this.b = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.a.d(this.c.e)) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c.e);
            hashMap.put("shopping_drawer_ad_playing", Boolean.valueOf(this.c.d));
            maa maaVar = this.c;
            atir atirVar = maaVar.e;
            if (atirVar == null || (atirVar.b & 1) == 0) {
                return;
            }
            hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{maaVar.c});
            aafo aafoVar = this.b;
            apzg apzgVar = this.c.e.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        }
    }
}
