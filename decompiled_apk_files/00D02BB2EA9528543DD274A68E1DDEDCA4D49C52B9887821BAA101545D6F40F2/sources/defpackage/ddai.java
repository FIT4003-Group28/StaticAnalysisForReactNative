package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: ddai  reason: default package */
/* loaded from: classes5.dex */
final class ddai extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        dbsk.s(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        dbsk.s(bArr);
    }
}
