package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mrc  reason: default package */
/* loaded from: classes7.dex */
public class mrc implements mra {
    private final noo a;
    private final Resources b;
    private final CharSequence c;
    private boolean d;
    @dzsi
    private CharSequence e;

    public mrc(noo nooVar, Resources resources, CharSequence charSequence) {
        this.a = nooVar;
        this.b = resources;
        this.c = charSequence;
    }

    @Override // defpackage.mra
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.mra
    public Boolean b() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.mra
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.mra
    @dzsi
    public CharSequence d() {
        return this.e;
    }

    @Override // defpackage.mra
    public cqkl e() {
        this.a.b();
        return cqkl.a;
    }

    @Override // defpackage.mra
    public cqkl f() {
        this.a.a();
        return cqkl.a;
    }

    public void g(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        if (z) {
            this.e = this.b.getString(R.string.CAR_LOADING_SEARCH_RESULTS);
        } else {
            this.e = null;
        }
        cqkx.p(this);
    }

    public void h(CharSequence charSequence) {
        this.e = charSequence;
        cqkx.p(this);
    }
}
