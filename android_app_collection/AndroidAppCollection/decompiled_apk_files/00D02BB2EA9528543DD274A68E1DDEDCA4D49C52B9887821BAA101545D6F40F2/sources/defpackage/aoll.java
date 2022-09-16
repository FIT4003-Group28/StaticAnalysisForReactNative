package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoll  reason: default package */
/* loaded from: classes2.dex */
public class aoll implements aoli {
    public final bvvq a;
    public final afha b;
    public final String c;
    private final View.OnAttachStateChangeListener d = new aolk(this);
    private final gga e;
    private final btvo f;
    private final CharSequence g;
    private final anhg h;
    private final btrm i;

    public aoll(bvvq bvvqVar, cqhn cqhnVar, gga ggaVar, btvo btvoVar, afha afhaVar, anhg anhgVar, btrm btrmVar, bvvs bvvsVar) {
        this.a = bvvqVar;
        this.e = ggaVar;
        this.f = btvoVar;
        this.b = afhaVar;
        this.h = anhgVar;
        this.i = btrmVar;
        this.c = bvvsVar.a().b;
        this.g = cqrt.l(R.string.OPEN_IN_BROWSER).a(ggaVar);
        bvvqVar.a(bvvsVar, dtya.q);
    }

    @Override // defpackage.aoli
    public View.OnAttachStateChangeListener a() {
        return this.d;
    }

    @Override // defpackage.aoli
    public CharSequence b() {
        return this.f.getMapsActivitiesParameters().c;
    }

    @Override // defpackage.aoli
    public cqkl c() {
        this.i.b(new anla());
        this.h.p();
        this.e.g().e();
        return cqkl.a;
    }

    @Override // defpackage.aoli
    public jht d() {
        jhu h = jhv.h();
        jhm a = jhm.a();
        CharSequence charSequence = this.g;
        a.a = charSequence;
        a.b = charSequence;
        a.c = cqrt.g(2131232371, ibm.p());
        a.d(new View.OnClickListener(this) { // from class: aolj
            private final aoll a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aoll aollVar = this.a;
                aollVar.b.m(aollVar.c, 4);
            }
        });
        a.f = cjtd.b;
        h.d(a.c());
        return h.b();
    }
}
