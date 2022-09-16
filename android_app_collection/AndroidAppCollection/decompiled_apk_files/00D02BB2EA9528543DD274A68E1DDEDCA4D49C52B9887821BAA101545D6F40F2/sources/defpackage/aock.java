package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aock  reason: default package */
/* loaded from: classes2.dex */
public class aock implements aoch {
    public String a;
    public String b;
    private final Activity c;
    private final String d;
    private final dvba e;

    public aock(Activity activity, dvba dvbaVar, String str) {
        this.c = activity;
        this.e = dvbaVar;
        this.d = str;
        this.a = dvbaVar.b;
        this.b = dvbaVar.c;
    }

    @Override // defpackage.aoch
    public String a() {
        return this.a;
    }

    @Override // defpackage.aoch
    public String b() {
        return this.d;
    }

    @Override // defpackage.aoch
    public Integer c() {
        return 140;
    }

    @Override // defpackage.aoch
    public cqgl d() {
        return new cqgl(this) { // from class: aoci
            private final aock a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.a = charSequence.toString();
            }
        };
    }

    @Override // defpackage.aoch
    public String e() {
        return this.b;
    }

    @Override // defpackage.aoch
    public Integer f() {
        return 5000;
    }

    @Override // defpackage.aoch
    public cqgl g() {
        return new cqgl(this) { // from class: aocj
            private final aock a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.b = charSequence.toString();
            }
        };
    }

    @Override // defpackage.aoch
    public cqkl h() {
        this.c.onBackPressed();
        return cqkl.a;
    }

    public dbsg<dork> i() {
        dorj bZ = dork.e.bZ();
        if (!this.e.b.equals(this.a)) {
            String str = this.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dork dorkVar = (dork) bZ.b;
            str.getClass();
            dorkVar.a |= 1;
            dorkVar.b = str;
        }
        if (!this.e.c.equals(this.b)) {
            String str2 = this.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dork dorkVar2 = (dork) bZ.b;
            str2.getClass();
            dorkVar2.a |= 2;
            dorkVar2.c = str2;
        }
        dork bK = bZ.bK();
        return bK.equals(dork.e) ? dbpy.a : dbsg.i(bK);
    }
}
