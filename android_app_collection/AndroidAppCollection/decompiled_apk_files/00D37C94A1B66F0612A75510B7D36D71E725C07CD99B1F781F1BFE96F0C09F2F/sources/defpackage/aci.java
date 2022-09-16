package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aci  reason: default package */
/* loaded from: classes.dex */
public final class aci extends ach {
    @Override // defpackage.ach
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return hashMap;
    }

    @Override // defpackage.ach
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    @Override // defpackage.ach
    public final /* bridge */ /* synthetic */ acg c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || (r0 = strArr.length) == 0) {
            return new acg(Collections.emptyMap());
        }
        afw afwVar = new afw();
        boolean z = true;
        for (String str : strArr) {
            int c = ake.c(context, str);
            boolean z2 = c != 0;
            afwVar.put(str, Boolean.valueOf(c == 0));
            z &= !z2;
        }
        if (z) {
            return new acg(afwVar);
        }
        return null;
    }
}
