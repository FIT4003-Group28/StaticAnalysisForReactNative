package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: aknz  reason: default package */
/* loaded from: classes.dex */
public final class aknz {
    public final Set a;
    public final Set b;
    public final Set c;
    public apzg d;
    public final String e;

    public aknz() {
        new HashSet();
        new ArrayList();
        new HashMap();
        this.a = new HashSet();
        this.b = Collections.newSetFromMap(new WeakHashMap());
        this.c = Collections.newSetFromMap(new WeakHashMap());
        new HashMap();
        new ArrayList();
        this.e = "";
    }

    public final void a(akny aknyVar) {
        ylr.c();
        this.c.add(aknyVar);
        b(aknyVar);
    }

    public final void b(akny aknyVar) {
        aknyVar.a(this);
    }

    public final void c(akny aknyVar) {
        ylr.c();
        this.c.remove(aknyVar);
    }
}
