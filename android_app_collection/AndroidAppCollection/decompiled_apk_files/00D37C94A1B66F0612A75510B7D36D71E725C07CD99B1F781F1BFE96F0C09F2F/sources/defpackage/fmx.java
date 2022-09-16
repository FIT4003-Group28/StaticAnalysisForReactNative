package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: fmx  reason: default package */
/* loaded from: classes3.dex */
public final class fmx {
    public final oet a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public int c;

    public fmx(oet oetVar) {
        this.a = oetVar;
    }

    public final void a(fmw fmwVar) {
        this.b.add(fmwVar);
    }
}
