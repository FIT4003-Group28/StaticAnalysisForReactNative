package defpackage;

import android.database.DataSetObserver;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jno  reason: default package */
/* loaded from: classes7.dex */
public final class jno extends DataSetObserver {
    private final WeakReference<jnq> a;

    public jno(jnq jnqVar) {
        this.a = new WeakReference<>(jnqVar);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        jnp jnpVar;
        jnq jnqVar = this.a.get();
        if (jnqVar == null || (jnpVar = jnqVar.u) == null) {
            return;
        }
        jnqVar.t = false;
        jnpVar.i(2);
        jnqVar.t = true;
    }
}
