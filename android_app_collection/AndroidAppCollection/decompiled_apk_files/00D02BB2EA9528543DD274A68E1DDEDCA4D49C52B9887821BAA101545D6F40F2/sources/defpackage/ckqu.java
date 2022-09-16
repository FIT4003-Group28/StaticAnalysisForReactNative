package defpackage;
/* compiled from: PG */
/* renamed from: ckqu  reason: default package */
/* loaded from: classes4.dex */
final class ckqu implements cree {
    final /* synthetic */ boolean a;
    final /* synthetic */ ckqx b;

    public ckqu(ckqx ckqxVar, boolean z) {
        this.b = ckqxVar;
        this.a = z;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        dmcf dmcfVar = dmcf.ERROR;
        cred credVar2 = cred.NEVER_PLAYED;
        int ordinal = credVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                ckqx ckqxVar = this.b;
                if (this.a) {
                    ckqxVar.c.b(1);
                    return;
                } else {
                    ckqxVar.c.b(4);
                    return;
                }
            } else if (ordinal != 3) {
                return;
            }
        }
        this.b.k(this.a);
    }

    @Override // defpackage.cree
    public final void b(long j) {
    }
}
