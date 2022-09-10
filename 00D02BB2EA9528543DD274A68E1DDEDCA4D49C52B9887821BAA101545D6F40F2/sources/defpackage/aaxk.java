package defpackage;
/* compiled from: PG */
/* renamed from: aaxk  reason: default package */
/* loaded from: classes2.dex */
public class aaxk implements aawp {
    private String a = "";
    private String b = "";
    private String c = "";
    private final dxio<afha> d;

    public aaxk(dxio<afha> dxioVar) {
        this.d = dxioVar;
    }

    @Override // defpackage.aawp
    public String a() {
        return this.a;
    }

    @Override // defpackage.aawp
    public String b() {
        return this.c;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        boolean z = false;
        if (g().booleanValue() && h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aawp
    public cqkl d() {
        this.d.a().m(f(), 1);
        return cqkl.a;
    }

    public void e(diwb diwbVar) {
        divg divgVar = diwbVar.R;
        if (divgVar == null) {
            divgVar = divg.d;
        }
        this.a = divgVar.a;
        divg divgVar2 = diwbVar.R;
        if (divgVar2 == null) {
            divgVar2 = divg.d;
        }
        this.b = divgVar2.b;
        divg divgVar3 = diwbVar.R;
        if (divgVar3 == null) {
            divgVar3 = divg.d;
        }
        this.c = divgVar3.c;
    }

    public String f() {
        return this.b;
    }

    public Boolean g() {
        return Boolean.valueOf(!a().isEmpty());
    }

    public Boolean h() {
        boolean z = false;
        if (!f().isEmpty() && !b().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
