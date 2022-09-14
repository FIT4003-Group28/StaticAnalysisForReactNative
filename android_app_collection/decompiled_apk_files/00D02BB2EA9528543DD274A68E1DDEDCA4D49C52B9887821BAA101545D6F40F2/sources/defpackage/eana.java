package defpackage;

import java.io.CharConversionException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eana  reason: default package */
/* loaded from: classes6.dex */
public final class eana {
    public final eanm a;
    public final InputStream b;
    public final byte[] c;
    public int d;
    public int e;
    public boolean f = true;
    public int g = 0;

    public eana(eanm eanmVar, InputStream inputStream) {
        this.a = eanmVar;
        this.b = inputStream;
        if (eanmVar.e != null) {
            throw new IllegalStateException("Trying to call allocReadIOBuffer() second time");
        }
        eanmVar.e = eanmVar.d.a(eaob.READ_IO_BUFFER);
        this.c = eanmVar.e;
        this.d = 0;
        this.e = 0;
    }

    public static final void c(String str) {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public final boolean a(int i) {
        if ((65280 & i) == 0) {
            this.f = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f = false;
        }
        this.g = 2;
        return true;
    }

    public final boolean b(int i) {
        int read;
        int i2 = this.e - this.d;
        while (i2 < i) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this.c;
                int i3 = this.e;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read <= 0) {
                return false;
            }
            this.e += read;
            i2 += read;
        }
        return true;
    }
}
