package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public class SupplementalDataEntry {
    protected byte[] data;
    protected int dataType;

    public SupplementalDataEntry(int i, byte[] bArr) {
        this.dataType = i;
        this.data = bArr;
    }

    public int getDataType() {
        return this.dataType;
    }

    public byte[] getData() {
        return this.data;
    }
}
