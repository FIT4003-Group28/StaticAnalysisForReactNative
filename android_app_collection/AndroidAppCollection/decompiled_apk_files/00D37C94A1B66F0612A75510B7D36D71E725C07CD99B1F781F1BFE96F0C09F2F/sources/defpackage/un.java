package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
/* compiled from: PG */
/* renamed from: un  reason: default package */
/* loaded from: classes4.dex */
public final class un extends wc {
    final /* synthetic */ uu a;
    final /* synthetic */ AppCompatSpinner b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(AppCompatSpinner appCompatSpinner, View view, uu uuVar) {
        super(view);
        this.b = appCompatSpinner;
        this.a = uuVar;
    }

    @Override // defpackage.wc
    public final sx a() {
        return this.a;
    }

    @Override // defpackage.wc
    public final boolean b() {
        if (!this.b.b.u()) {
            this.b.b();
            return true;
        }
        return true;
    }
}
