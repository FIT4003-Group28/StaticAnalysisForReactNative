package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: acwa  reason: default package */
/* loaded from: classes2.dex */
public class acwa implements acvx {
    private final Activity a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final dxio<afha> f;
    private final dxio<axwy> g;
    private final boolean h;
    private final String i;
    private final int j;

    public acwa(Activity activity, dxio<afha> dxioVar, dgmo dgmoVar, dxio<axwy> dxioVar2) {
        this.a = activity;
        this.f = dxioVar;
        this.g = dxioVar2;
        this.b = dgmoVar.a;
        this.c = dgmoVar.c;
        dgmn dgmnVar = dgmoVar.b;
        this.d = (dgmnVar == null ? dgmn.d : dgmnVar).b;
        dgmn dgmnVar2 = dgmoVar.b;
        this.e = (dgmnVar2 == null ? dgmn.d : dgmnVar2).a;
        this.h = dgmoVar.e;
        int a = dgmk.a(dgmoVar.d);
        this.j = a == 0 ? 1 : a;
        dgmn dgmnVar3 = dgmoVar.b;
        this.i = (dgmnVar3 == null ? dgmn.d : dgmnVar3).c;
    }

    @Override // defpackage.acvx
    public String a() {
        return this.b;
    }

    @Override // defpackage.acvx
    public String b() {
        if (this.c.startsWith("//")) {
            String valueOf = String.valueOf(this.c);
            return valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
        }
        return this.c;
    }

    @Override // defpackage.acvx
    public String c() {
        return this.e;
    }

    @Override // defpackage.acvx
    public cqkl d() {
        if (this.j == 3) {
            this.g.a().F(axwf.d(this.i, this.d));
        } else {
            this.f.a().k(this.a, this.d, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.acvx
    public cjtd e() {
        ddho ddhoVar = dtxy.ns;
        int i = this.j;
        if (i == 2) {
            ddhoVar = dtxy.nr;
        } else if (i == 3) {
            ddhoVar = dtxy.nq;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.acvx
    public boolean f() {
        return this.h;
    }
}
