package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yum  reason: default package */
/* loaded from: classes7.dex */
public final class yum implements aa<yvk> {
    final /* synthetic */ Set a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ Iterable c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ x f;
    final /* synthetic */ yuu g;

    public yum(yuu yuuVar, Set set, AtomicBoolean atomicBoolean, Iterable iterable, int i, boolean z, x xVar) {
        this.g = yuuVar;
        this.a = set;
        this.b = atomicBoolean;
        this.c = iterable;
        this.d = i;
        this.e = z;
        this.f = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.app.Activity, m] */
    @Override // defpackage.aa
    /* renamed from: a */
    public final synchronized void m(yvk yvkVar) {
        if (yvkVar == null) {
            return;
        }
        this.a.remove(yvkVar.a());
        if (!this.a.isEmpty() || !this.b.get()) {
            return;
        }
        this.b.set(false);
        this.g.c(this.c, this.d, this.e);
        this.f.e(this.g.k);
    }
}
