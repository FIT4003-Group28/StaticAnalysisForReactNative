package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: damu  reason: default package */
/* loaded from: classes5.dex */
public final class damu implements dali {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public final Context b;
    public final daih<dame> c;
    public final daih<dame> d;
    public final Executor e;
    public final Set<String> f;
    public final Set<String> g;
    public final AtomicBoolean h;
    private final Handler i;
    private final dalc j;
    private final danl k;
    private final dakr l;
    private final File m;
    private final AtomicReference<dame> n;

    public damu(Context context, File file, dalc dalcVar) {
        Executor a2 = daiw.a();
        danl danlVar = new danl(context);
        this.i = new Handler(Looper.getMainLooper());
        this.n = new AtomicReference<>();
        this.f = Collections.synchronizedSet(new HashSet());
        this.g = Collections.synchronizedSet(new HashSet());
        this.h = new AtomicBoolean(false);
        this.b = context;
        this.m = file;
        this.j = dalcVar;
        this.e = a2;
        this.k = danlVar;
        this.d = new daih<>();
        this.c = new daih<>();
        this.l = daky.a;
    }

    public static String g(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    private final synchronized dame k(damt damtVar) {
        dame f = f();
        dame a2 = damtVar.a(f);
        if (this.n.compareAndSet(f, a2)) {
            return a2;
        }
        return null;
    }

    private final daku l() {
        daku c = this.j.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    @Override // defpackage.dali
    public final danb<Integer> a(final dalt daltVar) {
        int i;
        File[] fileArr;
        int i2;
        List list;
        Iterator it;
        try {
            dame k = k(new damt(daltVar) { // from class: damo
                private final dalt a;

                {
                    this.a = daltVar;
                }

                @Override // defpackage.damt
                public final dame a(dame dameVar) {
                    int b;
                    dalt daltVar2 = this.a;
                    long j = damu.a;
                    if (dameVar == null || (b = dameVar.b()) == 0 || b == 5 || b == 6 || b == 7) {
                        return dame.j(dameVar == null ? 1 : 1 + dameVar.a(), 1, 0, 0L, 0L, daltVar2.a, new ArrayList());
                    }
                    throw new dalb(-1);
                }
            });
            if (k == null) {
                return danj.b(new dalb(-100));
            }
            int a2 = k.a();
            final ArrayList arrayList = new ArrayList();
            for (Locale locale : daltVar.b) {
                arrayList.add(locale.getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] listFiles = this.m.listFiles();
            if (listFiles == null) {
                return danj.b(new dalb(-5));
            }
            int length = listFiles.length;
            int i3 = 0;
            long j = 0;
            while (i3 < length) {
                File file = listFiles[i3];
                String a3 = danp.a(file);
                if (daltVar.a.contains(g(a3))) {
                    String g = g(a3);
                    Configuration configuration = this.k.a.getResources().getConfiguration();
                    fileArr = listFiles;
                    i2 = length;
                    if (Build.VERSION.SDK_INT >= 24) {
                        LocaleList locales = configuration.getLocales();
                        ArrayList arrayList3 = new ArrayList(locales.size());
                        i = a2;
                        for (int i4 = 0; i4 < locales.size(); i4++) {
                            arrayList3.add(danl.a(locales.get(i4)));
                        }
                        list = arrayList3;
                    } else {
                        list = Collections.singletonList(danl.a(configuration.locale));
                        i = a2;
                    }
                    HashSet hashSet2 = new HashSet(list);
                    Map<String, Set<String>> a4 = l().a(Arrays.asList(g));
                    HashSet hashSet3 = new HashSet();
                    for (Set<String> set : a4.values()) {
                        hashSet3.addAll(set);
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (str.contains("_")) {
                            it = it2;
                            str = str.split("_", -1)[0];
                        } else {
                            it = it2;
                        }
                        hashSet4.add(str);
                        it2 = it;
                    }
                    hashSet4.addAll(this.g);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry<String, Set<String>> entry : a4.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll(entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(a3) || hashSet5.contains(a3)) {
                        j += file.length();
                        hashSet.add(danp.a(file));
                        arrayList2.add(file);
                        break;
                        i3++;
                        listFiles = fileArr;
                        length = i2;
                        a2 = i;
                    }
                } else {
                    i = a2;
                    fileArr = listFiles;
                    i2 = length;
                }
                List<Locale> list2 = daltVar.b;
                ArrayList arrayList4 = new ArrayList(this.f);
                arrayList4.addAll(Arrays.asList("", "base"));
                Map<String, Set<String>> a5 = l().a(arrayList4);
                for (Locale locale2 : list2) {
                    if (a5.containsKey(locale2.getLanguage()) && a5.get(locale2.getLanguage()).contains(a3)) {
                        j += file.length();
                        hashSet.add(danp.a(file));
                        arrayList2.add(file);
                        break;
                    }
                }
                i3++;
                listFiles = fileArr;
                length = i2;
                a2 = i;
            }
            int i5 = a2;
            String valueOf = String.valueOf(hashSet);
            String valueOf2 = String.valueOf(daltVar.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("availableSplits");
            sb.append(valueOf);
            sb.append(" want ");
            sb.append(valueOf2);
            sb.toString();
            if (!hashSet.containsAll(new HashSet(daltVar.a))) {
                return danj.b(new dalb(-2));
            }
            Long valueOf3 = Long.valueOf(j);
            List<String> list3 = daltVar.a;
            Integer valueOf4 = Integer.valueOf(i5);
            j(1, 0, 0L, valueOf3, list3, valueOf4, arrayList);
            this.e.execute(new Runnable(this, arrayList2, arrayList) { // from class: damn
                private final damu a;
                private final List b;
                private final List c;

                {
                    this.a = this;
                    this.b = arrayList2;
                    this.c = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final damu damuVar = this.a;
                    List<File> list4 = this.b;
                    final List list5 = this.c;
                    final ArrayList arrayList5 = new ArrayList();
                    final ArrayList arrayList6 = new ArrayList();
                    for (File file2 : list4) {
                        String a6 = danp.a(file2);
                        Uri fromFile = Uri.fromFile(file2);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(fromFile, damuVar.b.getContentResolver().getType(fromFile));
                        intent.addFlags(1);
                        intent.putExtra("module_name", damu.g(a6));
                        intent.putExtra("split_id", a6);
                        arrayList5.add(intent);
                        arrayList6.add(damu.g(danp.a(file2)));
                    }
                    dame f = damuVar.f();
                    if (f == null) {
                        return;
                    }
                    final long e = f.e();
                    damuVar.e.execute(new Runnable(damuVar, e, arrayList5, arrayList6, list5) { // from class: damq
                        private final damu a;
                        private final long b;
                        private final List c;
                        private final List d;
                        private final List e;

                        {
                            this.a = damuVar;
                            this.b = e;
                            this.c = arrayList5;
                            this.d = arrayList6;
                            this.e = list5;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final damu damuVar2 = this.a;
                            final long j2 = this.b;
                            final List list6 = this.c;
                            final List list7 = this.d;
                            final List list8 = this.e;
                            long j3 = j2 / 3;
                            long j4 = 0;
                            int i6 = 0;
                            while (i6 < 3) {
                                long min = Math.min(j2, j4 + j3);
                                int i7 = i6;
                                damuVar2.j(2, 0, Long.valueOf(min), Long.valueOf(j2), null, null, null);
                                SystemClock.sleep(damu.a);
                                dame f2 = damuVar2.f();
                                if (f2.b() == 9 || f2.b() == 7 || f2.b() == 6) {
                                    return;
                                }
                                i6 = i7 + 1;
                                j4 = min;
                            }
                            damuVar2.e.execute(new Runnable(damuVar2, list6, list7, list8, j2) { // from class: damr
                                private final damu a;
                                private final List b;
                                private final List c;
                                private final List d;
                                private final long e;

                                {
                                    this.a = damuVar2;
                                    this.b = list6;
                                    this.c = list7;
                                    this.d = list8;
                                    this.e = j2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    damu damuVar3 = this.a;
                                    List<Intent> list9 = this.b;
                                    List<String> list10 = this.c;
                                    List<String> list11 = this.d;
                                    long j5 = this.e;
                                    if (!damuVar3.h.get()) {
                                        damuVar3.h(list9, list10, list11, j5, false);
                                    } else {
                                        damuVar3.i(-6);
                                    }
                                }
                            });
                        }
                    });
                }
            });
            return danj.a(valueOf4);
        } catch (dalb e) {
            return danj.b(e);
        }
    }

    @Override // defpackage.dali
    public final danb<Void> b(List<Locale> list) {
        return danj.b(new dalb(-5));
    }

    @Override // defpackage.dali
    public final danb<Void> c(List<Locale> list) {
        return danj.b(new dalb(-5));
    }

    @Override // defpackage.dali
    public final Set<String> d() {
        HashSet hashSet = new HashSet();
        if (this.j.b() != null) {
            hashSet.addAll(this.j.b());
        }
        hashSet.addAll(this.g);
        return hashSet;
    }

    @Override // defpackage.dali
    public final void e(btbl btblVar) {
        this.d.b(btblVar);
    }

    public final dame f() {
        return this.n.get();
    }

    public final void h(List<Intent> list, List<String> list2, List<String> list3, long j, boolean z) {
        this.l.a().a(list, new dams(this, list2, list3, j, z, list));
    }

    public final void i(int i) {
        j(6, i, null, null, null, null, null);
    }

    public final void j(final int i, final int i2, final Long l, final Long l2, final List<String> list, final Integer num, final List<String> list2) {
        final dame k = k(new damt(num, i, i2, l, l2, list, list2) { // from class: damm
            private final Integer a;
            private final int b;
            private final int c;
            private final Long d;
            private final Long e;
            private final List f;
            private final List g;

            {
                this.a = num;
                this.b = i;
                this.c = i2;
                this.d = l;
                this.e = l2;
                this.f = list;
                this.g = list2;
            }

            @Override // defpackage.damt
            public final dame a(dame dameVar) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Integer num2 = this.a;
                int i3 = this.b;
                int i4 = this.c;
                Long l3 = this.d;
                Long l4 = this.e;
                List list3 = this.f;
                List list4 = this.g;
                long j = damu.a;
                dame j2 = dameVar == null ? dame.j(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : dameVar;
                int a2 = num2 == null ? j2.a() : num2.intValue();
                long d = l3 == null ? j2.d() : l3.longValue();
                long e = l4 == null ? j2.e() : l4.longValue();
                if (list3 == null) {
                    arrayList = j2.f() != null ? new ArrayList(j2.f()) : new ArrayList();
                } else {
                    arrayList = list3;
                }
                if (list4 == null) {
                    arrayList2 = j2.g() != null ? new ArrayList(j2.g()) : new ArrayList();
                } else {
                    arrayList2 = list4;
                }
                return dame.j(a2, i3, i4, d, e, arrayList, arrayList2);
            }
        });
        if (k != null) {
            this.i.post(new Runnable(this, k) { // from class: damp
                private final damu a;
                private final dame b;

                {
                    this.a = this;
                    this.b = k;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    damu damuVar = this.a;
                    dame dameVar = this.b;
                    damuVar.c.a(dameVar);
                    damuVar.d.a(dameVar);
                }
            });
        }
    }
}
