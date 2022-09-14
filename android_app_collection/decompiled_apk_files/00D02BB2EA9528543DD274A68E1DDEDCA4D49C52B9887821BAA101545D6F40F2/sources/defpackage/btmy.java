package defpackage;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: btmy  reason: default package */
/* loaded from: classes4.dex */
public final class btmy {
    private static final Pattern a = Pattern.compile("\\s+");
    private final Context b;
    private final File d;
    private final cqat e;
    @dzsi
    private Map<String, Long> f;
    private final Object c = new Object();
    private int g = 0;

    public btmy(Context context, File file, cqat cqatVar) {
        dbsk.s(context);
        this.b = context.getApplicationContext();
        this.d = file;
        dbsk.s(cqatVar);
        this.e = cqatVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r6.length() == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        r2 = "Unexpected line format: ".concat(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
        r2 = new java.lang.String("Unexpected line format: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
        throw new defpackage.btmx(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
        r0 = android.util.Pair.create(r2, java.lang.Integer.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Long> h() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btmy.h():java.util.Map");
    }

    private final void i(Iterable<Pair<String, Long>> iterable) {
        boolean z;
        FileWriter fileWriter;
        for (Pair<String, Long> pair : iterable) {
            dbsk.a(true ^ dbsj.d((String) pair.first));
            dbsk.s((Long) pair.second);
        }
        Map<String, Long> h = h();
        for (Pair<String, Long> pair2 : iterable) {
            String str = (String) pair2.first;
            long longValue = ((Long) pair2.second).longValue();
            if (longValue != -1 || h.containsKey(str)) {
                Locale locale = Locale.US;
                Long valueOf = Long.valueOf(longValue);
                String format = String.format(locale, "%s %d", str, valueOf);
                File file = this.d;
                synchronized (this.c) {
                    FileWriter fileWriter2 = null;
                    try {
                        try {
                            z = !file.exists();
                            fileWriter = new FileWriter(file, true);
                        } catch (IOException e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        if (z) {
                            printWriter.println(Integer.toString(1));
                        }
                        printWriter.println(format);
                        try {
                            fileWriter.flush();
                            fileWriter.close();
                        } catch (IOException e2) {
                            throw new btmx("Unable to close the journal file, drop cache", e2);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileWriter2 = fileWriter;
                        throw new btmx("Unable to write to the journal file", e);
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        if (fileWriter2 != null) {
                            try {
                                fileWriter2.flush();
                                fileWriter2.close();
                            } catch (IOException e4) {
                                throw new btmx("Unable to close the journal file, drop cache", e4);
                            }
                        }
                        throw th;
                    }
                }
                if (h.put(str, valueOf) != null) {
                    this.g++;
                }
            }
        }
        Map<String, Long> map = this.f;
        if (map != null && map.size() >= 30) {
            double d = this.g;
            double size = this.f.size();
            Double.isNaN(d);
            Double.isNaN(size);
            if (d / size <= 0.5d) {
                return;
            }
            f();
        }
    }

    public final synchronized boolean a(String str) {
        dbsk.a(!dbsj.d(str));
        try {
            Long l = h().get(str);
            if (l == null) {
                return false;
            }
            return l.longValue() > this.e.b();
        } catch (btmx unused) {
            return false;
        }
    }

    public final synchronized boolean b(String str, long j) {
        dbsk.a(!dbsj.d(str));
        dbsk.a(j > 0);
        i(dcdc.f(Pair.create(str, Long.valueOf(j))));
        return true;
    }

    public final synchronized boolean c(Iterable<String> iterable) {
        dccx F = dcdc.F();
        for (String str : iterable) {
            dbsk.a(true ^ dbsj.d(str));
            F.g(Pair.create(str, -1L));
        }
        i(F.f());
        return true;
    }

    public final synchronized Set<String> d() {
        HashSet hashSet;
        hashSet = new HashSet();
        try {
            Map<String, Long> h = h();
            long b = this.e.b();
            for (Map.Entry<String, Long> entry : h.entrySet()) {
                Long value = entry.getValue();
                dbsk.s(value);
                if (value.longValue() < b && value.longValue() != -1) {
                    hashSet.add(entry.getKey());
                }
            }
        } catch (btmx unused) {
            return hashSet;
        }
        return hashSet;
    }

    public final synchronized void e() {
        if (!this.d.exists() || this.d.delete()) {
            this.f = null;
            this.g = 0;
        }
    }

    final synchronized void f() {
        FileWriter fileWriter;
        Map<String, Long> h = h();
        HashMap hashMap = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, Long> entry : h.entrySet()) {
            if (entry.getValue().longValue() != -1) {
                hashMap.put(entry.getKey(), entry.getValue());
                arrayList.add(String.format(Locale.US, "%s %d", entry.getKey(), entry.getValue()));
            }
        }
        try {
            File createTempFile = File.createTempFile("expiration", "journal", this.b.getCacheDir());
            File file = this.d;
            synchronized (this.c) {
                FileWriter fileWriter2 = null;
                try {
                    try {
                        fileWriter = new FileWriter(createTempFile, false);
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException unused2) {
                }
                try {
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    printWriter.println(Integer.toString(1));
                    for (String str : arrayList) {
                        printWriter.println(str);
                    }
                    fileWriter.flush();
                    fileWriter.close();
                    if (!file.exists() || file.delete()) {
                        if (!createTempFile.renameTo(file)) {
                            throw new btmx("Unable to rename new journal file");
                        }
                    }
                } catch (IOException unused3) {
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        fileWriter2.flush();
                        fileWriter2.close();
                    }
                    this.f = hashMap;
                    this.g = 0;
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        fileWriter2.flush();
                        fileWriter2.close();
                    }
                    throw th;
                }
            }
            this.f = hashMap;
            this.g = 0;
        } catch (IOException unused4) {
        }
    }

    public final synchronized void g(String str) {
        c(dcdc.f(str));
    }
}
