package defpackage;
/* compiled from: PG */
/* renamed from: bong  reason: default package */
/* loaded from: classes3.dex */
final class bong implements cpne {
    final /* synthetic */ bonh a;

    public bong(bonh bonhVar) {
        this.a = bonhVar;
    }

    @Override // defpackage.cpne
    public final void a(cpnd cpndVar) {
        dory doryVar;
        String str;
        bokg bokgVar = this.a.b;
        bokgVar.b = cpndVar;
        dory doryVar2 = dory.UNSPECIFIED;
        dorz e = bokgVar.e();
        String str2 = "";
        if (cpndVar != cpnd.USER_INPUT_KEEP_ORIGINAL || e == null) {
            if (cpndVar == cpnd.SUGGESTION) {
                doryVar = dory.FEEDBACK_SERVICE;
                if (this.a.b.e() == null) {
                    bokg bokgVar2 = this.a.b;
                    doru bZ = dorz.f.bZ();
                    dory doryVar3 = this.a.b.k;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dorz dorzVar = (dorz) bZ.b;
                    dorzVar.b = doryVar3.i;
                    dorzVar.a |= 1;
                    dnip bZ2 = dniu.i.bZ();
                    String str3 = this.a.b.m;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dniu dniuVar = (dniu) bZ2.b;
                    str3.getClass();
                    int i = dniuVar.a | 1;
                    dniuVar.a = i;
                    dniuVar.b = str3;
                    String str4 = this.a.b.l;
                    str4.getClass();
                    dniuVar.a = i | 4;
                    dniuVar.d = str4;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dorz dorzVar2 = (dorz) bZ.b;
                    dniu bK = bZ2.bK();
                    bK.getClass();
                    dorzVar2.c = bK;
                    dorzVar2.a |= 2;
                    bokgVar2.f(bZ.bK());
                }
            } else if (cpndVar != cpnd.USER_INPUT_NOT_VERIFIED) {
                return;
            } else {
                doryVar = dory.USER_PROVIDED;
            }
            str = str2;
        } else {
            doryVar = dory.b(e.b);
            if (doryVar == null) {
                doryVar = dory.UNSPECIFIED;
            }
            dniu dniuVar2 = e.c;
            if (dniuVar2 == null) {
                dniuVar2 = dniu.i;
            }
            str2 = dniuVar2.b;
            dniu dniuVar3 = e.c;
            if (dniuVar3 == null) {
                dniuVar3 = dniu.i;
            }
            str = dniuVar3.d;
            cpnn cpnnVar = this.a.e;
            if (cpnnVar != null) {
                cpnnVar.a(dgzv.c);
            }
        }
        this.a.N(doryVar, str2, str, true);
    }
}
