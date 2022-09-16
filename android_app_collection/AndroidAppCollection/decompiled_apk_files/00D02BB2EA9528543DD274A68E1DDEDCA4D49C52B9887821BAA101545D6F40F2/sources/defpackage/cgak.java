package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgak  reason: default package */
/* loaded from: classes4.dex */
public class cgak {
    private final btrm c;
    private boolean d = false;
    public z<List<dwmk>> a = new z<>();
    public HashMap<String, docg> b = new HashMap<>();

    public cgak(btrm btrmVar) {
        this.c = btrmVar;
    }

    public static String g(dwmk dwmkVar) {
        dwlh dwlhVar = dwmkVar.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        return dniuVar.b;
    }

    public final void a(List<dwmk> list) {
        this.a.g(list);
        final dcep B = dcbg.b(list).s(cgag.a).B();
        dcft.y(this.b.keySet(), new dbsl(B) { // from class: cgah
            private final dcep a;

            {
                this.a = B;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.contains((String) obj);
            }
        });
    }

    public final void b(final String str) {
        this.a.g(dcbg.b(f()).o(new dbsl(str) { // from class: cgai
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                dwmk dwmkVar = (dwmk) obj;
                dbsk.s(dwmkVar);
                return !str2.equals(cgak.g(dwmkVar));
            }
        }).z());
        this.b.remove(str);
    }

    public final synchronized void c() {
        if (!this.d) {
            btrm btrmVar = this.c;
            dceq a = dcet.a();
            a.b(bqje.class, new cgal(bqje.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a.a());
            this.d = true;
        }
    }

    public final synchronized void d() {
        if (this.d) {
            this.c.a(this);
            this.d = false;
        }
    }

    public final dbsg<docg> e(dwmk dwmkVar) {
        String g = g(dwmkVar);
        return this.b.containsKey(g) ? dbsg.i(this.b.get(g)) : dbpy.a;
    }

    public final List<dwmk> f() {
        return (List) dbsg.j(this.a.h()).c(dcdc.e());
    }
}
