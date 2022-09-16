package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aguq  reason: default package */
/* loaded from: classes.dex */
public final class aguq implements aguu {
    private final azqb a;

    public aguq(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.aguu
    public final int a(String str, agvx agvxVar) {
        return ((agus) this.a.get()).a(str, agvxVar);
    }

    @Override // defpackage.aguu
    public final arzh b(agvx agvxVar, Set set) {
        return ((agus) this.a.get()).b(agvxVar, set);
    }

    @Override // defpackage.aguu
    public final void c(String str, agvx agvxVar) {
        ((agus) this.a.get()).c(str, agvxVar);
    }
}
