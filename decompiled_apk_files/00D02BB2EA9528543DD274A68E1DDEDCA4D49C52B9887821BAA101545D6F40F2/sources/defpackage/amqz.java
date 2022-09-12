package defpackage;

import java.util.Comparator;
import java.util.Map;
/* renamed from: amqz  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class amqz implements Comparator {
    static final Comparator a = new amqz();

    private amqz() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        amrf amrfVar = (amrf) ((Map.Entry) obj).getValue();
        amrf amrfVar2 = (amrf) ((Map.Entry) obj2).getValue();
        return dbzx.b.a(amrfVar.b, amrfVar2.b).c(amrfVar.c, amrfVar2.c).i();
    }
}
