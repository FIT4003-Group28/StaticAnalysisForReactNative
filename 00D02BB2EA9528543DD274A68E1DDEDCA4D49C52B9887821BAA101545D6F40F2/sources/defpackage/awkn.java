package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: awkn  reason: default package */
/* loaded from: classes3.dex */
final class awkn implements avii {
    final WeakReference<awkq> a;

    public awkn(awkq awkqVar) {
        this.a = new WeakReference<>(awkqVar);
    }

    @Override // defpackage.avii
    public final void a(avih avihVar) {
        long j = awkq.a;
        awkq awkqVar = this.a.get();
        if (awkqVar != null) {
            awkqVar.d();
        }
    }

    @Override // defpackage.avii
    public final void b() {
        long j = awkq.a;
        awkq awkqVar = this.a.get();
        if (awkqVar != null) {
            awkqVar.d();
        }
    }

    @Override // defpackage.avii
    public final void c() {
        long j = awkq.a;
        awkq awkqVar = this.a.get();
        if (awkqVar != null) {
            awkqVar.d();
        }
    }
}
