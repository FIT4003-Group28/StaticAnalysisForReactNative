package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dywb  reason: default package */
/* loaded from: classes6.dex */
final class dywb {
    public static final dyya a = new dyya(dyya.d, "https");
    public static final dyya b = new dyya(dyya.d, "http");
    public static final dyya c = new dyya(dyya.b, "POST");
    public static final dyya d = new dyya(dyya.b, "GET");
    public static final dyya e = new dyya(dyow.f.a, "application/grpc");
    public static final dyya f = new dyya("te", "trailers");

    public static List<dyya> a(dyhw dyhwVar, String str, String str2, String str3, boolean z, boolean z2) {
        dbsk.t(dyhwVar, "headers");
        dbsk.t(str, "defaultPath");
        dbsk.t(str2, "authority");
        dyhwVar.j(dyow.f);
        dyhwVar.j(dyow.g);
        dyhwVar.j(dyow.h);
        ArrayList arrayList = new ArrayList(dygq.d(dyhwVar) + 7);
        if (z2) {
            arrayList.add(b);
        } else {
            arrayList.add(a);
        }
        if (z) {
            arrayList.add(d);
        } else {
            arrayList.add(c);
        }
        arrayList.add(new dyya(dyya.e, str2));
        arrayList.add(new dyya(dyya.c, str));
        arrayList.add(new dyya(dyow.h.a, str3));
        arrayList.add(e);
        arrayList.add(f);
        byte[][] a2 = dyvo.a(dyhwVar);
        for (int i = 0; i < a2.length; i += 2) {
            eajc a3 = eajc.a(a2[i]);
            String c2 = a3.c();
            if (!c2.startsWith(":") && !dyow.f.a.equalsIgnoreCase(c2) && !dyow.h.a.equalsIgnoreCase(c2)) {
                arrayList.add(new dyya(a3, eajc.a(a2[i + 1])));
            }
        }
        return arrayList;
    }
}
