package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xuu  reason: default package */
/* loaded from: classes4.dex */
public final class xuu implements View.OnClickListener {
    final /* synthetic */ apzg a;
    final /* synthetic */ xuz b;
    private final /* synthetic */ int c;

    public xuu(xuz xuzVar, apzg apzgVar) {
        this.b = xuzVar;
        this.a = apzgVar;
    }

    public /* synthetic */ xuu(xuz xuzVar, apzg apzgVar, int i) {
        this.c = i;
        this.b = xuzVar;
        this.a = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            xuy xuyVar = new xuy(this.b);
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xuyVar);
            this.b.aN = true;
            this.b.af.c(this.a, hashMap);
            return;
        }
        xuz xuzVar = this.b;
        apzg apzgVar = this.a;
        xuzVar.aN = true;
        xuzVar.af.a(apzgVar);
    }
}
