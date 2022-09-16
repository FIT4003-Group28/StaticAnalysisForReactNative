package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: afkf  reason: default package */
/* loaded from: classes.dex */
public final class afkf implements afjk {
    public final Set a = new CopyOnWriteArraySet();

    @Override // defpackage.afjk
    public final void a(Exception exc) {
        for (afkg afkgVar : this.a) {
            afkgVar.b(exc);
        }
    }

    @Override // defpackage.afjk
    public final void b(int i) {
        for (afkg afkgVar : this.a) {
            afkgVar.c(i);
        }
    }

    @Override // defpackage.afjk
    @Deprecated
    public final void c(long j) {
        for (afkg afkgVar : this.a) {
            afkgVar.rX(j);
        }
    }

    public final void d(afkg afkgVar) {
        this.a.add(afkgVar);
    }

    public final void e(afkg afkgVar) {
        this.a.remove(afkgVar);
    }
}
