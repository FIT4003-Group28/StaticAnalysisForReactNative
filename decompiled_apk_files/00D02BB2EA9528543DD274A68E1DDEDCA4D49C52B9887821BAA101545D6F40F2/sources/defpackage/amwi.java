package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
/* compiled from: PG */
/* renamed from: amwi  reason: default package */
/* loaded from: classes2.dex */
public final class amwi implements amwh {
    private final cqat b;
    private final bwsa c;
    private volatile boolean d = false;
    private final Map<alyh, amwg> e = Collections.synchronizedMap(dcjz.d());

    public amwi(cqat cqatVar, bwsa bwsaVar) {
        this.b = cqatVar;
        this.c = bwsaVar;
    }

    private final synchronized void f() {
        int length;
        this.e.clear();
        try {
            byte[] a = this.c.a("TILE_HISTORY");
            if (a == null || (length = a.length) == 0) {
                return;
            }
            dwyx dwyxVar = (dwyx) bvrs.j((dssr) dwyx.b.cu(7), a, length, dsqa.b());
            int size = dwyxVar.a.size();
            for (int i = 0; i < size; i++) {
                amwg h = amwg.h(dwyxVar.a.get(i), this.b);
                this.e.put(h.b, h);
            }
            this.e.size();
        } catch (IOException unused) {
            this.e.clear();
            this.c.b("TILE_HISTORY");
        }
    }

    @Override // defpackage.amwh
    public final synchronized void a() {
        if (!this.d) {
            f();
            e();
            this.d = true;
        }
    }

    @Override // defpackage.amwh
    public final synchronized void b(akra akraVar, dwyu dwyuVar, String str, @dzsi Integer num) {
        alyh a = alyh.a(14, akraVar);
        if (a == null) {
            return;
        }
        amwg amwgVar = this.e.get(a);
        if (amwgVar == null) {
            amwgVar = new amwg(a, dcjz.d(), null, amwg.a, this.b);
        }
        if (str != null) {
            amwgVar.c = str;
        }
        if (num != null) {
            amwgVar.d(num.intValue());
        }
        amwgVar.c(dwyuVar);
        this.e.put(a, amwgVar);
    }

    @Override // defpackage.amwh
    public final synchronized void c() {
        if (this.d) {
            try {
                e();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dwyw bZ = dwyx.b.bZ();
                synchronized (this.e) {
                    for (amwg amwgVar : this.e.values()) {
                        dwyr g = amwgVar.g();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwyx dwyxVar = (dwyx) bZ.b;
                        g.getClass();
                        dsrj<dwyr> dsrjVar = dwyxVar.a;
                        if (!dsrjVar.a()) {
                            dwyxVar.a = dsqw.cl(dsrjVar);
                        }
                        dwyxVar.a.add(g);
                    }
                }
                bvrs.a(dataOutputStream, bZ.bK());
                this.c.d(byteArrayOutputStream.toByteArray(), "TILE_HISTORY");
                this.e.size();
            } catch (IOException e) {
                bvoo.i(new RuntimeException(e));
            }
        }
    }

    @Override // defpackage.amwh
    public final synchronized Vector<alyh> d() {
        Vector<alyh> vector;
        e();
        amwg[] amwgVarArr = (amwg[]) this.e.values().toArray(new amwg[0]);
        Arrays.sort(amwgVarArr);
        vector = new Vector<>();
        for (amwg amwgVar : amwgVarArr) {
            vector.addElement(amwgVar.b);
        }
        return vector;
    }

    protected final void e() {
        synchronized (this.e) {
            Iterator<Map.Entry<alyh, amwg>> it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                amwg value = it.next().getValue();
                value.e();
                if (value.a()) {
                    it.remove();
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tile History");
        Vector<alyh> d = d();
        for (int i = 0; i < d.size(); i++) {
            alyh elementAt = d.elementAt(i);
            sb.append('\n');
            sb.append("coords: ");
            sb.append(elementAt);
            amwg amwgVar = this.e.get(elementAt);
            dbsk.s(amwgVar);
            sb.append('\n');
            sb.append("score: ");
            sb.append(amwgVar.f());
            sb.append('\n');
            sb.append(amwgVar);
            sb.append('\n');
        }
        return sb.toString();
    }
}
