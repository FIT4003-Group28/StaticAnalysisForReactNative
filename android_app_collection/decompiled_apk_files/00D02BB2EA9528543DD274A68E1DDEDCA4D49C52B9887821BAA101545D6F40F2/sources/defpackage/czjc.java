package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: czjc  reason: default package */
/* loaded from: classes5.dex */
public class czjc extends FilterInputStream {
    public czjc(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }
}
