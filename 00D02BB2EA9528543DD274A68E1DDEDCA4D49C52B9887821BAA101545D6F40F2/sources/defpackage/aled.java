package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aled  reason: default package */
/* loaded from: classes2.dex */
public final class aled implements aleh {
    private final alee a;
    private final akxa b;

    public aled(alee aleeVar, akxa akxaVar) {
        this.a = aleeVar;
        this.b = akxaVar;
    }

    @Override // defpackage.aleh
    public final List<akte> e(aldp aldpVar, boolean z) {
        akuh akuhVar;
        if (z) {
            akuhVar = aldpVar.c ? ((aleg) this.a).a : ((aleg) this.a).b;
        } else {
            akuhVar = ((aleg) this.a).c;
        }
        return dchl.b(this.b.c(aldpVar.a, akuhVar, 0, 0, 1, 1, 1));
    }
}
