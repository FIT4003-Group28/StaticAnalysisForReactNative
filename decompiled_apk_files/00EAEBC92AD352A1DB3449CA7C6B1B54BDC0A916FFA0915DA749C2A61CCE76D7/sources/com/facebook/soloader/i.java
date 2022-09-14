package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        

        /* renamed from: b  reason: collision with root package name */
        private final String f6483b;

        b(String str) {
            this.f6483b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6483b;
        }
    }

    private static long a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static void a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a("ELF file truncated");
    }

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
        long j2;
        long j3;
        long j4;
        long a2;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (d(fileChannel, allocate, 0L) == 1179403647) {
            boolean z = true;
            if (e(fileChannel, allocate, 4L) != 1) {
                z = false;
            }
            if (e(fileChannel, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long d2 = z ? d(fileChannel, allocate, 28L) : a(fileChannel, allocate, 32L);
            long c2 = z ? c(fileChannel, allocate, 44L) : c(fileChannel, allocate, 56L);
            int c3 = c(fileChannel, allocate, z ? 42L : 54L);
            if (c2 == 65535) {
                long d3 = z ? d(fileChannel, allocate, 32L) : a(fileChannel, allocate, 40L);
                c2 = d(fileChannel, allocate, z ? d3 + 28 : d3 + 44);
            }
            long j5 = d2;
            long j6 = 0;
            while (true) {
                if (j6 >= c2) {
                    j = 0;
                    break;
                } else if (d(fileChannel, allocate, j5 + 0) == 2) {
                    j = z ? d(fileChannel, allocate, j5 + 4) : a(fileChannel, allocate, j5 + 8);
                } else {
                    j5 += c3;
                    j6++;
                }
            }
            long j7 = 0;
            if (j == 0) {
                throw new a("ELF file does not contain dynamic linking information");
            }
            long j8 = j;
            long j9 = 0;
            int i = 0;
            while (true) {
                boolean z2 = z;
                long d4 = z ? d(fileChannel, allocate, j8 + j7) : a(fileChannel, allocate, j8 + j7);
                if (d4 == 1) {
                    j2 = j;
                    if (i == Integer.MAX_VALUE) {
                        throw new a("malformed DT_NEEDED section");
                    }
                    i++;
                } else {
                    j2 = j;
                    if (d4 == 5) {
                        j9 = z2 ? d(fileChannel, allocate, j8 + 4) : a(fileChannel, allocate, j8 + 8);
                    }
                }
                long j10 = 16;
                j8 += z2 ? 8L : 16L;
                j7 = 0;
                if (d4 != 0) {
                    z = z2;
                    j = j2;
                } else if (j9 == 0) {
                    throw new a("Dynamic section string-table not found");
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c2) {
                            j3 = 0;
                            break;
                        }
                        if (d(fileChannel, allocate, d2 + j7) == 1) {
                            long d5 = z2 ? d(fileChannel, allocate, d2 + 8) : a(fileChannel, allocate, d2 + j10);
                            if (z2) {
                                j4 = c2;
                                a2 = d(fileChannel, allocate, d2 + 20);
                            } else {
                                j4 = c2;
                                a2 = a(fileChannel, allocate, d2 + 40);
                            }
                            if (d5 <= j9 && j9 < a2 + d5) {
                                j3 = (z2 ? d(fileChannel, allocate, d2 + 4) : a(fileChannel, allocate, d2 + 8)) + (j9 - d5);
                            }
                        } else {
                            j4 = c2;
                        }
                        d2 += c3;
                        i2++;
                        c2 = j4;
                        j10 = 16;
                        j7 = 0;
                    }
                    long j11 = 0;
                    if (j3 == 0) {
                        throw new a("did not find file offset of DT_STRTAB table");
                    }
                    String[] strArr = new String[i];
                    int i3 = 0;
                    while (true) {
                        long j12 = j2 + j11;
                        long d6 = z2 ? d(fileChannel, allocate, j12) : a(fileChannel, allocate, j12);
                        if (d6 == 1) {
                            strArr[i3] = b(fileChannel, allocate, (z2 ? d(fileChannel, allocate, j2 + 4) : a(fileChannel, allocate, j2 + 8)) + j3);
                            if (i3 == Integer.MAX_VALUE) {
                                throw new a("malformed DT_NEEDED section");
                            }
                            i3++;
                        }
                        j2 += z2 ? 8L : 16L;
                        if (d6 == 0) {
                            if (i3 != strArr.length) {
                                throw new a("malformed DT_NEEDED section");
                            }
                            return strArr;
                        }
                        j11 = 0;
                    }
                }
            }
        } else {
            throw new a("file is not ELF");
        }
    }

    private static String b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e2 = e(fileChannel, byteBuffer, j);
            if (e2 != 0) {
                sb.append((char) e2);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    private static int c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    private static long d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }
}
