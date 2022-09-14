package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.n;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public class f extends n {

    /* renamed from: f  reason: collision with root package name */
    protected final File f6465f;

    /* renamed from: g  reason: collision with root package name */
    protected final String f6466g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends n.b implements Comparable {

        /* renamed from: d  reason: collision with root package name */
        final ZipEntry f6467d;

        /* renamed from: e  reason: collision with root package name */
        final int f6468e;

        b(String str, ZipEntry zipEntry, int i) {
            super(str, a(zipEntry));
            this.f6467d = zipEntry;
            this.f6468e = i;
        }

        private static String a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f6493b.compareTo(((b) obj).f6493b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public class c extends n.f {

        /* renamed from: b  reason: collision with root package name */
        private b[] f6469b;

        /* renamed from: c  reason: collision with root package name */
        private final ZipFile f6470c;

        /* renamed from: d  reason: collision with root package name */
        private final n f6471d;

        /* loaded from: classes.dex */
        private final class a extends n.e {

            /* renamed from: b  reason: collision with root package name */
            private int f6473b;

            private a() {
            }

            @Override // com.facebook.soloader.n.e
            public boolean a() {
                c.this.c();
                return this.f6473b < c.this.f6469b.length;
            }

            @Override // com.facebook.soloader.n.e
            public n.d b() {
                c.this.c();
                b[] bVarArr = c.this.f6469b;
                int i = this.f6473b;
                this.f6473b = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = c.this.f6470c.getInputStream(bVar.f6467d);
                try {
                    return new n.d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(n nVar) {
            this.f6470c = new ZipFile(f.this.f6465f);
            this.f6471d = nVar;
        }

        @Override // com.facebook.soloader.n.f
        protected final n.c a() {
            return new n.c(c());
        }

        protected boolean a(ZipEntry zipEntry, String str) {
            throw null;
        }

        @Override // com.facebook.soloader.n.f
        protected final n.e b() {
            return new a();
        }

        final b[] c() {
            if (this.f6469b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(f.this.f6466g);
                String[] a2 = SysUtil.a();
                Enumeration<? extends ZipEntry> entries = this.f6470c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a3 = SysUtil.a(a2, group);
                        if (a3 >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || a3 < bVar.f6468e) {
                                hashMap.put(group2, new b(group2, nextElement, a3));
                            }
                        }
                    }
                }
                this.f6471d.a((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    b bVar2 = bVarArr[i2];
                    if (a(bVar2.f6467d, bVar2.f6493b)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                b[] bVarArr2 = new b[i];
                int i3 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.f6469b = bVarArr2;
            }
            return this.f6469b;
        }

        @Override // com.facebook.soloader.n.f, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f6470c.close();
        }
    }

    public f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f6465f = file;
        this.f6466g = str2;
    }
}
