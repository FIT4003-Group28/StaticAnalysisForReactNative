package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cabk  reason: default package */
/* loaded from: classes4.dex */
public class cabk implements cafh {
    private final dcdc<cabj> a;
    private int b;

    public cabk(cbqg cbqgVar, @dzsi dwul dwulVar, caff caffVar) {
        this.b = -1;
        dccx F = dcdc.F();
        int i = 0;
        for (dkcq dkcqVar : dwulVar.d) {
            if ((dkcqVar.a & 1) != 0) {
                dkcp b = dkcp.b(dkcqVar.b);
                b = b == null ? dkcp.UNKNOWN_TAB_TYPE : b;
                if (b != dkcp.EVENTS || cbqgVar.a()) {
                    if (dkcqVar.d) {
                        this.b = i;
                    }
                    F.g(new cabj(dkcqVar, b, caffVar));
                    i++;
                }
            }
        }
        this.a = F.f();
    }

    @Override // defpackage.cafh
    public List<cabj> a() {
        return this.a;
    }

    @Override // defpackage.cafh
    public Float b() {
        int i = this.b;
        return Float.valueOf(i >= 0 ? i : 0.0f);
    }

    @dzsi
    public cafg c() {
        try {
            return this.a.get(this.b);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public void d(dkcp dkcpVar) {
        this.b = -1;
        for (int i = 0; i < this.a.size(); i++) {
            cabj cabjVar = this.a.get(i);
            if (cabjVar.a() == dkcpVar) {
                cabjVar.d(true);
                this.b = i;
            } else {
                cabjVar.d(false);
            }
        }
    }

    public dkcp e() {
        int i = this.b;
        if (i < 0) {
            return dkcp.UNKNOWN_TAB_TYPE;
        }
        return this.a.get(i).a();
    }
}
