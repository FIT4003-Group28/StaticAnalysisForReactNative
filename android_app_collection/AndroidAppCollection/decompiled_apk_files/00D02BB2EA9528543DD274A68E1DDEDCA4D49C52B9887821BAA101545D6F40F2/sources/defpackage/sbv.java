package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sbv  reason: default package */
/* loaded from: classes7.dex */
public abstract class sbv implements saj {
    private final String a;
    private final String b;
    @dzsi
    private final View.OnClickListener c;

    /* JADX INFO: Access modifiers changed from: protected */
    public sbv(String str, String str2, @dzsi View.OnClickListener onClickListener) {
        this.a = str;
        this.b = str2;
        this.c = onClickListener;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz jhzVar = new jhz();
        jhzVar.a = this.a;
        jhzVar.C = 2;
        jhzVar.u = ibm.t();
        jhzVar.q = ibm.b();
        jhzVar.x = true;
        jhzVar.i = cqrt.g(2131231588, ibm.p());
        jhzVar.f(this.c);
        return jhzVar.b();
    }

    @Override // defpackage.saj
    public Boolean e() {
        throw null;
    }

    @Override // defpackage.saj
    public String h() {
        return this.b;
    }

    @Override // defpackage.saj
    public cqtd i() {
        return iup.e(R.raw.general_error);
    }
}
