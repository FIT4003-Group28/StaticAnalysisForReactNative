package defpackage;

import android.view.View;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: ajo  reason: default package */
/* loaded from: classes2.dex */
public final class ajo implements Comparator<View> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(View view, View view2) {
        float af = od.af(view);
        float af2 = od.af(view2);
        if (af > af2) {
            return -1;
        }
        return af < af2 ? 1 : 0;
    }
}
