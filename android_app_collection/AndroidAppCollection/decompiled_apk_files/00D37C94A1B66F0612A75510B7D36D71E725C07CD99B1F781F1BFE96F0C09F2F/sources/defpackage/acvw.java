package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acvw  reason: default package */
/* loaded from: classes.dex */
final class acvw implements acvn {
    protected final Set a = new HashSet();
    protected final Set b = new HashSet();
    final /* synthetic */ acvz c;
    private final acvl d;
    private final Class e;
    private final ampt f;
    private final boolean g;

    public acvw(acvz acvzVar, acvl acvlVar, Class cls, ampt amptVar, boolean z) {
        this.c = acvzVar;
        acvlVar.getClass();
        this.d = acvlVar;
        this.e = cls;
        this.f = amptVar;
        this.g = z;
    }

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ymg ymgVar = (ymg) obj;
        ampt amptVar = this.f;
        if (amptVar == null || amptVar.a(ymgVar)) {
            acvk a = this.d.a(this.c);
            a.c(ymgVar, this.a, this.b);
            this.c.l(a, this.e, this.g);
            this.c.a.add(a);
        }
    }

    @Override // defpackage.acvn
    public final void b(Class cls) {
        this.b.add(cls);
    }

    @Override // defpackage.acvn
    public final void c(Class cls) {
        this.a.add(cls);
    }
}
