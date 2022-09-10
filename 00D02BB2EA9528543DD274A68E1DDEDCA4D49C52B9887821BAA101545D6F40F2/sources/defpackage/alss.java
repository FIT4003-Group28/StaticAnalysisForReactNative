package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alss  reason: default package */
/* loaded from: classes.dex */
final class alss implements alsx {
    final /* synthetic */ bnrs a;
    final /* synthetic */ akzh b;
    final /* synthetic */ alst c;

    public alss(alst alstVar, bnrs bnrsVar, akzh akzhVar) {
        this.c = alstVar;
        this.a = bnrsVar;
        this.b = akzhVar;
    }

    @Override // defpackage.alsx
    public final void a(alyh alyhVar, int i, @dzsi Collection<altt> collection) {
        altt e;
        Set<altt> f;
        if (this.a == this.c.f && i == 0 && collection != null) {
            synchronized (this.c) {
                this.c.c.put(alyhVar, collection);
                alst alstVar = this.c;
                alstVar.e = true;
                e = alstVar.e(alstVar.d(this.b));
                f = this.c.f();
            }
            this.c.a(e, f);
        }
    }
}
