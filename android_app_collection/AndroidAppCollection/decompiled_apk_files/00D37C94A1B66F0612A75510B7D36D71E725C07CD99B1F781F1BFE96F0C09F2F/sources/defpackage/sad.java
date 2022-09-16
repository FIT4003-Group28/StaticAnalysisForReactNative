package defpackage;

import android.view.View;
import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: sad  reason: default package */
/* loaded from: classes4.dex */
final class sad implements Comparator {
    final /* synthetic */ Map a;

    public sad(Map map) {
        this.a = map;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        int i = 0;
        int i2 = view.getLayoutParams() instanceof sby ? ((sby) view.getLayoutParams()).b : 0;
        if (view2.getLayoutParams() instanceof sby) {
            i = ((sby) view2.getLayoutParams()).b;
        }
        int i3 = i2 - i;
        return i3 != 0 ? i3 : ((Integer) this.a.get(view)).intValue() - ((Integer) this.a.get(view2)).intValue();
    }
}
