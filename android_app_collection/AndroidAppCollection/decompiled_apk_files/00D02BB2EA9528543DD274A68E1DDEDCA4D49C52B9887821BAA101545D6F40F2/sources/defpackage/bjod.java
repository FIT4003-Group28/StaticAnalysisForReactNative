package defpackage;

import android.view.View;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjod  reason: default package */
/* loaded from: classes3.dex */
public class bjod implements bjoa {
    public final gfv a;
    public String b;
    private final PublicDisclosureLayout$PublicDisclosureViewModelImpl c;
    private final gga d;

    public bjod(gfv gfvVar, ilo iloVar, String str, PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl, gga ggaVar) {
        this.a = gfvVar;
        this.b = str;
        publicDisclosureLayout$PublicDisclosureViewModelImpl.m(iloVar);
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
        publicDisclosureLayout$PublicDisclosureViewModelImpl.n(true);
        this.c = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        this.d = ggaVar;
    }

    @Override // defpackage.bjoa
    public List<jho> a() {
        jhm b = jhm.b(R.string.GENERIC_SAVE_BUTTON);
        b.d(new View.OnClickListener(this) { // from class: bjob
            private final bjod a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bjod bjodVar = this.a;
                gfv gfvVar = bjodVar.a;
                bjhu bZ = bjhv.c.bZ();
                String str = bjodVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bjhv bjhvVar = (bjhv) bZ.b;
                str.getClass();
                bjhvVar.a |= 1;
                bjhvVar.b = str;
                gfvVar.Nw(bZ.bK());
                bjodVar.f();
            }
        });
        return dcdc.f(b.c());
    }

    @Override // defpackage.bjoa
    public String b() {
        return this.b;
    }

    @Override // defpackage.bjoa
    public cayf c() {
        return this.c;
    }

    @Override // defpackage.bjoa
    public cqgl d() {
        return new cqgl(this) { // from class: bjoc
            private final bjod a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.b = charSequence.toString();
            }
        };
    }

    @Override // defpackage.bjoa
    public cqkl e() {
        f();
        return cqkl.a;
    }

    public final void f() {
        this.d.onBackPressed();
    }

    public void g(m mVar) {
        ((fd) mVar).Z.a(this.c);
    }
}
