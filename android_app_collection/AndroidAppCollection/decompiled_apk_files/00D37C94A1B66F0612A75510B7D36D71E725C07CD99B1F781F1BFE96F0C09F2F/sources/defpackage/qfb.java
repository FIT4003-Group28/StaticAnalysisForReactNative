package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qfb  reason: default package */
/* loaded from: classes4.dex */
public final class qfb extends qep {
    private final dpd a;
    private final qgw b;

    public qfb(dpd dpdVar, qgw qgwVar) {
        this.a = dpdVar;
        this.b = qgwVar;
    }

    private final dpi G(String str) {
        HashMap hashMap;
        Field[] fields;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            dpi dpiVar = (dpi) this.a.b().newInstance();
            HashMap hashMap2 = new HashMap();
            for (Field field : dpiVar.getClass().getFields()) {
                dph dphVar = (dph) field.getAnnotation(dph.class);
                if (dphVar != null) {
                    hashMap2.put(dphVar.a(), field);
                }
            }
            if (hashMap2.isEmpty()) {
                qfl.e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Field field2 = (Field) hashMap2.remove(entry.getKey());
                if (field2 != null) {
                    try {
                        try {
                            field2.set(dpiVar, entry.getValue());
                        } catch (IllegalArgumentException unused) {
                            String str2 = (String) entry.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 43);
                            sb.append("Server option \"");
                            sb.append(str2);
                            sb.append("\" could not be set: Bad Type");
                            qfl.e(sb.toString());
                        }
                    } catch (IllegalAccessException unused2) {
                        String str3 = (String) entry.getKey();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 49);
                        sb2.append("Server option \"");
                        sb2.append(str3);
                        sb2.append("\" could not be set: Illegal Access");
                        qfl.e(sb2.toString());
                    }
                } else {
                    String.valueOf((String) entry.getKey()).length();
                    String.valueOf((String) entry.getValue()).length();
                }
            }
            StringBuilder sb3 = new StringBuilder();
            for (Field field3 : hashMap2.values()) {
                if (((dph) field3.getAnnotation(dph.class)).b()) {
                    String valueOf = String.valueOf(((dph) field3.getAnnotation(dph.class)).a());
                    qfl.e(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(((dph) field3.getAnnotation(dph.class)).a());
                }
            }
            if (sb3.length() <= 0) {
                return dpiVar;
            }
            String valueOf2 = String.valueOf(sb3.toString());
            throw new dpg(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        } catch (Throwable th) {
            qfl.c(th);
            throw new RemoteException();
        }
    }

    private static final void H(AdRequestParcel adRequestParcel) {
        if (!adRequestParcel.f) {
            qar.c();
            qga.e();
        }
    }

    @Override // defpackage.qeq
    public final qdr A() {
        return null;
    }

    @Override // defpackage.qeq
    public final void B(rad radVar, qfx qfxVar) {
    }

    @Override // defpackage.qeq
    public final void C() {
    }

    @Override // defpackage.qeq
    public final void D() {
    }

    @Override // defpackage.qeq
    public final void E(rad radVar, List list) {
    }

    @Override // defpackage.qeq
    public final void F(rad radVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2) {
    }

    @Override // defpackage.qeq
    public final Bundle a() {
        return new Bundle();
    }

    @Override // defpackage.qeq
    public final Bundle b() {
        return new Bundle();
    }

    @Override // defpackage.qeq
    public final Bundle c() {
        return new Bundle();
    }

    @Override // defpackage.qeq
    public final qcg d() {
        return null;
    }

    @Override // defpackage.qeq
    public final qew e() {
        return null;
    }

    @Override // defpackage.qeq
    public final rad f() {
        dpd dpdVar = this.a;
        if (dpdVar instanceof dpe) {
            try {
                ((dpe) dpdVar).d();
                return rac.a(null);
            } catch (Throwable th) {
                qfl.c(th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(dpdVar.getClass().getCanonicalName());
        qfl.e(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void h(AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.qeq
    public final void i(rad radVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, qet qetVar) {
        j(radVar, adSizeParcel, adRequestParcel, str, null, qetVar);
    }

    @Override // defpackage.qeq
    public final void j(rad radVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, qet qetVar) {
        dpd dpdVar = this.a;
        if (dpdVar instanceof dpe) {
            try {
                dpe dpeVar = (dpe) dpdVar;
                qfd qfdVar = new qfd(qetVar);
                Activity activity = (Activity) rac.b(radVar);
                dpi G = G(str);
                int i = 0;
                dnk[] dnkVarArr = {dnk.a, dnk.b, dnk.c, dnk.d, dnk.e, dnk.f};
                while (true) {
                    if (i >= 6) {
                        new dnk(pxv.k(adSizeParcel.e, adSizeParcel.b, adSizeParcel.a));
                        break;
                    }
                    pzb pzbVar = dnkVarArr[i].g;
                    if (pzbVar.c == adSizeParcel.e && pzbVar.d == adSizeParcel.b) {
                        break;
                    }
                    i++;
                }
                H(adRequestParcel);
                ptx.j(adRequestParcel);
                dpeVar.e(qfdVar, G, this.b);
                return;
            } catch (Throwable th) {
                qfl.c(th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(dpdVar.getClass().getCanonicalName());
        qfl.e(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void k(rad radVar, AdRequestParcel adRequestParcel, String str, qet qetVar) {
        l(radVar, adRequestParcel, str, null, qetVar);
    }

    @Override // defpackage.qeq
    public final void l(rad radVar, AdRequestParcel adRequestParcel, String str, String str2, qet qetVar) {
        dpd dpdVar = this.a;
        if (dpdVar instanceof dpf) {
            try {
                qfd qfdVar = new qfd(qetVar);
                Activity activity = (Activity) rac.b(radVar);
                dpi G = G(str);
                H(adRequestParcel);
                ptx.j(adRequestParcel);
                ((dpf) dpdVar).g(qfdVar, G, this.b);
                return;
            } catch (Throwable th) {
                qfl.c(th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(dpdVar.getClass().getCanonicalName());
        qfl.e(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void m(rad radVar, AdRequestParcel adRequestParcel, String str, String str2, qet qetVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
    }

    @Override // defpackage.qeq
    public final void n(rad radVar) {
    }

    @Override // defpackage.qeq
    public final void o() {
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void p() {
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void q(boolean z) {
    }

    @Override // defpackage.qeq
    public final void r() {
        dpd dpdVar = this.a;
        if (dpdVar instanceof dpf) {
            try {
                ((dpf) dpdVar).f();
                return;
            } catch (Throwable th) {
                qfl.c(th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(dpdVar.getClass().getCanonicalName());
        qfl.e(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void s() {
    }

    @Override // defpackage.qeq
    public final boolean t() {
        return true;
    }

    @Override // defpackage.qeq
    public final void u() {
    }

    @Override // defpackage.qeq
    public final void v(rad radVar, AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.qeq
    public final void w(AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.qeq
    public final void x(rad radVar, AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.qeq
    public final void y() {
    }

    @Override // defpackage.qeq
    public final void z() {
    }

    @Override // defpackage.qeq
    public final void g() {
        try {
            this.a.c();
        } catch (Throwable th) {
            qfl.c(th);
            throw new RemoteException();
        }
    }
}
