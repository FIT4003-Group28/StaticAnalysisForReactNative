package defpackage;

import java.io.File;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxlb  reason: default package */
/* loaded from: classes5.dex */
public abstract class cxlb<T> {
    public static final cxla c = new cxla();
    final cxji d;
    final String e;
    public final boolean g = false;
    final cxlz<T> f = new cxlz<>(new dbty(this) { // from class: cxkw
        private final cxlb a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return this.a.a();
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    public cxlb(cxji cxjiVar, String str) {
        this.d = cxjiVar;
        this.e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, T> a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final T e(String str) {
        T t;
        cxlz<T> cxlzVar = this.f;
        Map<String, T> map = cxlzVar.b;
        if (map == null) {
            synchronized (cxlzVar.a) {
                Map<String, T> map2 = cxlzVar.b;
                if (map2 == null) {
                    map2 = cxlzVar.c.a();
                    dbsk.s(map2);
                    cxlzVar.b = map2;
                    cxlzVar.c = null;
                }
                t = map2.get(str);
            }
            return t;
        }
        return map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File f() {
        return new File(this.d.b.getDir("phenotype_file", 0), String.valueOf(this.e).concat(".pb"));
    }
}
