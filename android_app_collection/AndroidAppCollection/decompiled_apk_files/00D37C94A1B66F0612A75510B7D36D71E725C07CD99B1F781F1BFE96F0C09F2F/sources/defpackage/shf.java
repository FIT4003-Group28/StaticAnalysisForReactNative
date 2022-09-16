package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: shf  reason: default package */
/* loaded from: classes4.dex */
public final class shf implements Comparator {
    final /* synthetic */ sgp a;

    public shf(sgp sgpVar) {
        this.a = sgpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Double d = (Double) this.a.a(obj, -1, null);
        Double d2 = (Double) this.a.a(obj2, -1, null);
        if (d == null && d2 == null) {
            return 0;
        }
        if (d == null) {
            return -1;
        }
        if (d2 != null) {
            return d.compareTo(d2);
        }
        return 1;
    }
}
