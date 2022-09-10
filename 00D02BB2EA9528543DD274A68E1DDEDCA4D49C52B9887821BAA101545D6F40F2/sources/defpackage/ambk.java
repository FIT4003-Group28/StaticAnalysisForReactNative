package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ambk  reason: default package */
/* loaded from: classes.dex */
public final class ambk {
    public final String b;
    public final decj c;
    public final dcdn<Integer, Integer> d;
    public final int g;
    public final dmwb h;
    public final Map<alwn, String> a = dcjz.j();
    public boolean e = false;
    public boolean f = false;

    public ambk(dmwc dmwcVar) {
        dmwb b = dmwb.b(dmwcVar.c);
        this.h = b == null ? dmwb.MULTIZOOM_STYLE_TABLE : b;
        for (int i = 0; i < dmwcVar.b.size(); i++) {
            dmyp dmypVar = dmwcVar.b.get(i);
            dmyo b2 = dmyo.b(dmypVar.b);
            int i2 = (b2 == null ? dmyo.UNKNOWN : b2).L;
            int length = ambm.b.length;
            if (ambm.b[i2] != null && (dmypVar.a & 2) != 0) {
                alwn alwnVar = ambm.b[i2];
                dbsk.s(alwnVar);
                this.a.put(alwnVar, dmypVar.c);
            }
        }
        this.b = dmwcVar.d;
        dmwl dmwlVar = dmwcVar.e;
        this.c = decj.b((dmwlVar == null ? dmwl.c : dmwlVar).a);
        int i3 = dmwcVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dmwcVar).c(dmwcVar);
            dmwcVar.bC = i3;
        }
        this.g = i3;
        dcdg p = dcdn.p();
        dmwl dmwlVar2 = dmwcVar.e;
        for (dmwj dmwjVar : (dmwlVar2 == null ? dmwl.c : dmwlVar2).b) {
            p.f(Integer.valueOf(dmwjVar.a), Integer.valueOf(dmwjVar.b));
        }
        this.d = p.b();
    }
}
