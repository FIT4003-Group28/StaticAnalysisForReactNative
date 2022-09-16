package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ahix  reason: default package */
/* loaded from: classes.dex */
public final class ahix implements ahih {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public ahix(ahih... ahihVarArr) {
        for (int i = 0; i < 2; i++) {
            a(ahihVarArr[i]);
        }
    }

    public final void a(ahih ahihVar) {
        this.a.add(ahihVar);
    }

    @Override // defpackage.ahih
    public final void kT() {
        for (ahih ahihVar : this.a) {
            ahihVar.kT();
        }
    }

    @Override // defpackage.ahih
    public final void l(auaz auazVar, boolean z) {
        for (ahih ahihVar : this.a) {
            ahihVar.l(auazVar, z);
        }
    }

    @Override // defpackage.ahih
    public final void m(long j, long j2) {
        for (ahih ahihVar : this.a) {
            ahihVar.m(j, j2);
        }
    }
}
