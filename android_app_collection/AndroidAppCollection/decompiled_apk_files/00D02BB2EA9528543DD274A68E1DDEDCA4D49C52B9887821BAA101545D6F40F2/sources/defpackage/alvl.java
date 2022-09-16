package defpackage;

import java.util.Comparator;
/* renamed from: alvl  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class alvl implements Comparator {
    static final Comparator a = new alvl();

    private alvl() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dmma dmmaVar = (dmma) obj;
        dmma dmmaVar2 = (dmma) obj2;
        return dbzx.b.c(dmmaVar.a, dmmaVar2.a).c(dmmaVar.b, dmmaVar2.b).i();
    }
}
