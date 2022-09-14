package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: zr  reason: default package */
/* loaded from: classes.dex */
final class zr implements Comparator<zt> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zt ztVar, zt ztVar2) {
        zt ztVar3 = ztVar;
        zt ztVar4 = ztVar2;
        RecyclerView recyclerView = ztVar3.d;
        if ((recyclerView == null) != (ztVar4.d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = ztVar3.a;
        if (z != ztVar4.a) {
            return !z ? 1 : -1;
        }
        int i = ztVar4.b - ztVar3.b;
        if (i != 0) {
            return i;
        }
        int i2 = ztVar3.c - ztVar4.c;
        if (i2 != 0) {
            return i2;
        }
        return 0;
    }
}
