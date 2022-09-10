package defpackage;
/* compiled from: PG */
/* renamed from: ckqs  reason: default package */
/* loaded from: classes4.dex */
final class ckqs implements cree {
    final /* synthetic */ ckqx a;

    public ckqs(ckqx ckqxVar) {
        this.a = ckqxVar;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        dmcf dmcfVar = dmcf.ERROR;
        cred credVar2 = cred.NEVER_PLAYED;
        int ordinal = credVar.ordinal();
        if (ordinal == 0) {
            this.a.c.m(8);
        } else if (ordinal == 1) {
            this.a.c.m(7);
        } else if (ordinal == 2) {
            this.a.c.m(5);
        } else if (ordinal != 3) {
        } else {
            this.a.c.m(6);
        }
    }

    @Override // defpackage.cree
    public final void b(long j) {
    }
}
