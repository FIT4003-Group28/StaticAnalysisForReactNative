package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zsl  reason: default package */
/* loaded from: classes4.dex */
public final class zsl extends AsyncTask {
    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    public zsl(zsy zsyVar, avyp avypVar, Set set) {
        this.a = new WeakReference(zsyVar);
        this.b = new WeakReference(avypVar);
        this.c = new WeakReference(set);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        zsy zsyVar = (zsy) this.a.get();
        avyp avypVar = (avyp) this.b.get();
        Set set = (Set) this.c.get();
        if (zsyVar == null || avypVar == null || set == null) {
            return null;
        }
        aopu<String> aopuVar = avypVar.f;
        ylr.b();
        zsyVar.g();
        if (aopuVar != null && !aopuVar.isEmpty()) {
            String.valueOf(String.valueOf(aopuVar)).length();
            for (String str : aopuVar) {
                File file = new File(zsyVar.a, str);
                if (file.exists()) {
                    synchronized (zsyVar.d) {
                        try {
                            file.delete();
                            String.valueOf(str).length();
                            zsyVar.e.remove(str);
                        } catch (SecurityException e) {
                            String valueOf = String.valueOf(str);
                            zep.d(valueOf.length() != 0 ? "unable to delete asset: ".concat(valueOf) : new String("unable to delete asset: "), e);
                        }
                    }
                }
            }
        }
        zsyVar.f(set);
        return null;
    }
}
