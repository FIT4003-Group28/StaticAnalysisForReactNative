package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggp  reason: default package */
/* loaded from: classes.dex */
public class aggp implements aggn {
    private final zdp a;
    private final aatb b;
    private final aggo c;
    protected final snc d;
    public jdj e;
    private final agvw f;
    private final agkn g;

    public aggp(snc sncVar, zdp zdpVar, aatb aatbVar, aggo aggoVar, agvw agvwVar, agkn agknVar) {
        this.d = sncVar;
        this.a = zdpVar;
        this.b = aatbVar;
        this.c = aggoVar;
        this.f = agvwVar;
        this.g = agknVar;
    }

    private static int b(snc sncVar, Collection collection) {
        Iterator it = collection.iterator();
        int i = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(sncVar.c() - ((agqv) it.next()).g);
            if (seconds >= 0 && seconds < i) {
                i = seconds;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x002b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: all -> 0x0313, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x002b, B:9:0x0031, B:18:0x0055, B:22:0x006e, B:24:0x0079, B:25:0x0089, B:28:0x00a2, B:13:0x003f, B:16:0x004d, B:29:0x00a8, B:31:0x00ae, B:33:0x00b2, B:35:0x00c7, B:36:0x00e4, B:37:0x00e8, B:39:0x00ee, B:40:0x00fa, B:44:0x012b, B:45:0x014c, B:46:0x015b, B:47:0x0166, B:49:0x016c, B:51:0x0177, B:53:0x017d, B:55:0x0181, B:56:0x0183, B:59:0x0194, B:61:0x01a2, B:64:0x01af, B:65:0x01bf, B:66:0x01d2, B:68:0x01d8, B:70:0x01e3, B:72:0x01e7, B:73:0x01e9, B:74:0x01f1, B:75:0x01fb, B:77:0x0201, B:79:0x0207, B:81:0x020b, B:82:0x020d, B:85:0x021a, B:87:0x0224, B:90:0x022d, B:91:0x023a, B:92:0x0245, B:94:0x024b, B:96:0x0256, B:98:0x025a, B:99:0x025c, B:100:0x0264, B:101:0x026a, B:103:0x0270, B:105:0x0276, B:107:0x027a, B:108:0x027c, B:109:0x0287, B:111:0x028d, B:113:0x0299, B:114:0x029d, B:115:0x02ab, B:116:0x02b7, B:118:0x02bd, B:120:0x02cc, B:122:0x02d2, B:123:0x02da, B:125:0x02de, B:126:0x02ea, B:130:0x02f4, B:132:0x0304, B:134:0x030e, B:133:0x0309, B:43:0x0125), top: B:142:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    @Override // defpackage.aggn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int a(java.lang.String r16, defpackage.agvx r17) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggp.a(java.lang.String, agvx):int");
    }
}
