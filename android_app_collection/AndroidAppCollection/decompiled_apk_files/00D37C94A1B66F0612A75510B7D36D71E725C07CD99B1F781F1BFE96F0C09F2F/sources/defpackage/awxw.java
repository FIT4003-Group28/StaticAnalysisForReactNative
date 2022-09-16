package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: awxw  reason: default package */
/* loaded from: classes2.dex */
public final class awxw {
    public final String a;
    public int b;
    public final axgz c;

    static {
        " ".codePointAt(0);
    }

    public awxw(String str, int i) {
        byte[] bArr = new byte[2];
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            randomAccessFile.readFully(bArr);
            this.c = new axgz(bArr);
            randomAccessFile.close();
            this.a = str;
            this.b = i;
        } catch (IOException | IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            throw new IOException(valueOf.length() != 0 ? "Wrong index file: ".concat(valueOf) : new String("Wrong index file: "), e);
        }
    }

    public static final String b(RandomAccessFile randomAccessFile) {
        int readByte = randomAccessFile.readByte() & 255;
        if (readByte == 0) {
            return null;
        }
        byte[] bArr = new byte[readByte];
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static final int c(int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= (bArr[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public final void a(ArrayList arrayList, awxv awxvVar) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (((awxv) arrayList.get(size)).c >= awxvVar.c) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, awxvVar);
        if (arrayList.size() > this.b) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
