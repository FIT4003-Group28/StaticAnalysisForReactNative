package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acwe  reason: default package */
/* loaded from: classes.dex */
final class acwe implements ynj {
    final /* synthetic */ acwi a;
    private final acvl b;
    private final Class c;
    private final Set d;

    public acwe(acwi acwiVar, acvl acvlVar, Class cls, Class cls2) {
        this.a = acwiVar;
        this.b = acvlVar;
        this.c = cls2;
        this.d = Collections.singleton(cls);
    }

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ymg ymgVar = (ymg) obj;
        acvk a = this.b.a(this.a);
        a.c(ymgVar, this.d, Collections.emptySet());
        this.a.l(a, this.c, true);
        if (!a.a(ymgVar) || a.a) {
            return;
        }
        this.a.b.add(a);
    }
}
