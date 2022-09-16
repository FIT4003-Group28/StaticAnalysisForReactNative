package defpackage;

import com.google.android.apps.maps.R;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: bmey  reason: default package */
/* loaded from: classes3.dex */
public class bmey implements bmew {
    private static final dcqe a = dcqe.c("bmey");
    private final gga b;
    private final aaap c;
    private final abdz d;
    @dzsi
    private bwrs<ilo> e;
    @dzsi
    private dqqa f;
    @dzsi
    private CharSequence g;
    @dzsi
    private abdp h;

    public bmey(gga ggaVar, aaap aaapVar, abdz abdzVar) {
        this.b = ggaVar;
        this.c = aaapVar;
        this.d = abdzVar;
    }

    private final void g() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.bmew
    public CharSequence a() {
        String string = this.b.getString(R.string.SHOWTIMES_TITLE);
        CharSequence charSequence = this.g;
        return charSequence == null ? string : String.format("%s · %s", string, charSequence);
    }

    @Override // defpackage.bmew
    public Boolean b() {
        dqqa dqqaVar = this.f;
        boolean z = false;
        if (dqqaVar == null) {
            return false;
        }
        if (1 == (dqqaVar.a & 1)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmew
    public CharSequence c() {
        dqqa dqqaVar = this.f;
        return dqqaVar == null ? "" : dqqaVar.c;
    }

    @Override // defpackage.bmew
    @dzsi
    public abdp d() {
        return this.h;
    }

    @Override // defpackage.bmew
    public Boolean e() {
        dqqa dqqaVar = this.f;
        boolean z = false;
        if (dqqaVar == null) {
            return false;
        }
        if (dqqaVar.b.size() > 1) {
            return true;
        }
        abdp abdpVar = this.h;
        if (abdpVar != null && abdpVar.a().size() > 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmew
    public cqkl f() {
        bwrs<ilo> bwrsVar = this.e;
        if (bwrsVar != null) {
            this.c.k(bwrsVar);
        } else {
            bvoo.h("Placemark reference is null.", new Object[0]);
        }
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            g();
            return;
        }
        dqqa U = c.U();
        if (U == null || U.b.size() <= 0) {
            g();
            return;
        }
        this.e = bwrsVar;
        this.f = U;
        dbsg r = dcbg.b(U.b).r(bmex.a);
        if (!r.a()) {
            return;
        }
        this.g = ((dqpm) r.b()).b;
        this.h = this.d.a((dqpm) r.b(), 2, c.n(), U.f, U.e, Collections.unmodifiableMap(U.d));
    }

    @Override // defpackage.bega
    public void u() {
        g();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.f != null);
    }
}
