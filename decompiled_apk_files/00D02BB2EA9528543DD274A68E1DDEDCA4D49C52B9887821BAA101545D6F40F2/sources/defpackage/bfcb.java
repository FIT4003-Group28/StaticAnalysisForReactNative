package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfcb  reason: default package */
/* loaded from: classes3.dex */
public abstract class bfcb implements bfca {
    public boolean a;
    private final Activity b;

    public bfcb(Activity activity) {
        this.b = activity;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.bfca
    public cqtd b() {
        if (this.a) {
            return cqrt.g(2131232566, ibm.m());
        }
        return cqrt.g(2131232485, ibm.w());
    }

    @Override // defpackage.jad
    public cqkl c() {
        throw null;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        if (this.a) {
            return this.b.getString(R.string.LOCAL_FOLLOW_BUTTON_POSITIVE);
        }
        return this.b.getString(R.string.LOCAL_FOLLOW_BUTTON_NEGATIVE);
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

    @Override // defpackage.bfca
    public Boolean j() {
        return false;
    }

    @Override // defpackage.bfca
    public CharSequence l() {
        return "";
    }
}
