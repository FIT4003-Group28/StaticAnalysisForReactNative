package com.google.firebase.crashlytics.c.m;

import com.google.firebase.crashlytics.c.h.q;
import com.google.firebase.crashlytics.c.j.v;
import com.google.firebase.crashlytics.c.j.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static final Charset f9049g = Charset.forName("UTF-8");

    /* renamed from: h  reason: collision with root package name */
    private static final int f9050h = 15;
    private static final com.google.firebase.crashlytics.c.j.x.h i = new com.google.firebase.crashlytics.c.j.x.h();
    private static final Comparator<? super File> j = e.a();
    private static final FilenameFilter k = f.a();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f9051a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final File f9052b;

    /* renamed from: c  reason: collision with root package name */
    private final File f9053c;

    /* renamed from: d  reason: collision with root package name */
    private final File f9054d;

    /* renamed from: e  reason: collision with root package name */
    private final File f9055e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.q.e f9056f;

    public g(File file, com.google.firebase.crashlytics.c.q.e eVar) {
        File file2 = new File(file, "report-persistence");
        this.f9052b = new File(file2, "sessions");
        this.f9053c = new File(file2, "priority-reports");
        this.f9054d = new File(file2, "reports");
        this.f9055e = new File(file2, "native-reports");
        this.f9056f = eVar;
    }

    private static int a(File file, int i2) {
        List<File> a2 = a(file, c.a());
        Collections.sort(a2, d.a());
        return a(a2, i2);
    }

    private static int a(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            e(file);
            size--;
        }
        return size;
    }

    private static String a(int i2, boolean z) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i2));
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    private static List<File> a(File file) {
        return a(file, (FileFilter) null);
    }

    private static List<File> a(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> a(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> a(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (List<File> list : listArr) {
            i2 += list.size();
        }
        arrayList.ensureCapacity(i2);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private void a(File file, long j2) {
        boolean z;
        List<File> a2 = a(file, k);
        if (a2.isEmpty()) {
            return;
        }
        Collections.sort(a2);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file2 : a2) {
                try {
                    arrayList.add(i.a(d(file2)));
                } catch (IOException e2) {
                    com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
                    a3.a("Could not add event to report for " + file2, e2);
                }
                if (z || e(file2.getName())) {
                    z = true;
                }
            }
        }
        String str = null;
        File file3 = new File(file, "user");
        if (file3.isFile()) {
            try {
                str = d(file3);
            } catch (IOException e3) {
                com.google.firebase.crashlytics.c.b a4 = com.google.firebase.crashlytics.c.b.a();
                a4.a("Could not read user ID file in " + file.getName(), e3);
            }
        }
        a(new File(file, "report"), z ? this.f9053c : this.f9054d, arrayList, j2, z, str);
    }

    private static void a(File file, File file2, v.c cVar, String str) {
        try {
            v a2 = i.b(d(file)).a(cVar);
            c(file2);
            d(new File(file2, str), i.a(a2));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.a("Could not synthesize final native report file for " + file, e2);
        }
    }

    private static void a(File file, File file2, List<v.d.AbstractC0171d> list, long j2, boolean z, String str) {
        try {
            v a2 = i.b(d(file)).a(j2, z, str).a(w.a(list));
            v.d h2 = a2.h();
            if (h2 == null) {
                return;
            }
            c(file2);
            d(new File(file2, h2.g()), i.a(a2));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.a("Could not synthesize final report file for " + file, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private List<File> b(String str) {
        List<File> a2 = a(this.f9052b, b.a(str));
        Collections.sort(a2, j);
        if (a2.size() <= 8) {
            return a2;
        }
        for (File file : a2.subList(8, a2.size())) {
            e(file);
        }
        return a2.subList(0, 8);
    }

    private static List<File> b(List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, j);
        }
        return a(listArr);
    }

    private static boolean b(File file) {
        return file.exists() || file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(File file, File file2) {
        return c(file.getName()).compareTo(c(file2.getName()));
    }

    private static File c(File file) {
        if (b(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static String c(String str) {
        return str.substring(0, f9050h);
    }

    private void c() {
        int i2 = this.f9056f.b().a().f9139b;
        List<File> d2 = d();
        int size = d2.size();
        if (size <= i2) {
            return;
        }
        for (File file : d2.subList(i2, size)) {
            file.delete();
        }
    }

    private File d(String str) {
        return new File(this.f9052b, str);
    }

    private static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f9049g);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    private List<File> d() {
        return b(a(a(this.f9053c), a(this.f9055e)), a(this.f9054d));
    }

    private static void d(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f9049g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private static void e(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                e(file2);
            }
        }
        file.delete();
    }

    private static boolean e(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public void a() {
        for (File file : d()) {
            file.delete();
        }
    }

    public void a(v.d.AbstractC0171d abstractC0171d, String str, boolean z) {
        int i2 = this.f9056f.b().a().f9138a;
        File d2 = d(str);
        try {
            d(new File(d2, a(this.f9051a.getAndIncrement(), z)), i.a(abstractC0171d));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.a("Could not persist event for session " + str, e2);
        }
        a(d2, i2);
    }

    public void a(v vVar) {
        v.d h2 = vVar.h();
        if (h2 == null) {
            com.google.firebase.crashlytics.c.b.a().a("Could not get session for report");
            return;
        }
        String g2 = h2.g();
        try {
            File d2 = d(g2);
            c(d2);
            d(new File(d2, "report"), i.a(vVar));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.a("Could not persist report for session " + g2, e2);
        }
    }

    public void a(String str) {
        FilenameFilter a2 = a.a(str);
        for (File file : a(a(this.f9053c, a2), a(this.f9055e, a2), a(this.f9054d, a2))) {
            file.delete();
        }
    }

    public void a(String str, long j2) {
        for (File file : b(str)) {
            a(file, j2);
            e(file);
        }
        c();
    }

    public void a(String str, v.c cVar) {
        a(new File(d(str), "report"), this.f9055e, cVar, str);
    }

    public void a(String str, String str2) {
        try {
            d(new File(d(str2), "user"), str);
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.a("Could not persist user ID for session " + str2, e2);
        }
    }

    public List<q> b() {
        List<File> d2 = d();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(d2.size());
        for (File file : d()) {
            try {
                arrayList.add(q.a(i.b(d(file)), file.getName()));
            } catch (IOException e2) {
                com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
                a2.a("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }
}
