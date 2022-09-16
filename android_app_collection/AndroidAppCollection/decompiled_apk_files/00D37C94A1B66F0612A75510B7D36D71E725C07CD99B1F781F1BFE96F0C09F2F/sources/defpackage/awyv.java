package defpackage;
/* compiled from: PG */
/* renamed from: awyv  reason: default package */
/* loaded from: classes2.dex */
public final class awyv {
    public final awxz a;

    public awyv(awxz awxzVar) {
        this.a = awxzVar;
    }

    public final awyp a(String str, awya awyaVar, awxx awxxVar, String str2, awyu awyuVar) {
        boolean z = true;
        if (!akzj.i("POST", "put") && !akzj.i("POST", "post")) {
            z = false;
        }
        aqxo.p(z);
        if (awxxVar.a() == -1 || awxxVar.a() >= 0) {
            return new awyn(str, "POST", awyaVar, awxxVar, str2, this.a, awyuVar, false);
        }
        return new awyj(str, awyaVar, awxxVar, str2, this.a, awyuVar);
    }
}
