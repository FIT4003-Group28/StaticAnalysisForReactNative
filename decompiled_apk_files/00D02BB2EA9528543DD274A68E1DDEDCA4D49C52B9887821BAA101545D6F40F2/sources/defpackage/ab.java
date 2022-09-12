package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ab  reason: default package */
/* loaded from: classes2.dex */
final class ab implements avo {
    final /* synthetic */ ad a;

    public ab(ad adVar) {
        this.a = adVar;
    }

    @Override // defpackage.avo
    public final Bundle a() {
        for (Map.Entry entry : new HashMap(this.a.b).entrySet()) {
            Bundle a = ((avo) entry.getValue()).a();
            ad adVar = this.a;
            String str = (String) entry.getKey();
            if (a != null) {
                Class[] clsArr = ad.e;
                for (int i = 0; i < 29; i++) {
                    if (!clsArr[i].isInstance(a)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a.getClass() + " into saved state");
            }
            ac<?> acVar = adVar.c.get(str);
            if (acVar != null) {
                acVar.g(a);
            } else {
                adVar.a.put(str, a);
            }
        }
        Set<String> keySet = this.a.a.keySet();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        for (String str2 : keySet) {
            arrayList.add(str2);
            arrayList2.add(this.a.a.get(str2));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("keys", arrayList);
        bundle.putParcelableArrayList("values", arrayList2);
        return bundle;
    }
}
