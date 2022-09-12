package defpackage;
/* compiled from: PG */
/* renamed from: bnxb  reason: default package */
/* loaded from: classes3.dex */
public class bnxb {
    public final bnyo a;

    public bnxb(bnyo bnyoVar) {
        this.a = bnyoVar;
    }

    public static boolean a(dglu dgluVar) {
        dglm dglmVar;
        int a = dglw.a(dgluVar.d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return dgluVar.b == 3;
        } else if (i == 2) {
            return dgluVar.b == 4;
        } else if (i != 3) {
            return false;
        } else {
            if (dgluVar.b == 5) {
                dglmVar = (dglm) dgluVar.c;
            } else {
                dglmVar = dglm.c;
            }
            return dglmVar.a == 2;
        }
    }
}
