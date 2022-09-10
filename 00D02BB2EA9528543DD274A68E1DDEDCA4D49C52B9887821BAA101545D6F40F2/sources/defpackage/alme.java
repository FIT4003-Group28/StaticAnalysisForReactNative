package defpackage;

import java.util.Comparator;
/* renamed from: alme  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class alme implements Comparator {
    static final Comparator a = new alme();

    private alme() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        amxg amxgVar = (amxg) obj;
        amxg amxgVar2 = (amxg) obj2;
        return dbzx.b.c(amxgVar2.d.a().p, amxgVar.d.a().p).c(amxgVar2.d.b(), amxgVar.d.b()).a(amxgVar2.o(), amxgVar.o()).c(System.identityHashCode(amxgVar2), System.identityHashCode(amxgVar)).i();
    }
}
