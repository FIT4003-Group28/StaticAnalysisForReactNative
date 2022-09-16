package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aymu  reason: default package */
/* loaded from: classes2.dex */
public final class aymu extends InputStream implements axzx {
    public aoqu a;
    public final aorb b;
    public ByteArrayInputStream c;

    public aymu(aoqu aoquVar, aorb aorbVar) {
        this.a = aoquVar;
        this.b = aorbVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        aoqu aoquVar = this.a;
        if (aoquVar != null) {
            return aoquVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        return byteArrayInputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        aoqu aoquVar = this.a;
        if (aoquVar != null) {
            this.c = new ByteArrayInputStream(aoquVar.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        aoqu aoquVar = this.a;
        if (aoquVar != null) {
            int serializedSize = aoquVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 >= serializedSize) {
                aool am = aool.am(bArr, i, serializedSize);
                this.a.writeTo(am);
                am.an();
                this.a = null;
                this.c = null;
                return serializedSize;
            } else {
                this.c = new ByteArrayInputStream(this.a.toByteArray());
                this.a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
