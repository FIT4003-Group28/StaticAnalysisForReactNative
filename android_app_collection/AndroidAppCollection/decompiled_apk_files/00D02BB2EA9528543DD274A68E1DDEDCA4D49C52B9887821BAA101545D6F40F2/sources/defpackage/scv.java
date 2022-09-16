package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: scv  reason: default package */
/* loaded from: classes7.dex */
public class scv implements sah {
    public final rzr a;
    public final scu b;
    private final Application c;

    public scv(Application application, rzr rzrVar, scu scuVar) {
        this.c = application;
        this.a = rzrVar;
        this.b = scuVar;
    }

    @Override // defpackage.sah
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: scs
            private final scv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scv scvVar = this.a;
                scvVar.b.a();
                scvVar.a.b();
            }
        };
    }

    @Override // defpackage.sah
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: sct
            private final scv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scv scvVar = this.a;
                scvVar.b.a();
                scvVar.a.c();
            }
        };
    }

    @Override // defpackage.sah
    public CharSequence c() {
        return this.c.getResources().getString(R.string.COMMUTE_MULTIMODAL_ROUTE_DIALOG_ERROR_TEXT);
    }

    @Override // defpackage.sah
    public CharSequence d() {
        return this.c.getResources().getString(R.string.COMMUTE_MULTIMODAL_ROUTE_DIALOG_DISMISS_BUTTON_TITLE);
    }

    @Override // defpackage.sah
    public CharSequence e() {
        return this.c.getResources().getString(R.string.COMMUTE_MULTIMODAL_ROUTE_DIALOG_RETRY_BUTTON_TITLE);
    }

    @Override // defpackage.sah
    public cjtd f() {
        return cjtd.a(dtxl.cQ);
    }

    @Override // defpackage.sah
    public cjtd g() {
        return cjtd.a(dtxl.cR);
    }

    @Override // defpackage.sah
    public cjtd h() {
        return cjtd.a(dtxl.cS);
    }
}
