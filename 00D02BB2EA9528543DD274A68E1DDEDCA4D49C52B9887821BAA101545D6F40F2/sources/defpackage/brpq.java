package defpackage;

import defpackage.brpv;
import defpackage.dssj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brpq  reason: default package */
/* loaded from: classes4.dex */
public final class brpq<T extends dssj, K extends brpv> {
    public final Map<String, ArrayList<brpp>> a = new HashMap();
    public final String b;
    public final cqat c;
    final btni d;
    private final dxio<akfa> e;
    private final dbsg<Long> f;
    @dzsi
    private btlu g;
    private final int h;

    public brpq(int i, String str, dxio<akfa> dxioVar, btmv btmvVar, cqat cqatVar, dbsg<Long> dbsgVar) {
        brpn brpnVar = new brpn(this);
        this.d = brpnVar;
        this.h = i;
        this.b = str;
        this.e = dxioVar;
        btmvVar.a(brpnVar, str);
        this.c = cqatVar;
        this.f = dbsgVar;
    }

    private final void e() {
        if (!btlu.g(this.g, this.e.a().j())) {
            c();
            this.g = this.e.a().j();
        }
    }

    public final void a(K k, T t) {
        e();
        if (this.h <= 0) {
            return;
        }
        ArrayList<brpp> arrayList = this.a.get(k.b());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(k.b(), arrayList);
        }
        if (arrayList.size() >= this.h) {
            arrayList.remove(0);
        }
        arrayList.add(new brpp(this, t, k, this.f.a() ? dbsg.i(Long.valueOf(this.c.b() + this.f.b().longValue())) : dbpy.a));
    }

    @dzsi
    public final T b(K k) {
        e();
        ArrayList<brpp> arrayList = this.a.get(k.b());
        T t = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f.a()) {
                ListIterator<brpp> listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    brpp next = listIterator.next();
                    if (next.c.a() && next.c.b().longValue() < next.d.c.b()) {
                        listIterator.remove();
                    }
                }
            }
            int size = arrayList.size();
            brpu brpuVar = null;
            for (int i = 0; i < size; i++) {
                brpp brppVar = arrayList.get(i);
                brpu a = k.a(brppVar.b);
                if (a.a() && (brpuVar == null || a.b(brpuVar))) {
                    t = (T) brppVar.a;
                    brpuVar = a;
                }
            }
        }
        return t;
    }

    public final void c() {
        this.a.clear();
    }

    public final int d() {
        return this.a.size();
    }
}
