package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdeu  reason: default package */
/* loaded from: classes3.dex */
public final class bdeu implements bdal {
    public final bcrs a;
    private final Activity b;

    public bdeu(Activity activity, bcrs bcrsVar) {
        this.b = activity;
        this.a = bcrsVar;
    }

    private final jho b(final dwfl dwflVar) {
        jhm a = jhm.a();
        a.h = 1;
        a.c = cqrt.f(2131232824);
        a.d = ibl.b();
        a.a = this.b.getString(R.string.REPORT_A_PROBLEM);
        a.b = this.b.getString(R.string.REPORT_A_PROBLEM);
        a.f = cjtd.a(dtxy.fr);
        a.d(new View.OnClickListener(this, dwflVar) { // from class: bdet
            private final bdeu a;
            private final dwfl b;

            {
                this.a = this;
                this.b = dwflVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bdeu bdeuVar = this.a;
                bdeuVar.a.a(this.b);
            }
        });
        return a.c();
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        dwfl a = bczwVar.a();
        dizh dizhVar = a.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        if ((dizhVar.a & 1) != 0) {
            if ((a.a & 2097152) == 0) {
                if (!cknv.i(a)) {
                    return b(a);
                }
                return null;
            }
            dghi dghiVar = a.v;
            if (dghiVar == null) {
                dghiVar = dghi.d;
            }
            if (!dghiVar.c) {
                return null;
            }
            return b(a);
        }
        return null;
    }
}
