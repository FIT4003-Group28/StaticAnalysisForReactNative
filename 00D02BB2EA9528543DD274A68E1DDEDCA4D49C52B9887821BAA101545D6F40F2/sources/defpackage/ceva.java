package defpackage;
/* compiled from: PG */
/* renamed from: ceva  reason: default package */
/* loaded from: classes4.dex */
public class ceva implements cetj {
    private final drea a;
    private final ceuz b;
    private boolean c;

    public ceva(drea dreaVar, ceuz ceuzVar, boolean z) {
        this.a = dreaVar;
        this.b = ceuzVar;
        this.c = z;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cetj
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.a(this.a);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxl.fF;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = b().booleanValue() ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
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

    public void j(Boolean bool) {
        this.c = bool.booleanValue();
    }

    public String k() {
        drec drecVar = this.a.b;
        if (drecVar == null) {
            drecVar = drec.c;
        }
        return drecVar.a == 1 ? (String) drecVar.b : "";
    }

    @Override // defpackage.jad
    public CharSequence e() {
        drea dreaVar = this.a;
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
