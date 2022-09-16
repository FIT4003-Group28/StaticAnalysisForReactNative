package defpackage;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
/* compiled from: PG */
/* renamed from: qmd  reason: default package */
/* loaded from: classes4.dex */
public final class qmd {
    static {
        new qpu("CastDynamiteModule");
    }

    public static qlb a(Context context, CastOptions castOptions, rad radVar, qkx qkxVar) {
        if (radVar == null) {
            return null;
        }
        try {
            return c(context).f(castOptions, radVar, qkxVar);
        } catch (RemoteException | qln unused) {
            return null;
        }
    }

    public static qlf b(Service service, rad radVar, rad radVar2) {
        if (radVar != null && radVar2 != null) {
            try {
                return c(service.getApplicationContext()).g(rac.a(service), radVar, radVar2);
            } catch (RemoteException | qln unused) {
            }
        }
        return null;
    }

    public static qmf c(Context context) {
        try {
            IBinder d = ras.e(context, ras.a, "com.google.android.gms.cast.framework.dynamite").d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (d == null) {
                return null;
            }
            IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof qmf) {
                return (qmf) queryLocalInterface;
            }
            return new qme(d);
        } catch (rao e) {
            throw new qln(e);
        }
    }

    public static qlh d(Context context, String str, String str2, qlm qlmVar) {
        try {
            return c(context).h(str, str2, qlmVar);
        } catch (RemoteException | qln unused) {
            return null;
        }
    }

    public static qom e(Context context, AsyncTask asyncTask, qon qonVar, int i, int i2) {
        try {
            return c(context.getApplicationContext()).i(rac.a(asyncTask), qonVar, i, i2);
        } catch (RemoteException | qln unused) {
            return null;
        }
    }
}
