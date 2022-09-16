package defpackage;

import android.graphics.Rect;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: czt  reason: default package */
/* loaded from: classes3.dex */
public final class czt {
    public static final Map a = new HashMap();
    public dbk b;
    private int c;

    private czt() {
    }

    static synchronized czt d(dbk dbkVar, int i) {
        synchronized (czt.class) {
            czt cztVar = new czt();
            cyv X = dbkVar.X();
            if (i >= dbkVar.av().size()) {
                return null;
            }
            k(X, (cyr) dbkVar.av().get(i));
            cztVar.b = dbkVar;
            cztVar.c = i;
            dbkVar.aF(cztVar);
            return cztVar;
        }
    }

    public static czt f(dci dciVar) {
        return e(dciVar.r);
    }

    public static String k(cyv cyvVar, cyr cyrVar) {
        ComponentTree componentTree = cyvVar.j;
        String str = cyrVar.m;
        int identityHashCode = System.identityHashCode(componentTree);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(identityHashCode);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(cyv cyvVar, dbk dbkVar) {
        if (dbkVar.av() == null || dbkVar.av().isEmpty()) {
            return;
        }
        czs czsVar = (czs) a.get(k(cyvVar, (cyr) dbkVar.av().get(0)));
        if (czsVar == null) {
            return;
        }
        new czv(dbkVar);
        czsVar.b();
    }

    private static int q(dbk dbkVar) {
        if (dbkVar == null) {
            return 0;
        }
        return dbkVar.I() + q(s(dbkVar));
    }

    private static int r(dbk dbkVar) {
        if (dbkVar == null) {
            return 0;
        }
        return dbkVar.J() + r(s(dbkVar));
    }

    private static dbk s(dbk dbkVar) {
        dbk al = dbkVar.al();
        return al != null ? al : dbkVar.ak();
    }

    public final Rect a() {
        int I = this.b.I();
        int J2 = this.b.J();
        return new Rect(I, J2, this.b.H() + I, this.b.C() + J2);
    }

    public final Rect b() {
        if (this.c != 0 || this.b.al() != null) {
            int q = q(this.b);
            int r = r(this.b);
            return new Rect(q, r, this.b.H() + q, this.b.C() + r);
        }
        return new Rect(0, 0, this.b.H(), this.b.C());
    }

    public final cyr c() {
        return (cyr) this.b.av().get(this.c);
    }

    public final czv g() {
        if (o()) {
            return new czv(this.b);
        }
        return null;
    }

    public final dci h() {
        cyv X = this.b.X();
        ComponentTree componentTree = X == null ? null : X.j;
        if (componentTree == null) {
            return null;
        }
        return componentTree.getLithoView();
    }

    public final dna i() {
        return this.b.ap();
    }

    public final Object j() {
        cyo cyoVar = ((cyr) this.b.av().get(this.c)).s;
        if (cyoVar != null) {
            return cyoVar.e;
        }
        return null;
    }

    public final String l() {
        cyo cyoVar = ((cyr) this.b.av().get(this.c)).s;
        if (cyoVar == null || (cyoVar.a & 2) == 0) {
            return null;
        }
        return cyoVar.d;
    }

    public final List m() {
        if (!o()) {
            czt d = d(this.b, this.c - 1);
            if (d != null) {
                return Collections.singletonList(d);
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int c = this.b.c();
        for (int i = 0; i < c; i++) {
            dbk ai = this.b.ai(i);
            czt d2 = d(ai, Math.max(0, ((czz) ai).b.size() - 1));
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        dbk aj = this.b.aj();
        if (aj != null && aj.aU()) {
            int c2 = aj.c();
            for (int i2 = 0; i2 < c2; i2++) {
                dbk ai2 = aj.ai(i2);
                czt d3 = d(ai2, Math.max(0, ((czz) ai2).b.size() - 1));
                if (d3 != null) {
                    arrayList.add(d3);
                }
            }
        }
        return arrayList;
    }

    public final boolean o() {
        return this.c == 0;
    }

    public final boolean p(czt cztVar) {
        return this.b == cztVar.b;
    }

    public static czt e(ComponentTree componentTree) {
        dbq dbqVar = componentTree == null ? null : componentTree.t;
        dbk dbkVar = dbqVar == null ? null : dbqVar.k;
        if (dbkVar == null || dbkVar == cyv.a) {
            return null;
        }
        return d(dbkVar, Math.max(0, dbkVar.av().size() - 1));
    }
}
