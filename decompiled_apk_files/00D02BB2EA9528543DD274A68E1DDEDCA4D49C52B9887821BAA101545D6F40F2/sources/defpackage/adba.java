package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adba  reason: default package */
/* loaded from: classes2.dex */
public class adba extends aczs implements adax {
    public final dxio<ache> a;
    public final achc b;
    private final gga c;
    private final cjtd d;

    public adba(gga ggaVar, dxio<ache> dxioVar, dzsj<adaf> dzsjVar, achc achcVar, absg absgVar) {
        this.c = ggaVar;
        this.a = dxioVar;
        this.b = achcVar;
        this.d = cjtd.a(absgVar == absg.AREA_EXPLORE ? dtxj.cS : dtxr.aM);
    }

    @Override // defpackage.idl
    public CharSequence Pb() {
        return this.c.getResources().getString(R.string.HOME_SEND_FEEDBACK_BUTTON);
    }

    @Override // defpackage.idl
    public CharSequence a() {
        return this.c.getResources().getString(R.string.HOME_SEND_FEEDBACK_TITLE);
    }

    @Override // defpackage.idl
    public CharSequence b() {
        return this.c.getResources().getString(R.string.HOME_SEND_FEEDBACK_SUBTEXT);
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.d;
    }

    @Override // defpackage.idl
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: aday
            private final adba a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adba adbaVar = this.a;
                adbaVar.a.a().k(false, true, adbaVar.b, null);
            }
        };
    }

    @Override // defpackage.idl
    public View.OnClickListener g() {
        return new View.OnClickListener() { // from class: adaz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
    }

    @Override // defpackage.idl
    public Boolean h() {
        return false;
    }
}
