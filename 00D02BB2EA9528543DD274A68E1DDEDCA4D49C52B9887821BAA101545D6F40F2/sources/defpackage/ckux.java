package defpackage;
/* compiled from: PG */
/* renamed from: ckux  reason: default package */
/* loaded from: classes4.dex */
public final class ckux {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ ckwg c;
    final /* synthetic */ ckuy d;

    public ckux(ckuy ckuyVar, String str, long j, ckwg ckwgVar) {
        this.d = ckuyVar;
        this.a = str;
        this.b = j;
        this.c = ckwgVar;
    }

    public final void a(@dzsi dgas dgasVar) {
        if (dgasVar != null) {
            ckuy ckuyVar = this.d;
            String str = this.a;
            long j = this.b;
            int a = ckwd.a(this.c.d);
            if (a == 0) {
                a = 1;
            }
            ckuu ckuuVar = ckuyVar.b;
            ckwi bZ = ckwj.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ckwj ckwjVar = (ckwj) bZ.b;
            ckwjVar.a = 1 | ckwjVar.a;
            ckwjVar.b = j;
            String charSequence = bvtb.c(ckuyVar.a, dgasVar, bvsz.ABBREVIATED).toString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ckwj ckwjVar2 = (ckwj) bZ.b;
            charSequence.getClass();
            int i = ckwjVar2.a | 2;
            ckwjVar2.a = i;
            ckwjVar2.c = charSequence;
            ckwjVar2.d = a - 1;
            ckwjVar2.a = i | 4;
            ckuw.a(ckuuVar, str, "/eta_response", bZ.bK().bS());
        }
    }
}
