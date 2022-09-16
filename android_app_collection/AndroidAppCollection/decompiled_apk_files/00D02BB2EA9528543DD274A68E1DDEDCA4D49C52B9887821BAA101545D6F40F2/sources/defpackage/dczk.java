package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dczk  reason: default package */
/* loaded from: classes5.dex */
final class dczk extends dcyo {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public dczk(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void l() {
        dbsk.m(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.dcyo
    protected final void a(byte b) {
        l();
        this.a.update(b);
    }

    @Override // defpackage.dcyo
    protected final void b(ByteBuffer byteBuffer) {
        l();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.dcyo
    protected final void e(byte[] bArr, int i) {
        l();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.dczb
    public final dcyz p() {
        l();
        this.c = true;
        if (this.b == this.a.getDigestLength()) {
            return dcyz.g(this.a.digest());
        }
        return dcyz.g(Arrays.copyOf(this.a.digest(), this.b));
    }
}
