package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: adx  reason: default package */
/* loaded from: classes.dex */
final class adx implements DialogInterface.OnClickListener {
    private final WeakReference a;

    public adx(ady adyVar) {
        this.a = new WeakReference(adyVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.get() != null) {
            ((ady) this.a.get()).q(true);
        }
    }
}
