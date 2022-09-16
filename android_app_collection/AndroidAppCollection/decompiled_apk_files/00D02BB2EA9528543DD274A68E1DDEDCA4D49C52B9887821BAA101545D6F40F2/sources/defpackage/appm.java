package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: appm  reason: default package */
/* loaded from: classes2.dex */
public final class appm implements apnj {
    final /* synthetic */ appo a;

    public appm(appo appoVar) {
        this.a = appoVar;
    }

    @Override // defpackage.apnj
    public final void a(boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        appo appoVar = this.a;
        boolean z5 = appoVar.h;
        if (!appoVar.c) {
            if (z) {
                if (i != 4) {
                    z3 = true;
                    appoVar.e = z3;
                    z2 = !z && i == 3;
                    appoVar.h = z2;
                    if (z || i != 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                        i = 2;
                    }
                    appoVar.g = z4;
                } else {
                    i = 4;
                }
            }
            z3 = false;
            appoVar.e = z3;
            if (!z) {
            }
            appoVar.h = z2;
            if (z) {
            }
            z4 = false;
            appoVar.g = z4;
        } else {
            z2 = z5;
        }
        appoVar.d = i == 4;
        appn appnVar = appoVar.l;
        if (appnVar != null && z5 != z2) {
            appnVar.c(z2);
        }
        if (i == 2 || i == 3) {
            appo appoVar2 = this.a;
            appoVar2.k = true;
            appoVar2.D();
        } else {
            appo appoVar3 = this.a;
            appoVar3.k = false;
            appoVar3.D();
        }
        cqkx.p(this.a);
    }
}
