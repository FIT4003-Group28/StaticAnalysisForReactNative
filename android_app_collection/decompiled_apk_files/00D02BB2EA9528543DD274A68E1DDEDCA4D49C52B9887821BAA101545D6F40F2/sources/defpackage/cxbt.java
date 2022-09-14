package defpackage;

import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxbt  reason: default package */
/* loaded from: classes5.dex */
public final class cxbt {
    public final File a;
    public final List<Pattern> b;
    public final List<eabo> e;
    private final int f;
    public final Queue<cxbs> c = new ArrayDeque();
    private final Map<File, Long> g = new HashMap();
    public final Queue<Pair<File, String>> d = new ArrayDeque();

    public cxbt(File file, List<eabo> list, int i, dcdc<Pattern> dcdcVar) {
        this.a = file;
        this.f = i;
        this.e = list;
        this.b = dcdcVar;
    }

    private final long c(File[] fileArr) {
        long longValue;
        long j = 0;
        try {
            for (File file : fileArr) {
                if (!cxbu.a(file)) {
                    if (file.isFile()) {
                        longValue = file.length();
                    } else if (file.isDirectory()) {
                        Long l = this.g.get(file);
                        if (l == null) {
                            l = Long.valueOf(c(file.listFiles()));
                            this.g.put(file, l);
                        }
                        longValue = l.longValue();
                    }
                    j += longValue;
                }
            }
        } catch (IOException | SecurityException unused) {
        }
        return j;
    }

    public final void a(cxbs cxbsVar) {
        try {
            File[] listFiles = cxbsVar.a().listFiles();
            if (cxbsVar.b >= this.f) {
                return;
            }
            for (File file : listFiles) {
                if (!cxbu.a(file)) {
                    if (file.isFile()) {
                        Queue<Pair<File, String>> queue = this.d;
                        String name = file.getName();
                        if (cxbsVar.b != 0) {
                            String str = cxbsVar.a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
                            sb.append(str);
                            sb.append('/');
                            sb.append(name);
                            name = sb.toString();
                        }
                        queue.add(Pair.create(file, name));
                    } else if (file.isDirectory()) {
                        this.c.add(new cxbs(this, cxbsVar, file.getName()));
                    }
                }
            }
        } catch (IOException | SecurityException unused) {
            String str2 = cxbsVar.a;
        }
    }

    public final void b(cxbs cxbsVar) {
        eabn bZ = eabo.e.bZ();
        String str = cxbsVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eabo eaboVar = (eabo) bZ.b;
        str.getClass();
        eaboVar.a |= 1;
        eaboVar.b = str;
        long c = c(cxbsVar.a().listFiles());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eabo eaboVar2 = (eabo) bZ.b;
        eaboVar2.a |= 2;
        eaboVar2.d = c;
        this.e.add(bZ.bK());
    }
}
