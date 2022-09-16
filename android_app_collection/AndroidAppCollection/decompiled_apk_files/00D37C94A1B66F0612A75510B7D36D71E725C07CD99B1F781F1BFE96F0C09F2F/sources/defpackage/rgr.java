package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: rgr  reason: default package */
/* loaded from: classes4.dex */
public final class rgr extends rgj {
    public final rgq b;

    public rgr(Context context, Looper looper, qsv qsvVar, qsw qswVar, qwu qwuVar) {
        super(context, looper, qsvVar, qswVar, qwuVar);
        this.b = new rgq(context, this.a);
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final void l() {
        synchronized (this.b) {
            if (w()) {
                try {
                    rgq rgqVar = this.b;
                    synchronized (rgqVar.b) {
                        for (rgd rgdVar : rgqVar.b.values()) {
                            if (rgdVar != null) {
                                rgqVar.e.b().a(new LocationRequestUpdateData(2, null, rgdVar, null, null, null, null));
                            }
                        }
                        rgqVar.b.clear();
                    }
                    synchronized (rgqVar.d) {
                        for (rga rgaVar : rgqVar.d.values()) {
                            if (rgaVar != null) {
                                rgqVar.e.b().a(LocationRequestUpdateData.a(rgaVar, null));
                            }
                        }
                        rgqVar.d.clear();
                    }
                    synchronized (rgqVar.c) {
                        for (rfx rfxVar : rgqVar.c.values()) {
                            if (rfxVar != null) {
                                rgn b = rgqVar.e.b();
                                DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData = new DeviceOrientationRequestUpdateData(2, null, rfxVar, null);
                                Parcel pv = b.pv();
                                dve.g(pv, deviceOrientationRequestUpdateData);
                                b.px(75, pv);
                            }
                        }
                        rgqVar.c.clear();
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.l();
        }
    }
}
