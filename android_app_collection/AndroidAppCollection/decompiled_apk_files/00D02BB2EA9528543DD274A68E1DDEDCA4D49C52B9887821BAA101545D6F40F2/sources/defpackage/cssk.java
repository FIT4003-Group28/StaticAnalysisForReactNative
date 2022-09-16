package defpackage;
/* compiled from: PG */
/* renamed from: cssk  reason: default package */
/* loaded from: classes5.dex */
public final class cssk {
    public static dayi a(dhdi dhdiVar) {
        if (!dhdiVar.a.isEmpty()) {
            dayc daycVar = dhdiVar.a.get(0).a;
            if (daycVar == null) {
                daycVar = dayc.e;
            }
            dsrj<dayi> dsrjVar = daycVar.b;
            if (dsrjVar.isEmpty()) {
                return null;
            }
            for (dayi dayiVar : dsrjVar) {
                if ((dayiVar.a & 1) != 0) {
                    daye dayeVar = dayiVar.b;
                    if (dayeVar == null) {
                        dayeVar = daye.b;
                    }
                    if (dayeVar.a) {
                        return dayiVar;
                    }
                }
            }
            return dsrjVar.get(0);
        }
        return null;
    }
}
