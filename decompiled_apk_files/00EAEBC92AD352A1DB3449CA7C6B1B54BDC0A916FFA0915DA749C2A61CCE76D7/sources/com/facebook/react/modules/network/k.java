package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f5730a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f5731b = null;

    public k(Charset charset) {
        this.f5730a = charset.newDecoder();
    }

    public String a(byte[] bArr, int i) {
        byte[] bArr2 = this.f5731b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f5731b.length, i);
            i += this.f5731b.length;
            bArr = bArr3;
        }
        boolean z = true;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.f5730a.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z2 || i2 <= 0) {
            z = false;
        }
        if (z) {
            this.f5731b = new byte[i2];
            System.arraycopy(bArr, i - i2, this.f5731b, 0, i2);
        } else {
            this.f5731b = null;
        }
        if (!z2) {
            c.d.d.e.a.d("ReactNative", "failed to decode string from byte array");
            return "";
        }
        return new String(charBuffer.array(), 0, charBuffer.length());
    }
}
