package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ara  reason: default package */
/* loaded from: classes2.dex */
public final class ara {
    final List<aqn> a;
    final boolean b;

    public ara(List<aqn> list, boolean z) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = z;
    }

    public static ara b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(aqn.u((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new ara(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            aqn aqnVar = this.a.get(i);
            if (aqnVar == null || !aqnVar.t()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.a.toArray()) + ", isValid=" + a() + " }";
    }
}
