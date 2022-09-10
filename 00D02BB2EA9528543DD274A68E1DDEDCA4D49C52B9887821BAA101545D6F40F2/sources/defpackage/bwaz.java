package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwaz  reason: default package */
/* loaded from: classes4.dex */
public final class bwaz extends bvwn<dmhu> {
    private final dxio<ache> b;

    public bwaz(dxio<ache> dxioVar) {
        super(dmhu.d);
        this.b = dxioVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmhu dmhuVar) {
        achc achcVar;
        achb b;
        dmhu dmhuVar2 = dmhuVar;
        try {
            int a = dmgu.a(dmhuVar2.a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                achcVar = achc.MERCHANT_BIZ_INFO;
            } else if (i == 2) {
                achcVar = achc.TIMELINE;
            } else if (i == 3) {
                achcVar = achc.MERCHANT_INFO_UPDATE;
            } else if (i != 4) {
                String valueOf = String.valueOf(Integer.toString(i));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                achcVar = achc.MERCHANT_PERFORMANCE;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(dmhuVar2.b);
            if (unmodifiableMap.isEmpty()) {
                b = null;
            } else {
                acgz b2 = achb.b();
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    b2.c((String) entry.getKey(), (String) entry.getValue());
                }
                b = b2.b();
            }
            this.b.a().k(false, true, achcVar, b);
        } catch (IllegalArgumentException unused) {
            bvwi c = bvwj.c();
            c.b(drtc.INVALID_ARGUMENT);
            int a2 = dmgu.a(dmhuVar2.a);
            String str = (a2 == 0 || a2 == 1) ? "UNKNOWN_REPORT_STATE" : a2 != 2 ? a2 != 4 ? a2 != 5 ? "TIMELINE" : "MERCHANT_PERFORMANCE" : "MERCHANT_INFO_UPDATE" : "MERCHANT_BIZ_INFO";
            c.c(str.length() != 0 ? "Invalid value for report_state: ".concat(str) : new String("Invalid value for report_state: "));
            throw c.a();
        }
    }
}
