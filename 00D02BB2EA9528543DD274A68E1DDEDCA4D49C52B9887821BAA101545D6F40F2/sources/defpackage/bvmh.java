package defpackage;
/* compiled from: PG */
/* renamed from: bvmh  reason: default package */
/* loaded from: classes4.dex */
public final class bvmh {
    private final ckcw a;

    public bvmh(ckcw ckcwVar) {
        this.a = ckcwVar;
    }

    private final void c(bvmf bvmfVar, boolean z) {
        bvmf bvmfVar2 = bvmf.NETWORK_COUNTRY_KEY;
        int ordinal = bvmfVar.ordinal();
        if (ordinal == 0) {
            ((ckcm) this.a.a(ckkh.a)).a(z);
        } else if (ordinal == 1) {
            ((ckcm) this.a.a(ckkh.b)).a(z);
        } else if (ordinal != 2) {
        } else {
            ((ckcm) this.a.a(ckkh.c)).a(z);
        }
    }

    public final void a(bvmf bvmfVar) {
        c(bvmfVar, true);
    }

    public final void b(bvmf bvmfVar) {
        c(bvmfVar, false);
    }
}
