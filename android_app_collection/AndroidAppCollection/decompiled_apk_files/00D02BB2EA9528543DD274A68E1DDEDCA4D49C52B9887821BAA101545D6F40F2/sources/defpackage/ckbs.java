package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: ckbs  reason: default package */
/* loaded from: classes.dex */
final class ckbs implements dbty<dumx> {
    final /* synthetic */ ckbz a;

    public ckbs(ckbz ckbzVar) {
        this.a = ckbzVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ dumx a() {
        dumj bZ = dumx.P.bZ();
        String b = bvnz.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar = (dumx) bZ.b;
        b.getClass();
        int i = dumxVar.a | 512;
        dumxVar.a = i;
        dumxVar.l = b;
        ckbz ckbzVar = this.a;
        String str = ckbzVar.g;
        str.getClass();
        dumxVar.a = i | 32;
        dumxVar.h = str;
        String c = bvnz.c(ckbzVar.f.a().b());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar2 = (dumx) bZ.b;
        c.getClass();
        dumxVar2.a |= 64;
        dumxVar2.i = c;
        String a = bvnz.a(this.a.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar3 = (dumx) bZ.b;
        a.getClass();
        dumxVar3.a |= 2048;
        dumxVar3.n = a;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar4 = (dumx) bZ.b;
        valueOf.getClass();
        dumxVar4.a |= 1024;
        dumxVar4.m = valueOf;
        cnmq cnmqVar = cnmq.a;
        int i2 = cnnl.i(this.a.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar5 = (dumx) bZ.b;
        dumxVar5.a |= 4194304;
        dumxVar5.y = i2;
        return bZ.bK();
    }
}
