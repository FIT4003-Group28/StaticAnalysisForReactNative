package defpackage;
/* compiled from: PG */
/* renamed from: azgk  reason: default package */
/* loaded from: classes2.dex */
public final class azgk extends ayoi {
    final aypx a;

    public azgk(aypx aypxVar) {
        this.a = aypxVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            azgj azgjVar = new azgj(ayomVar, this.a, 0);
            ayomVar.sj(azgjVar);
            Object obj = azgjVar.c;
            if (azgjVar.d) {
                azgjVar.c = null;
                return;
            }
            aypx aypxVar = azgjVar.b;
            while (!azgjVar.d) {
                azgjVar.f = false;
                try {
                    obj = aypxVar.a(obj, azgjVar);
                    if (azgjVar.e) {
                        azgjVar.d = true;
                        azgjVar.c = null;
                        return;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    azgjVar.c = null;
                    azgjVar.d = true;
                    azgjVar.c(th);
                    return;
                }
            }
            azgjVar.c = null;
        } catch (Throwable th2) {
            bapv.j(th2);
            ayqj.h(th2, ayomVar);
        }
    }
}
