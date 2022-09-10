package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: ctun  reason: default package */
/* loaded from: classes5.dex */
public final class ctun {
    public static dbsg<cufb> a(dxks dxksVar) {
        dxlh dxlhVar;
        cucr cucrVar = new cucr();
        int a = dxop.a(dxksVar.c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 2;
        int i3 = 5;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 == 2) {
            i3 = 2;
        } else if (i2 == 3) {
            i3 = 3;
        } else if (i2 == 4) {
            i3 = 4;
        } else if (i2 != 5) {
            i3 = 0;
        }
        cucrVar.a = Integer.valueOf(i3);
        int a2 = dxop.a(dxksVar.c);
        if (a2 != 0) {
            i = a2;
        }
        int i4 = i - 2;
        if (i4 == 3 || i4 == 4) {
            if (dxksVar.a == 11) {
                dxlhVar = (dxlh) dxksVar.b;
            } else {
                dxlhVar = dxlh.b;
            }
            dccx F = dcdc.F();
            for (dxnc dxncVar : dxlhVar.a) {
                F.g(ctus.c(dxncVar));
            }
            cuea cueaVar = new cuea();
            dcdc<ContactId> f = F.f();
            if (f != null) {
                cueaVar.a = f;
                String str = "";
                String str2 = cueaVar.a == null ? " contactIds" : str;
                if (!str2.isEmpty()) {
                    throw new IllegalStateException(str2.length() != 0 ? "Missing required properties:".concat(str2) : new String("Missing required properties:"));
                }
                cucrVar.b = (cufa) ((dbsu) dbsg.i(new cuaj(new cueb(cueaVar.a)))).a;
                if (cucrVar.a == null) {
                    str = " type";
                }
                if (cucrVar.b == null) {
                    str = str.concat(" metadata");
                }
                if (str.isEmpty()) {
                    return dbsg.i(new cucs(cucrVar.a.intValue(), cucrVar.b));
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null contactIds");
        }
        return dbpy.a;
    }
}
