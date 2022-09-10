package defpackage;

import java.io.PrintWriter;
import java.util.EnumSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vxo  reason: default package */
/* loaded from: classes7.dex */
public class vxo implements btph {
    @dzsi
    public final dxio<vpd> a;
    private final dxio<bvjj> b;
    private final dxio<akfa> c;
    private final dbsg<vxn> d;

    public vxo(dxio<bvjj> dxioVar, dxio<akfa> dxioVar2, @dzsi dxio<vpd> dxioVar3, dbsg<vxn> dbsgVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.a = dxioVar3;
        this.d = dbsgVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final EnumSet<vux> a() {
        return b(this.c.a().j());
    }

    public final EnumSet<vux> b(@dzsi btlu btluVar) {
        bvjj a = this.b.a();
        return a.J(a.E(bvjk.hs, btluVar, null), vux.class);
    }

    public final void d(EnumSet<vux> enumSet) {
        btlu j = this.c.a().j();
        if (j == null) {
            j = btlu.b;
        }
        e(j, enumSet);
        if (this.d.a()) {
            this.d.b().b(j, enumSet);
        }
    }

    public final void e(btlu btluVar, EnumSet<vux> enumSet) {
        this.b.a().ag(bvjk.hs, btluVar, bvjj.ak(enumSet));
    }

    public final void f(Map<vux, Integer> map) {
        EnumSet<vux> a = a();
        if (a == null) {
            a = EnumSet.noneOf(vux.class);
        }
        for (Map.Entry<vux, Integer> entry : map.entrySet()) {
            vux key = entry.getKey();
            dbsk.s(key);
            Integer value = entry.getValue();
            dbsk.s(value);
            int intValue = value.intValue();
            int ordinal = key.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            if (intValue != 0) {
                                a.add(vux.AVOID_FERRIES);
                            } else {
                                a.remove(vux.AVOID_FERRIES);
                            }
                        }
                    } else if (intValue != 0) {
                        a.add(vux.AVOID_TOLLS);
                    } else {
                        a.remove(vux.AVOID_TOLLS);
                    }
                } else if (intValue != 0) {
                    a.add(vux.AVOID_HIGHWAYS);
                } else {
                    a.remove(vux.AVOID_HIGHWAYS);
                }
            } else if (intValue != 0) {
                a.add(vux.GOOD_TO_GO);
            } else {
                a.remove(vux.GOOD_TO_GO);
            }
        }
        d(a);
        if (this.a != null) {
            dowl dowlVar = dowl.UNSET;
            if (map.containsKey(vux.AVOID_ODD_EVEN_ROADS)) {
                dowlVar = dowl.b(map.get(vux.AVOID_ODD_EVEN_ROADS).intValue());
            }
            this.a.a().g(vpc.JAKARTA, dowlVar);
            dowl dowlVar2 = dowl.UNSET;
            if (map.containsKey(vux.AVOID_RODIZIO_AREAS)) {
                dowlVar2 = dowl.b(map.get(vux.AVOID_RODIZIO_AREAS).intValue());
            }
            this.a.a().g(vpc.SAO_PAULO, dowlVar2);
            dowl dowlVar3 = dowl.UNSET;
            if (map.containsKey(vux.AVOID_MANILA_NUMBER_CODING_ROADS)) {
                dowlVar3 = dowl.b(map.get(vux.AVOID_MANILA_NUMBER_CODING_ROADS).intValue());
            }
            this.a.a().g(vpc.MANILA, dowlVar3);
        }
    }
}
