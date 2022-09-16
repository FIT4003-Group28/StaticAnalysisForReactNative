package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zsy  reason: default package */
/* loaded from: classes4.dex */
public final class zsy {
    File a;
    File b;
    public final Context c;
    public final Object d = new Object();
    public final List e = new ArrayList();
    public final Set f = new HashSet();
    public final boolean g;
    public zte h;
    public boolean i;
    private final yqw j;
    private final Set k;
    private final zsx l;
    private volatile boolean m;

    public zsy(Context context, yqw yqwVar, zsx zsxVar, boolean z, final zte zteVar) {
        this.c = context;
        yqwVar.getClass();
        this.j = yqwVar;
        zsxVar.getClass();
        this.l = zsxVar;
        this.g = z;
        this.k = new HashSet();
        if (z) {
            this.h = zteVar;
            zteVar.c.execute(new Runnable() { // from class: zta
                @Override // java.lang.Runnable
                public final void run() {
                    zte zteVar2 = zte.this;
                    ylr.b();
                    zteVar2.a = new znh(zteVar2.b, 1, zny.b, zny.i, zteVar2.d);
                }
            });
        }
    }

    static File a(Context context) {
        File file = new File(context.getFilesDir(), zny.a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(Context context) {
        File file = new File(context.getFilesDir(), zny.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return str.replace("://", "/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private final void j(Context context, File file) {
        AssetManager assets = context.getAssets();
        try {
            String[] list = assets.list("kazoo");
            if (list == null || (r2 = list.length) == 0) {
                return;
            }
            for (String str : list) {
                String path = new File("kazoo", str).getPath();
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                        InputStream open = assets.open(path);
                        if (this.g) {
                            byte[] c = anek.c(open);
                            zte zteVar = this.h;
                            if (zteVar != null) {
                                zteVar.a(str, c, zsu.a);
                            } else {
                                zep.b("Error saving assert, null cache wrapper.");
                            }
                        } else {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            e(open, fileOutputStream);
                            open.close();
                            fileOutputStream.close();
                        }
                    } catch (IOException | SecurityException e) {
                        String valueOf = String.valueOf(str);
                        zep.d(valueOf.length() != 0 ? "Error saving asset: ".concat(valueOf) : new String("Error saving asset: "), e);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    private final void k(String str) {
        if (this.i) {
            zep.c("PresetFilterDebug", str);
        }
    }

    private final void l(File file) {
        File[] listFiles;
        synchronized (this.d) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    l(file2);
                } else {
                    this.e.add(file2.getAbsolutePath());
                }
            }
        }
    }

    public final String d() {
        return String.valueOf(a(this.c).getAbsolutePath()).concat("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Set set) {
        String lastPathSegment;
        ylr.b();
        g();
        if (set == null || set.isEmpty()) {
            return;
        }
        String valueOf = String.valueOf(set);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("fetchNewAssets: ");
        sb.append(valueOf);
        k(sb.toString());
        String.valueOf(String.valueOf(set)).length();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (this.g) {
                String c = c(str);
                String path = new File(this.b.getPath(), c).getPath();
                this.f.add(c);
                lastPathSegment = path;
            } else {
                lastPathSegment = Uri.parse(str).getLastPathSegment();
            }
            synchronized (this.d) {
                if (this.e.contains(lastPathSegment)) {
                    this.l.d(str, lastPathSegment);
                    String valueOf2 = String.valueOf(lastPathSegment);
                    k(valueOf2.length() != 0 ? "onAssetReady already available: ".concat(valueOf2) : new String("onAssetReady already available: "));
                } else if (!this.k.contains(str)) {
                    String valueOf3 = String.valueOf(str);
                    if (valueOf3.length() != 0) {
                        "httpRequestQueue.add: ".concat(valueOf3);
                    }
                    this.j.a(new zsw(this, str, new cez() { // from class: zss
                        @Override // defpackage.cez
                        public final void kV(cff cffVar) {
                            cew cewVar;
                            String valueOf4 = String.valueOf(str);
                            zep.b(valueOf4.length() != 0 ? "Error fetching asset: ".concat(valueOf4) : new String("Error fetching asset: "));
                            if (cffVar == null || (cewVar = cffVar.b) == null) {
                                return;
                            }
                            int i = cewVar.a;
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Response status code: ");
                            sb2.append(i);
                            zep.b(sb2.toString());
                        }
                    }, lastPathSegment, str));
                    this.k.add(str);
                }
            }
        }
    }

    public final void g() {
        File[] listFiles;
        ylr.b();
        if (this.m) {
            return;
        }
        if (this.g) {
            Context context = this.c;
            ylr.b();
            File b = b(context);
            j(context, b);
            this.b = b;
        } else {
            Context context2 = this.c;
            ylr.b();
            File a = a(context2);
            j(context2, a);
            this.a = a;
        }
        synchronized (this.d) {
            if (this.g) {
                l(this.b);
            } else {
                try {
                    for (File file : this.a.listFiles()) {
                        if (file.isFile()) {
                            this.e.add(file.getName());
                        }
                    }
                } catch (SecurityException e) {
                    zep.d("Error finding built-in assets: ", e);
                }
            }
        }
        this.j.c();
        this.m = true;
    }

    public final void h(String str, String str2) {
        synchronized (this.d) {
            this.e.add(str2);
            this.l.d(str, str2);
            String valueOf = String.valueOf(str2);
            k(valueOf.length() != 0 ? "onAssetReady new: ".concat(valueOf) : new String("onAssetReady new: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String[] i() {
        String[] strArr;
        ylr.b();
        g();
        synchronized (this.d) {
            strArr = new String[this.e.size()];
            this.e.toArray(strArr);
        }
        return strArr;
    }
}
