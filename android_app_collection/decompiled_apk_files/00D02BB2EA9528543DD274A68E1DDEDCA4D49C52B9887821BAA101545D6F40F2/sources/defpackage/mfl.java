package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mfl  reason: default package */
/* loaded from: classes7.dex */
public class mfl implements mfe {
    private final noo a;
    private final CharSequence b;
    private final Context c;
    private final ksr d;
    private final Boolean e;
    private boolean f;
    @dzsi
    private CharSequence g;

    public mfl(noo nooVar, CharSequence charSequence, Context context, ksr ksrVar, boolean z) {
        this.a = nooVar;
        this.b = charSequence;
        this.c = context;
        this.d = ksrVar;
        this.e = Boolean.valueOf(!z);
    }

    @Override // defpackage.mfe
    public Boolean a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.mfe
    public Boolean b() {
        return Boolean.valueOf(this.g != null);
    }

    @Override // defpackage.mfe
    public CharSequence c() {
        return this.b;
    }

    @Override // defpackage.mfe
    @dzsi
    public CharSequence d() {
        return this.g;
    }

    @Override // defpackage.mfe
    public cqkl e() {
        this.a.b();
        return cqkl.a;
    }

    @Override // defpackage.mfe
    public cqkl f() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.mfe
    public Boolean g() {
        return this.e;
    }

    public void h() {
        this.f = true;
        this.g = this.c.getResources().getString(true != this.d.g() ? R.string.CAR_LOADING_SEARCH_RESULTS : R.string.CAR_WAITING_FOR_LOCATION);
        cqkx.p(this);
    }

    public void i() {
        this.g = this.c.getResources().getString(R.string.CAR_NO_SEARCH_RESULTS_FOUND);
        this.f = false;
        cqkx.p(this);
    }

    public void j() {
        this.g = null;
        this.f = false;
        cqkx.p(this);
    }
}
