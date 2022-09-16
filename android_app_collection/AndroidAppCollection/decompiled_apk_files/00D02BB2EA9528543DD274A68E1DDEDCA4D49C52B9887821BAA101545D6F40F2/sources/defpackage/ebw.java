package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ebw  reason: default package */
/* loaded from: classes6.dex */
class ebw implements jad {
    final /* synthetic */ ebx a;

    public ebw(ebx ebxVar) {
        this.a = ebxVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    /* renamed from: b */
    public String e() {
        String c = this.a.a().c();
        String string = this.a.a.getString(R.string.BADGES_LEVELS_DETAILS_BUTTON_DESCRIPTION);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 2 + String.valueOf(string).length());
        sb.append(c);
        sb.append(". ");
        sb.append(string);
        return sb.toString();
    }

    @Override // defpackage.jad
    public cqkl c() {
        ebx ebxVar = this.a;
        ebu ebuVar = ebxVar.c;
        if (ebuVar.aD) {
            dkfv dkfvVar = ebxVar.b;
            Bundle bundle = new Bundle();
            bundle.putByteArray("arg_key_badge", dkfvVar.bS());
            eca ecaVar = new eca();
            ecaVar.B(bundle);
            ebuVar.aZ(ecaVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxk.c;
        b.g(this.a.b.b);
        return b.a();
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
