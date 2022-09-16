package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yqr  reason: default package */
/* loaded from: classes4.dex */
public final class yqr extends yqt {
    private final byte[] a;
    private final int d;
    private ByteBuffer e;

    public yqr(byte[] bArr, int i, String str) {
        super(i, str);
        this.a = bArr;
        this.d = i;
        this.e = null;
    }

    @Override // defpackage.yqt
    public final InputStream a() {
        return new yul(this.a, this.d);
    }

    @Override // defpackage.yqt
    public final ByteBuffer b() {
        if (this.e == null) {
            this.e = ByteBuffer.wrap(this.a, 0, this.d);
        }
        return this.e.duplicate();
    }

    @Override // defpackage.yqt
    public final byte[] c() {
        int i = this.d;
        byte[] bArr = this.a;
        if (i == bArr.length) {
            return bArr;
        }
        return null;
    }
}
