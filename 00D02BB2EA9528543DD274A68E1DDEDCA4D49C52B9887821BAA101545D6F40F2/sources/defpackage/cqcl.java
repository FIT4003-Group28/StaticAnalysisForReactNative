package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqcl  reason: default package */
/* loaded from: classes5.dex */
public final class cqcl implements degu<dslz> {
    final /* synthetic */ cqcp a;

    public cqcl(cqcp cqcpVar) {
        this.a = cqcpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.c(cqcm.CONSENT_DATA_LOADING_FAILED);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dslz dslzVar) {
        cqcp cqcpVar;
        cqcm cqcmVar;
        dslz dslzVar2 = dslzVar;
        this.a.h = dslzVar2;
        cqdb cqdbVar = cqdb.ALREADY_CONSENTED;
        cqcm cqcmVar2 = cqcm.CONSENT_DATA_LOADING;
        int ordinal = cqdc.a(dslzVar2).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    cqcpVar = this.a;
                    cqcmVar = cqcm.WAITING_FOR_USER_DECISION;
                } else if (ordinal != 3) {
                    return;
                }
            }
            cqcpVar = this.a;
            cqcmVar = cqcm.CONSENT_NOT_POSSIBLE;
        } else {
            cqcpVar = this.a;
            cqcmVar = cqcm.ALREADY_CONSENTED;
        }
        cqcpVar.c(cqcmVar);
    }
}
