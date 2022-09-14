package com.google.firebase.crashlytics.c.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.c.h.r;
import com.google.firebase.crashlytics.c.i.b;
import com.google.firebase.crashlytics.c.o.b;
import com.google.firebase.crashlytics.c.o.c.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    private final Context f8659b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.h.t f8660c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.h.n f8661d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f8662e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.h.i f8663f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.l.c f8664g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.h.y f8665h;
    private final com.google.firebase.crashlytics.c.m.h i;
    private final com.google.firebase.crashlytics.c.h.b j;
    private final b.InterfaceC0184b k;
    private final b0 l;
    private final com.google.firebase.crashlytics.c.i.b m;
    private final com.google.firebase.crashlytics.c.o.a n;
    private final b.a o;
    private final com.google.firebase.crashlytics.c.a p;
    private final com.google.firebase.crashlytics.c.r.d q;
    private final String r;
    private final com.google.firebase.crashlytics.c.f.a s;
    private final h0 t;
    private com.google.firebase.crashlytics.c.h.r u;
    static final FilenameFilter z = new C0163k("BeginSession");
    static final FilenameFilter A = com.google.firebase.crashlytics.c.h.j.a();
    static final FilenameFilter B = new p();
    static final Comparator<File> C = new q();
    static final Comparator<File> D = new r();
    private static final Pattern E = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> F = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] G = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f8658a = new AtomicInteger(0);
    c.e.a.b.g.i<Boolean> v = new c.e.a.b.g.i<>();
    c.e.a.b.g.i<Boolean> w = new c.e.a.b.g.i<>();
    c.e.a.b.g.i<Void> x = new c.e.a.b.g.i<>();
    AtomicBoolean y = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8667b;

        a(long j, String str) {
            this.f8666a = j;
            this.f8667b = str;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            if (!k.this.i()) {
                k.this.m.a(this.f8666a, this.f8667b);
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class a0 implements FilenameFilter {
        a0() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return com.google.firebase.crashlytics.c.n.b.f9060e.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Date f8669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Throwable f8670c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Thread f8671d;

        b(Date date, Throwable th, Thread thread) {
            this.f8669b = date;
            this.f8670c = th;
            this.f8671d = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!k.this.i()) {
                long b2 = k.b(this.f8669b);
                k.this.t.b(this.f8670c, this.f8671d, b2);
                k.this.a(this.f8671d, this.f8670c, b2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b0 implements b.InterfaceC0166b {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.firebase.crashlytics.c.m.h f8673a;

        public b0(com.google.firebase.crashlytics.c.m.h hVar) {
            this.f8673a = hVar;
        }

        @Override // com.google.firebase.crashlytics.c.i.b.InterfaceC0166b
        public File a() {
            File file = new File(this.f8673a.b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f8674a;

        c(j0 j0Var) {
            this.f8674a = j0Var;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            k.this.t.b();
            new com.google.firebase.crashlytics.c.h.b0(k.this.f()).a(k.this.u(), this.f8674a);
            return null;
        }
    }

    /* loaded from: classes.dex */
    private final class c0 implements b.c {
        private c0() {
        }

        /* synthetic */ c0(k kVar, C0163k c0163k) {
            this();
        }

        @Override // com.google.firebase.crashlytics.c.o.b.c
        public File[] a() {
            return k.this.l();
        }

        @Override // com.google.firebase.crashlytics.c.o.b.c
        public File[] b() {
            return k.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f8677a;

        d(Map map) {
            this.f8677a = map;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            new com.google.firebase.crashlytics.c.h.b0(k.this.f()).a(k.this.u(), this.f8677a);
            return null;
        }
    }

    /* loaded from: classes.dex */
    private final class d0 implements b.a {
        private d0() {
        }

        /* synthetic */ d0(k kVar, C0163k c0163k) {
            this();
        }

        @Override // com.google.firebase.crashlytics.c.o.b.a
        public boolean a() {
            return k.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Callable<Void> {
        e() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            k.this.r();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Context f8681b;

        /* renamed from: c  reason: collision with root package name */
        private final com.google.firebase.crashlytics.c.o.c.c f8682c;

        /* renamed from: d  reason: collision with root package name */
        private final com.google.firebase.crashlytics.c.o.b f8683d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f8684e;

        public e0(Context context, com.google.firebase.crashlytics.c.o.c.c cVar, com.google.firebase.crashlytics.c.o.b bVar, boolean z) {
            this.f8681b = context;
            this.f8682c = cVar;
            this.f8683d = bVar;
            this.f8684e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!com.google.firebase.crashlytics.c.h.h.b(this.f8681b)) {
                return;
            }
            com.google.firebase.crashlytics.c.b.a().a("Attempting to send crash report at time of crash...");
            this.f8683d.a(this.f8682c, this.f8684e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.a(kVar.a(new a0()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f0 implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private final String f8686a;

        public f0(String str) {
            this.f8686a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8686a);
            sb.append(".cls");
            return !str.equals(sb.toString()) && str.contains(this.f8686a) && !str.endsWith(".cls_temp");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f8687a;

        g(k kVar, Set set) {
            this.f8687a = set;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.f8687a.contains(str.substring(0, 35));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8688a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8689b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f8690c;

        h(k kVar, String str, String str2, long j) {
            this.f8688a = str;
            this.f8689b = str2;
            this.f8690c = j;
        }

        @Override // com.google.firebase.crashlytics.c.h.k.y
        public void a(com.google.firebase.crashlytics.c.n.c cVar) {
            com.google.firebase.crashlytics.c.n.d.a(cVar, this.f8688a, this.f8689b, this.f8690c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f8693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f8694d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f8695e;

        i(String str, String str2, String str3, String str4, int i) {
            this.f8691a = str;
            this.f8692b = str2;
            this.f8693c = str3;
            this.f8694d = str4;
            this.f8695e = i;
        }

        @Override // com.google.firebase.crashlytics.c.h.k.y
        public void a(com.google.firebase.crashlytics.c.n.c cVar) {
            com.google.firebase.crashlytics.c.n.d.a(cVar, this.f8691a, this.f8692b, this.f8693c, this.f8694d, this.f8695e, k.this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8698b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f8699c;

        j(k kVar, String str, String str2, boolean z) {
            this.f8697a = str;
            this.f8698b = str2;
            this.f8699c = z;
        }

        @Override // com.google.firebase.crashlytics.c.h.k.y
        public void a(com.google.firebase.crashlytics.c.n.c cVar) {
            com.google.firebase.crashlytics.c.n.d.a(cVar, this.f8697a, this.f8698b, this.f8699c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.c.h.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0163k extends z {
        C0163k(String str) {
            super(str);
        }

        @Override // com.google.firebase.crashlytics.c.h.k.z, java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8702c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f8703d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f8704e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f8705f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f8706g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f8707h;
        final /* synthetic */ String i;

        l(k kVar, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            this.f8700a = i;
            this.f8701b = str;
            this.f8702c = i2;
            this.f8703d = j;
            this.f8704e = j2;
            this.f8705f = z;
            this.f8706g = i3;
            this.f8707h = str2;
            this.i = str3;
        }

        @Override // com.google.firebase.crashlytics.c.h.k.y
        public void a(com.google.firebase.crashlytics.c.n.c cVar) {
            com.google.firebase.crashlytics.c.n.d.a(cVar, this.f8700a, this.f8701b, this.f8702c, this.f8703d, this.f8704e, this.f8705f, this.f8706g, this.f8707h, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f8708a;

        m(k kVar, j0 j0Var) {
            this.f8708a = j0Var;
        }

        @Override // com.google.firebase.crashlytics.c.h.k.y
        public void a(com.google.firebase.crashlytics.c.n.c cVar) {
            com.google.firebase.crashlytics.c.n.d.a(cVar, this.f8708a.b(), (String) null, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8709a;

        n(String str) {
            this.f8709a = str;
        }

        @Override // com.google.firebase.crashlytics.c.h.k.y
        public void a(com.google.firebase.crashlytics.c.n.c cVar) {
            com.google.firebase.crashlytics.c.n.d.a(cVar, this.f8709a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8710a;

        o(long j) {
            this.f8710a = j;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f8710a);
            k.this.s.a("_ae", bundle);
            return null;
        }
    }

    /* loaded from: classes.dex */
    class p implements FilenameFilter {
        p() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* loaded from: classes.dex */
    class q implements Comparator<File> {
        q() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* loaded from: classes.dex */
    class r implements Comparator<File> {
        r() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class s implements r.a {
        s() {
        }

        @Override // com.google.firebase.crashlytics.c.h.r.a
        public void a(com.google.firebase.crashlytics.c.q.e eVar, Thread thread, Throwable th) {
            k.this.a(eVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class t implements Callable<c.e.a.b.g.h<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Date f8713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f8714b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f8715c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.c.q.e f8716d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements c.e.a.b.g.g<com.google.firebase.crashlytics.c.q.i.b, Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Executor f8718a;

            a(Executor executor) {
                this.f8718a = executor;
            }

            @Override // c.e.a.b.g.g
            public c.e.a.b.g.h<Void> a(com.google.firebase.crashlytics.c.q.i.b bVar) {
                if (bVar == null) {
                    com.google.firebase.crashlytics.c.b.a().d("Received null app settings, cannot send reports at crash time.");
                    return c.e.a.b.g.k.a((Object) null);
                }
                k.this.a(bVar, true);
                return c.e.a.b.g.k.a((c.e.a.b.g.h<?>[]) new c.e.a.b.g.h[]{k.this.x(), k.this.t.a(this.f8718a, com.google.firebase.crashlytics.c.h.u.a(bVar))});
            }
        }

        t(Date date, Throwable th, Thread thread, com.google.firebase.crashlytics.c.q.e eVar) {
            this.f8713a = date;
            this.f8714b = th;
            this.f8715c = thread;
            this.f8716d = eVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public c.e.a.b.g.h<Void> mo288call() {
            k.this.f8661d.a();
            long b2 = k.b(this.f8713a);
            k.this.t.a(this.f8714b, this.f8715c, b2);
            k.this.b(this.f8715c, this.f8714b, b2);
            k.this.b(this.f8713a.getTime());
            com.google.firebase.crashlytics.c.q.i.e b3 = this.f8716d.b();
            int i = b3.a().f9138a;
            int i2 = b3.a().f9139b;
            k.this.a(i);
            k.this.r();
            k.this.c(i2);
            if (!k.this.f8660c.a()) {
                return c.e.a.b.g.k.a((Object) null);
            }
            Executor b4 = k.this.f8663f.b();
            return this.f8716d.a().a(b4, new a(b4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class u implements c.e.a.b.g.g<Void, Boolean> {
        u(k kVar) {
        }

        @Override // c.e.a.b.g.g
        public c.e.a.b.g.h<Boolean> a(Void r1) {
            return c.e.a.b.g.k.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class v implements c.e.a.b.g.g<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.e.a.b.g.h f8720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f8721b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Callable<c.e.a.b.g.h<Void>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Boolean f8723a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.firebase.crashlytics.c.h.k$v$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0164a implements c.e.a.b.g.g<com.google.firebase.crashlytics.c.q.i.b, Void> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ List f8725a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f8726b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Executor f8727c;

                C0164a(List list, boolean z, Executor executor) {
                    this.f8725a = list;
                    this.f8726b = z;
                    this.f8727c = executor;
                }

                @Override // c.e.a.b.g.g
                public c.e.a.b.g.h<Void> a(com.google.firebase.crashlytics.c.q.i.b bVar) {
                    if (bVar == null) {
                        com.google.firebase.crashlytics.c.b.a().d("Received null app settings, cannot send reports during app startup.");
                    } else {
                        for (com.google.firebase.crashlytics.c.o.c.c cVar : this.f8725a) {
                            if (cVar.getType() == c.a.JAVA) {
                                k.b(bVar.f9133e, cVar.e());
                            }
                        }
                        k.this.x();
                        k.this.k.a(bVar).a(this.f8725a, this.f8726b, v.this.f8721b);
                        k.this.t.a(this.f8727c, com.google.firebase.crashlytics.c.h.u.a(bVar));
                        k.this.x.b((c.e.a.b.g.i<Void>) null);
                    }
                    return c.e.a.b.g.k.a((Object) null);
                }
            }

            a(Boolean bool) {
                this.f8723a = bool;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            /* renamed from: call */
            public c.e.a.b.g.h<Void> mo289call() {
                List<com.google.firebase.crashlytics.c.o.c.c> b2 = k.this.n.b();
                if (this.f8723a.booleanValue()) {
                    com.google.firebase.crashlytics.c.b.a().a("Reports are being sent.");
                    boolean booleanValue = this.f8723a.booleanValue();
                    k.this.f8660c.a(booleanValue);
                    Executor b3 = k.this.f8663f.b();
                    return v.this.f8720a.a(b3, new C0164a(b2, booleanValue, b3));
                }
                com.google.firebase.crashlytics.c.b.a().a("Reports are being deleted.");
                k.c(k.this.j());
                k.this.n.a(b2);
                k.this.t.c();
                k.this.x.b((c.e.a.b.g.i<Void>) null);
                return c.e.a.b.g.k.a((Object) null);
            }
        }

        v(c.e.a.b.g.h hVar, float f2) {
            this.f8720a = hVar;
            this.f8721b = f2;
        }

        @Override // c.e.a.b.g.g
        public c.e.a.b.g.h<Void> a(Boolean bool) {
            return k.this.f8663f.b(new a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class w implements b.InterfaceC0184b {
        w() {
        }

        @Override // com.google.firebase.crashlytics.c.o.b.InterfaceC0184b
        public com.google.firebase.crashlytics.c.o.b a(com.google.firebase.crashlytics.c.q.i.b bVar) {
            String str = bVar.f9131c;
            String str2 = bVar.f9132d;
            return new com.google.firebase.crashlytics.c.o.b(bVar.f9133e, k.this.j.f8612a, com.google.firebase.crashlytics.c.h.u.a(bVar), k.this.n, k.this.b(str, str2), k.this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class x implements FilenameFilter {
        private x() {
        }

        /* synthetic */ x(C0163k c0163k) {
            this();
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !k.B.accept(file, str) && k.E.matcher(str).matches();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface y {
        void a(com.google.firebase.crashlytics.c.n.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class z implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private final String f8730a;

        public z(String str) {
            this.f8730a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.f8730a) && !str.endsWith(".cls_temp");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, com.google.firebase.crashlytics.c.h.i iVar, com.google.firebase.crashlytics.c.l.c cVar, com.google.firebase.crashlytics.c.h.y yVar, com.google.firebase.crashlytics.c.h.t tVar, com.google.firebase.crashlytics.c.m.h hVar, com.google.firebase.crashlytics.c.h.n nVar, com.google.firebase.crashlytics.c.h.b bVar, com.google.firebase.crashlytics.c.o.a aVar, b.InterfaceC0184b interfaceC0184b, com.google.firebase.crashlytics.c.a aVar2, com.google.firebase.crashlytics.c.s.b bVar2, com.google.firebase.crashlytics.c.f.a aVar3, com.google.firebase.crashlytics.c.q.e eVar) {
        b.InterfaceC0184b interfaceC0184b2 = interfaceC0184b;
        this.f8659b = context;
        this.f8663f = iVar;
        this.f8664g = cVar;
        this.f8665h = yVar;
        this.f8660c = tVar;
        this.i = hVar;
        this.f8661d = nVar;
        this.j = bVar;
        this.k = interfaceC0184b2 == null ? q() : interfaceC0184b2;
        this.p = aVar2;
        this.r = bVar2.a();
        this.s = aVar3;
        this.f8662e = new j0();
        this.l = new b0(hVar);
        this.m = new com.google.firebase.crashlytics.c.i.b(context, this.l);
        this.n = aVar == null ? new com.google.firebase.crashlytics.c.o.a(new c0(this, null)) : aVar;
        this.o = new d0(this, null);
        this.q = new com.google.firebase.crashlytics.c.r.a(1024, new com.google.firebase.crashlytics.c.r.c(10));
        this.t = h0.a(context, yVar, hVar, bVar, this.m, this.f8662e, this.q, eVar);
    }

    private c.e.a.b.g.h<Void> a(long j2) {
        if (s()) {
            com.google.firebase.crashlytics.c.b.a().a("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return c.e.a.b.g.k.a((Object) null);
        }
        return c.e.a.b.g.k.a(new ScheduledThreadPoolExecutor(1), new o(j2));
    }

    static String a(File file) {
        return file.getName().substring(0, 35);
    }

    static List<com.google.firebase.crashlytics.c.h.c0> a(com.google.firebase.crashlytics.c.d dVar, String str, Context context, File file, byte[] bArr) {
        byte[] bArr2;
        com.google.firebase.crashlytics.c.h.b0 b0Var = new com.google.firebase.crashlytics.c.h.b0(file);
        File b2 = b0Var.b(str);
        File a2 = b0Var.a(str);
        try {
            bArr2 = com.google.firebase.crashlytics.c.k.b.a(dVar.f(), context);
        } catch (Exception unused) {
            bArr2 = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.c.h.f("logs_file", "logs", bArr));
        arrayList.add(new com.google.firebase.crashlytics.c.h.f("binary_images_file", "binaryImages", bArr2));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("crash_meta_file", "metadata", dVar.g()));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("session_meta_file", "session", dVar.e()));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("app_meta_file", "app", dVar.a()));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("device_meta_file", "device", dVar.c()));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("os_meta_file", "os", dVar.b()));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("minidump_file", "minidump", dVar.d()));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("user_meta_file", "user", b2));
        arrayList.add(new com.google.firebase.crashlytics.c.h.x("keys_file", "keys", a2));
        return arrayList;
    }

    private void a(int i2, boolean z2) {
        int i3 = !z2 ? 1 : 0;
        d(i3 + 8);
        File[] w2 = w();
        if (w2.length <= i3) {
            com.google.firebase.crashlytics.c.b.a().a("No open sessions to be closed.");
            return;
        }
        String a2 = a(w2[i3]);
        i(a2);
        if (z2) {
            this.t.a();
        } else if (this.p.b(a2)) {
            b(a2);
            if (!this.p.a(a2)) {
                com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
                a3.a("Could not finalize native session: " + a2);
            }
        }
        a(w2, i3, i2);
        this.t.a(v());
    }

    private void a(j0 j0Var) {
        this.f8663f.a(new c(j0Var));
    }

    private void a(com.google.firebase.crashlytics.c.n.b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            bVar.a();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b.a().b("Error closing session file stream in the presence of an exception", e2);
        }
    }

    private static void a(com.google.firebase.crashlytics.c.n.c cVar, File file) {
        if (!file.exists()) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.b("Tried to include a file that doesn't exist: " + file.getName());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                a(fileInputStream2, cVar, (int) file.length());
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                com.google.firebase.crashlytics.c.h.h.a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(com.google.firebase.crashlytics.c.n.c cVar, String str) {
        String[] strArr;
        for (String str2 : G) {
            File[] a2 = a(new z(str + str2 + ".cls"));
            if (a2.length == 0) {
                com.google.firebase.crashlytics.c.b.a().a("Can't find " + str2 + " data for session ID " + str);
            } else {
                com.google.firebase.crashlytics.c.b.a().a("Collecting " + str2 + " data for session ID " + str);
                a(cVar, a2[0]);
            }
        }
    }

    private void a(com.google.firebase.crashlytics.c.n.c cVar, Thread thread, Throwable th, long j2, String str, boolean z2) {
        Thread[] threadArr;
        Map<String, String> a2;
        TreeMap treeMap;
        com.google.firebase.crashlytics.c.r.e eVar = new com.google.firebase.crashlytics.c.r.e(th, this.q);
        Context t2 = t();
        com.google.firebase.crashlytics.c.h.e a3 = com.google.firebase.crashlytics.c.h.e.a(t2);
        Float a4 = a3.a();
        int b2 = a3.b();
        boolean f2 = com.google.firebase.crashlytics.c.h.h.f(t2);
        int i2 = t2.getResources().getConfiguration().orientation;
        long b3 = com.google.firebase.crashlytics.c.h.h.b() - com.google.firebase.crashlytics.c.h.h.a(t2);
        long a5 = com.google.firebase.crashlytics.c.h.h.a(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo a6 = com.google.firebase.crashlytics.c.h.h.a(t2.getPackageName(), t2);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = eVar.f9161c;
        String str2 = this.j.f8613b;
        String b4 = this.f8665h.b();
        int i3 = 0;
        if (z2) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr2[i3] = entry.getKey();
                linkedList.add(this.q.a(entry.getValue()));
                i3++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (!com.google.firebase.crashlytics.c.h.h.a(t2, "com.crashlytics.CollectCustomKeys", true)) {
            a2 = new TreeMap<>();
        } else {
            a2 = this.f8662e.a();
            if (a2 != null && a2.size() > 1) {
                treeMap = new TreeMap(a2);
                com.google.firebase.crashlytics.c.n.d.a(cVar, j2, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.m.b(), a6, i2, b4, str2, a4, b2, f2, b3, a5);
                this.m.a();
            }
        }
        treeMap = a2;
        com.google.firebase.crashlytics.c.n.d.a(cVar, j2, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.m.b(), a6, i2, b4, str2, a4, b2, f2, b3, a5);
        this.m.a();
    }

    private static void a(com.google.firebase.crashlytics.c.n.c cVar, File[] fileArr, String str) {
        Arrays.sort(fileArr, com.google.firebase.crashlytics.c.h.h.f8634c);
        for (File file : fileArr) {
            try {
                com.google.firebase.crashlytics.c.b.a().a(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                a(cVar, file);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.c.b.a().b("Error writting non-fatal to session.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.google.firebase.crashlytics.c.q.i.b bVar, boolean z2) {
        File[] k;
        Context t2 = t();
        com.google.firebase.crashlytics.c.o.b a2 = this.k.a(bVar);
        for (File file : k()) {
            b(bVar.f9133e, file);
            this.f8663f.a(new e0(t2, new com.google.firebase.crashlytics.c.o.c.d(file, F), a2, z2));
        }
    }

    private static void a(File file, y yVar) {
        FileOutputStream fileOutputStream;
        com.google.firebase.crashlytics.c.n.c cVar = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            cVar = com.google.firebase.crashlytics.c.n.c.a(fileOutputStream);
            yVar.a(cVar);
            com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to append to " + file.getPath());
            com.google.firebase.crashlytics.c.h.h.a((Closeable) fileOutputStream, "Failed to close " + file.getPath());
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to append to " + file.getPath());
            com.google.firebase.crashlytics.c.h.h.a((Closeable) fileOutputStream, "Failed to close " + file.getPath());
            throw th;
        }
    }

    private void a(File file, String str, int i2) {
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Collecting session parts for ID " + str);
        File[] a3 = a(new z(str + "SessionCrash"));
        boolean z2 = a3 != null && a3.length > 0;
        com.google.firebase.crashlytics.c.b.a().a(String.format(Locale.US, "Session %s has fatal exception: %s", str, Boolean.valueOf(z2)));
        File[] a4 = a(new z(str + "SessionEvent"));
        boolean z3 = a4 != null && a4.length > 0;
        com.google.firebase.crashlytics.c.b.a().a(String.format(Locale.US, "Session %s has non-fatal exceptions: %s", str, Boolean.valueOf(z3)));
        if (z2 || z3) {
            a(file, str, a(str, a4, i2), z2 ? a3[0] : null);
        } else {
            com.google.firebase.crashlytics.c.b a5 = com.google.firebase.crashlytics.c.b.a();
            a5.a("No events present for session ID " + str);
        }
        com.google.firebase.crashlytics.c.b a6 = com.google.firebase.crashlytics.c.b.a();
        a6.a("Removing session part files for ID " + str);
        c(d(str));
    }

    private void a(File file, String str, File[] fileArr, File file2) {
        com.google.firebase.crashlytics.c.n.b bVar;
        boolean z2 = file2 != null;
        File e2 = z2 ? e() : h();
        if (!e2.exists()) {
            e2.mkdirs();
        }
        com.google.firebase.crashlytics.c.n.c cVar = null;
        try {
            try {
                bVar = new com.google.firebase.crashlytics.c.n.b(e2, str);
                try {
                    cVar = com.google.firebase.crashlytics.c.n.c.a(bVar);
                    com.google.firebase.crashlytics.c.b.a().a("Collecting SessionStart data for session ID " + str);
                    a(cVar, file);
                    cVar.a(4, v());
                    cVar.a(5, z2);
                    cVar.d(11, 1);
                    cVar.a(12, 3);
                    a(cVar, str);
                    a(cVar, fileArr, str);
                    if (z2) {
                        a(cVar, file2);
                    }
                    com.google.firebase.crashlytics.c.h.h.a(cVar, "Error flushing session file stream");
                    com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close CLS file");
                } catch (Exception e3) {
                    e = e3;
                    com.google.firebase.crashlytics.c.b.a().b("Failed to write session file for session ID: " + str, e);
                    com.google.firebase.crashlytics.c.h.h.a(cVar, "Error flushing session file stream");
                    a(bVar);
                }
            } catch (Throwable th) {
                th = th;
                com.google.firebase.crashlytics.c.h.h.a((Flushable) null, "Error flushing session file stream");
                com.google.firebase.crashlytics.c.h.h.a((Closeable) null, "Failed to close CLS file");
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.c.h.h.a((Flushable) null, "Error flushing session file stream");
            com.google.firebase.crashlytics.c.h.h.a((Closeable) null, "Failed to close CLS file");
            throw th;
        }
    }

    private static void a(InputStream inputStream, com.google.firebase.crashlytics.c.n.c cVar, int i2) {
        int read;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < bArr.length && (read = inputStream.read(bArr, i3, bArr.length - i3)) >= 0) {
            i3 += read;
        }
        cVar.a(bArr);
    }

    private void a(String str, int i2) {
        File f2 = f();
        k0.a(f2, new z(str + "SessionEvent"), i2, D);
    }

    private void a(String str, long j2) {
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", com.google.firebase.crashlytics.c.h.m.i());
        a(str, "BeginSession", new h(this, str, format, j2));
        this.p.a(str, format, j2);
    }

    private void a(String str, String str2, y yVar) {
        com.google.firebase.crashlytics.c.n.b bVar;
        com.google.firebase.crashlytics.c.n.c cVar = null;
        try {
            bVar = new com.google.firebase.crashlytics.c.n.b(f(), str + str2);
            try {
                cVar = com.google.firebase.crashlytics.c.n.c.a(bVar);
                yVar.a(cVar);
                com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to session " + str2 + " file.");
                com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close session " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to session " + str2 + " file.");
                com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Thread thread, Throwable th, long j2) {
        com.google.firebase.crashlytics.c.n.b bVar;
        com.google.firebase.crashlytics.c.n.c a2;
        String u2 = u();
        if (u2 == null) {
            com.google.firebase.crashlytics.c.b.a().a("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        com.google.firebase.crashlytics.c.n.c cVar = null;
        try {
            com.google.firebase.crashlytics.c.b.a().a("Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
            bVar = new com.google.firebase.crashlytics.c.n.b(f(), u2 + "SessionEvent" + com.google.firebase.crashlytics.c.h.h.a(this.f8658a.getAndIncrement()));
            try {
                try {
                    a2 = com.google.firebase.crashlytics.c.n.c.a(bVar);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
        }
        try {
            try {
                a(a2, thread, th, j2, "error", false);
                com.google.firebase.crashlytics.c.h.h.a(a2, "Failed to flush to non-fatal file.");
            } catch (Exception e4) {
                e = e4;
                cVar = a2;
                com.google.firebase.crashlytics.c.b.a().b("An error occurred in the non-fatal exception logger", e);
                com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to non-fatal file.");
                com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close non-fatal file output stream.");
                a(u2, 64);
                return;
            } catch (Throwable th4) {
                th = th4;
                cVar = a2;
                com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to non-fatal file.");
                com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close non-fatal file output stream.");
                throw th;
            }
            a(u2, 64);
            return;
        } catch (Exception e5) {
            com.google.firebase.crashlytics.c.b.a().b("An error occurred when trimming non-fatal files.", e5);
            return;
        }
        com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close non-fatal file output stream.");
    }

    private void a(Map<String, String> map) {
        this.f8663f.a(new d(map));
    }

    private void a(File[] fileArr, int i2, int i3) {
        com.google.firebase.crashlytics.c.b.a().a("Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String a2 = a(file);
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.a("Closing session: " + a2);
            a(file, a2, i3);
            i2++;
        }
    }

    private void a(File[] fileArr, Set<String> set) {
        com.google.firebase.crashlytics.c.b a2;
        StringBuilder sb;
        String str;
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = E.matcher(name);
            if (!matcher.matches()) {
                a2 = com.google.firebase.crashlytics.c.b.a();
                sb = new StringBuilder();
                str = "Deleting unknown file: ";
            } else if (!set.contains(matcher.group(1))) {
                a2 = com.google.firebase.crashlytics.c.b.a();
                sb = new StringBuilder();
                str = "Trimming session file: ";
            }
            sb.append(str);
            sb.append(name);
            a2.a(sb.toString());
            file.delete();
        }
    }

    private File[] a(File file, FilenameFilter filenameFilter) {
        return d(file.listFiles(filenameFilter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File[] a(FilenameFilter filenameFilter) {
        return a(f(), filenameFilter);
    }

    private File[] a(String str, File[] fileArr, int i2) {
        if (fileArr.length > i2) {
            com.google.firebase.crashlytics.c.b.a().a(String.format(Locale.US, "Trimming down to %d logged exceptions.", Integer.valueOf(i2)));
            a(str, i2);
            return a(new z(str + "SessionEvent"));
        }
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long b(Date date) {
        return date.getTime() / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.c.o.d.b b(String str, String str2) {
        String b2 = com.google.firebase.crashlytics.c.h.h.b(t(), "com.crashlytics.ApiEndpoint");
        return new com.google.firebase.crashlytics.c.o.d.a(new com.google.firebase.crashlytics.c.o.d.c(b2, str, this.f8664g, com.google.firebase.crashlytics.c.h.m.i()), new com.google.firebase.crashlytics.c.o.d.d(b2, str2, this.f8664g, com.google.firebase.crashlytics.c.h.m.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j2) {
        try {
            File f2 = f();
            new File(f2, ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            com.google.firebase.crashlytics.c.b.a().a("Could not write app exception marker.");
        }
    }

    private void b(String str) {
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.c.d c2 = this.p.c(str);
        File d2 = c2.d();
        if (d2 == null || !d2.exists()) {
            com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
            a3.d("No minidump data found for session " + str);
            return;
        }
        long lastModified = d2.lastModified();
        com.google.firebase.crashlytics.c.i.b bVar = new com.google.firebase.crashlytics.c.i.b(this.f8659b, this.l, str);
        File file = new File(g(), str);
        if (!file.mkdirs()) {
            com.google.firebase.crashlytics.c.b.a().a("Couldn't create native sessions directory");
            return;
        }
        b(lastModified);
        List<com.google.firebase.crashlytics.c.h.c0> a4 = a(c2, str, t(), f(), bVar.b());
        com.google.firebase.crashlytics.c.h.d0.a(file, a4);
        this.t.a(e(str), a4);
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, File file) {
        if (str == null) {
            return;
        }
        a(file, new n(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Thread thread, Throwable th, long j2) {
        com.google.firebase.crashlytics.c.n.b bVar;
        String u2;
        com.google.firebase.crashlytics.c.n.c cVar = null;
        try {
            u2 = u();
        } catch (Exception e2) {
            e = e2;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to session begin file.");
            com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
        if (u2 == null) {
            com.google.firebase.crashlytics.c.b.a().b("Tried to write a fatal exception while no session was open.");
            com.google.firebase.crashlytics.c.h.h.a((Flushable) null, "Failed to flush to session begin file.");
            com.google.firebase.crashlytics.c.h.h.a((Closeable) null, "Failed to close fatal exception file output stream.");
            return;
        }
        bVar = new com.google.firebase.crashlytics.c.n.b(f(), u2 + "SessionCrash");
        try {
            try {
                cVar = com.google.firebase.crashlytics.c.n.c.a(bVar);
                a(cVar, thread, th, j2, "crash", true);
            } catch (Exception e3) {
                e = e3;
                com.google.firebase.crashlytics.c.b.a().b("An error occurred in the fatal exception logger", e);
                com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to session begin file.");
                com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close fatal exception file output stream.");
            }
            com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to session begin file.");
            com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close fatal exception file output stream.");
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.c.h.h.a(cVar, "Failed to flush to session begin file.");
            com.google.firebase.crashlytics.c.h.h.a((Closeable) bVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    private j0 c(String str) {
        return i() ? this.f8662e : new com.google.firebase.crashlytics.c.h.b0(f()).c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    private void d(int i2) {
        HashSet hashSet = new HashSet();
        File[] w2 = w();
        int min = Math.min(i2, w2.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(a(w2[i3]));
        }
        this.m.a(hashSet);
        a(a(new x(null)), hashSet);
    }

    private File[] d(String str) {
        return a(new f0(str));
    }

    private File[] d(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private static String e(String str) {
        return str.replaceAll("-", "");
    }

    private void f(String str) {
        String b2 = this.f8665h.b();
        com.google.firebase.crashlytics.c.h.b bVar = this.j;
        String str2 = bVar.f8616e;
        String str3 = bVar.f8617f;
        String a2 = this.f8665h.a();
        int a3 = com.google.firebase.crashlytics.c.h.v.a(this.j.f8614c).a();
        a(str, "SessionApp", new i(b2, str2, str3, a2, a3));
        this.p.a(str, b2, str2, str3, a2, a3, this.r);
    }

    private void g(String str) {
        Context t2 = t();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a2 = com.google.firebase.crashlytics.c.h.h.a();
        String str2 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = com.google.firebase.crashlytics.c.h.h.b();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean j2 = com.google.firebase.crashlytics.c.h.h.j(t2);
        int c2 = com.google.firebase.crashlytics.c.h.h.c(t2);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        a(str, "SessionDevice", new l(this, a2, str2, availableProcessors, b2, blockCount, j2, c2, str3, str4));
        this.p.a(str, a2, str2, availableProcessors, b2, blockCount, j2, c2, str3, str4);
    }

    private void h(String str) {
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        boolean k = com.google.firebase.crashlytics.c.h.h.k(t());
        a(str, "SessionOS", new j(this, str2, str3, k));
        this.p.a(str, str2, str3, k);
    }

    private void i(String str) {
        a(str, "SessionUser", new m(this, c(str)));
    }

    private b.InterfaceC0184b q() {
        return new w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        long v2 = v();
        String gVar = new com.google.firebase.crashlytics.c.h.g(this.f8665h).toString();
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Opening a new session with ID " + gVar);
        this.p.d(gVar);
        a(gVar, v2);
        f(gVar);
        h(gVar);
        g(gVar);
        this.m.a(gVar);
        this.t.a(e(gVar), v2);
    }

    private static boolean s() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context t() {
        return this.f8659b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String u() {
        File[] w2 = w();
        if (w2.length > 0) {
            return a(w2[0]);
        }
        return null;
    }

    private static long v() {
        return b(new Date());
    }

    private File[] w() {
        File[] m2 = m();
        Arrays.sort(m2, C);
        return m2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.e.a.b.g.h<Void> x() {
        File[] j2;
        ArrayList arrayList = new ArrayList();
        for (File file : j()) {
            try {
                arrayList.add(a(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.c.b.a().a("Could not parse timestamp from file " + file.getName());
            }
            file.delete();
        }
        return c.e.a.b.g.k.a((Collection<? extends c.e.a.b.g.h<?>>) arrayList);
    }

    private c.e.a.b.g.h<Boolean> y() {
        if (this.f8660c.a()) {
            com.google.firebase.crashlytics.c.b.a().a("Automatic data collection is enabled. Allowing upload.");
            this.v.b((c.e.a.b.g.i<Boolean>) false);
            return c.e.a.b.g.k.a(true);
        }
        com.google.firebase.crashlytics.c.b.a().a("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.c.b.a().a("Notifying that unsent reports are available.");
        this.v.b((c.e.a.b.g.i<Boolean>) true);
        c.e.a.b.g.h<TContinuationResult> a2 = this.f8660c.b().a(new u(this));
        com.google.firebase.crashlytics.c.b.a().a("Waiting for send/deleteUnsentReports to be called.");
        return k0.a(a2, this.w.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Boolean> a() {
        if (!this.y.compareAndSet(false, true)) {
            com.google.firebase.crashlytics.c.b.a().a("checkForUnsentReports should only be called once per execution.");
            return c.e.a.b.g.k.a(false);
        }
        return this.v.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> a(float f2, c.e.a.b.g.h<com.google.firebase.crashlytics.c.q.i.b> hVar) {
        if (this.n.a()) {
            com.google.firebase.crashlytics.c.b.a().a("Unsent reports are available.");
            return y().a(new v(hVar, f2));
        }
        com.google.firebase.crashlytics.c.b.a().a("No reports are available.");
        this.v.b((c.e.a.b.g.i<Boolean>) false);
        return c.e.a.b.g.k.a((Object) null);
    }

    void a(int i2) {
        a(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j2, String str) {
        this.f8663f.a(new a(j2, str));
    }

    synchronized void a(com.google.firebase.crashlytics.c.q.e eVar, Thread thread, Throwable th) {
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            k0.a(this.f8663f.b(new t(new Date(), th, thread, eVar)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f8662e.a(str);
        a(this.f8662e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            this.f8662e.a(str, str2);
            a(this.f8662e.a());
        } catch (IllegalArgumentException e2) {
            Context context = this.f8659b;
            if (context != null && com.google.firebase.crashlytics.c.h.h.i(context)) {
                throw e2;
            }
            com.google.firebase.crashlytics.c.b.a().b("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.c.q.e eVar) {
        n();
        this.u = new com.google.firebase.crashlytics.c.h.r(new s(), eVar, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Thread thread, Throwable th) {
        this.f8663f.a(new b(new Date(), th, thread));
    }

    void a(File[] fileArr) {
        File[] a2;
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            com.google.firebase.crashlytics.c.b.a().a("Found invalid session part file: " + file);
            hashSet.add(a(file));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        for (File file2 : a(new g(this, hashSet))) {
            com.google.firebase.crashlytics.c.b.a().a("Deleting invalid session file: " + file2);
            file2.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f8663f.a(new f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i2) {
        this.f8663f.a();
        if (i()) {
            com.google.firebase.crashlytics.c.b.a().a("Skipping session finalization because a crash has already occurred.");
            return Boolean.FALSE.booleanValue();
        }
        com.google.firebase.crashlytics.c.b.a().a("Finalizing previously open sessions.");
        try {
            a(i2, false);
            com.google.firebase.crashlytics.c.b.a().a("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.c.b.a().b("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> c() {
        this.w.b((c.e.a.b.g.i<Boolean>) false);
        return this.x.a();
    }

    void c(int i2) {
        int a2 = i2 - k0.a(g(), e(), i2, D);
        k0.a(f(), B, a2 - k0.a(h(), a2, D), D);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        if (!this.f8661d.b()) {
            String u2 = u();
            return u2 != null && this.p.b(u2);
        }
        com.google.firebase.crashlytics.c.b.a().a("Found previous crash marker.");
        this.f8661d.c();
        return Boolean.TRUE.booleanValue();
    }

    File e() {
        return new File(f(), "fatal-sessions");
    }

    File f() {
        return this.i.b();
    }

    File g() {
        return new File(f(), "native-sessions");
    }

    File h() {
        return new File(f(), "nonfatal-sessions");
    }

    boolean i() {
        com.google.firebase.crashlytics.c.h.r rVar = this.u;
        return rVar != null && rVar.a();
    }

    File[] j() {
        return a(A);
    }

    File[] k() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, a(e(), B));
        Collections.addAll(linkedList, a(h(), B));
        Collections.addAll(linkedList, a(f(), B));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    File[] l() {
        return d(g().listFiles());
    }

    File[] m() {
        return a(z);
    }

    void n() {
        this.f8663f.a(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> o() {
        this.w.b((c.e.a.b.g.i<Boolean>) true);
        return this.x.a();
    }
}
