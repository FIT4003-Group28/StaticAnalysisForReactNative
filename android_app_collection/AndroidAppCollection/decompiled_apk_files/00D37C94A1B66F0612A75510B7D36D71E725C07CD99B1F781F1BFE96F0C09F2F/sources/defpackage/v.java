package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: v  reason: default package */
/* loaded from: classes4.dex */
public final class v implements bli {
    final /* synthetic */ x a;

    public v(x xVar) {
        this.a = xVar;
    }

    @Override // defpackage.bli
    public final Bundle a() {
        for (Map.Entry entry : new HashMap(this.a.c).entrySet()) {
            Bundle a = ((bli) entry.getValue()).a();
            x xVar = this.a;
            String str = (String) entry.getKey();
            if (a != null) {
                Class[] clsArr = x.a;
                for (int i = 0; i < 29; i++) {
                    if (!clsArr[i].isInstance(a)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a.getClass() + " into saved state");
            }
            t tVar = (t) xVar.d.get(str);
            if (tVar != null) {
                tVar.k(a);
            } else {
                xVar.b.put(str, a);
            }
        }
        Set<String> keySet = this.a.b.keySet();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        for (String str2 : keySet) {
            arrayList.add(str2);
            arrayList2.add(this.a.b.get(str2));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("keys", arrayList);
        bundle.putParcelableArrayList("values", arrayList2);
        return bundle;
    }
}
