package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: yuk  reason: default package */
/* loaded from: classes4.dex */
public final class yuk implements ces {
    private ykm a;
    private final File b;
    private final int c;

    public yuk(File file, int i) {
        this.b = new File(String.valueOf(file.getAbsolutePath()).concat("/volleyCache"));
        this.c = i;
    }

    static int g(InputStream inputStream) {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    static long h(InputStream inputStream) {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((255 & m(inputStream)) << 56);
    }

    static String i(InputStream inputStream) {
        return new String(n(inputStream, (int) h(inputStream)), "UTF-8");
    }

    static void j(OutputStream outputStream, int i) {
        outputStream.write(i & PrivateKeyType.INVALID);
        outputStream.write((i >> 8) & PrivateKeyType.INVALID);
        outputStream.write((i >> 16) & PrivateKeyType.INVALID);
        outputStream.write((i >> 24) & PrivateKeyType.INVALID);
    }

    static void k(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        k(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    private static int m(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static byte[] n(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected ");
        sb.append(i);
        sb.append(" bytes, read ");
        sb.append(i2);
        sb.append(" bytes");
        throw new IOException(sb.toString());
    }

    private static final String o(String str) {
        return String.valueOf(str.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    @Override // defpackage.ces
    public final synchronized cer a(String str) {
        InputStream inputStream;
        ykm ykmVar = this.a;
        ?? r1 = 0;
        try {
            if (ykmVar == null) {
                return null;
            }
            try {
                ykl a = this.a.a(o(str));
                if (a != null) {
                    inputStream = a.a[0];
                    try {
                        yuj yujVar = new yuj();
                        if (g(inputStream) != 538181937) {
                            throw new IOException();
                        }
                        yujVar.a = g(inputStream);
                        yujVar.b = i(inputStream);
                        yujVar.c = i(inputStream);
                        if (yujVar.c.equals("")) {
                            yujVar.c = null;
                        }
                        yujVar.d = h(inputStream);
                        yujVar.e = h(inputStream);
                        yujVar.f = h(inputStream);
                        yujVar.g = h(inputStream);
                        int g = g(inputStream);
                        Map emptyMap = g == 0 ? Collections.emptyMap() : new afw(g);
                        for (int i = 0; i < g; i++) {
                            emptyMap.put(i(inputStream).intern(), i(inputStream).intern());
                        }
                        yujVar.h = emptyMap;
                        if (!yujVar.b.equals(str)) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    zep.d("VolleyDiskCache.get", e);
                                }
                            }
                            return null;
                        }
                        byte[] n = n(inputStream, yujVar.a);
                        cer cerVar = new cer();
                        cerVar.a = n;
                        cerVar.b = yujVar.c;
                        cerVar.d = yujVar.d;
                        cerVar.c = yujVar.e;
                        cerVar.e = yujVar.f;
                        cerVar.f = yujVar.g;
                        cerVar.g = yujVar.h;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                zep.d("VolleyDiskCache.get", e2);
                            }
                        }
                        return cerVar;
                    } catch (IOException e3) {
                        e = e3;
                        zep.d("VolleyDiskCache.get", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                zep.d("VolleyDiskCache.get", e4);
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e6) {
                        zep.d("VolleyDiskCache.get", e6);
                    }
                }
                throw th;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = ykmVar;
        }
    }

    @Override // defpackage.ces
    public final synchronized void b() {
        ykm ykmVar = this.a;
        if (ykmVar != null) {
            try {
                ykmVar.e();
                this.a = null;
            } catch (IOException e) {
                zep.d("VolleyDiskCache.clear", e);
                this.a = null;
            }
        }
    }

    @Override // defpackage.ces
    public final synchronized void d(String str, cer cerVar) {
        yki ykiVar;
        if (this.a != null) {
            yki ykiVar2 = null;
            try {
                try {
                    ykj k = this.a.k(o(str));
                    if (k == null) {
                        zep.b("VolleyDiskCache.put failed -- could not edit cache file");
                        return;
                    }
                    synchronized (k.c) {
                        ykk ykkVar = k.a;
                        if (ykkVar.d != k) {
                            throw new IllegalStateException();
                        }
                        ykiVar = new yki(k, new FileOutputStream(ykkVar.d()));
                    }
                    try {
                        try {
                            cerVar.g.put("VolleyDiskCache", "VolleyDiskCache");
                            yuj yujVar = new yuj(str, cerVar);
                            try {
                                j(ykiVar, 538181937);
                                j(ykiVar, yujVar.a);
                                l(ykiVar, yujVar.b);
                                String str2 = yujVar.c;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                l(ykiVar, str2);
                                k(ykiVar, yujVar.d);
                                k(ykiVar, yujVar.e);
                                k(ykiVar, yujVar.f);
                                k(ykiVar, yujVar.g);
                                Map map = yujVar.h;
                                if (map != null) {
                                    j(ykiVar, map.size());
                                    for (Map.Entry entry : map.entrySet()) {
                                        l(ykiVar, (String) entry.getKey());
                                        l(ykiVar, (String) entry.getValue());
                                    }
                                } else {
                                    j(ykiVar, 0);
                                }
                                ykiVar.flush();
                            } catch (IOException unused) {
                            }
                            ykiVar.write(cerVar.a);
                            if (k.b) {
                                k.c.d(k, false);
                                k.c.m(k.a.a);
                            } else {
                                k.c.d(k, true);
                            }
                            try {
                                ykiVar.close();
                            } catch (IOException e) {
                                zep.d("VolleyDiskCache.put", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            ykiVar2 = ykiVar;
                            if (ykiVar2 != null) {
                                try {
                                    ykiVar2.close();
                                } catch (IOException e2) {
                                    zep.d("VolleyDiskCache.put", e2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        ykiVar2 = ykiVar;
                        zep.d("VolleyDiskCache.put", e);
                        if (ykiVar2 == null) {
                            return;
                        }
                        try {
                            ykiVar2.close();
                        } catch (IOException e4) {
                            zep.d("VolleyDiskCache.put", e4);
                        }
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.ces
    public final synchronized void e(String str) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.m(o(str));
        } catch (IOException e) {
            zep.d("VolleyDiskCache.remove", e);
        }
    }

    @Override // defpackage.ces
    public final synchronized void f(String str) {
        cer a = a(str);
        if (a != null) {
            a.f = 0L;
            a.e = 0L;
            d(str, a);
        }
    }

    @Override // defpackage.ces
    public final synchronized void c() {
        if (this.a != null) {
            return;
        }
        try {
            this.a = ykm.l(this.b, this.c);
        } catch (IOException e) {
            throw new RuntimeException("Couldn't initialize volley disk cache", e);
        }
    }
}
