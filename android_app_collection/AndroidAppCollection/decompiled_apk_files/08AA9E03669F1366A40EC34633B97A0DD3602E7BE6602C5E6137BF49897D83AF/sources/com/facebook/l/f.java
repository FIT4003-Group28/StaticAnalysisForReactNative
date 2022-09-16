package com.facebook.l;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
/* compiled from: MinElf.java */
/* loaded from: classes.dex */
public final class f {
    public static String[] a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] a(FileChannel fileChannel) {
        long j;
        boolean z;
        long b2;
        long j2;
        long j3;
        long b3;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (c(fileChannel, allocate, 0L) != 1179403647) {
            throw new a("file is not ELF");
        }
        boolean z2 = true;
        if (e(fileChannel, allocate, 4L) != 1) {
            z2 = false;
        }
        if (e(fileChannel, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        long c2 = z2 ? c(fileChannel, allocate, 28L) : b(fileChannel, allocate, 32L);
        long d2 = z2 ? d(fileChannel, allocate, 44L) : d(fileChannel, allocate, 56L);
        int d3 = d(fileChannel, allocate, z2 ? 42L : 54L);
        if (d2 == 65535) {
            long c3 = z2 ? c(fileChannel, allocate, 32L) : b(fileChannel, allocate, 40L);
            d2 = c(fileChannel, allocate, z2 ? c3 + 28 : c3 + 44);
        }
        long j4 = c2;
        long j5 = 0;
        while (true) {
            if (j5 >= d2) {
                j = 0;
                break;
            }
            if (c(fileChannel, allocate, j4 + (z2 ? 0L : 0L)) == 2) {
                j = z2 ? c(fileChannel, allocate, j4 + 4) : b(fileChannel, allocate, j4 + 8);
            } else {
                j4 += d3;
                j5++;
            }
        }
        long j6 = 0;
        if (j == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j7 = j;
        long j8 = 0;
        int i = 0;
        while (true) {
            if (z2) {
                z = z2;
                b2 = c(fileChannel, allocate, j7 + j6);
            } else {
                z = z2;
                b2 = b(fileChannel, allocate, j7 + j6);
            }
            long j9 = j;
            if (b2 == 1) {
                if (i == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i++;
            } else if (b2 == 5) {
                j8 = z ? c(fileChannel, allocate, j7 + 4) : b(fileChannel, allocate, j7 + 8);
            }
            long j10 = 16;
            j7 += z ? 8L : 16L;
            j6 = 0;
            if (b2 != 0) {
                z2 = z;
                j = j9;
            } else if (j8 == 0) {
                throw new a("Dynamic section string-table not found");
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= d2) {
                        j2 = 0;
                        break;
                    }
                    if (!z) {
                    }
                    if (c(fileChannel, allocate, c2 + j6) == 1) {
                        long c4 = z ? c(fileChannel, allocate, c2 + 8) : b(fileChannel, allocate, c2 + j10);
                        if (z) {
                            j3 = d2;
                            b3 = c(fileChannel, allocate, c2 + 20);
                        } else {
                            j3 = d2;
                            b3 = b(fileChannel, allocate, c2 + 40);
                        }
                        if (c4 <= j8 && j8 < b3 + c4) {
                            j2 = (z ? c(fileChannel, allocate, c2 + 4) : b(fileChannel, allocate, c2 + 8)) + (j8 - c4);
                        }
                    } else {
                        j3 = d2;
                    }
                    c2 += d3;
                    i2++;
                    d2 = j3;
                    j10 = 16;
                    j6 = 0;
                }
                long j11 = 0;
                if (j2 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i];
                int i3 = 0;
                while (true) {
                    long c5 = z ? c(fileChannel, allocate, j9 + j11) : b(fileChannel, allocate, j9 + j11);
                    if (c5 == 1) {
                        strArr[i3] = a(fileChannel, allocate, (z ? c(fileChannel, allocate, j9 + 4) : b(fileChannel, allocate, j9 + 8)) + j2);
                        if (i3 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i3++;
                    }
                    j9 += z ? 8L : 16L;
                    if (c5 == 0) {
                        if (i3 == strArr.length) {
                            return strArr;
                        }
                        throw new a("malformed DT_NEEDED section");
                    }
                    j11 = 0;
                }
            }
        }
    }

    private static String a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = e(fileChannel, byteBuffer, j);
            if (e != 0) {
                sb.append((char) e);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    private static void a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += read;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    private static long b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static long c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static int d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    private static short e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MinElf.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }
}
