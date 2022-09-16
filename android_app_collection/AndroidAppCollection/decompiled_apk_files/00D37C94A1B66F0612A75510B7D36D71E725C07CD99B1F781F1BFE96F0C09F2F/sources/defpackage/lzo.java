package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: lzo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lzo implements fjp {
    public final /* synthetic */ lzp a;
    private final /* synthetic */ int b;

    public /* synthetic */ lzo(lzp lzpVar, int i) {
        this.b = i;
        this.a = lzpVar;
    }

    @Override // defpackage.fjp
    public final void a(Object obj, List list) {
        if (this.b == 0) {
            lzp lzpVar = this.a;
            if (obj == null || lzpVar.b.d(obj)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{lzpVar.d});
            aafx.d(lzpVar.a, list, hashMap);
            return;
        }
        this.a.b(obj, list);
    }
}
