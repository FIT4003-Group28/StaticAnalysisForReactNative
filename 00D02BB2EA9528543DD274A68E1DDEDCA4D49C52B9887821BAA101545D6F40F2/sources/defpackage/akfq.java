package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: akfq  reason: default package */
/* loaded from: classes2.dex */
class akfq implements akfw {
    final /* synthetic */ akfs a;

    public akfq(akfs akfsVar) {
        this.a = akfsVar;
    }

    @Override // defpackage.akfw
    public CharSequence a() {
        return this.a.c.getString(R.string.LOGIN_DIALOG_ADD_ACCOUNT_LABEL);
    }

    @Override // defpackage.akfw
    public jic b() {
        return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131232138, irg.k()), 0);
    }

    @Override // defpackage.akfw
    public cqkl c() {
        akfs akfsVar = this.a;
        akfc akfcVar = akfsVar.e;
        akey akeyVar = akfsVar.a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        akdv akdvVar = (akdv) akfcVar;
        akdvVar.c.a().addAccount("com.google", akdvVar.f, null, bundle, akdvVar.a, new akds(akdvVar, akeyVar), null);
        this.a.b.run();
        return cqkl.a;
    }
}
