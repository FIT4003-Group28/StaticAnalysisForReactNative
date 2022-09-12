package defpackage;

import android.os.CancellationSignal;
/* compiled from: PG */
/* renamed from: btnq  reason: default package */
/* loaded from: classes.dex */
public final class btnq extends btop {
    public dbsg<Integer> a;
    private dbsg<String[]> b;
    private dbsg<String> c;
    private dbsg<String[]> d;
    private dbsg<String> e;
    private dbsg<CancellationSignal> f;

    public btnq() {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.a = dbpy.a;
        this.f = dbpy.a;
    }

    public btnq(btoq btoqVar) {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.a = dbpy.a;
        this.f = dbpy.a;
        btnr btnrVar = (btnr) btoqVar;
        this.b = btnrVar.a;
        this.c = btnrVar.b;
        this.d = btnrVar.c;
        this.e = btnrVar.d;
        this.a = btnrVar.e;
        this.f = btnrVar.f;
    }

    @Override // defpackage.btop
    public final btoq a() {
        return new btnr(this.b, this.c, this.d, this.e, this.a, this.f);
    }

    @Override // defpackage.btop
    public final void b(String... strArr) {
        this.b = dbsg.i(strArr);
    }

    @Override // defpackage.btop
    public final void c(String str) {
        this.c = dbsg.i(str);
    }

    @Override // defpackage.btop
    public final void d(String... strArr) {
        this.d = dbsg.i(strArr);
    }

    @Override // defpackage.btop
    public final void e(String str) {
        this.e = dbsg.i(str);
    }
}
