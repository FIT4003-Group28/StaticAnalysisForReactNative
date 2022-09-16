package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: azgg  reason: default package */
/* loaded from: classes2.dex */
public final class azgg extends ayoi {
    final Iterable a;

    public azgg(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    ayqj.f(ayomVar);
                    return;
                }
                azgf azgfVar = new azgf(ayomVar, it);
                ayomVar.sj(azgfVar);
                if (azgfVar.d) {
                    return;
                }
                while (!azgfVar.c) {
                    try {
                        Object next = azgfVar.b.next();
                        ayrd.b(next, "The iterator returned a null value");
                        azgfVar.a.c(next);
                        if (azgfVar.c) {
                            return;
                        }
                        try {
                            if (!azgfVar.b.hasNext()) {
                                if (azgfVar.c) {
                                    return;
                                }
                                azgfVar.a.sm();
                                return;
                            }
                        } catch (Throwable th) {
                            bapv.j(th);
                            azgfVar.a.b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        bapv.j(th2);
                        azgfVar.a.b(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                bapv.j(th3);
                ayqj.h(th3, ayomVar);
            }
        } catch (Throwable th4) {
            bapv.j(th4);
            ayqj.h(th4, ayomVar);
        }
    }
}
