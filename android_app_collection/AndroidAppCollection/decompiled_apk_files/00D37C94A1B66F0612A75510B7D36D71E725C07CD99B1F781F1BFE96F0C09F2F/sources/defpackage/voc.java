package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: voc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class voc implements Runnable {
    public final /* synthetic */ vok a;
    private final /* synthetic */ int b;

    public /* synthetic */ voc(vok vokVar, int i) {
        this.b = i;
        this.a = vokVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            vok vokVar = this.a;
            synchronized (vokVar.i) {
                if (vokVar.l == 0) {
                    vokVar.d();
                }
            }
            return;
        }
        vok vokVar2 = this.a;
        synchronized (vokVar2.i) {
            ankt anktVar = vokVar2.k;
            if (vokVar2.l == 0 && anktVar != null) {
                vokVar2.k = null;
                if (!anktVar.cancel(true)) {
                    try {
                        ((SQLiteDatabase) anlz.y(anktVar)).close();
                    } catch (ExecutionException unused) {
                    }
                }
                vokVar2.b.unregisterComponentCallbacks(vokVar2);
                Iterator it = vokVar2.h.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == null) {
                        it.remove();
                    }
                }
            }
        }
    }
}
