package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qey  reason: default package */
/* loaded from: classes4.dex */
public final class qey extends qep {
    private final Object a;
    private qez b;
    private rad c;
    private qfx d;

    public qey(qgg qggVar) {
        this.a = qggVar;
    }

    private final Bundle G(String str, AdRequestParcel adRequestParcel, String str2) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Server parameters: ".concat(valueOf);
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (adRequestParcel != null) {
                    bundle.putInt("tagForChildDirectedTreatment", adRequestParcel.g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            qfl.c(th);
            throw new RemoteException();
        }
    }

    private static final boolean H(AdRequestParcel adRequestParcel) {
        if (!adRequestParcel.f) {
            qar.c();
            return qga.e();
        }
        return true;
    }

    private final void I(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.m.getBundle(this.a.getClass().getName()) != null) {
            return;
        }
        new Bundle();
    }

    private static final void J(String str, AdRequestParcel adRequestParcel) {
        String str2 = adRequestParcel.u;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // defpackage.qeq
    public final qdr A() {
        qez qezVar = this.b;
        if (qezVar != null) {
            qds qdsVar = qezVar.b;
            if (!(qdsVar instanceof qds)) {
                return null;
            }
            return qdsVar.a;
        }
        return null;
    }

    @Override // defpackage.qeq
    public final void B(rad radVar, qfx qfxVar) {
        Object obj = this.a;
        if (!(obj instanceof qgg)) {
            String canonicalName = qgg.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
        this.c = radVar;
        this.d = qfxVar;
        rad a = rac.a(obj);
        Parcel pv = qfxVar.pv();
        dve.i(pv, a);
        qfxVar.px(1, pv);
    }

    @Override // defpackage.qeq
    public final void C() {
        Object obj = this.a;
        if (!(obj instanceof qgg)) {
            return;
        }
        ((qgg) obj).c();
        throw null;
    }

    @Override // defpackage.qeq
    public final void D() {
        Object obj = this.a;
        if (!(obj instanceof qgg)) {
            return;
        }
        ((qgg) obj).b();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qeq
    public final void E(rad radVar, List list) {
        char c;
        if (!(this.a instanceof qgg)) {
            throw new RemoteException();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediationConfigurationParcel mediationConfigurationParcel = (MediationConfigurationParcel) it.next();
            String str = mediationConfigurationParcel.a;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4) {
                Bundle bundle = mediationConfigurationParcel.b;
                arrayList.add(new qzv());
            }
        }
        Context context = (Context) rac.b(radVar);
        ((qgg) this.a).a();
    }

    @Override // defpackage.qeq
    public final void F(rad radVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2) {
        Object obj = this.a;
        if (obj instanceof qgg) {
            try {
                qgg qggVar = (qgg) obj;
                Context context = (Context) rac.b(radVar);
                G(str, adRequestParcel, str2);
                I(adRequestParcel);
                H(adRequestParcel);
                Location location = adRequestParcel.k;
                int i = adRequestParcel.g;
                int i2 = adRequestParcel.t;
                J(str, adRequestParcel);
                int i3 = adSizeParcel.e;
                int i4 = adSizeParcel.b;
                pzb pzbVar = new pzb(i3, i4);
                pzbVar.h = true;
                pzbVar.i = i4;
                throw null;
            } catch (Exception e) {
                qfl.c(e);
                throw new RemoteException();
            }
        }
        String canonicalName = qgg.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final Bundle a() {
        Object obj = this.a;
        if (!(obj instanceof qha)) {
            String canonicalName = qha.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qfl.e(sb.toString());
            return new Bundle();
        }
        return ((qha) obj).a();
    }

    @Override // defpackage.qeq
    public final Bundle b() {
        Object obj = this.a;
        if (!(obj instanceof qhb)) {
            String canonicalName = qhb.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qfl.e(sb.toString());
            return new Bundle();
        }
        return ((qhb) obj).getInterstitialAdapterInfo();
    }

    @Override // defpackage.qeq
    public final Bundle c() {
        return new Bundle();
    }

    @Override // defpackage.qeq
    public final qcg d() {
        Object obj = this.a;
        if (obj instanceof qgt) {
            try {
                return ((qgt) obj).getVideoController();
            } catch (Throwable th) {
                qfl.c(th);
            }
        }
        return null;
    }

    @Override // defpackage.qeq
    public final qew e() {
        qez qezVar;
        qgs qgsVar;
        if (!(this.a instanceof qgn) || (qezVar = this.b) == null || (qgsVar = qezVar.a) == null) {
            return null;
        }
        return new qev(qgsVar);
    }

    @Override // defpackage.qeq
    public final rad f() {
        Object obj = this.a;
        if (obj instanceof qgj) {
            try {
                return rac.a(((qgj) obj).getBannerView());
            } catch (Throwable th) {
                qfl.c(th);
                throw new RemoteException();
            }
        } else if (obj instanceof qgg) {
            return rac.a(null);
        } else {
            String canonicalName = qgj.class.getCanonicalName();
            String canonicalName2 = qgg.class.getCanonicalName();
            String canonicalName3 = this.a.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeq
    public final void g() {
        Object obj = this.a;
        if (!(obj instanceof qgi)) {
            return;
        }
        try {
            ((qgi) obj).onDestroy();
        } catch (Throwable th) {
            qfl.c(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeq
    public final void h(AdRequestParcel adRequestParcel, String str) {
        w(adRequestParcel, str);
    }

    @Override // defpackage.qeq
    public final void i(rad radVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, qet qetVar) {
        j(radVar, adSizeParcel, adRequestParcel, str, null, qetVar);
    }

    @Override // defpackage.qeq
    public final void j(rad radVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, qet qetVar) {
        pzb k;
        RemoteException remoteException;
        Object obj = this.a;
        if ((obj instanceof qgj) || (obj instanceof qgg)) {
            if (adSizeParcel.n) {
                int i = adSizeParcel.e;
                int i2 = adSizeParcel.b;
                k = new pzb(i, i2);
                k.f = true;
                k.g = i2;
            } else {
                k = pxv.k(adSizeParcel.e, adSizeParcel.b, adSizeParcel.a);
            }
            pzb pzbVar = k;
            Object obj2 = this.a;
            Date date = null;
            if (obj2 instanceof qgj) {
                try {
                    qgj qgjVar = (qgj) obj2;
                    List list = adRequestParcel.e;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = adRequestParcel.b;
                    if (j != -1) {
                        date = new Date(j);
                    }
                    Date date2 = date;
                    int i3 = adRequestParcel.d;
                    Location location = adRequestParcel.k;
                    boolean H = H(adRequestParcel);
                    int i4 = adRequestParcel.g;
                    boolean z = adRequestParcel.r;
                    int i5 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    qgjVar.requestBannerAd((Context) rac.b(radVar), new qez(qetVar), G(str, adRequestParcel, str2), pzbVar, new qex(date2, i3, hashSet, location, H, i4, z), adRequestParcel.m.getBundle(qgjVar.getClass().getName()));
                    return;
                } finally {
                }
            } else if (!(obj2 instanceof qgg)) {
                return;
            } else {
                try {
                    qgg qggVar = (qgg) obj2;
                    Context context = (Context) rac.b(radVar);
                    G(str, adRequestParcel, str2);
                    I(adRequestParcel);
                    H(adRequestParcel);
                    Location location2 = adRequestParcel.k;
                    int i6 = adRequestParcel.g;
                    int i7 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    throw null;
                } finally {
                }
            }
        }
        String canonicalName = qgj.class.getCanonicalName();
        String canonicalName2 = qgg.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void k(rad radVar, AdRequestParcel adRequestParcel, String str, qet qetVar) {
        l(radVar, adRequestParcel, str, null, qetVar);
    }

    @Override // defpackage.qeq
    public final void l(rad radVar, AdRequestParcel adRequestParcel, String str, String str2, qet qetVar) {
        RemoteException remoteException;
        Object obj = this.a;
        Date date = null;
        if (obj instanceof qgl) {
            try {
                qgl qglVar = (qgl) obj;
                List list = adRequestParcel.e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = adRequestParcel.b;
                if (j != -1) {
                    date = new Date(j);
                }
                int i = adRequestParcel.d;
                Location location = adRequestParcel.k;
                boolean H = H(adRequestParcel);
                int i2 = adRequestParcel.g;
                boolean z = adRequestParcel.r;
                int i3 = adRequestParcel.t;
                J(str, adRequestParcel);
                qglVar.requestInterstitialAd((Context) rac.b(radVar), new qez(qetVar), G(str, adRequestParcel, str2), new qex(date, i, hashSet, location, H, i2, z), adRequestParcel.m.getBundle(qglVar.getClass().getName()));
            } finally {
            }
        } else if (obj instanceof qgg) {
            try {
                qgg qggVar = (qgg) obj;
                Context context = (Context) rac.b(radVar);
                G(str, adRequestParcel, str2);
                I(adRequestParcel);
                H(adRequestParcel);
                Location location2 = adRequestParcel.k;
                int i4 = adRequestParcel.g;
                int i5 = adRequestParcel.t;
                J(str, adRequestParcel);
                throw null;
            } finally {
            }
        } else {
            String canonicalName = qgl.class.getCanonicalName();
            String canonicalName2 = qgg.class.getCanonicalName();
            String canonicalName3 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeq
    public final void m(rad radVar, AdRequestParcel adRequestParcel, String str, String str2, qet qetVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
        RemoteException remoteException;
        Object obj = this.a;
        Date date = null;
        if (obj instanceof qgn) {
            try {
                qgn qgnVar = (qgn) obj;
                List list2 = adRequestParcel.e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j = adRequestParcel.b;
                if (j != -1) {
                    date = new Date(j);
                }
                Date date2 = date;
                int i = adRequestParcel.d;
                Location location = adRequestParcel.k;
                boolean H = H(adRequestParcel);
                int i2 = adRequestParcel.g;
                boolean z = adRequestParcel.r;
                int i3 = adRequestParcel.t;
                J(str, adRequestParcel);
                qfa qfaVar = new qfa(date2, i, hashSet, location, H, i2, nativeAdOptionsParcel, list, z);
                Bundle bundle = adRequestParcel.m.getBundle(qgnVar.getClass().getName());
                this.b = new qez(qetVar);
                qgnVar.requestNativeAd((Context) rac.b(radVar), this.b, G(str, adRequestParcel, str2), qfaVar, bundle);
            } finally {
            }
        } else if (obj instanceof qgg) {
            try {
                qgg qggVar = (qgg) obj;
                Context context = (Context) rac.b(radVar);
                G(str, adRequestParcel, str2);
                I(adRequestParcel);
                H(adRequestParcel);
                Location location2 = adRequestParcel.k;
                int i4 = adRequestParcel.g;
                int i5 = adRequestParcel.t;
                J(str, adRequestParcel);
                throw null;
            } finally {
            }
        } else {
            String canonicalName = qgn.class.getCanonicalName();
            String canonicalName2 = qgg.class.getCanonicalName();
            String canonicalName3 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeq
    public final void n(rad radVar) {
        Context context = (Context) rac.b(radVar);
        Object obj = this.a;
        if (obj instanceof qgq) {
            ((qgq) obj).a();
        }
    }

    @Override // defpackage.qeq
    public final void o() {
        Object obj = this.a;
        if (!(obj instanceof qgi)) {
            return;
        }
        try {
            ((qgi) obj).onPause();
        } catch (Throwable th) {
            qfl.c(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeq
    public final void p() {
        Object obj = this.a;
        if (!(obj instanceof qgi)) {
            return;
        }
        try {
            ((qgi) obj).onResume();
        } catch (Throwable th) {
            qfl.c(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.qeq
    public final void q(boolean z) {
        Object obj = this.a;
        if (obj instanceof qgr) {
            try {
                ((qgr) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                qfl.c(th);
                return;
            }
        }
        String canonicalName = qgr.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        String.valueOf(canonicalName).length();
        String.valueOf(canonicalName2).length();
    }

    @Override // defpackage.qeq
    public final void r() {
        Object obj = this.a;
        if (obj instanceof qgl) {
            try {
                ((qgl) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                qfl.c(th);
                throw new RemoteException();
            }
        }
        String canonicalName = qgl.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void s() {
        if (!(this.a instanceof qgg)) {
            String canonicalName = qgg.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
        qfl.b("Can not show null mediated rewarded ad.");
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final boolean t() {
        if (this.a instanceof qgg) {
            return this.d != null;
        }
        String canonicalName = qgg.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void u() {
        qfl.e("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void v(rad radVar, AdRequestParcel adRequestParcel, String str) {
        Object obj = this.a;
        if (obj instanceof qgg) {
            try {
                qgg qggVar = (qgg) obj;
                Context context = (Context) rac.b(radVar);
                G(str, adRequestParcel, null);
                I(adRequestParcel);
                H(adRequestParcel);
                Location location = adRequestParcel.k;
                int i = adRequestParcel.g;
                int i2 = adRequestParcel.t;
                J(str, adRequestParcel);
                throw null;
            } catch (Exception e) {
                qfl.c(e);
                throw new RemoteException();
            }
        }
        String canonicalName = qgg.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void w(AdRequestParcel adRequestParcel, String str) {
        Object obj = this.a;
        if (!(obj instanceof qgg)) {
            String canonicalName = qgg.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
        rad radVar = this.c;
        new qes((qgg) obj, this.d);
        v(radVar, adRequestParcel, str);
    }

    @Override // defpackage.qeq
    public final void x(rad radVar, AdRequestParcel adRequestParcel, String str) {
        Object obj = this.a;
        if (obj instanceof qgg) {
            try {
                qgg qggVar = (qgg) obj;
                Context context = (Context) rac.b(radVar);
                G(str, adRequestParcel, null);
                I(adRequestParcel);
                H(adRequestParcel);
                Location location = adRequestParcel.k;
                int i = adRequestParcel.g;
                int i2 = adRequestParcel.t;
                J(str, adRequestParcel);
                throw null;
            } catch (Exception e) {
                qfl.c(e);
                throw new RemoteException();
            }
        }
        String canonicalName = qgg.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void y() {
        Object obj = this.a;
        if ((obj instanceof qgg) || (obj instanceof qgl)) {
            if (obj instanceof qgl) {
                r();
                return;
            } else {
                qfl.b("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = qgl.class.getCanonicalName();
        String canonicalName2 = qgg.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qfl.e(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.qeq
    public final void z() {
        if (!(this.a instanceof qgg)) {
            String canonicalName = qgg.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qfl.e(sb.toString());
            throw new RemoteException();
        }
        qfl.b("Can not show null mediation rewarded ad.");
        throw new RemoteException();
    }

    public qey(qgi qgiVar) {
        this.a = qgiVar;
    }
}
