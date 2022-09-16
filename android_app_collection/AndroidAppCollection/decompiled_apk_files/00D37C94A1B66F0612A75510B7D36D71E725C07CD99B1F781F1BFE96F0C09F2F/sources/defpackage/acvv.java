package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acvv  reason: default package */
/* loaded from: classes.dex */
final class acvv implements ynj {
    final /* synthetic */ acvz a;
    private final acvl b;
    private final Class c;
    private final Set d;

    public acvv(acvz acvzVar, acvl acvlVar, Class cls, Class cls2) {
        this.a = acvzVar;
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
