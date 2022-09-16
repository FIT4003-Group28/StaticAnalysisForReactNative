package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: aqvw  reason: default package */
/* loaded from: classes2.dex */
public class aqvw extends aquz implements aqux {
    private final Activity a;
    private final cqhn b;
    private boolean c;
    private boolean d;

    public aqvw(Activity activity, cqhn cqhnVar, String str, String str2, Boolean bool, Boolean bool2, View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        super(str, str2, onClickListener, cjtdVar);
        this.a = activity;
        this.b = cqhnVar;
        this.c = bool.booleanValue();
        this.d = bool2.booleanValue();
    }

    private final void l() {
        this.a.runOnUiThread(new apzx(this));
    }

    @Override // defpackage.aquz, defpackage.aquu
    @dzsi
    public /* bridge */ /* synthetic */ View.OnClickListener a() {
        return super.a();
    }

    @Override // defpackage.aquz, defpackage.aquu
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // defpackage.aquz, defpackage.aquu
    public /* bridge */ /* synthetic */ String c() {
        return super.c();
    }

    @Override // defpackage.aquu
    public Integer d() {
        return 0;
    }

    @Override // defpackage.aquz, defpackage.aquu
    @dzsi
    public /* bridge */ /* synthetic */ cjtd e() {
        return super.e();
    }

    @Override // defpackage.aquz, defpackage.aquu
    public /* bridge */ /* synthetic */ Boolean f() {
        return super.f();
    }

    @Override // defpackage.aquz, defpackage.aquu
    public /* bridge */ /* synthetic */ void g(boolean z) {
        throw null;
    }

    @Override // defpackage.aqux
    public Boolean h() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aqux
    public void i(boolean z) {
        this.c = z;
        l();
    }

    @Override // defpackage.aqux
    public Boolean j() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aqux
    public void k(boolean z) {
        this.d = z;
        l();
    }
}
