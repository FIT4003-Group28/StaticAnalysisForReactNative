package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahbs  reason: default package */
/* loaded from: classes2.dex */
public final class ahbs implements degu<dlbu> {
    final /* synthetic */ akqs a;
    final /* synthetic */ ahbw b;

    public ahbs(ahbw ahbwVar, akqs akqsVar) {
        this.b = ahbwVar;
        this.a = akqsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.p();
        this.b.k(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dlbu dlbuVar) {
        dlbu dlbuVar2 = dlbuVar;
        this.b.q(dlbuVar2);
        this.b.i.add(new ahan(this.a, dlbuVar2));
        Iterator<ahbv> it = this.b.i.iterator();
        while (it.hasNext() && this.b.i.size() > 100) {
            it.next();
            it.remove();
        }
    }
}
