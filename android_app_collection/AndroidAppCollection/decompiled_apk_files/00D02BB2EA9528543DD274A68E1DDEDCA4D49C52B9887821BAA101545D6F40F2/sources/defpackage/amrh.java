package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amrh  reason: default package */
/* loaded from: classes.dex */
public final class amrh {
    public final List<amkz> a;
    public final List<amkz> b;
    public final List<akrk> c;
    public final List<akrk> d;
    public final Map<amsb, Integer> e;
    @dzsi
    public akra f;

    public amrh() {
        ArrayList a = dchl.a();
        this.a = a;
        this.b = Collections.unmodifiableList(a);
        ArrayList a2 = dchl.a();
        this.c = a2;
        this.d = Collections.unmodifiableList(a2);
        this.e = dcjz.k(amsb.class);
    }

    public final void a(amsb amsbVar, amkz amkzVar) {
        this.a.add(amkzVar);
        if (this.e.containsKey(amsbVar)) {
            this.e.put(amsbVar, Integer.valueOf(this.e.get(amsbVar).intValue() + 1));
        } else {
            this.e.put(amsbVar, 1);
        }
    }
}
