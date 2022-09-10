package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afcj  reason: default package */
/* loaded from: classes2.dex */
final class afcj {
    public final File[] a;
    @dzsi
    private final bvjj e;
    @dzsi
    public afbz b = null;
    @dzsi
    public afcf c = null;
    public int d = 0;
    private final Map<bvjk, String> f = new HashMap();

    public afcj(File[] fileArr, @dzsi bvjj bvjjVar) {
        this.a = fileArr;
        this.e = bvjjVar;
    }

    public final bvjj a() {
        return this.e;
    }

    public final int b() {
        return this.d == 0 ? 1 : -1;
    }

    public final void c(bvjk bvjkVar, String str) {
        this.f.put(bvjkVar, str);
    }

    public final void d(bvjk bvjkVar) {
        this.f.remove(bvjkVar);
    }

    public final String e(bvjk bvjkVar) {
        return dbsj.e(this.f.get(bvjkVar));
    }

    public final int f() {
        int i = this.d;
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 2 : 3;
    }

    public final void g(afcf afcfVar) {
        String str;
        if (this.c == null) {
            this.c = afcfVar;
            this.d = 1;
        } else {
            this.d++;
        }
        if (afcfVar instanceof afby) {
            afbz afbzVar = this.b;
            dbsk.s(afbzVar);
            File a = afbzVar.a();
            if (a != null) {
                str = a.getAbsolutePath();
                if (str == null) {
                    str = a.getName();
                }
            } else {
                str = "null";
            }
            afcl.g(new bvon("Incognito Operation failed:  (FileOperation) %s  %d  %s", afcfVar.toString(), Integer.valueOf(this.d), str));
            return;
        }
        afcl.g(new bvon("Incognito Operation failed:  (Operation) %s  %d", afcfVar.toString(), Integer.valueOf(this.d)));
    }
}
