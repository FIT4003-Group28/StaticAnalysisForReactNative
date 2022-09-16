package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayqt  reason: default package */
/* loaded from: classes3.dex */
public class ayqt implements ayms {
    private final gga a;
    private final aymh b;
    private final List<azxk> c;
    private final dcdc<aymq> d;

    public ayqt(gga ggaVar, aymh aymhVar, final ayak ayakVar, List<azxk> list) {
        this.a = ggaVar;
        this.b = aymhVar;
        this.c = list;
        this.d = dcdc.g(new ayol(ayom.c, cjtd.a(dtyg.C), new ayok(ayakVar) { // from class: ayqr
            private final ayak a;

            {
                this.a = ayakVar;
            }

            @Override // defpackage.ayok
            public final void a() {
                this.a.i(null).a();
            }
        }), new ayol(ayom.d, cjtd.a(ayak.c(null)), new ayok(ayakVar) { // from class: ayqs
            private final ayak a;

            {
                this.a = ayakVar;
            }

            @Override // defpackage.ayok
            public final void a() {
                this.a.d(null).a();
            }
        }));
    }

    @Override // defpackage.ayms
    public String a() {
        return this.a.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE);
    }

    @Override // defpackage.ayms
    public CharSequence b() {
        return this.b.b(drcs.PRIVATE, ibm.n(), this.c.size());
    }

    @Override // defpackage.ayms
    public CharSequence c() {
        return "";
    }

    @Override // defpackage.ayms
    public cjtd d() {
        return null;
    }

    @Override // defpackage.ayms
    public String e() {
        return "";
    }

    @Override // defpackage.ayms
    public List<aymq> f() {
        return this.d;
    }

    @Override // defpackage.ayms
    public jic g() {
        return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(baam.a(baab.STARRED_PLACES), ibm.b()), 0);
    }

    @Override // defpackage.ayms
    public View.OnClickListener h() {
        return null;
    }

    @Override // defpackage.ayms
    public cjtd i() {
        return null;
    }

    @Override // defpackage.ayms
    public String j() {
        return "";
    }

    @Override // defpackage.ayms
    public Boolean k() {
        return false;
    }

    @Override // defpackage.ayms
    public Boolean l() {
        return false;
    }

    @Override // defpackage.ayms
    public aymw m() {
        return null;
    }

    @Override // defpackage.ayms
    public cqss n() {
        return baam.c(baab.STARRED_PLACES);
    }

    @Override // defpackage.ayms
    public void o() {
    }

    @Override // defpackage.ayms
    public Boolean p() {
        return false;
    }

    @Override // defpackage.ayms
    public aydl q() {
        return null;
    }
}
