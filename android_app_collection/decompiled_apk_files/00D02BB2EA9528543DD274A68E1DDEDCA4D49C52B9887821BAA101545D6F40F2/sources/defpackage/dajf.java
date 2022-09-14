package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* renamed from: dajf  reason: default package */
/* loaded from: classes5.dex */
public final class dajf {
    public static final /* synthetic */ int b = 0;
    private static final Pattern c = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final daix a;

    public dajf(daix daixVar) {
        this.a = daixVar;
    }

    public static void a(dajl dajlVar, dajc dajcVar) {
        ZipFile zipFile;
        String[] strArr;
        try {
            zipFile = new ZipFile(dajlVar.a());
        } catch (IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            dajlVar.b();
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = c.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new daje(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str)) {
                    for (daje dajeVar : (Set) hashMap.get(str)) {
                        if (hashMap2.containsKey(dajeVar.a)) {
                            String str2 = dajeVar.a;
                        } else {
                            hashMap2.put(dajeVar.a, dajeVar);
                            String str3 = dajeVar.a;
                        }
                    }
                }
            }
            dajcVar.a(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    deki.a(e, e3);
                }
            }
            throw e;
        }
    }

    public final void b(dajl dajlVar, Set<daje> set, dajd dajdVar) {
        for (daje dajeVar : set) {
            daix daixVar = this.a;
            String b2 = dajlVar.b();
            File h = daix.h(daixVar.g(b2), dajeVar.a);
            boolean z = false;
            if (h.exists() && h.length() == dajeVar.b.getSize()) {
                z = true;
            }
            dajdVar.a(dajeVar, h, z);
        }
    }
}
