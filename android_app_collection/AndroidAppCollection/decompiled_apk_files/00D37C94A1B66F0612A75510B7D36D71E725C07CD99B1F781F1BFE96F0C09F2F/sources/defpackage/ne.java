package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.widget.PopupWindow;
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
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ne  reason: default package */
/* loaded from: classes3.dex */
public class ne {
    private static int a(int i) {
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

    private static int b(int i) {
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

    private static String c(int i) {
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

    private static ByteBuffer e(ByteBuffer byteBuffer) {
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
            StringBuilder sb2 = new StringBuilder(101);
            sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
            sb2.append(i);
            sb2.append(", remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
        return d(byteBuffer, i);
    }

    private static void f(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        cek cekVar = new cek(fileChannel, 0L, j);
        cek cekVar2 = new cek(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        m(duplicate);
        int position = duplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        duplicate.putInt(duplicate.position() + position, (int) j);
        cei ceiVar = new cei(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] q = q(iArr, new cej[]{cekVar, cekVar2, ceiVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), q[i2])) {
                    throw new SecurityException(c(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    public static Pair l(RandomAccessFile randomAccessFile, int i) {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    public static void m(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    private static byte[] o(ByteBuffer byteBuffer) {
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

    public static void oC(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void oD(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static long oE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    public static X509Certificate[][] oF(String str) {
        Pair l;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i = 0;
            if (randomAccessFile.length() < 22) {
                l = null;
            } else {
                l = l(randomAccessFile, 0);
                if (l == null) {
                    l = l(randomAccessFile, 65535);
                }
            }
            if (l != null) {
                ByteBuffer byteBuffer = (ByteBuffer) l.first;
                long longValue = ((Long) l.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new cem("ZIP64 APK not supported");
                    }
                }
                m(byteBuffer);
                long oE = oE(byteBuffer, byteBuffer.position() + 16);
                if (oE < longValue) {
                    m(byteBuffer);
                    if (oE(byteBuffer, byteBuffer.position() + 12) + oE != longValue) {
                        throw new cem("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    if (oE >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(oE - allocate.capacity());
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i2 = 8;
                        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                            throw new cem("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = allocate.getLong(0);
                        if (j2 < allocate.capacity() || j2 > 2147483639) {
                            StringBuilder sb = new StringBuilder(57);
                            sb.append("APK Signing Block size out of range: ");
                            sb.append(j2);
                            throw new cem(sb.toString());
                        }
                        int i3 = (int) (8 + j2);
                        long j3 = oE - i3;
                        if (j3 < 0) {
                            StringBuilder sb2 = new StringBuilder(59);
                            sb2.append("APK Signing Block offset out of range: ");
                            sb2.append(j3);
                            throw new cem(sb2.toString());
                        }
                        ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j4 = allocate2.getLong(0);
                        if (j4 != j2) {
                            StringBuilder sb3 = new StringBuilder(103);
                            sb3.append("APK Signing Block sizes in header and footer do not match: ");
                            sb3.append(j4);
                            sb3.append(" vs ");
                            sb3.append(j2);
                            throw new cem(sb3.toString());
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
                                                X509Certificate[][] r = r(randomAccessFile.getChannel(), new cel(d(slice, i4 - 4), longValue2, oE, longValue, byteBuffer));
                                                randomAccessFile.close();
                                                try {
                                                    randomAccessFile.close();
                                                } catch (IOException unused) {
                                                }
                                                return r;
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
                                            throw new cem(sb6.toString());
                                        }
                                    } else {
                                        StringBuilder sb7 = new StringBuilder(76);
                                        sb7.append("APK Signing Block entry #");
                                        sb7.append(i);
                                        sb7.append(" size out of range: ");
                                        sb7.append(j5);
                                        throw new cem(sb7.toString());
                                    }
                                } else {
                                    StringBuilder sb8 = new StringBuilder(70);
                                    sb8.append("Insufficient data to read size of APK Signing Block entry #");
                                    sb8.append(i);
                                    throw new cem(sb8.toString());
                                }
                            }
                            throw new cem("No APK Signature Scheme v2 block in APK Signing Block");
                        }
                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                    }
                    StringBuilder sb9 = new StringBuilder(87);
                    sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb9.append(oE);
                    throw new cem(sb9.toString());
                }
                StringBuilder sb10 = new StringBuilder(122);
                sb10.append("ZIP Central Directory offset out of range: ");
                sb10.append(oE);
                sb10.append(". ZIP End of Central Directory offset: ");
                sb10.append(longValue);
                throw new cem(sb10.toString());
            }
            long length = randomAccessFile.length();
            StringBuilder sb11 = new StringBuilder(102);
            sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb11.append(length);
            sb11.append(" bytes");
            throw new cem(sb11.toString());
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = b(r5);
        r12 = b(r7);
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
    private static java.security.cert.X509Certificate[] p(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.p(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] q(int[] iArr, cej[] cejVarArr) {
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
            j3 += (cejVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(a(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            s(i3, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String c = c(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(c);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(c.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            cej cejVar = cejVarArr[i6];
            long j4 = j2;
            int i9 = i6;
            long a = cejVar.a();
            while (a > j2) {
                int min = (int) Math.min(a, j);
                s(min, bArr3);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    cejVar.b(messageDigestArr, j5, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        cej cejVar2 = cejVar;
                        byte[] bArr4 = bArr[i11];
                        int a2 = a(i12);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr4, (i7 * a2) + 5, a2);
                        if (digest != a2) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        cejVar = cejVar2;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    cej cejVar3 = cejVar;
                    long j6 = min;
                    long j7 = j5 + j6;
                    a -= j6;
                    i7++;
                    j2 = 0;
                    j = 1048576;
                    cejVar = cejVar3;
                    j4 = j7;
                    bArr3 = bArr3;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i7);
                    sb3.append(" of section #");
                    sb3.append(i8);
                    throw new DigestException(sb3.toString(), e2);
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
            String c2 = c(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(c2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(c2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] r(FileChannel fileChannel, cel celVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer e = e(celVar.a);
                int i = 0;
                while (e.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(p(e(e), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    f(hashMap, fileChannel, celVar.b, celVar.c, celVar.d, celVar.e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    private static void s(int i, byte[] bArr) {
        bArr[1] = (byte) (i & PrivateKeyType.INVALID);
        bArr[2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[3] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        bArr[4] = (byte) (i >> 24);
    }

    public void i(RecyclerView recyclerView, int i) {
    }

    public void j(RecyclerView recyclerView, int i, int i2) {
    }

    private static ByteBuffer d(ByteBuffer byteBuffer, int i) {
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
