package defpackage;

import java.io.File;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ckrx  reason: default package */
/* loaded from: classes4.dex */
public final class ckrx {
    private final File a;
    private final long d;
    private final long e;
    private final int f;
    private final int g;
    private final bvrb j;
    private final cqat k;
    private final btvo l;
    private final Map<String, Integer> b = new HashMap();
    private final Map<String, Long> c = new HashMap();
    private int h = -1;
    private long i = -1;

    public ckrx(bvrb bvrbVar, cqat cqatVar, btvo btvoVar, String str, long j, int i) {
        this.j = bvrbVar;
        this.k = cqatVar;
        this.l = btvoVar;
        this.a = new File(str);
        this.d = j;
        this.e = j >> 1;
        this.f = i;
        this.g = i >> 1;
    }

    @dzsi
    private final String h(@dzsi String str) {
        if (str == null || !this.a.exists()) {
            return null;
        }
        String absolutePath = this.a.getAbsolutePath();
        String str2 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + String.valueOf(str2).length() + str.length());
        sb.append(absolutePath);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    private static String i(@dzsi String str, long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append(str);
        sb.append("_");
        sb.append(j);
        return sb.toString();
    }

    @dzsi
    private static Map.Entry<String, Long> j(String str) {
        String[] split = str.split("_");
        if (split.length != 2) {
            return null;
        }
        try {
            return new AbstractMap.SimpleImmutableEntry(split[0], Long.valueOf(Long.parseLong(split[1])));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final long k() {
        return this.k.b();
    }

    private final void l(int i, long j) {
        this.h += i;
        this.i += j;
    }

    final synchronized void b(@dzsi String str) {
        Integer num = this.b.get(str);
        this.b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    final synchronized void c(@dzsi String str) {
        Integer num = this.b.get(str);
        if (num == null) {
            this.b.remove(str);
        } else if (num.intValue() == 1) {
            this.b.remove(str);
        } else if (num.intValue() <= 1) {
        } else {
            this.b.put(str, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final synchronized boolean d(@dzsi String str) {
        String a = a(str);
        if (a == null) {
            return false;
        }
        b(a);
        File file = new File(a);
        if (file.exists() && file.length() != 0) {
            Long l = this.c.get(str);
            if (l != null) {
                if (l.longValue() < this.k.b() - TimeUnit.DAYS.toMillis(this.l.getTextToSpeechParameters().e)) {
                    c(a);
                    return false;
                }
            }
            file.setLastModified(k());
            c(a);
            return true;
        }
        c(a);
        return false;
    }

    public final synchronized boolean e(File file, String str) {
        f();
        long k = k();
        String h = h(i(str, k));
        if (h == null) {
            return false;
        }
        b(h);
        String a = a(str);
        if (this.c.get(str) != null && a != null) {
            File file2 = new File(a);
            l(-1, -file2.length());
            file2.delete();
        }
        File file3 = new File(h);
        if (!file.renameTo(file3)) {
            file.getAbsolutePath();
            c(h);
            return false;
        }
        this.c.put(str, Long.valueOf(k));
        file3.setLastModified(k);
        l(1, file3.length());
        this.j.b(new ckrv(this), bvrj.BACKGROUND_THREADPOOL);
        c(h);
        return true;
    }

    public final synchronized void f() {
        if (this.h < 0 || this.i < 0) {
            this.h = 0;
            this.i = 0L;
            File[] listFiles = this.a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isFile()) {
                        l(1, file.length());
                        Map.Entry<String, Long> j = j(file.getName());
                        if (j != null) {
                            this.c.put(j.getKey(), j.getValue());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void g() {
        if (this.i > this.d || this.h > this.f) {
            long j = this.e;
            int i = this.g;
            File[] listFiles = this.a.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                ckrw[] ckrwVarArr = new ckrw[length];
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    ckrwVarArr[i2] = new ckrw(listFiles[i2]);
                }
                Arrays.sort(ckrwVarArr);
                long e = this.k.e();
                for (int i3 = 0; i3 < length; i3++) {
                    File file = ckrwVarArr[i3].a;
                    if (file.isFile()) {
                        if (!this.b.containsKey(file.getAbsolutePath())) {
                            long length2 = file.length();
                            if (!file.delete()) {
                                file.getName();
                            } else {
                                l(-1, -length2);
                                Map.Entry<String, Long> j2 = j(file.getName());
                                String key = j2 == null ? null : j2.getKey();
                                if (key != null) {
                                    this.c.remove(key);
                                }
                                file.getName();
                            }
                            if (this.i <= j) {
                                if (this.h <= i) {
                                    break;
                                }
                            }
                            if (this.k.e() - e > 1000 && this.i <= this.d && this.h <= this.f) {
                                break;
                            }
                        } else {
                            file.getAbsolutePath();
                            this.b.get(file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }

    @dzsi
    public final synchronized String a(@dzsi String str) {
        String str2;
        str2 = null;
        if (str != null) {
            Long l = this.c.get(str);
            if (l != null) {
                str2 = i(str, l.longValue());
            }
        }
        return h(str2);
    }
}
