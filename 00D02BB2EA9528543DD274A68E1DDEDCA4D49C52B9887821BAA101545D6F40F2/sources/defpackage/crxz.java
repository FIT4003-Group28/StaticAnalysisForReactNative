package defpackage;

import java.security.MessageDigest;
/* renamed from: crxz  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class crxz implements bty {
    static final bty a = new crxz();

    private crxz() {
    }

    @Override // defpackage.bty
    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        int i = cryc.a;
        if (((Boolean) obj).booleanValue()) {
            messageDigest.update(bArr);
        }
    }
}
