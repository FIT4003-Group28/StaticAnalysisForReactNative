package com.google.firebase.crashlytics.c.h;

import android.os.Looper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final FilenameFilter f8731a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f8732b = w.a("awaitEvenIfOnMainThread task continuation executor");

    /* loaded from: classes.dex */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements c.e.a.b.g.a<T, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.e.a.b.g.i f8733a;

        b(c.e.a.b.g.i iVar) {
            this.f8733a = iVar;
        }

        @Override // c.e.a.b.g.a
        public Void a(c.e.a.b.g.h<T> hVar) {
            if (hVar.e()) {
                this.f8733a.b((c.e.a.b.g.i) hVar.b());
                return null;
            }
            this.f8733a.b(hVar.a());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f8734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.e.a.b.g.i f8735c;

        /* loaded from: classes.dex */
        class a implements c.e.a.b.g.a<T, Void> {
            a() {
            }

            @Override // c.e.a.b.g.a
            public Void a(c.e.a.b.g.h<T> hVar) {
                if (hVar.e()) {
                    c.this.f8735c.a((c.e.a.b.g.i) hVar.b());
                    return null;
                }
                c.this.f8735c.a(hVar.a());
                return null;
            }
        }

        c(Callable callable, c.e.a.b.g.i iVar) {
            this.f8734b = callable;
            this.f8735c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((c.e.a.b.g.h) this.f8734b.call()).a(new a());
            } catch (Exception e2) {
                this.f8735c.a(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements c.e.a.b.g.a<T, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f8737a;

        d(CountDownLatch countDownLatch) {
            this.f8737a = countDownLatch;
        }

        @Override // c.e.a.b.g.a
        public Object a(c.e.a.b.g.h<T> hVar) {
            this.f8737a.countDown();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(File file, int i, Comparator<File> comparator) {
        return a(file, f8731a, i, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(File file, File file2, int i, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(f8731a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return a(arrayList, i, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return a(Arrays.asList(listFiles), i, comparator);
    }

    static int a(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            a(file);
            size--;
        }
        return size;
    }

    public static <T> c.e.a.b.g.h<T> a(c.e.a.b.g.h<T> hVar, c.e.a.b.g.h<T> hVar2) {
        c.e.a.b.g.i iVar = new c.e.a.b.g.i();
        b bVar = new b(iVar);
        hVar.a(bVar);
        hVar2.a(bVar);
        return iVar.a();
    }

    public static <T> c.e.a.b.g.h<T> a(Executor executor, Callable<c.e.a.b.g.h<T>> callable) {
        c.e.a.b.g.i iVar = new c.e.a.b.g.i();
        executor.execute(new c(callable, iVar));
        return iVar.a();
    }

    public static <T> T a(c.e.a.b.g.h<T> hVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.a(f8732b, new d(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (hVar.d()) {
            return hVar.b();
        }
        throw new TimeoutException();
    }

    private static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        file.delete();
    }
}
