package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqvi  reason: default package */
/* loaded from: classes2.dex */
public class aqvi implements aquv {
    public final Runnable a;
    public final Runnable b;

    public aqvi(Activity activity, apzy apzyVar, Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // defpackage.aquv
    public cqtd a() {
        return iup.e(R.raw.ic_merchant_messaging_opt_out);
    }

    @Override // defpackage.aquv
    public String b() {
        return "";
    }

    @Override // defpackage.aquv
    public String c() {
        return "";
    }

    @Override // defpackage.aquv
    public String d() {
        return "";
    }

    @Override // defpackage.aquv
    @dzsi
    public String e() {
        return "";
    }

    @Override // defpackage.aquv
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: aqvg
            private final aqvi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.run();
            }
        };
    }

    @Override // defpackage.aquv
    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: aqvh
            private final aqvi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.run();
            }
        };
    }

    @Override // defpackage.aquv
    @dzsi
    public cjtd h() {
        return cjtd.a(dtxv.bF);
    }

    @Override // defpackage.aquv
    public cjtd i() {
        return cjtd.a(dtxv.bD);
    }

    @Override // defpackage.aquv
    public cjtd j() {
        return cjtd.a(dtxv.bE);
    }
}
