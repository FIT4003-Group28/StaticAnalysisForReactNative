package defpackage;
/* compiled from: PG */
/* renamed from: tls  reason: default package */
/* loaded from: classes7.dex */
final class tls extends tln {
    private volatile transient dcdc<tlv> d;

    public tls(btlu btluVar, dbsg<String> dbsgVar, tme tmeVar, dcdc<String> dcdcVar, dcdn<String, tlv> dcdnVar) {
        super(btluVar, dbsgVar, tmeVar, dcdcVar, dcdnVar);
    }

    @Override // defpackage.tmd
    public final dcdc<tlv> g() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    dccx F = dcdc.F();
                    if (this.a.a() && this.c.containsKey(this.a.b())) {
                        tlv tlvVar = this.c.get(this.a.b());
                        dbsk.s(tlvVar);
                        F.g(tlvVar);
                    }
                    dcdc<String> dcdcVar = this.b;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        String str = dcdcVar.get(i);
                        if (this.c.containsKey(str) && !dbsg.i(str).equals(this.a)) {
                            tlv tlvVar2 = this.c.get(str);
                            dbsk.s(tlvVar2);
                            F.g(tlvVar2);
                        }
                    }
                    this.d = F.f();
                    if (this.d == null) {
                        throw new NullPointerException("groups() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }
}
