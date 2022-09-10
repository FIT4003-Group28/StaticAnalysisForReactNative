package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aefi  reason: default package */
/* loaded from: classes2.dex */
public class aefi implements aees {
    private final gga a;
    private jib b;

    public aefi(gga ggaVar, final brba brbaVar) {
        this.a = ggaVar;
        jhz e = jib.g(ggaVar, ggaVar.getString(R.string.EXPLORE_FEED_LATEST_NEARBY)).e();
        e.i = cqrt.g(2131232731, ibm.p());
        e.o = cjtd.a(dtxr.bu);
        jhm a = jhm.a();
        a.h = 1;
        a.c = cqrt.g(2131232897, ibm.p());
        a.b = ggaVar.getString(R.string.SEARCH);
        a.d(new View.OnClickListener(brbaVar) { // from class: aefh
            private final brba a;

            {
                this.a = brbaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e("");
            }
        });
        a.f = cjtd.a(dtxr.bN);
        e.c(a.c());
        this.b = e.b();
    }

    @Override // defpackage.aees
    public jib a() {
        return this.b;
    }

    public void b(awwb awwbVar) {
        dvha dvhaVar = (dvha) awwbVar.a(awvv.a).f();
        boolean b = awwbVar.c(awvv.a).b();
        if (dvhaVar == null || b) {
            return;
        }
        if (!dvhaVar.d.isEmpty()) {
            jhz e = this.b.e();
            e.a = this.a.getString(R.string.EXPLORE_FEED_LATEST_IN_AREA, new Object[]{dvhaVar.d});
            this.b = e.b();
            return;
        }
        jhz e2 = this.b.e();
        e2.a = this.a.getString(R.string.EXPLORE_FEED_LATEST_NEARBY);
        this.b = e2.b();
    }
}
