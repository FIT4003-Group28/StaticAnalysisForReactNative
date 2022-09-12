package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cnts  reason: default package */
/* loaded from: classes.dex */
public class cnts {
    public final String[] a;
    public final ArrayList<HashMap<String, Object>> b = new ArrayList<>();

    public /* synthetic */ cnts(String[] strArr) {
        this.a = strArr;
        new HashMap();
    }

    public void a(HashMap<String, Object> hashMap) {
        this.b.add(hashMap);
    }

    public final DataHolder b(int i, Bundle bundle) {
        return new DataHolder(this.a, DataHolder.i(this), i, bundle);
    }

    public final void c(ContentValues contentValues) {
        HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        a(hashMap);
    }
}
