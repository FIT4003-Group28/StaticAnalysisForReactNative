package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bddk  reason: default package */
/* loaded from: classes3.dex */
public final class bddk implements bdal {
    public final dxio<anhg> a;
    public final gfw b;
    private final Activity c;

    public bddk(Activity activity, dxio<anhg> dxioVar, gfw gfwVar) {
        this.c = activity;
        this.a = dxioVar;
        this.b = gfwVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        final dwfl a = bczwVar.a();
        dizh dizhVar = a.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        for (diiu diiuVar : new dsrh(diisVar.c, diis.d)) {
            if (diiuVar == diiu.MAYBE_RECEIPT) {
                jhm jhmVar = new jhm();
                jhmVar.h = 0;
                jhmVar.a = this.c.getResources().getString(R.string.MARK_AS_A_RECEIPT_MENU);
                jhmVar.d = ibl.b();
                jhmVar.b = this.c.getResources().getString(R.string.MARK_AS_A_RECEIPT_MENU);
                jhmVar.f = cjtd.a(dtyi.aC);
                jhmVar.d(new View.OnClickListener(this, a) { // from class: bddj
                    private final bddk a;
                    private final dwfl b;

                    {
                        this.a = this;
                        this.b = a;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bddk bddkVar = this.a;
                        bddkVar.a.a().s(this.b, bddkVar.b);
                    }
                });
                return jhmVar.c();
            }
        }
        return null;
    }
}
