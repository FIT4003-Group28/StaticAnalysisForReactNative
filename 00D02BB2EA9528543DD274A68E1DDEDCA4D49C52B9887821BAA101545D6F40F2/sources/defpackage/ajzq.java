package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ajzq  reason: default package */
/* loaded from: classes2.dex */
public final class ajzq {
    public static final dcdc<String> a = dcdc.h("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.ACTIVITY_RECOGNITION");
    private final axru b;

    public ajzq(axru axruVar) {
        this.b = axruVar;
    }

    public final ajzp a() {
        ajzo ajzoVar;
        HashMap hashMap = new HashMap();
        dcdc<String> dcdcVar = a;
        int size = dcdcVar.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            String str = dcdcVar.get(i);
            boolean a2 = this.b.a(str);
            hashMap.put(str, Boolean.valueOf(a2));
            z = z && a2;
        }
        if (z) {
            ajzoVar = ajzo.PERMISSIONS_RESULT_SUCCESS;
        } else {
            ajzoVar = ajzo.PERMISSIONS_RESULT_DENIED;
        }
        return new ajze(ajzoVar, dcdn.r(hashMap));
    }
}
