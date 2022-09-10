package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: cptt  reason: default package */
/* loaded from: classes5.dex */
public final class cptt<T, D> extends cptj<T, D, cptt<T, D>> {
    public cpts f;

    public cptt(Context context) {
        super(context);
        i(context);
    }

    private final void i(Context context) {
        this.f = new cpts(context, this);
        this.f.setLayoutParams(new cppw((int) cpqk.a(context, 100.0f), (byte) 40));
        cpts cptsVar = this.f;
        this.d = new cptn(cptsVar, cptsVar);
    }

    @Override // defpackage.cptj, defpackage.cpta
    public final void c(cpoj<T, D> cpojVar) {
        if (!this.e) {
            return;
        }
        super.g(cpojVar.l(), cpojVar.v);
    }

    @Override // defpackage.cptj, defpackage.cpta
    public final /* bridge */ /* synthetic */ void d() {
    }

    @Override // defpackage.cptj
    protected final void e(cpny<T, D, ?> cpnyVar) {
        cpnyVar.addView(this.f);
    }

    @Override // defpackage.cptj
    protected final void f(cpny<T, D, ?> cpnyVar) {
        cpnyVar.removeView(this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cptj
    public final cpts h() {
        return this.f;
    }

    public cptt(Context context, AttributeSet attributeSet) {
        super(context);
        i(context);
    }

    public cptt(Context context, AttributeSet attributeSet, int i) {
        super(context);
        i(context);
    }
}
