package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bafk  reason: default package */
/* loaded from: classes3.dex */
public final class bafk {
    final aybl a;
    final ayfl b;
    @dzsi
    ayfk c;
    final z<List<baal>> d = new z<>();

    public bafk(aybl ayblVar, ayfl ayflVar) {
        this.a = ayblVar;
        this.b = ayflVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<baal> a(List<baal> list) {
        return dcbg.b(list).o(new dbsl(this) { // from class: bafi
            private final bafk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ayfk ayfkVar = this.a.c;
                dbsk.s(ayfkVar);
                return ayfkVar.d((baal) obj);
            }
        }).z();
    }
}
