package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ocg  reason: default package */
/* loaded from: classes3.dex */
public final class ocg implements odb {
    public final ajyj a;
    public final Set b;
    private final ajwb c;
    private final ocf d;

    public ocg(ajwb ajwbVar, ajyj ajyjVar) {
        ajwbVar.getClass();
        this.c = ajwbVar;
        ajyjVar.getClass();
        this.a = ajyjVar;
        this.b = Collections.newSetFromMap(new WeakHashMap());
        ajrj ajrjVar = ajwbVar.e;
        ocf ocfVar = new ocf(this, ajrjVar);
        this.d = ocfVar;
        ajrjVar.lT(ocfVar);
    }

    @Override // defpackage.odb
    public final void a() {
        this.c.f.h(new ajqv(this.d, new ampt() { // from class: oce
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                return !ocg.this.b.contains(obj) && !(obj instanceof ajyv);
            }
        }));
        this.d.pi();
    }

    @Override // defpackage.odb
    public final void b() {
        this.c.H();
    }
}
