package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wnk  reason: default package */
/* loaded from: classes4.dex */
public final class wnk {
    private wvq a = null;

    public final void a() {
        wvq wvqVar = this.a;
        if (wvqVar == null) {
            wwf.a(null, "Tried to submit survey with no registered listener");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : wvqVar.c.c()) {
            xed xedVar = (xed) xehVar.b;
            if (((wuk) wvqVar.b.get()).g().contains(xedVar.a)) {
                String str = xedVar.a;
                if (TextUtils.equals(str, str)) {
                    arrayList.add(xehVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            wwf.a(null, "No associated layouts for survey submit click. Exit category: 1");
        } else {
            ((wvr) wvqVar.a.get()).q(arrayList);
        }
    }

    public final void b(wvq wvqVar) {
        if (this.a != null) {
            wwf.a(null, "Tried to override existing survey listener");
        } else {
            this.a = wvqVar;
        }
    }
}
