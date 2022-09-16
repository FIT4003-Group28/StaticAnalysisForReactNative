package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wvw  reason: default package */
/* loaded from: classes4.dex */
public final class wvw {
    private final wkn a;
    private final Map b = new EnumMap(apcd.class);
    private final Map c = new EnumMap(apcb.class);
    private final Map d = new EnumMap(apcf.class);
    private final wnb e;

    public wvw(wkn wknVar, wnb wnbVar) {
        this.a = wknVar;
        this.e = wnbVar;
    }

    public final synchronized String a(apcb apcbVar, String str) {
        String str2;
        int intValue = this.c.containsKey(apcbVar) ? ((Integer) this.c.get(apcbVar)).intValue() : 0;
        str2 = str + "_" + apcbVar.name() + "_" + intValue;
        this.c.put(apcbVar, Integer.valueOf(intValue + 1));
        return str2;
    }

    public final synchronized String b(apcd apcdVar) {
        if (this.a.l) {
            int intValue = this.b.containsKey(apcdVar) ? ((Integer) this.b.get(apcdVar)).intValue() : 0;
            String str = apcdVar.name() + "_" + intValue;
            this.b.put(apcdVar, Integer.valueOf(intValue + 1));
            return str;
        }
        return this.e.a();
    }

    public final synchronized String c(apcf apcfVar) {
        String str;
        int intValue = this.d.containsKey(apcfVar) ? ((Integer) this.d.get(apcfVar)).intValue() : 0;
        str = apcfVar.name() + "_" + intValue;
        this.d.put(apcfVar, Integer.valueOf(intValue + 1));
        return str;
    }
}
