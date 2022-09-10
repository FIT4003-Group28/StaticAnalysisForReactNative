package defpackage;
/* compiled from: PG */
/* renamed from: ceyv  reason: default package */
/* loaded from: classes4.dex */
public class ceyv implements cetj {
    private final ceet a;
    private final gfw b;
    private final drea c;
    @dzsi
    private final String d;
    private final dhtc e;

    public ceyv(ceet ceetVar, dhtc dhtcVar, gfw gfwVar, drea dreaVar, @dzsi String str) {
        this.e = dhtcVar;
        this.b = gfwVar;
        this.a = ceetVar;
        this.c = dreaVar;
        this.d = str;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cetj
    public Boolean b() {
        return false;
    }

    @Override // defpackage.jad
    public cqkl c() {
        ceet ceetVar = this.a;
        String str = this.d;
        drds drdsVar = drds.REVIEW;
        boolean z = this.d != null;
        ceer g = cees.g();
        ((ceep) g).b = this.b;
        g.b(this.e);
        drfr bZ = drfs.c.bZ();
        drdj bZ2 = drdk.c.bZ();
        drec drecVar = this.c.b;
        if (drecVar == null) {
            drecVar = drec.c;
        }
        String str2 = drecVar.a == 1 ? (String) drecVar.b : "";
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdk drdkVar = (drdk) bZ2.b;
        str2.getClass();
        drdkVar.a = 1;
        drdkVar.b = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drfs drfsVar = (drfs) bZ.b;
        drdk bK = bZ2.bK();
        bK.getClass();
        drfsVar.b = bK;
        drfsVar.a = 1;
        g.e(bZ.bK());
        ceetVar.l(str, drdsVar, z, g.a());
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxl.fk);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        drea dreaVar = this.c;
        if ((dreaVar.a & 8) == 0) {
            String str = dreaVar.c;
            int i = dreaVar.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append(" ");
            sb.append(i);
            return sb.toString();
        }
        String str2 = dreaVar.e;
        String str3 = dreaVar.c;
        int i2 = dreaVar.d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13 + String.valueOf(str3).length());
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(str3);
        sb2.append(" ");
        sb2.append(i2);
        return sb2.toString();
    }
}
