package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hp  reason: default package */
/* loaded from: classes6.dex */
public final class hp implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;

    public hp(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String J = od.J(view);
            if (J != null) {
                Iterator it = this.b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (J.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                od.I(view, str);
            }
        }
    }
}
