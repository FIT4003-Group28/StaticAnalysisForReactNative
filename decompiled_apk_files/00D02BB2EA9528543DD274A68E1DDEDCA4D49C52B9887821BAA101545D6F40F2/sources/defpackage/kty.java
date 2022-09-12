package defpackage;
/* compiled from: PG */
/* renamed from: kty  reason: default package */
/* loaded from: classes7.dex */
public final class kty {
    public static final dcdc<ckhf> a = dcdc.o(ckee.N, ckee.O, ckee.P, ckee.Q, ckee.R, ckee.T, ckee.U, ckee.V, ckee.W, ckee.X, ckee.Y);
    public static boolean b = false;

    public static void a(ckcw ckcwVar, ckhf ckhfVar) {
        if (!b) {
            return;
        }
        dcdc<ckhf> dcdcVar = a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            ckhf ckhfVar2 = dcdcVar.get(i);
            ckhe ckheVar = (ckhe) ckcwVar.a(ckhfVar2);
            if (ckhfVar2.equals(ckhfVar)) {
                String str = ckhfVar2.b;
                ckheVar.c();
            } else {
                ckheVar.e();
            }
        }
        b = false;
    }

    public static void b(ckcw ckcwVar) {
        if (!b) {
            return;
        }
        dcdc<ckhf> dcdcVar = a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            ((ckhe) ckcwVar.a(dcdcVar.get(i))).e();
        }
        b = false;
    }
}
