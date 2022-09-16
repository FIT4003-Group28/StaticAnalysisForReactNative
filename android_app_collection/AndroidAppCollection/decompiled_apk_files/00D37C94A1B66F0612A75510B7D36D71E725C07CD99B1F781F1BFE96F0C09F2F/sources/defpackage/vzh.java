package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: vzh  reason: default package */
/* loaded from: classes4.dex */
final class vzh implements Runnable {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ vzi b;

    public vzh(WeakReference weakReference, vzi vziVar) {
        this.a = weakReference;
        this.b = vziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cfa cfaVar = (cfa) this.a.get();
        if (cfaVar != null) {
            cfaVar.lG(this.b);
        }
    }
}
