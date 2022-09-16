package defpackage;

import android.view.View;
import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpoc  reason: default package */
/* loaded from: classes5.dex */
final class cpoc implements Comparator<View> {
    final /* synthetic */ Map a;

    public cpoc(Map map) {
        this.a = map;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(View view, View view2) {
        View view3 = view;
        View view4 = view2;
        int i = 0;
        int i2 = view3.getLayoutParams() instanceof cppw ? ((cppw) view3.getLayoutParams()).b : 0;
        if (view4.getLayoutParams() instanceof cppw) {
            i = ((cppw) view4.getLayoutParams()).b;
        }
        int i3 = i2 - i;
        return i3 != 0 ? i3 : ((Integer) this.a.get(view3)).intValue() - ((Integer) this.a.get(view4)).intValue();
    }
}
