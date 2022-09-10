package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cjom  reason: default package */
/* loaded from: classes4.dex */
final class cjom implements afzt {
    private final WeakReference<cjoo> a;

    public cjom(cjoo cjooVar) {
        this.a = new WeakReference<>(cjooVar);
    }

    @Override // defpackage.afzt
    public final void a(final afzu afzuVar) {
        final cjoo cjooVar = this.a.get();
        if (cjooVar == null || !cjooVar.aD) {
            return;
        }
        cjooVar.aB.execute(new Runnable(cjooVar, afzuVar) { // from class: cjoa
            private final cjoo a;
            private final afzu b;

            {
                this.a = cjooVar;
                this.b = afzuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cjoo cjooVar2 = this.a;
                afzu afzuVar2 = this.b;
                cjpx cjpxVar = cjooVar2.aU;
                if (cjpxVar != null) {
                    cjpxVar.m(cjpp.FOR_YOU, afzuVar2.b(cjooVar2.aU.j()));
                }
            }
        });
    }
}
