package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qem  reason: default package */
/* loaded from: classes4.dex */
public final class qem extends qen {
    public Map a;

    @Override // defpackage.qeo
    public final qeq a(String str) {
        qeq qfbVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, qem.class.getClassLoader());
                if (dpd.class.isAssignableFrom(cls)) {
                    dpd dpdVar = (dpd) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new qfb(dpdVar, (qgw) this.a.get(dpdVar.a()));
                } else if (qgi.class.isAssignableFrom(cls)) {
                    return new qey((qgi) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    if (qgg.class.isAssignableFrom(cls)) {
                        return new qey((qgg) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                    sb.append("Could not instantiate mediation adapter: ");
                    sb.append(str);
                    sb.append(" (not a valid adapter).");
                    qfl.e(sb.toString());
                    throw new RemoteException();
                }
            } catch (Throwable unused) {
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    qfbVar = new qey(new AdMobAdapter());
                } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                    qfbVar = new qey(new AdUrlAdapter());
                } else if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    qfbVar = new qey(new CustomEventAdapter());
                } else {
                    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        qfbVar = new qfb(new com.google.ads.mediation.customevent.CustomEventAdapter(), (qgw) this.a.get(qgw.class));
                    }
                    throw new RemoteException();
                }
                return qfbVar;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            qfl.f(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeo
    public final qfj b(String str) {
        return new qfi((qgz) Class.forName(str, false, qfl.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // defpackage.qeo
    public final boolean c(String str) {
        try {
            return qgg.class.isAssignableFrom(Class.forName(str, false, qem.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            qfl.e(sb.toString());
            return false;
        }
    }

    @Override // defpackage.qeo
    public final boolean d(String str) {
        try {
            return qgu.class.isAssignableFrom(Class.forName(str, false, qem.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            qfl.e(sb.toString());
            return false;
        }
    }
}
