package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aaxb  reason: default package */
/* loaded from: classes2.dex */
class aaxb implements aawl {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public aaxb(Activity activity, bydp bydpVar, boolean z) {
        String str;
        this.a = bydpVar.g(activity);
        if (bydpVar.d()) {
            String b = bydpVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2);
            sb.append("(");
            sb.append(b);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        this.b = str;
        this.c = z;
        this.d = bydpVar.l(activity);
        this.e = z;
        this.f = bydpVar.c();
        this.g = bydpVar.e();
    }

    @Override // defpackage.aawl
    public String a() {
        return this.a;
    }

    @Override // defpackage.aawl
    public String b() {
        return this.b;
    }

    @Override // defpackage.aawl
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aawl
    public String d() {
        return this.d;
    }

    @Override // defpackage.aawl
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.aawl
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.aawl
    public Boolean g() {
        return Boolean.valueOf(this.g);
    }

    public aaxb(diwg diwgVar) {
        diwi diwiVar = diwgVar.a;
        this.a = (diwiVar == null ? diwi.c : diwiVar).a;
        this.b = "";
        diwi diwiVar2 = diwgVar.a;
        int a = diwk.a((diwiVar2 == null ? diwi.c : diwiVar2).b);
        boolean z = true;
        this.c = a != 0 && a == 2;
        diwi diwiVar3 = diwgVar.b;
        this.d = (diwiVar3 == null ? diwi.c : diwiVar3).a;
        diwi diwiVar4 = diwgVar.b;
        int a2 = diwk.a((diwiVar4 == null ? diwi.c : diwiVar4).b);
        this.e = (a2 == 0 || a2 != 2) ? false : z;
        this.f = false;
        this.g = false;
    }
}
