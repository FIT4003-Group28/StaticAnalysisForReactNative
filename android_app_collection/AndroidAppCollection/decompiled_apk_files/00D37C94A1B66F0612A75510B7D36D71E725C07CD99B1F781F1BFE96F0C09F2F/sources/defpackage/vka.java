package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: vka  reason: default package */
/* loaded from: classes4.dex */
public class vka extends FilterInputStream {
    public vka(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }
}
