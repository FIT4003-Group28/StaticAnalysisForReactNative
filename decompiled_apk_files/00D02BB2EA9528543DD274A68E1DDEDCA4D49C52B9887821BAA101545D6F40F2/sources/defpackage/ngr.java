package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: ngr  reason: default package */
/* loaded from: classes7.dex */
public class ngr implements nfy {
    private final Future<kdj> a;
    private boolean b;
    @dzsi
    private View.OnFocusChangeListener c;

    public ngr(Future<kdj> future, cqhn cqhnVar, boolean z) {
        this.a = future;
        this.b = z;
    }

    @Override // defpackage.nfy
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.nfy
    @dzsi
    public View.OnFocusChangeListener b() {
        return this.c;
    }

    @Override // defpackage.nfy
    public cqkl c() {
        ((kdj) deha.s(this.a)).e();
        return cqkl.a;
    }

    @Override // defpackage.nfy
    public cqtd d() {
        return nqu.aE(R.raw.car_only_ic_settings_36dp, nql.c);
    }

    public void e(@dzsi View.OnFocusChangeListener onFocusChangeListener) {
        if (this.c != onFocusChangeListener) {
            this.c = onFocusChangeListener;
            cqkx.p(this);
        }
    }

    public void f(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }
}
