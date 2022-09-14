package com.facebook.l;

import android.content.Context;
import com.facebook.l.j;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ExtractFromZipSoSource.java */
/* loaded from: classes.dex */
public class d extends j {

    /* renamed from: c  reason: collision with root package name */
    protected final File f3032c;

    /* renamed from: d  reason: collision with root package name */
    protected final String f3033d;

    public d(Context context, String str, File file, String str2) {
        super(context, str);
        this.f3032c = file;
        this.f3033d = str2;
    }

    @Override // com.facebook.l.j
    protected j.e a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes.dex */
    public class b extends j.e {

        /* renamed from: a  reason: collision with root package name */
        private a[] f3036a;

        /* renamed from: c  reason: collision with root package name */
        private final ZipFile f3038c;

        protected boolean a(ZipEntry zipEntry, String str) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
            this.f3038c = new ZipFile(d.this.f3032c);
        }

        final a[] c() {
            a aVar;
            if (this.f3036a == null) {
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(d.this.f3033d);
                String[] a2 = i.a();
                Enumeration<? extends ZipEntry> entries = this.f3038c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a3 = i.a(a2, group);
                        if (a3 >= 0 && ((aVar = (a) hashMap.get(group2)) == null || a3 < aVar.f3035b)) {
                            hashMap.put(group2, new a(group2, nextElement, a3));
                        }
                    }
                }
                a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    a aVar2 = aVarArr[i2];
                    if (a(aVar2.f3034a, aVar2.f3051c)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                a[] aVarArr2 = new a[i];
                int i3 = 0;
                for (a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        aVarArr2[i3] = aVar3;
                        i3++;
                    }
                }
                this.f3036a = aVarArr2;
            }
            return this.f3036a;
        }

        @Override // com.facebook.l.j.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3038c.close();
        }

        @Override // com.facebook.l.j.e
        protected final j.b a() {
            return new j.b(c());
        }

        @Override // com.facebook.l.j.e
        protected final j.d b() {
            return new a();
        }

        /* compiled from: ExtractFromZipSoSource.java */
        /* loaded from: classes.dex */
        private final class a extends j.d {

            /* renamed from: b  reason: collision with root package name */
            private int f3040b;

            private a() {
            }

            @Override // com.facebook.l.j.d
            public boolean a() {
                b.this.c();
                return this.f3040b < b.this.f3036a.length;
            }

            @Override // com.facebook.l.j.d
            public j.c b() {
                b.this.c();
                a[] aVarArr = b.this.f3036a;
                int i = this.f3040b;
                this.f3040b = i + 1;
                a aVar = aVarArr[i];
                InputStream inputStream = b.this.f3038c.getInputStream(aVar.f3034a);
                try {
                    return new j.c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes.dex */
    public static final class a extends j.a implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        final ZipEntry f3034a;

        /* renamed from: b  reason: collision with root package name */
        final int f3035b;

        a(String str, ZipEntry zipEntry, int i) {
            super(str, a(zipEntry));
            this.f3034a = zipEntry;
            this.f3035b = i;
        }

        private static String a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f3051c.compareTo(((a) obj).f3051c);
        }
    }
}
