package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zti  reason: default package */
/* loaded from: classes4.dex */
public final class zti extends AsyncTask {
    private final WeakReference a;
    private final Set b;

    public zti(zsy zsyVar, Set set) {
        this.a = new WeakReference(zsyVar);
        this.b = set;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        zsy zsyVar = (zsy) this.a.get();
        if (zsyVar != null) {
            zsyVar.f(this.b);
            return null;
        }
        return null;
    }
}
