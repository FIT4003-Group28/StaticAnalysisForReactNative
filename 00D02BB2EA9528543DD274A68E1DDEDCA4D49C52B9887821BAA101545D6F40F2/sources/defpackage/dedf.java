package defpackage;

import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dedf  reason: default package */
/* loaded from: classes.dex */
final class dedf extends dclu {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Map b;

    public dedf(Comparator comparator, Map map) {
        this.a = comparator;
        this.b = map;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(this.b.get(obj), this.b.get(obj2));
    }
}
