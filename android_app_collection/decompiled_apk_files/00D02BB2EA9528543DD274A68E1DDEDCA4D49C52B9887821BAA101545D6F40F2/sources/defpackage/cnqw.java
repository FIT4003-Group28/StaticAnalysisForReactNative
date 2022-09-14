package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnqw  reason: default package */
/* loaded from: classes5.dex */
public final class cnqw extends cnrp {
    private final WeakReference<cnqx> a;

    public cnqw(cnqx cnqxVar) {
        this.a = new WeakReference<>(cnqxVar);
    }

    @Override // defpackage.cnrp
    public final void a() {
        cnqx cnqxVar = this.a.get();
        if (cnqxVar == null) {
            return;
        }
        cnqxVar.f();
    }
}
