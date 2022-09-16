package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zik  reason: default package */
/* loaded from: classes4.dex */
public final class zik implements zin, ynl {
    public static final String a = zep.a("DP.InfoProvider");
    public final yrj b;
    public zii c;
    private final Executor d;
    private zim e;
    private final azqb f;
    private final aadd g;
    private final TelephonyManager h;
    private final zih i;

    public zik(yrj yrjVar, Executor executor, azqb azqbVar, aadd aaddVar, Context context, zih zihVar) {
        this.b = yrjVar;
        this.d = executor;
        this.f = azqbVar;
        this.g = aaddVar;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.h = telephonyManager;
        this.i = zihVar;
    }

    @Override // defpackage.zin
    public final zii a() {
        return this.c;
    }

    public final void b(String str) {
        atxv atxvVar;
        String simOperator = this.h.getSimState() == 5 ? this.h.getSimOperator() : null;
        if (simOperator != null) {
            if (this.g.a() != null) {
                atdy atdyVar = this.g.a().i;
                if (atdyVar == null) {
                    atdyVar = atdy.a;
                }
                atxvVar = atdyVar.l;
                if (atxvVar == null) {
                    atxvVar = atxv.a;
                }
            } else {
                atxvVar = atxv.a;
            }
            for (atxt atxtVar : atxvVar.b) {
                for (String str2 : atxtVar.b) {
                    if (str2.equals(simOperator)) {
                        if (this.e == null) {
                            this.e = (zim) this.f.get();
                        }
                        zig zigVar = new zig(this.i, simOperator);
                        zim zimVar = this.e;
                        rqz rqzVar = new rqz();
                        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = rqzVar.a;
                        mdpCarrierPlanIdRequest.a = "AIzaSyDHQ9ipnphqTzDqZsbtd8_Ru4_kiKVQe2k";
                        if (str != null) {
                            if (mdpCarrierPlanIdRequest.b == null) {
                                mdpCarrierPlanIdRequest.b = new Bundle();
                            }
                            rqzVar.a.b.putString("cpid_to_be_invalidated", str);
                        }
                        anlz.A(tjk.e(zimVar.b.a(rqzVar.a).b(zimVar.a, rcb.c)), new zij(this, zigVar), this.d);
                        return;
                    }
                }
            }
        }
        this.c = null;
    }

    @Override // defpackage.zin
    public final void c(String str) {
        b(str);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((ypy) obj).a() && this.b.m()) {
                    b(null);
                    return null;
                }
                this.c = null;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }
}
