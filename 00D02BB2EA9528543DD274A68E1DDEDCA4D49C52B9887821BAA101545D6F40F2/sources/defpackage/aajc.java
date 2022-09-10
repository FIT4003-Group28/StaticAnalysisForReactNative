package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aajc  reason: default package */
/* loaded from: classes2.dex */
public class aajc implements aajb {
    private final cqtd a;
    private final String b;
    private final String c;
    private final Boolean d;
    private final cjtd e;
    private final Runnable f;
    @dzsi
    private final Runnable g;

    public aajc(cqtd cqtdVar, String str, cjtd cjtdVar, Runnable runnable, @dzsi Runnable runnable2) {
        this(cqtdVar, str, str, false, cjtdVar, runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static cqtd k(ditv ditvVar, int i) {
        ditv ditvVar2 = ditv.DEFAULT_ICON;
        if (ditvVar.ordinal() == 1) {
            return iup.e(R.raw.logo_googleg_24dp);
        }
        return cqrt.g(i, irg.r());
    }

    @Override // defpackage.aajb
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.aajb
    public String b() {
        return this.b;
    }

    @Override // defpackage.aajb
    public cqkl c() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.aajb
    public Boolean d() {
        return Boolean.valueOf(this.g != null);
    }

    @Override // defpackage.aajb
    public cqkl e() {
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.aajb
    public cjtd f() {
        return this.e;
    }

    @Override // defpackage.aajb
    public Boolean g() {
        return this.d;
    }

    @Override // defpackage.aajb
    public String h() {
        return this.c;
    }

    @Override // defpackage.aajb
    @dzsi
    public cqss i() {
        return null;
    }

    @Override // defpackage.aajb
    @dzsi
    public cqss j() {
        return null;
    }

    public aajc(cqtd cqtdVar, String str, String str2, boolean z, cjtd cjtdVar, Runnable runnable, @dzsi Runnable runnable2) {
        this.a = cqtdVar;
        this.b = str;
        this.c = str2;
        this.d = Boolean.valueOf(z);
        this.e = cjtdVar;
        this.f = runnable;
        this.g = runnable2;
    }
}
