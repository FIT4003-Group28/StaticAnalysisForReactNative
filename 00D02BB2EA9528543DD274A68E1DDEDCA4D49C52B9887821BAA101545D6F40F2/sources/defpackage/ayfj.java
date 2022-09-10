package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfj  reason: default package */
/* loaded from: classes3.dex */
public final class ayfj {
    public final aik<baal> a = new aik<>();
    final /* synthetic */ ayfk b;

    public ayfj(ayfk ayfkVar) {
        this.b = ayfkVar;
        List<baal> list = ayfkVar.l;
        if (list != null) {
            for (baal baalVar : list) {
                if (baalVar.x() == baaj.PLACE) {
                    baak z = baalVar.z();
                    dbsk.s(z);
                    akqi a = z.a();
                    if (!a.equals(akqi.a)) {
                        this.a.d(a.c, baalVar);
                    }
                }
            }
        }
    }
}
