package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class f {
    public static int a(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((char) b2);
        }
        return sb.toString();
    }

    private static boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    private static byte b(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    private static int c(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    private static short d(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    public static Pair<Integer, Integer> e(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            if (!a(bArr, "RIFF")) {
                return null;
            }
            c(inputStream);
            inputStream.read(bArr);
            if (!a(bArr, "WEBP")) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return null;
            }
            inputStream.read(bArr);
            String a2 = a(bArr);
            if ("VP8 ".equals(a2)) {
                Pair<Integer, Integer> f2 = f(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return f2;
            } else if ("VP8L".equals(a2)) {
                Pair<Integer, Integer> g2 = g(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return g2;
            } else if (!"VP8X".equals(a2)) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return null;
            } else {
                Pair<Integer, Integer> h2 = h(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                return h2;
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    private static Pair<Integer, Integer> f(InputStream inputStream) {
        inputStream.skip(7L);
        short d2 = d(inputStream);
        short d3 = d(inputStream);
        short d4 = d(inputStream);
        if (d2 == 157 && d3 == 1 && d4 == 42) {
            return new Pair<>(Integer.valueOf(a(inputStream)), Integer.valueOf(a(inputStream)));
        }
        return null;
    }

    private static Pair<Integer, Integer> g(InputStream inputStream) {
        c(inputStream);
        if (b(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    private static Pair<Integer, Integer> h(InputStream inputStream) {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(i(inputStream) + 1), Integer.valueOf(i(inputStream) + 1));
    }

    private static int i(InputStream inputStream) {
        byte b2 = b(inputStream);
        return ((b(inputStream) << 16) & 16711680) | ((b(inputStream) << 8) & 65280) | (b2 & 255);
    }
}
