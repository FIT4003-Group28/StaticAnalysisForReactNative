package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aha  reason: default package */
/* loaded from: classes.dex */
public final class aha extends agz<String[], Map<String, Boolean>> {
    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ Map<String, Boolean> a(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                HashMap hashMap = new HashMap();
                int length = stringArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ Intent b(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ agy<Map<String, Boolean>> c(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 == null || (r0 = strArr2.length) == 0) {
            return new agy<>(Collections.emptyMap());
        }
        aif aifVar = new aif();
        boolean z = true;
        for (String str : strArr2) {
            int d = akm.d(context, str);
            boolean z2 = d != 0;
            aifVar.put(str, Boolean.valueOf(d == 0));
            z &= !z2;
        }
        if (z) {
            return new agy<>(aifVar);
        }
        return null;
    }
}
