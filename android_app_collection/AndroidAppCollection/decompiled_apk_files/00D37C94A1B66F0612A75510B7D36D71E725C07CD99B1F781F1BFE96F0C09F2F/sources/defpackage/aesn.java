package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aesn  reason: default package */
/* loaded from: classes.dex */
public final class aesn extends aesm {
    public aesn(aesh aeshVar, Handler handler, aerw aerwVar) {
        super(aeshVar, handler, aerwVar);
    }

    public final byte[] a(pnu pnuVar) {
        try {
            return super.f(pnuVar.a);
        } catch (aesf e) {
            asx asxVar = new asx();
            asxVar.b(pnuVar.b);
            asxVar.d = pnuVar.a;
            asxVar.a();
            throw new pod(e);
        }
    }

    public final byte[] b(pnv pnvVar) {
        try {
            return super.g(pnvVar.b, pnvVar.a);
        } catch (aesf e) {
            asx asxVar = new asx();
            asxVar.b(pnvVar.b);
            asxVar.d = pnvVar.a;
            asxVar.a();
            throw new pod(e);
        }
    }

    @Override // defpackage.aesm
    public final void e(String str, String str2, String str3, String str4, String str5) {
        super.e(str, str2, str3, str4, str5);
    }

    public aesn(aesh aeshVar, aerw aerwVar) {
        super(aeshVar, null, aerwVar);
    }
}
