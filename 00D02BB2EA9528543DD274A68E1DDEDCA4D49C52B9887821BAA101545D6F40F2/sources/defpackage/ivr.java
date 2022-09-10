package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ivr  reason: default package */
/* loaded from: classes.dex */
public class ivr implements iyz {
    public final dxio<bsvm> a;
    private final gga b;

    public ivr(gga ggaVar, dxio<bsvm> dxioVar, ine ineVar) {
        this.b = ggaVar;
        this.a = dxioVar;
    }

    @Override // defpackage.iyz
    public jht a() {
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = this.b.getString(R.string.SETTINGS);
        jhmVar.d(new View.OnClickListener(this) { // from class: ivq
            private final ivr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a().e();
            }
        });
        h.d(jhmVar.c());
        return h.b();
    }

    @Override // defpackage.iyz
    public Boolean b() {
        return false;
    }
}
