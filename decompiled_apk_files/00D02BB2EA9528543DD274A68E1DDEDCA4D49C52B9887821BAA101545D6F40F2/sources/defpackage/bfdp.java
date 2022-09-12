package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bfdp  reason: default package */
/* loaded from: classes3.dex */
public abstract class bfdp extends ges {
    private jfr a;
    private jbk b;
    public bwqv d;
    public efg e;
    @dzsi
    protected bwrs<ilo> f;

    public static Bundle w(bwqv bwqvVar, @dzsi bwrs<ilo> bwrsVar) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        return bundle;
    }

    @dzsi
    protected jib g() {
        return null;
    }

    protected abstract View i(ilo iloVar);

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        try {
            bwrs<ilo> e = this.d.e(ilo.class, this.o, "placemark");
            dbsk.s(e);
            this.f = e;
            final jib g = g();
            if (g != null) {
                this.b = new jbk(g) { // from class: bfdo
                    private final jib a;

                    {
                        this.a = g;
                    }

                    @Override // defpackage.jbk
                    public jib NC() {
                        return this.a;
                    }
                };
                this.a = new jfr(J(), this.b);
            }
            super.l(bundle);
        } catch (IOException e2) {
            throw new RuntimeException("PlacePageSubPageFragment cannot be created without a placemark", e2);
        }
    }

    public jfr q() {
        return this.a;
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        bwrs<ilo> bwrsVar = this.f;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        View i = i(c);
        jfr q = q();
        dbsk.s(q);
        efg efgVar = this.e;
        egj egjVar = new egj(this);
        if (q.b == null) {
            q.b = new RelativeLayout(q.getContext());
        }
        q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        q.b.removeAllViews();
        q.b.addView(i);
        q.b.addView(q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        i.setLayoutParams(layoutParams);
        layoutParams.addRule(3, R.id.mod_header_view);
        layoutParams.topMargin = -ise.b.e(q.getContext());
        egjVar.w(q.b);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }
}
