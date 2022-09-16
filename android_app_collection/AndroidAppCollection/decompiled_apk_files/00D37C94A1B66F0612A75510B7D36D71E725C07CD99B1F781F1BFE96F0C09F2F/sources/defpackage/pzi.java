package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdapterResponseInfoParcel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pzi  reason: default package */
/* loaded from: classes4.dex */
public final class pzi {
    private final List a = new ArrayList();
    private final qcd b;

    public pzi(qcd qcdVar) {
        this.b = qcdVar;
        if (((Boolean) qdb.z.e()).booleanValue()) {
            try {
                Parcel pw = qcdVar.pw(3, qcdVar.pv());
                ArrayList<AdapterResponseInfoParcel> createTypedArrayList = pw.createTypedArrayList(AdapterResponseInfoParcel.CREATOR);
                pw.recycle();
                if (createTypedArrayList == null) {
                    return;
                }
                for (AdapterResponseInfoParcel adapterResponseInfoParcel : createTypedArrayList) {
                    pzd pzdVar = adapterResponseInfoParcel != null ? new pzd(adapterResponseInfoParcel) : null;
                    if (pzdVar != null) {
                        this.a.add(pzdVar);
                    }
                }
            } catch (RemoteException e) {
                qfl.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = null;
        try {
            qcd qcdVar = this.b;
            Parcel pw = qcdVar.pw(2, qcdVar.pv());
            str = pw.readString();
            pw.recycle();
        } catch (RemoteException e) {
            qfl.d("Could not forward getResponseId to ResponseInfo.", e);
            str = null;
        }
        if (str == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", str);
        }
        try {
            qcd qcdVar2 = this.b;
            Parcel pw2 = qcdVar2.pw(1, qcdVar2.pv());
            String readString = pw2.readString();
            pw2.recycle();
            str2 = readString;
        } catch (RemoteException e2) {
            qfl.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
        }
        if (str2 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", str2);
        }
        JSONArray jSONArray = new JSONArray();
        for (pzd pzdVar : this.a) {
            jSONArray.put(pzdVar.a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
