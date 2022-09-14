package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserModel.java */
/* loaded from: classes.dex */
public class e extends DataSetObservable {

    /* renamed from: a  reason: collision with root package name */
    static final String f953a = "e";
    private static final Object e = new Object();
    private static final Map<String, e> f = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Context f954b;

    /* renamed from: c  reason: collision with root package name */
    final String f955c;

    /* renamed from: d  reason: collision with root package name */
    boolean f956d;
    private final Object g;
    private final List<a> h;
    private final List<c> i;
    private Intent j;
    private b k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private d p;

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Intent intent, List<a> list, List<c> list2);
    }

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(e eVar, Intent intent);
    }

    public int a() {
        int size;
        synchronized (this.g) {
            d();
            size = this.h.size();
        }
        return size;
    }

    public ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.g) {
            d();
            resolveInfo = this.h.get(i).f957a;
        }
        return resolveInfo;
    }

    public int a(ResolveInfo resolveInfo) {
        synchronized (this.g) {
            d();
            List<a> list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f957a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Intent b(int i) {
        synchronized (this.g) {
            if (this.j == null) {
                return null;
            }
            d();
            a aVar = this.h.get(i);
            ComponentName componentName = new ComponentName(aVar.f957a.activityInfo.packageName, aVar.f957a.activityInfo.name);
            Intent intent = new Intent(this.j);
            intent.setComponent(componentName);
            if (this.p != null) {
                if (this.p.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo b() {
        synchronized (this.g) {
            d();
            if (!this.h.isEmpty()) {
                return this.h.get(0).f957a;
            }
            return null;
        }
    }

    public void c(int i) {
        synchronized (this.g) {
            d();
            a aVar = this.h.get(i);
            a aVar2 = this.h.get(0);
            a(new c(new ComponentName(aVar.f957a.activityInfo.packageName, aVar.f957a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f958b - aVar.f958b) + 5.0f : 1.0f));
        }
    }

    private void c() {
        if (!this.m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (!this.n) {
            return;
        }
        this.n = false;
        if (TextUtils.isEmpty(this.f955c)) {
            return;
        }
        new AsyncTaskC0024e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.i), this.f955c);
    }

    private void d() {
        boolean f2 = f() | g();
        h();
        if (f2) {
            e();
            notifyChanged();
        }
    }

    private boolean e() {
        if (this.k == null || this.j == null || this.h.isEmpty() || this.i.isEmpty()) {
            return false;
        }
        this.k.a(this.j, this.h, Collections.unmodifiableList(this.i));
        return true;
    }

    private boolean f() {
        if (!this.o || this.j == null) {
            return false;
        }
        this.o = false;
        this.h.clear();
        List<ResolveInfo> queryIntentActivities = this.f954b.getPackageManager().queryIntentActivities(this.j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.h.add(new a(queryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean g() {
        if (!this.f956d || !this.n || TextUtils.isEmpty(this.f955c)) {
            return false;
        }
        this.f956d = false;
        this.m = true;
        i();
        return true;
    }

    private boolean a(c cVar) {
        boolean add = this.i.add(cVar);
        if (add) {
            this.n = true;
            h();
            c();
            e();
            notifyChanged();
        }
        return add;
    }

    private void h() {
        int size = this.i.size() - this.l;
        if (size <= 0) {
            return;
        }
        this.n = true;
        for (int i = 0; i < size; i++) {
            this.i.remove(0);
        }
    }

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f959a;

        /* renamed from: b  reason: collision with root package name */
        public final long f960b;

        /* renamed from: c  reason: collision with root package name */
        public final float f961c;

        public c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public c(ComponentName componentName, long j, float f) {
            this.f959a = componentName;
            this.f960b = j;
            this.f961c = f;
        }

        public int hashCode() {
            return (((((this.f959a == null ? 0 : this.f959a.hashCode()) + 31) * 31) + ((int) (this.f960b ^ (this.f960b >>> 32)))) * 31) + Float.floatToIntBits(this.f961c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f959a == null) {
                if (cVar.f959a != null) {
                    return false;
                }
            } else if (!this.f959a.equals(cVar.f959a)) {
                return false;
            }
            return this.f960b == cVar.f960b && Float.floatToIntBits(this.f961c) == Float.floatToIntBits(cVar.f961c);
        }

        public String toString() {
            return "[; activity:" + this.f959a + "; time:" + this.f960b + "; weight:" + new BigDecimal(this.f961c) + "]";
        }
    }

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public final ResolveInfo f957a;

        /* renamed from: b  reason: collision with root package name */
        public float f958b;

        public a(ResolveInfo resolveInfo) {
            this.f957a = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f958b) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f958b) == Float.floatToIntBits(((a) obj).f958b);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.f958b) - Float.floatToIntBits(this.f958b);
        }

        public String toString() {
            return "[resolveInfo:" + this.f957a.toString() + "; weight:" + new BigDecimal(this.f958b) + "]";
        }
    }

    private void i() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.f954b.openFileInput(this.f955c);
            try {
                try {
                    try {
                        newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                        }
                    } catch (XmlPullParserException e2) {
                        String str = f953a;
                        Log.e(str, "Error reading historical recrod file: " + this.f955c, e2);
                        if (openFileInput == null) {
                            return;
                        }
                    }
                } catch (IOException e3) {
                    String str2 = f953a;
                    Log.e(str2, "Error reading historical recrod file: " + this.f955c, e3);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if (!"historical-records".equals(newPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<c> list = this.i;
                list.clear();
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1) {
                        if (openFileInput == null) {
                            return;
                        }
                    } else if (next != 3 && next != 4) {
                        if (!"historical-record".equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        list.add(new c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                    }
                }
                try {
                    openFileInput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityChooserModel.java */
    /* renamed from: android.support.v7.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class AsyncTaskC0024e extends AsyncTask<Object, Void, Void> {
        AsyncTaskC0024e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r4 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
            if (r4 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r4 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
            if (r4 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.e.AsyncTaskC0024e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }
}
