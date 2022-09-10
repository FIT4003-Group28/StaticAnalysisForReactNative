package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: avpn  reason: default package */
/* loaded from: classes.dex */
public final class avpn {
    public static final String a;
    public static final String b;
    static final String c;
    static final String d;
    static final String e;
    private static final FileFilter h;
    public final Context f;
    public final dehp g;

    public avpn(Context context, dehp dehpVar) {
        this.f = context;
        this.g = dehpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ boolean j(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    private final File k(String str) {
        dbsk.g(!str.contains("/"), "controllerName %s is invalid. It must not be null nor contain any slashes.", str);
        File filesDir = this.f.getFilesDir();
        String valueOf = String.valueOf(c);
        return new File(filesDir, str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
    }

    private final File l(String str) {
        dbsk.g(!str.contains("/"), "controllerName %s is invalid. It must not be null nor contain any slashes.", str);
        File filesDir = this.f.getFilesDir();
        String valueOf = String.valueOf(d);
        return new File(filesDir, str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
    }

    private final File m() {
        String string = Settings.Secure.getString(this.f.getContentResolver(), "android_id");
        String str = a;
        String str2 = File.separator;
        String str3 = File.separator;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(string).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(str2);
        sb.append(string);
        sb.append(str3);
        return new File(bvog.h(this.f), sb.toString());
    }

    private final File n(String str, String str2) {
        return new File(k(str), str2);
    }

    private final File o(String str, String str2) {
        return new File(l(str), str2);
    }

    private static String r(avze avzeVar) {
        String d2 = avzeVar.d();
        String str = File.separator;
        String b2 = avzeVar.e() ? avzeVar.b() : "0";
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + String.valueOf(str).length() + String.valueOf(b2).length());
        sb.append(d2);
        sb.append(str);
        sb.append(b2);
        return sb.toString();
    }

    public final File a(String str, avze avzeVar) {
        return p(str, avzeVar.g());
    }

    public final File b(String str, avze avzeVar) {
        return q(str, avzeVar.g());
    }

    public final File c() {
        return new File(this.f.getFilesDir(), b);
    }

    @dzsi
    public final String d(avze avzeVar) {
        String d2 = avzeVar.d();
        String b2 = avzeVar.b();
        if (dbsd.a(d2, "notLoggedInAccount") || dbsd.a(avzeVar, avze.a)) {
            return null;
        }
        if (b2 == null) {
            return String.format("gmm_offline-%s.db", d2);
        }
        String valueOf = String.valueOf(this.f.getFilesDir());
        String str = File.separator;
        String str2 = e;
        String str3 = File.separator;
        String str4 = File.separator;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(d2).length();
        StringBuilder sb = new StringBuilder(length + 14 + length2 + length3 + length4 + String.valueOf(str3).length() + b2.length() + String.valueOf(str4).length());
        sb.append(valueOf);
        sb.append(str);
        sb.append(str2);
        sb.append(d2);
        sb.append(str3);
        sb.append(b2);
        sb.append(str4);
        sb.append("gmm_offline.db");
        return sb.toString();
    }

    @dzsi
    public final String e() {
        File[] listFiles;
        File m = m();
        if (!j(m) || (listFiles = m.listFiles(h)) == null || listFiles.length == 0) {
            return null;
        }
        return listFiles[0].getName();
    }

    public final Collection<dlrl> f(String str, Iterable<btlu> iterable) {
        File[] listFiles;
        File[] listFiles2;
        ArrayList arrayList = new ArrayList();
        final HashSet hashSet = new HashSet();
        hashSet.add(a(str, avze.a));
        hashSet.add(a(str, avze.h()));
        hashSet.add(o(str, "notLoggedInAccount"));
        hashSet.add(n(str, "notLoggedInAccount"));
        for (btlu btluVar : iterable) {
            if (!btlu.p(btluVar)) {
                String str2 = btluVar.d;
                hashSet.add(n(str, str2));
                hashSet.add(o(str, str2));
            }
        }
        FileFilter fileFilter = new FileFilter(hashSet) { // from class: avpi
            private final Set a;

            {
                this.a = hashSet;
            }

            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                Set set = this.a;
                String str3 = avpn.a;
                return avpn.j(file) && !set.contains(file);
            }
        };
        File k = k(str);
        if (j(k) && (listFiles2 = k.listFiles(fileFilter)) != null) {
            for (File file : listFiles2) {
                dlrk bZ = dlrl.d.bZ();
                String name = file.getName();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlrl dlrlVar = (dlrl) bZ.b;
                name.getClass();
                dlrlVar.a |= 1;
                dlrlVar.b = name;
                arrayList.add(bZ.bK());
            }
        }
        File l = l(str);
        if (j(l) && (listFiles = l.listFiles(fileFilter)) != null) {
            for (File file2 : listFiles) {
                File[] listFiles3 = file2.listFiles(fileFilter);
                if (listFiles3 != null) {
                    for (File file3 : listFiles3) {
                        dlrk bZ2 = dlrl.d.bZ();
                        String name2 = file2.getName();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlrl dlrlVar2 = (dlrl) bZ2.b;
                        name2.getClass();
                        dlrlVar2.a |= 1;
                        dlrlVar2.b = name2;
                        String name3 = file3.getName();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlrl dlrlVar3 = (dlrl) bZ2.b;
                        name3.getClass();
                        dlrlVar3.a |= 2;
                        dlrlVar3.c = name3;
                        arrayList.add(bZ2.bK());
                    }
                }
            }
        }
        return arrayList;
    }

    public final void g(String str, dlrl dlrlVar) {
        File p = p(str, dlrlVar);
        File q = q(str, dlrlVar);
        if (j(p)) {
            bvog.m(p);
            if (!j(q)) {
                return;
            }
            bvog.m(q);
        }
    }

    public final File h(avze avzeVar) {
        File h2;
        File dir = this.f.getDir("offline_downloads", 0);
        if (avzeVar.e() && (h2 = bvog.h(this.f)) != null) {
            dir = new File(h2, "offline_downloads");
        }
        return new File(dir, r(avzeVar));
    }

    public final File i(avze avzeVar) {
        return new File(this.f.getDir("offline_hashes", 0), r(avzeVar));
    }

    static {
        String valueOf = String.valueOf(File.separator);
        String concat = valueOf.length() != 0 ? "users".concat(valueOf) : new String("users");
        a = concat;
        String valueOf2 = String.valueOf(File.separator);
        b = valueOf2.length() != 0 ? "offlinedatabase".concat(valueOf2) : new String("offlinedatabase");
        c = concat;
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2 + String.valueOf(str).length());
        sb.append(concat);
        sb.append("sd");
        sb.append(str);
        d = sb.toString();
        String str2 = File.separator;
        String str3 = File.separator;
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(concat);
        sb2.append("sd");
        sb2.append(str2);
        sb2.append("db");
        sb2.append(str3);
        e = sb2.toString();
        h = avpm.a;
    }

    private final File p(String str, dlrl dlrlVar) {
        String str2 = dlrlVar.b;
        if ((dlrlVar.a & 2) == 0) {
            return n(str, str2);
        }
        return new File(o(str, str2), dlrlVar.c);
    }

    private final File q(String str, dlrl dlrlVar) {
        String str2 = dlrlVar.c;
        String str3 = dlrlVar.b;
        if ((dlrlVar.a & 2) == 0) {
            return n(str, str3);
        }
        File file = new File(m(), str2);
        String str4 = File.separator;
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(str4);
        sb.append(str3);
        return new File(file, sb.toString());
    }
}
