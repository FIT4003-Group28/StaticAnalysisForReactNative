package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: enk  reason: default package */
/* loaded from: classes3.dex */
final class enk extends eni {
    private final LinkedHashSet b;

    public enk(azqb azqbVar, int i, boolean z, boolean z2, String str) {
        super(azqbVar, i, z, z2, str);
        this.b = new LinkedHashSet();
    }

    @Override // defpackage.eni
    protected final int a() {
        return this.b.size();
    }

    @Override // defpackage.eni, defpackage.enn
    public final void b(eno enoVar) {
        super.b(enoVar);
        this.b.remove(enoVar);
    }

    @Override // defpackage.eni, defpackage.enn
    public final void c(List list) {
        super.c(list);
        if (!list.isEmpty() || this.b.isEmpty()) {
            return;
        }
        list.add((eno) this.b.iterator().next());
    }

    @Override // defpackage.eni, defpackage.enn
    public final void d(eno enoVar, String str, Object obj, boolean z) {
        super.d(enoVar, str, obj, z);
        this.b.remove(enoVar);
        this.b.add(enoVar);
    }
}
