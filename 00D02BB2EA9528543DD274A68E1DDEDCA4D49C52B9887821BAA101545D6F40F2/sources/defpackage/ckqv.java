package defpackage;
/* compiled from: PG */
/* renamed from: ckqv  reason: default package */
/* loaded from: classes4.dex */
final class ckqv implements cree {
    final /* synthetic */ ckqx a;

    public ckqv(ckqx ckqxVar) {
        this.a = ckqxVar;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        dmcf dmcfVar = dmcf.ERROR;
        cred credVar2 = cred.NEVER_PLAYED;
        int ordinal = credVar.ordinal();
        if (ordinal == 0) {
            this.a.c.o(4);
        } else if (ordinal == 1) {
            this.a.c.o(3);
        } else if (ordinal == 2) {
            this.a.c.o(1);
        } else if (ordinal != 3) {
        } else {
            this.a.c.o(2);
        }
    }

    @Override // defpackage.cree
    public final void b(long j) {
    }
}
