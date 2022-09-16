package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxqp  reason: default package */
/* loaded from: classes4.dex */
public class bxqp implements bxok {
    private final dcdc<zdu> a;
    private final int b;
    @dzsi
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public bxqp(dxbo dxboVar, Context context, btvo btvoVar) {
        int a = dvub.a(btvoVar.getSuggestParameters().n);
        boolean z = true;
        a = a == 0 ? 1 : a;
        boolean z2 = a == 2 || a == 3;
        this.e = z2;
        this.d = !z2 && a != 1;
        this.f = a == 4 || a == 5;
        boolean z3 = a == 2 || a == 4 || a == 6;
        boolean z4 = a == 3 || a == 5 || a == 7;
        dccx F = dcdc.F();
        String str = null;
        if (z3) {
            for (dxbm dxbmVar : dxboVar.a) {
                dpce dpceVar = dxbmVar.a;
                if (dpceVar == null) {
                    dpceVar = dpce.f;
                }
                F.g(new zsg(null, new zvb(dpceVar)));
            }
        }
        dcdc<zdu> f = F.f();
        this.a = f;
        this.b = Math.max(dxboVar.b - f.size(), 0);
        if (z4) {
            String str2 = dxboVar.c;
            if (dbtw.a(str2)) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(context.getString(R.string.TRANSIT_HEADER_SEPARATOR));
                for (dxbm dxbmVar2 : dxboVar.a) {
                    dpce dpceVar2 = dxbmVar2.a;
                    doul doulVar = (dpceVar2 == null ? dpce.f : dpceVar2).c;
                    String str3 = (doulVar == null ? doul.f : doulVar).b;
                    if (!dbtw.a(str3)) {
                        if (!z) {
                            sb.append(context.getString(R.string.TRANSIT_LINES_SEPARATOR));
                        }
                        sb.append(str3);
                        z = false;
                    }
                }
                str = sb.toString();
            }
        }
        this.c = str;
    }

    @Override // defpackage.bxok
    public List<zdu> a() {
        return this.a;
    }

    @Override // defpackage.bxok
    public Integer b() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bxok
    @dzsi
    public String c() {
        return this.c;
    }

    @Override // defpackage.bxok
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bxok
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bxok
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }
}
