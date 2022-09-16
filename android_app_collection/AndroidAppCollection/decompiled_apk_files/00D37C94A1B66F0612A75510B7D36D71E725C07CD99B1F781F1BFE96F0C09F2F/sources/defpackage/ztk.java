package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ztk  reason: default package */
/* loaded from: classes4.dex */
final class ztk extends AsyncTask {
    private final WeakReference a;

    public ztk(zsy zsyVar) {
        this.a = new WeakReference(zsyVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        zsy zsyVar = (zsy) this.a.get();
        if (zsyVar == null) {
            return null;
        }
        final zte zteVar = zsyVar.h;
        if (zteVar == null) {
            zep.b("Error updateSwazzleAssets cache wrapper is null.");
            return null;
        }
        final Set set = zsyVar.f;
        zteVar.c.execute(new Runnable() { // from class: ztc
            @Override // java.lang.Runnable
            public final void run() {
                zte zteVar2 = zte.this;
                Set set2 = set;
                znh znhVar = zteVar2.a;
                if (znhVar == null) {
                    return;
                }
                znhVar.a(set2);
            }
        });
        return null;
    }
}
