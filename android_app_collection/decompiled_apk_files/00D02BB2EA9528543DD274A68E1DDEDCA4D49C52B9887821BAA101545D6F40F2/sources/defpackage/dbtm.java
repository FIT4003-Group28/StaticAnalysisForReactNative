package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbtm  reason: default package */
/* loaded from: classes.dex */
public final class dbtm {
    public final dbrb a;
    public final boolean b;
    public final int c;
    private final dbtl d;

    private dbtm(dbtl dbtlVar) {
        this(dbtlVar, false, dbqx.a, Integer.MAX_VALUE);
    }

    private dbtm(dbtl dbtlVar, boolean z, dbrb dbrbVar, int i) {
        this.d = dbtlVar;
        this.b = z;
        this.a = dbrbVar;
        this.c = i;
    }

    public static dbtm a(char c) {
        return b(dbrb.n(c));
    }

    public static dbtm b(dbrb dbrbVar) {
        return new dbtm(new dbte(dbrbVar));
    }

    public static dbtm c(String str) {
        dbsk.b(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return a(str.charAt(0));
        }
        return new dbtm(new dbtg(str));
    }

    public static dbtm d(String str) {
        dbre g = dbsj.g(str);
        dbsk.g(!g.a("").a(), "The pattern may not match the empty string: %s", g);
        return new dbtm(new dbti(g));
    }

    public final dbtm e() {
        return new dbtm(this.d, true, this.a, this.c);
    }

    public final dbtm f() {
        dbra dbraVar = dbra.b;
        dbsk.s(dbraVar);
        return new dbtm(this.d, this.b, dbraVar, this.c);
    }

    public final Iterable<String> g(CharSequence charSequence) {
        dbsk.s(charSequence);
        return new dbtj(this, charSequence);
    }

    public final Iterator<String> h(CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }

    public final List<String> i(CharSequence charSequence) {
        dbsk.s(charSequence);
        Iterator<String> h = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add(h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final dbtm j() {
        dbsk.e(true, "must be greater than zero: %s", 2);
        return new dbtm(this.d, this.b, this.a, 2);
    }
}
