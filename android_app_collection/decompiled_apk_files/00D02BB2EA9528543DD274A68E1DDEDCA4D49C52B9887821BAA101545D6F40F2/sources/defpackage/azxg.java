package defpackage;

import android.content.Context;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: azxg  reason: default package */
/* loaded from: classes3.dex */
public final class azxg extends azwm<azxg> {
    private final bvrt<dolm> a;

    public azxg(azxf azxfVar) {
        super(azxfVar);
        this.a = bvrt.b(azxfVar.a);
    }

    public static String l(dppt dpptVar, String str) {
        dpsn dpsnVar;
        String concat;
        dpum dpumVar;
        Object[] objArr = new Object[1];
        dppz dppzVar = dpptVar.d;
        if (dppzVar == null) {
            dppzVar = dppz.c;
        }
        dppy b = dppy.b(dppzVar.b);
        if (b == null) {
            b = dppy.UNKNOWN_ITEM_TYPE;
        }
        objArr[0] = Integer.valueOf(b.e);
        String format = String.format("%d:", objArr);
        int i = dpptVar.b;
        int i2 = 5;
        if (i == 0) {
            i2 = 6;
        } else if (i == 2) {
            i2 = 1;
        } else if (i == 3) {
            i2 = 3;
        } else if (i == 4) {
            i2 = 4;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            String valueOf = String.valueOf(format);
            if (dpptVar.b == 2) {
                dpsnVar = (dpsn) dpptVar.c;
            } else {
                dpsnVar = dpsn.d;
            }
            String valueOf2 = String.valueOf(new akqi(dpsnVar.b, (dpptVar.b == 2 ? (dpsn) dpptVar.c : dpsn.d).c).o());
            concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else if (i3 != 2) {
            String str2 = "";
            if (i3 == 3) {
                String valueOf3 = String.valueOf(format);
                if (dpptVar.b == 4) {
                    str2 = (String) dpptVar.c;
                }
                String valueOf4 = String.valueOf(str2);
                concat = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            } else if (i3 == 4) {
                String valueOf5 = String.valueOf(format);
                if (dpptVar.b == 6) {
                    str2 = (String) dpptVar.c;
                }
                String valueOf6 = String.valueOf(str2);
                concat = valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5);
            } else {
                String valueOf7 = String.valueOf(format);
                String valueOf8 = String.valueOf(Base64.encodeToString(dpptVar.bS(), 0));
                concat = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
            }
        } else {
            String valueOf9 = String.valueOf(format);
            Object[] objArr2 = new Object[2];
            if (dpptVar.b == 3) {
                dpumVar = (dpum) dpptVar.c;
            } else {
                dpumVar = dpum.d;
            }
            objArr2[0] = Double.valueOf(dpumVar.b);
            objArr2[1] = Double.valueOf((dpptVar.b == 3 ? (dpum) dpptVar.c : dpum.d).c);
            String valueOf10 = String.valueOf(String.format("%f:%f", objArr2));
            concat = valueOf10.length() != 0 ? valueOf9.concat(valueOf10) : new String(valueOf9);
        }
        return String.format("%s:%s", str, concat);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        dppl dpplVar = g().b;
        if (dpplVar == null) {
            dpplVar = dppl.m;
        }
        return dpplVar.e;
    }

    public final dolm g() {
        return this.a.e((dssr) dolm.f.cu(7), dolm.f);
    }

    @Override // defpackage.azwm
    public final azxm<azxg> h() {
        return azxm.k;
    }

    public final dbsg<String> j() {
        return (g().a & 2) != 0 ? dbsg.i(g().c) : dbpy.a;
    }

    @Override // defpackage.azwm
    /* renamed from: k */
    public final azxf i() {
        return new azxf(this);
    }
}
