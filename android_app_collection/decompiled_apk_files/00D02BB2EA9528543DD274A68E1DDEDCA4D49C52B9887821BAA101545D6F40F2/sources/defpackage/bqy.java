package defpackage;

import android.util.Pair;
import com.google.android.filament.R;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bqy  reason: default package */
/* loaded from: classes4.dex */
public final class bqy {
    public static X509Certificate[][] a(String str) {
        Pair<ByteBuffer, Long> a;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i = 0;
            if (randomAccessFile.length() < 22) {
                a = null;
            } else {
                a = bqz.a(randomAccessFile, 0);
                if (a == null) {
                    a = bqz.a(randomAccessFile, 65535);
                }
            }
            if (a != null) {
                ByteBuffer byteBuffer = (ByteBuffer) a.first;
                long longValue = ((Long) a.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new bqv("ZIP64 APK not supported");
                    }
                }
                bqz.b(byteBuffer);
                long c = bqz.c(byteBuffer, byteBuffer.position() + 16);
                if (c < longValue) {
                    bqz.b(byteBuffer);
                    if (bqz.c(byteBuffer, byteBuffer.position() + 12) + c != longValue) {
                        throw new bqv("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    if (c >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(c - allocate.capacity());
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i2 = 8;
                        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                            throw new bqv("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = allocate.getLong(0);
                        if (j2 < allocate.capacity() || j2 > 2147483639) {
                            StringBuilder sb = new StringBuilder(57);
                            sb.append("APK Signing Block size out of range: ");
                            sb.append(j2);
                            throw new bqv(sb.toString());
                        }
                        int i3 = (int) (8 + j2);
                        long j3 = c - i3;
                        if (j3 < 0) {
                            StringBuilder sb2 = new StringBuilder(59);
                            sb2.append("APK Signing Block offset out of range: ");
                            sb2.append(j3);
                            throw new bqv(sb2.toString());
                        }
                        ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j4 = allocate2.getLong(0);
                        if (j4 != j2) {
                            StringBuilder sb3 = new StringBuilder((int) R.styleable.AppCompatTheme_textAppearanceListItem);
                            sb3.append("APK Signing Block sizes in header and footer do not match: ");
                            sb3.append(j4);
                            sb3.append(" vs ");
                            sb3.append(j2);
                            throw new bqv(sb3.toString());
                        }
                        Pair create = Pair.create(allocate2, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                        long longValue2 = ((Long) create.second).longValue();
                        if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                            int capacity = byteBuffer2.capacity() - 24;
                            if (capacity < 8) {
                                StringBuilder sb4 = new StringBuilder(38);
                                sb4.append("end < start: ");
                                sb4.append(capacity);
                                sb4.append(" < ");
                                sb4.append(8);
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            int capacity2 = byteBuffer2.capacity();
                            if (capacity > byteBuffer2.capacity()) {
                                StringBuilder sb5 = new StringBuilder(41);
                                sb5.append("end > capacity: ");
                                sb5.append(capacity);
                                sb5.append(" > ");
                                sb5.append(capacity2);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                            int limit = byteBuffer2.limit();
                            int position = byteBuffer2.position();
                            byteBuffer2.position(0);
                            byteBuffer2.limit(capacity);
                            byteBuffer2.position(8);
                            ByteBuffer slice = byteBuffer2.slice();
                            slice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(limit);
                            byteBuffer2.position(position);
                            while (slice.hasRemaining()) {
                                i++;
                                if (slice.remaining() >= i2) {
                                    long j5 = slice.getLong();
                                    if (j5 >= 4 && j5 <= 2147483647L) {
                                        int i4 = (int) j5;
                                        int position2 = slice.position() + i4;
                                        if (i4 <= slice.remaining()) {
                                            if (slice.getInt() != 1896449818) {
                                                slice.position(position2);
                                                i2 = 8;
                                            } else {
                                                X509Certificate[][] b = b(randomAccessFile.getChannel(), new bqu(i(slice, i4 - 4), longValue2, c, longValue, byteBuffer));
                                                randomAccessFile.close();
                                                try {
                                                    randomAccessFile.close();
                                                } catch (IOException unused) {
                                                }
                                                return b;
                                            }
                                        } else {
                                            int remaining = slice.remaining();
                                            StringBuilder sb6 = new StringBuilder(91);
                                            sb6.append("APK Signing Block entry #");
                                            sb6.append(i);
                                            sb6.append(" size out of range: ");
                                            sb6.append(i4);
                                            sb6.append(", available: ");
                                            sb6.append(remaining);
                                            throw new bqv(sb6.toString());
                                        }
                                    } else {
                                        StringBuilder sb7 = new StringBuilder(76);
                                        sb7.append("APK Signing Block entry #");
                                        sb7.append(i);
                                        sb7.append(" size out of range: ");
                                        sb7.append(j5);
                                        throw new bqv(sb7.toString());
                                    }
                                } else {
                                    StringBuilder sb8 = new StringBuilder(70);
                                    sb8.append("Insufficient data to read size of APK Signing Block entry #");
                                    sb8.append(i);
                                    throw new bqv(sb8.toString());
                                }
                            }
                            throw new bqv("No APK Signature Scheme v2 block in APK Signing Block");
                        }
                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                    }
                    StringBuilder sb9 = new StringBuilder(87);
                    sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb9.append(c);
                    throw new bqv(sb9.toString());
                }
                StringBuilder sb10 = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedWidthMajor);
                sb10.append("ZIP Central Directory offset out of range: ");
                sb10.append(c);
                sb10.append(". ZIP End of Central Directory offset: ");
                sb10.append(longValue);
                throw new bqv(sb10.toString());
            }
            long length = randomAccessFile.length();
            StringBuilder sb11 = new StringBuilder(102);
            sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb11.append(length);
            sb11.append(" bytes");
            throw new bqv(sb11.toString());
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static X509Certificate[][] b(FileChannel fileChannel, bqu bquVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer j = j(bquVar.a);
                int i = 0;
                while (j.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(c(j(j), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    d(hashMap, fileChannel, bquVar.b, bquVar.c, bquVar.d, bquVar.e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = f(r5);
        r12 = f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] c(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqy.c(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static void d(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        bqt bqtVar = new bqt(fileChannel, 0L, j);
        bqt bqtVar2 = new bqt(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        bqz.b(duplicate);
        int position = duplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        duplicate.putInt(duplicate.position() + position, (int) j);
        bqr bqrVar = new bqr(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] e = e(iArr, new bqs[]{bqtVar, bqtVar2, bqrVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i3)), e[i2])) {
                    throw new SecurityException(g(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    private static byte[][] e(int[] iArr, bqs[] bqsVarArr) {
        long j;
        int i;
        int length;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (bqsVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr.length];
            int i4 = 0;
            while (true) {
                length = iArr.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[(h(iArr[i4]) * i3) + 5];
                bArr2[0] = 90;
                l(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String g = g(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(g);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(g.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                bqs bqsVar = bqsVarArr[i6];
                long j4 = j2;
                int i9 = i6;
                long a = bqsVar.a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    l(min, bArr3);
                    for (int i10 = 0; i10 < length; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        bqsVar.b(messageDigestArr, j5, min);
                        int i11 = 0;
                        while (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            bqs bqsVar2 = bqsVar;
                            byte[] bArr4 = bArr[i11];
                            int h = h(i12);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i11];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i7 * h) + 5, h);
                            if (digest != h) {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                            i11++;
                            bqsVar = bqsVar2;
                            bArr3 = bArr5;
                            messageDigestArr = messageDigestArr2;
                        }
                        bqs bqsVar3 = bqsVar;
                        long j6 = min;
                        long j7 = j5 + j6;
                        a -= j6;
                        i7++;
                        j2 = 0;
                        j = 1048576;
                        bqsVar = bqsVar3;
                        j4 = j7;
                        bArr3 = bArr3;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i8);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                i8++;
                i6 = i9 + 1;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                byte[] bArr7 = bArr[i13];
                String g2 = g(i14);
                try {
                    bArr6[i13] = MessageDigest.getInstance(g2).digest(bArr7);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(g2.concat(" digest not supported"), e3);
                }
            }
            return bArr6;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    private static int f(int i) {
        if (i != 513) {
            if (i == 514) {
                return 2;
            }
            if (i == 769) {
                return 1;
            }
            switch (i) {
                case 257:
                case 259:
                    return 1;
                case 258:
                case 260:
                    return 2;
                default:
                    String valueOf = String.valueOf(Long.toHexString(i));
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
            }
        }
        return 1;
    }

    private static String g(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return "SHA-256";
    }

    private static int h(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 32;
    }

    private static ByteBuffer j(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder((int) R.styleable.AppCompatTheme_switchStyle);
            sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
            sb2.append(i);
            sb2.append(", remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
        return i(byteBuffer, i);
    }

    private static byte[] k(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    private static void l(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static ByteBuffer i(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }
}
