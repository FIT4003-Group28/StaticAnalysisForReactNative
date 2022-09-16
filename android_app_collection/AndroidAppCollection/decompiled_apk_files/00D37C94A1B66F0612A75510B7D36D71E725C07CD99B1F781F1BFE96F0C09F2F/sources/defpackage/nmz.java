package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: nmz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nmz implements ajrt {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ nmz(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            String str = this.a;
            HashMap hashMap = new HashMap();
            hashMap.put("engagement_panel_id_key", str);
            ajrsVar.g(hashMap);
        } else if (i2 == 1) {
            String str2 = this.a;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("engagement_panel_id_key", str2);
            ajrsVar.g(hashMap2);
        } else {
            String str3 = this.a;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("engagement_panel_id_key", str3);
            ajrsVar.g(hashMap3);
        }
    }
}
