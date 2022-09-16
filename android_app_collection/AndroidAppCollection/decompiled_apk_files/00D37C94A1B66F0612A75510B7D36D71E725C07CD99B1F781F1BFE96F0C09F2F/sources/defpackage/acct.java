package defpackage;

import java.io.PipedOutputStream;
/* compiled from: PG */
/* renamed from: acct  reason: default package */
/* loaded from: classes.dex */
public final class acct extends PipedOutputStream {
    private final accs a;

    public acct(accs accsVar) {
        super(accsVar);
        this.a = accsVar;
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.a.a(bArr, i, i2);
    }
}
