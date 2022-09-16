package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: wty  reason: default package */
/* loaded from: classes4.dex */
public final class wty extends ajfb {
    public final Set a;
    private final Set b;
    private final azqb c;
    private final CopyOnWriteArrayList d;

    public wty(azqb azqbVar, Set set, azqb azqbVar2, CopyOnWriteArrayList copyOnWriteArrayList) {
        super(1);
        ((wpr) azqbVar.get()).a();
        this.b = set;
        this.c = azqbVar2;
        this.d = copyOnWriteArrayList;
        this.a = new HashSet();
    }

    public final void a(wkp wkpVar) {
        ylr.c();
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        wkpVar.getClass();
        copyOnWriteArrayList.add(wkpVar);
    }

    @Override // defpackage.ajfb
    public final void b() {
        ylr.c();
        ((xiw) this.c.get()).a();
    }

    @Override // defpackage.ajfb
    public final void c(String str) {
        ylr.c();
        ylr.c();
        xiu xiuVar = ((xiw) this.c.get()).d;
        if (xiuVar != null) {
            xiuVar.s();
            xiuVar.i();
        }
        for (wln wlnVar : this.a) {
            wlnVar.i();
        }
        for (wum wumVar : this.b) {
            wumVar.g();
        }
    }

    public final void d(wkp wkpVar) {
        ylr.c();
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        wkpVar.getClass();
        copyOnWriteArrayList.remove(wkpVar);
    }
}
