package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: apvr  reason: default package */
/* loaded from: classes2.dex */
public class apvr implements apvm, aprx {
    private static final Comparator<ilo> b = apvq.a;
    public final gga a;
    private final apvo c;
    private jib g;
    private List<ilo> e = dchl.a();
    private boolean f = true;
    private final List<apvl> d = dchl.a();

    public apvr(gga ggaVar, apvo apvoVar) {
        this.a = ggaVar;
        this.c = apvoVar;
    }

    private final void g() {
        this.d.clear();
        for (ilo iloVar : this.e) {
            List<apvl> list = this.d;
            apvo apvoVar = this.c;
            dvyw h = iloVar.h();
            gga a = apvoVar.a.a();
            apvo.a(a, 1);
            begg a2 = apvoVar.b.a();
            apvo.a(a2, 2);
            czsy a3 = apvoVar.c.a();
            apvo.a(a3, 3);
            apvo.a(h, 4);
            list.add(new apvn(a, a2, a3, h));
        }
    }

    @Override // defpackage.aprx
    public void a(brlu brluVar) {
        ArrayList a = dchl.a();
        for (ilo iloVar : brluVar.c()) {
            if (iloVar != null) {
                a.add(iloVar);
            }
        }
        Collections.sort(a, b);
        this.e = a;
        g();
        f(false);
    }

    @Override // defpackage.aprx
    public void b(brlu brluVar) {
        bttq an = brluVar.an();
        if (an != null) {
            an.name();
        }
        f(false);
    }

    @Override // defpackage.apvm
    public jib c() {
        if (this.g == null) {
            jhz a = jhz.a();
            a.a = this.a.getString(R.string.YOUR_BUSINESSES_PROFILE_PAGE_TITLE);
            a.n = this.a.getString(R.string.YOUR_BUSINESSES_PROFILE_PAGE_TITLE);
            a.C = 3;
            a.f(new View.OnClickListener(this) { // from class: apvp
                private final apvr a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a.onBackPressed();
                }
            });
            a.x = true;
            a.q = ibm.b();
            a.u = ibm.c();
            a.g = ibm.c();
            this.g = a.b();
        }
        return this.g;
    }

    @Override // defpackage.apvm
    public List<apvl> d() {
        return this.d;
    }

    @Override // defpackage.apvm
    public boolean e() {
        return this.f;
    }

    public void f(boolean z) {
        this.f = false;
        cqkx.p(this);
    }
}
