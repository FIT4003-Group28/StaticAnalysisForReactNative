package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpdt  reason: default package */
/* loaded from: classes3.dex */
class bpdt implements bpvj {
    final /* synthetic */ bpdw a;

    public bpdt(bpdw bpdwVar) {
        this.a = bpdwVar;
    }

    @Override // defpackage.bpvj
    public CharSequence a() {
        CharSequence charSequence = this.a.e;
        dbsk.s(charSequence);
        return charSequence;
    }

    @Override // defpackage.bpvj
    public CharSequence b() {
        return this.a.Rn().getText(this.a.g);
    }

    @Override // defpackage.bpvj
    public CharSequence c() {
        return this.a.Rn().getText(R.string.ADDRESS_REDIRECT_DIALOG_REDIRECT);
    }

    @Override // defpackage.bpvj
    public cqkl d() {
        this.a.g(1);
        return cqkl.a;
    }

    @Override // defpackage.bpvj
    public cqkl e() {
        this.a.g(2);
        return cqkl.a;
    }

    @Override // defpackage.bpvj
    public cjtd f() {
        return bpdw.b;
    }

    @Override // defpackage.bpvj
    public cjtd g() {
        return bpdw.a;
    }
}
