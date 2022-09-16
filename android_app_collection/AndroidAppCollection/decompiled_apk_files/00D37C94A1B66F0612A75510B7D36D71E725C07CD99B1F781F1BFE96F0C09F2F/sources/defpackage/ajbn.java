package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: ajbn  reason: default package */
/* loaded from: classes.dex */
public final class ajbn implements Comparator, Serializable {
    public static final int a(ajbl ajblVar, ajbl ajblVar2) {
        long j = ajblVar.a;
        long j2 = ajblVar2.a;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        } else if (ajblVar.a() != ajblVar2.a()) {
            return ajblVar2.a() - ajblVar.a();
        } else {
            int i = ajblVar.c - 1;
            int i2 = ajblVar2.c - 1;
            return i != i2 ? i - i2 : ajblVar.b().compareTo(ajblVar2.b());
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((ajbl) obj, (ajbl) obj2);
    }
}
