package defpackage;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpvx  reason: default package */
/* loaded from: classes5.dex */
public final class cpvx implements Comparator {
    final /* synthetic */ cpve a;

    public cpvx(cpve cpveVar) {
        this.a = cpveVar;
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
