package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: nkj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nkj implements fjp {
    public final /* synthetic */ nkk a;
    private final /* synthetic */ int b;

    public /* synthetic */ nkj(nkk nkkVar, int i) {
        this.b = i;
        this.a = nkkVar;
    }

    @Override // defpackage.fjp
    public final void a(Object obj, List list) {
        if (this.b == 0) {
            nkk nkkVar = this.a;
            if (nkkVar.b.d(obj)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            aafx.d(nkkVar.a, list, hashMap);
            return;
        }
        nkk nkkVar2 = this.a;
        if (nkkVar2.b.d(obj)) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        aafx.d(nkkVar2.a, list, hashMap2);
    }
}
