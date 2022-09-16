package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arnc  reason: default package */
/* loaded from: classes2.dex */
public final class arnc implements degu<Boolean> {
    final /* synthetic */ arnd a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    public arnc(arnd arndVar, int i, int i2) {
        this.a = arndVar;
        this.b = i;
        this.c = i2;
    }

    private final void c(int i, @dzsi int i2, boolean z) {
        if (i2 == 0) {
            cpwx cpwxVar = this.a.d;
            cpwxVar.d.c();
            cpxg cpxgVar = cpwxVar.l;
            if (cpxgVar != null) {
                cpxgVar.a = i;
                cpxgVar.a();
            }
            cpzg cpzgVar = (cpzg) cpzi.c.bZ();
            if (cpzgVar.c) {
                cpzgVar.bF();
                cpzgVar.c = false;
            }
            cpzi cpziVar = (cpzi) cpzgVar.b;
            cpziVar.b = 1;
            cpziVar.a |= 1;
            dsqv<cpzi, cqah> dsqvVar = cqaf.a;
            cqag bZ = cqah.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cqah cqahVar = (cqah) bZ.b;
            cqahVar.b = i - 1;
            int i3 = cqahVar.a | 1;
            cqahVar.a = i3;
            cqahVar.a = i3 | 4;
            cqahVar.d = z;
            cpzgVar.k(dsqvVar, bZ.bK());
            cpwxVar.d(cpzgVar);
            dcqy<String> dcqyVar = dcrd.a;
            return;
        }
        cpwx cpwxVar2 = this.a.d;
        cpwxVar2.d.c();
        cpzg cpzgVar2 = (cpzg) cpzi.c.bZ();
        if (cpzgVar2.c) {
            cpzgVar2.bF();
            cpzgVar2.c = false;
        }
        cpzi cpziVar2 = (cpzi) cpzgVar2.b;
        cpziVar2.b = 1;
        cpziVar2.a |= 1;
        dsqv<cpzi, cqah> dsqvVar2 = cqaf.a;
        cqag bZ2 = cqah.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        cqah cqahVar2 = (cqah) bZ2.b;
        cqahVar2.b = i - 1;
        int i4 = cqahVar2.a | 1;
        cqahVar2.a = i4;
        cqahVar2.c = i2 - 1;
        int i5 = i4 | 2;
        cqahVar2.a = i5;
        cqahVar2.a = i5 | 4;
        cqahVar2.d = z;
        cpzgVar2.k(dsqvVar2, bZ2.bK());
        cpwxVar2.d(cpzgVar2);
        dcqy<String> dcqyVar2 = dcrd.a;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcqd dcqdVar = dcqe.b;
        dcqy<String> dcqyVar = dcrd.a;
        dcqdVar.t(3339).p("Failed to get Morris eligibility.");
        c(this.b, this.c, false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        c(this.b, this.c, bool.booleanValue());
    }
}
