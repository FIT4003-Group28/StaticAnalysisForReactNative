package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqvn  reason: default package */
/* loaded from: classes2.dex */
public final class aqvn {
    public final Activity a;
    public final dehq b;
    public final dxio<apyt> c;
    public final dxio<aqbo> d;
    public final dxio<akfa> e;
    @dzsi
    public btlu g;
    @dzsi
    public aqux h;
    private final dehq j;
    private final aqvx k;
    public final crzo<Boolean> f = new crzo<>(Boolean.TRUE);
    private final View.OnClickListener l = new View.OnClickListener(this) { // from class: aqvk
        private final aqvn a;

        {
            this.a = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            aqvn aqvnVar = this.a;
            aqux aquxVar = aqvnVar.h;
            dbsk.s(aquxVar);
            boolean z = !aquxVar.h().booleanValue();
            aqvnVar.a(z);
            aqvnVar.b(z);
        }
    };
    public List<aquu> i = dcdc.e();

    public aqvn(Activity activity, dehq dehqVar, dehq dehqVar2, dxio<apyt> dxioVar, dxio<akfa> dxioVar2, dxio<aqbo> dxioVar3, aqvx aqvxVar) {
        this.a = activity;
        this.b = dehqVar;
        this.j = dehqVar2;
        this.c = dxioVar;
        this.e = dxioVar2;
        this.d = dxioVar3;
        this.k = aqvxVar;
    }

    public final void a(boolean z) {
        aqux aquxVar = this.h;
        dbsk.s(aquxVar);
        aquxVar.i(z);
    }

    public final void b(boolean z) {
        String string;
        dbsg<ctyy> e = this.d.a().e(1);
        if (e.a()) {
            this.f.b(Boolean.TRUE);
            btlu btluVar = this.g;
            dbsk.s(btluVar);
            dehn<apzp> a = this.c.a().a(e.b(), btluVar, z);
            if (z) {
                string = this.a.getString(apyi.MESSAGING_SETTINGS_PERSONAL_CATEGORY_READ_RECEIPT_ENABLE_SUCCESS);
            } else {
                string = this.a.getString(apyi.MESSAGING_SETTINGS_PERSONAL_CATEGORY_READ_RECEIPT_DISABLE_SUCCESS);
            }
            Activity activity = this.a;
            deha.q(a, new aqvm(activity, string, activity.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE)), this.j);
            return;
        }
        c();
        a(!z);
    }

    public final void c() {
        this.a.runOnUiThread(new Runnable(this) { // from class: aqvl
            private final aqvn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqvn aqvnVar = this.a;
                ckos.a(aqvnVar.a.findViewById(16908290), aqvnVar.a.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE), 0).c();
            }
        });
    }
}
