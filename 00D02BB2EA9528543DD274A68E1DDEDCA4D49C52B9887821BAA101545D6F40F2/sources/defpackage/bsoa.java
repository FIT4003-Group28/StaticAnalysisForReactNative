package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bsoa  reason: default package */
/* loaded from: classes4.dex */
final class bsoa implements Comparator<cqkp> {
    final Rect a;
    final /* synthetic */ bsoi b;
    final alrh c;

    public bsoa(bsoi bsoiVar) {
        this.b = bsoiVar;
        this.a = bsoiVar.p.e();
        alrh ak = bsoiVar.o.a().ak();
        dbsk.s(ak);
        this.c = ak;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cqkp cqkpVar, cqkp cqkpVar2) {
        Point T = bsoi.T(cqkpVar, this.c);
        Point T2 = bsoi.T(cqkpVar2, this.c);
        int o = bsoi.o(T, this.a);
        int o2 = bsoi.o(T2, this.a);
        if (o != o2) {
            return Integer.compare(o, o2);
        }
        int i = Integer.MAX_VALUE;
        int i2 = T == null ? Integer.MAX_VALUE : T.x;
        if (T2 != null) {
            i = T2.x;
        }
        return Integer.compare(i2, i);
    }
}
