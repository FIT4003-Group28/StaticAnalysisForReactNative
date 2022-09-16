package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aywv  reason: default package */
/* loaded from: classes2.dex */
public final class aywv extends aynx {
    final Iterable b;

    public aywv(Iterable iterable) {
        this.b = iterable;
    }

    public static void a(bame bameVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                azoc.b(bameVar);
            } else if (bameVar instanceof ayre) {
                bameVar.f(new aywt((ayre) bameVar, it));
            } else {
                bameVar.f(new aywu(bameVar, it));
            }
        } catch (Throwable th) {
            bapv.j(th);
            azoc.f(th, bameVar);
        }
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        try {
            a(bameVar, this.b.iterator());
        } catch (Throwable th) {
            bapv.j(th);
            azoc.f(th, bameVar);
        }
    }
}
