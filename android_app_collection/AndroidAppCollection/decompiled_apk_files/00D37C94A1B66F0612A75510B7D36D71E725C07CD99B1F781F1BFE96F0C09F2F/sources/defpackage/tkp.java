package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tkp  reason: default package */
/* loaded from: classes4.dex */
public final class tkp implements tkk {
    final /* synthetic */ tju a;
    final /* synthetic */ Set b;
    private final /* synthetic */ int c;

    public tkp(tju tjuVar, Set set) {
        this.a = tjuVar;
        this.b = set;
    }

    public tkp(tju tjuVar, Set set, int i) {
        this.c = i;
        this.a = tjuVar;
        this.b = set;
    }

    @Override // defpackage.tkk
    public final String a(Map map) {
        amuk i;
        if (this.c == 0) {
            Iterable<Number> j = tly.j(map.get(this.a));
            if (j == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Number number : j) {
                i2 += number.intValue();
                arrayList.add(Integer.valueOf(i2));
            }
            i = tly.i(arrayList, this.b, true);
            return TextUtils.join(",", i);
        }
        Iterable j2 = tly.j(map.get(this.a));
        if (j2 == null) {
            return null;
        }
        Set set = this.b;
        if (set != null) {
            j2 = tly.i(j2, set, true);
        }
        return TextUtils.join(",", j2);
    }
}
