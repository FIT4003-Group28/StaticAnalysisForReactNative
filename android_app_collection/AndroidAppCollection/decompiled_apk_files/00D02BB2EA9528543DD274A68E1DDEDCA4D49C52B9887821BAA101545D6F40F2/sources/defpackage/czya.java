package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: czya  reason: default package */
/* loaded from: classes5.dex */
final class czya extends czyh {
    final /* synthetic */ czyb a;

    public czya(czyb czybVar) {
        this.a = czybVar;
    }

    @Override // defpackage.czyh
    public final void a(Object obj) {
        Iterator it = this.a.ae.iterator();
        while (it.hasNext()) {
            ((czyh) it.next()).a(obj);
        }
    }
}
