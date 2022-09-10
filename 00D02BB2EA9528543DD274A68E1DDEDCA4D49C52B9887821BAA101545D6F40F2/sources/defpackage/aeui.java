package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aeui  reason: default package */
/* loaded from: classes2.dex */
public class aeui implements Serializable {
    public static final dcqe a = dcqe.c("aeui");
    public static final aeui b = new aeui(aeuh.NEUTRAL, dcdc.e(), null, null, null, dcdc.e(), dspd.b, new eapd(0));
    public static final aeui c = new aeui(aeuh.SERVER_ERROR, dcdc.e(), null, null, null, dcdc.e(), dspd.b, new eapd(0));
    public static final aeui d = new aeui(aeuh.CONNECTIVITY_ERROR, dcdc.e(), null, null, null, dcdc.e(), dspd.b, new eapd(0));
    public static final aeui e = new aeui(aeuh.GAIA_ERROR, dcdc.e(), null, null, null, dcdc.e(), dspd.b, new eapd(0));
    public final aeuh f;
    public final List<aeue> g;
    @dzsi
    public final aeue h;
    public final List<String> i;
    public transient dspd j;
    public final eapd k;
    @dzsi
    private final bvrt<dtaq> l;
    @dzsi
    private final bvrt<dwjf> m;

    public aeui(aeuh aeuhVar, List<aeue> list, @dzsi aeue aeueVar) {
        this(aeuhVar, list, aeueVar, null, null, null, dspd.b, new eapd(0L));
    }

    public static aeui f(dwjf dwjfVar, boolean z, @dzsi dtaq dtaqVar, @dzsi List<String> list, eapd eapdVar) {
        aeuh a2;
        ArrayList arrayList = new ArrayList();
        for (dwjb dwjbVar : dwjfVar.b) {
            if ((dwjbVar.a & 1) != 0) {
                dvyw dvywVar = dwjbVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                ily ilyVar = new ily();
                ilyVar.E(dvywVar);
                cjtd cjtdVar = null;
                String str = null;
                if ((dvywVar.b & 256) != 0) {
                    dvxb dvxbVar = dvywVar.V;
                    if (dvxbVar == null) {
                        dvxbVar = dvxb.d;
                    }
                    cjta b2 = cjtd.b();
                    int i = dvxbVar.a;
                    b2.b = (i & 1) != 0 ? dvxbVar.b : null;
                    if ((i & 2) != 0) {
                        str = dvxbVar.c;
                    }
                    b2.g(str);
                    cjtdVar = b2.a();
                }
                if (cjtdVar != null) {
                    ilyVar.y = cjtdVar;
                }
                if (z) {
                    String g = g(dwjbVar.e);
                    if (!dbsj.d(g)) {
                        ilyVar.x = g;
                    }
                }
                ilo d2 = ilyVar.d();
                dtaq dtaqVar2 = dwjbVar.d;
                if (dtaqVar2 == null) {
                    dtaqVar2 = dtaq.m;
                }
                aeuf i2 = aeuf.i(d2, dtaqVar2);
                dbsk.t(i2, "HerePlace.of() is expected to be null only for placemark = null");
                arrayList.add(i2);
            }
        }
        if (!dwjfVar.b.isEmpty()) {
            doer b3 = doer.b(dwjfVar.b.get(0).c);
            if (b3 == null) {
                b3 = doer.NO_CONFIDENCE;
            }
            a2 = aeuh.a(b3);
        } else {
            a2 = aeuh.NO_CONFIDENCE;
        }
        return new aeui(a2, arrayList, null, dtaqVar, dwjfVar, list, dwjfVar.d, eapdVar);
    }

    @dzsi
    static String g(@dzsi String str) {
        if (dbsj.d(str)) {
            return null;
        }
        if (str.startsWith("http://")) {
            String valueOf = String.valueOf(str.substring(7));
            str = valueOf.length() != 0 ? "https://".concat(valueOf) : new String("https://");
        } else if (!str.startsWith("https://")) {
            String valueOf2 = String.valueOf(str);
            str = valueOf2.length() != 0 ? "https://".concat(valueOf2) : new String("https://");
        }
        try {
            return new URL(str).toString();
        } catch (MalformedURLException unused) {
            bvoo.h("Server icon url is badly formatted: %s", str);
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            objectInputStream.readFully(bArr);
            this.j = dspd.x(bArr);
            return;
        }
        this.j = dspd.b;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.j.c());
        if (!this.j.u()) {
            objectOutputStream.write(this.j.G());
        }
    }

    public final aeui a(@dzsi dtaq dtaqVar, List<String> list) {
        if (!dbsd.a(d(), dtaqVar) || !dbsd.a(this.i, list)) {
            aeuh aeuhVar = this.f;
            List<aeue> list2 = this.g;
            aeue aeueVar = this.h;
            dwjf e2 = e();
            dbsk.s(list);
            return new aeui(aeuhVar, list2, aeueVar, dtaqVar, e2, list, this.j, this.k);
        }
        return this;
    }

    @dzsi
    public final aeue b(int i) {
        if (this.g.size() > i) {
            return this.g.get(i);
        }
        return null;
    }

    @dzsi
    public final aeuf c() {
        aeue b2;
        if (i() == null) {
            b2 = !this.g.isEmpty() ? b(0) : null;
        } else {
            b2 = i();
        }
        if (b2 instanceof aeuf) {
            return (aeuf) b2;
        }
        return null;
    }

    @dzsi
    public final dtaq d() {
        return (dtaq) bvrt.f(this.l, (dssr) dtaq.m.cu(7), dtaq.m);
    }

    @dzsi
    public final dwjf e() {
        return (dwjf) bvrt.f(this.m, (dssr) dwjf.g.cu(7), dwjf.g);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aeui)) {
            return false;
        }
        aeui aeuiVar = (aeui) obj;
        return dbsd.a(this.f, aeuiVar.f) && dbsd.a(this.g, aeuiVar.g) && dbsd.a(this.h, aeuiVar.h);
    }

    @dzsi
    public final ilo h() {
        aeue aeueVar;
        bwrs<ilo> f;
        if (this.f != aeuh.CONFIRMED_CHECKIN || (aeueVar = this.h) == null || (f = aeueVar.f()) == null) {
            return null;
        }
        return f.c();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.h});
    }

    @dzsi
    public final aeue i() {
        if (this.f != aeuh.CONFIRMED) {
            if (this.f != aeuh.HIGH_CONFIDENCE) {
                return null;
            }
            return this.g.get(0);
        }
        return this.h;
    }

    public final boolean j() {
        return this.f == aeuh.CONFIRMED || this.f == aeuh.HIGH_CONFIDENCE || this.f == aeuh.LOW_CONFIDENCE || this.f == aeuh.NO_CONFIDENCE;
    }

    public final String toString() {
        aeue i = i();
        dbsb b2 = dbsc.b(this);
        b2.b("stateType", this.f);
        b2.b("currentFeature", i != null ? i.c() : null);
        b2.f("features", this.g.size());
        return b2.toString();
    }

    public aeui(aeuh aeuhVar, List<aeue> list, @dzsi aeue aeueVar, @dzsi dtaq dtaqVar, @dzsi dwjf dwjfVar, @dzsi List<String> list2, dspd dspdVar, eapd eapdVar) {
        dbsk.s(list);
        boolean z = true;
        if (aeuhVar == aeuh.CONFIRMED && aeueVar == null) {
            z = false;
        }
        dbsk.a(z);
        this.f = aeuhVar;
        ArrayList c2 = dchl.c(list);
        this.g = c2;
        Collections.sort(c2, new aeug());
        this.h = aeueVar;
        this.l = bvrt.a(dtaqVar);
        this.m = bvrt.a(dwjfVar);
        this.i = list2 == null ? dcdc.e() : list2;
        this.j = dspdVar;
        this.k = eapdVar;
    }
}
