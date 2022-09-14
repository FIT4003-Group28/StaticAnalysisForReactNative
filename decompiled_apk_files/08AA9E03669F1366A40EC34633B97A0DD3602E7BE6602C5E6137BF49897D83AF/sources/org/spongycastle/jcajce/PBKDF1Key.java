package org.spongycastle.jcajce;

import org.spongycastle.crypto.CharToByteConverter;
/* loaded from: classes.dex */
public class PBKDF1Key implements PBKDFKey {
    private final CharToByteConverter converter;
    private final char[] password;

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    public PBKDF1Key(char[] cArr, CharToByteConverter charToByteConverter) {
        this.password = new char[cArr.length];
        this.converter = charToByteConverter;
        System.arraycopy(cArr, 0, this.password, 0, cArr.length);
    }

    public char[] getPassword() {
        return this.password;
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.converter.getType();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.converter.convert(this.password);
    }
}
