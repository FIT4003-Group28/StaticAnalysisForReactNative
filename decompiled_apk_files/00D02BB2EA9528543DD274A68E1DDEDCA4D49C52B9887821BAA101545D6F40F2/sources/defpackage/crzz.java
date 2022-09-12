package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: crzz  reason: default package */
/* loaded from: classes.dex */
public final class crzz<T> implements crzp<T> {
    final WeakReference<crzp<T>> a;

    public crzz(WeakReference<crzp<T>> weakReference) {
        this.a = weakReference;
    }

    public static <T> crzz<T> b(crzp<T> crzpVar) {
        return new crzz<>(new WeakReference(crzpVar));
    }

    @Override // defpackage.crzp
    public final void On(crzm<T> crzmVar) {
        crzp<T> crzpVar = this.a.get();
        if (crzpVar != null) {
            crzpVar.On(crzmVar);
        }
    }
}
