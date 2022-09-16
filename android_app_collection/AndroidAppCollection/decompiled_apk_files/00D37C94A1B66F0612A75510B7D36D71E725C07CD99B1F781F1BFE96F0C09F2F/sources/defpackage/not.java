package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: not  reason: default package */
/* loaded from: classes3.dex */
public final class not extends yk {
    public boolean a;
    private final int n;

    public not(Context context, int i) {
        super(context);
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final int b(int i) {
        return 500;
    }

    @Override // defpackage.yk
    public final int i(View view, int i) {
        return super.i(view, i) - this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final int j(int i) {
        return 250;
    }

    @Override // defpackage.yk
    protected final int l() {
        return this.a ? 1 : -1;
    }

    public final void n() {
        super.f();
    }
}
