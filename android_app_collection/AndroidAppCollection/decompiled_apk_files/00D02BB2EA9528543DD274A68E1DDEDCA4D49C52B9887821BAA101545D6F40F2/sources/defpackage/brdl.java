package defpackage;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: brdl  reason: default package */
/* loaded from: classes4.dex */
public class brdl {
    public final String a;
    public final String b;
    public final dcep<Integer> c;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public String e;
    private final brda f;
    @dzsi
    private dehn<List<brcz>> g;

    private brdl(brda brdaVar, String str, @dzsi String str2, Iterable<Integer> iterable, Iterable<Integer> iterable2, String str3) {
        this.f = brdaVar;
        this.a = str;
        this.b = dbsj.e(str2);
        this.e = str3;
        this.c = dcep.L(iterable);
        for (Integer num : iterable2) {
            this.d.put(num.intValue(), true);
        }
    }

    public static brdl a(brda brdaVar, brcy brcyVar) {
        brdl brdlVar = new brdl(brdaVar, brcyVar.a(), brcyVar.b(), brcyVar.d(), brcyVar.e(), brcyVar.c());
        brdlVar.b();
        return brdlVar;
    }

    public final dehn<List<brcz>> b() {
        dehn<List<brcz>> dehnVar = this.g;
        if (dehnVar != null) {
            if (dehnVar.isDone()) {
                try {
                    deha.r(dehnVar);
                } catch (ExecutionException unused) {
                }
            }
            return this.g;
        }
        dehn<List<brcz>> o = deha.o(deew.h(this.f.a(), new dbrn(this) { // from class: brdj
            private final brdl a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                brdl brdlVar = this.a;
                brde brdeVar = (brde) obj;
                dccx G = dcdc.G(brdeVar.c.size());
                dcdc dcdcVar = brdeVar.c;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    G.g(new brdk(brdlVar, brdeVar, ((Integer) dcdcVar.get(i)).intValue()));
                }
                return G.f();
            }
        }, dege.a));
        this.g = o;
        return o;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("id", this.a);
        b.b("androidId", this.b);
        b.b("name", this.e);
        b.b("defaultConnectors", this.c);
        b.b("selectedConnectors", this.d);
        return b.toString();
    }
}
