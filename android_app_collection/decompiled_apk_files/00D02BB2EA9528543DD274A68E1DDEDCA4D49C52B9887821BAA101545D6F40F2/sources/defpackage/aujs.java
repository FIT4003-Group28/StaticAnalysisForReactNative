package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aujs  reason: default package */
/* loaded from: classes.dex */
final class aujs implements crzp<aujn> {
    final /* synthetic */ auju a;

    public aujs(auju aujuVar) {
        this.a = aujuVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aujn> crzmVar) {
        bvrj.BACKGROUND_THREADPOOL.c();
        aujn l = crzmVar.l();
        if (l != null) {
            auju aujuVar = this.a;
            final Map<ddos, aujt> d = auju.d(aujuVar.e, aujuVar.a, aujuVar.b, l);
            this.a.d = new dbty(d) { // from class: aujr
                private final Map a;

                {
                    this.a = d;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a;
                }
            };
        }
    }
}
