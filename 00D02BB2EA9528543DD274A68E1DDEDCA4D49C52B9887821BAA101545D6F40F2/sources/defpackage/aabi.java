package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aabi  reason: default package */
/* loaded from: classes2.dex */
public class aabi implements jbk {
    public static final /* synthetic */ int c = 0;
    private static final cqss d = cqta.d(-12828605);
    public final aabh a;
    public btpf b;
    private final String e;
    private final jho f;
    private final jho g;
    private boolean h;
    private boolean i;

    public aabi(Activity activity, btpf btpfVar, final aabh aabhVar, String str) {
        this.b = btpfVar;
        this.a = aabhVar;
        this.e = str;
        jhm jhmVar = new jhm();
        cqss cqssVar = d;
        jhmVar.c = cqrt.g(2131231678, cqssVar);
        jhmVar.b = activity.getString(R.string.ACCESSIBILITY_VIEW_MAP);
        jhmVar.h = 1;
        jhmVar.d = irg.b();
        jhmVar.d(new View.OnClickListener(aabhVar) { // from class: aabe
            private final aabh a;

            {
                this.a = aabhVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aabh aabhVar2 = this.a;
                int i = aabi.c;
                aabhVar2.c();
            }
        });
        jhmVar.f = cjtd.a(dtxo.by);
        this.f = jhmVar.c();
        jhm jhmVar2 = new jhm();
        jhmVar2.c = cqrt.g(2131231642, cqssVar);
        jhmVar2.b = activity.getString(R.string.SEARCH_LIST_RESULTS);
        jhmVar2.h = 1;
        jhmVar2.d = irg.b();
        jhmVar2.d(new View.OnClickListener(aabhVar) { // from class: aabf
            private final aabh a;

            {
                this.a = aabhVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aabh aabhVar2 = this.a;
                int i = aabi.c;
                aabhVar2.d();
            }
        });
        this.g = jhmVar2.c();
    }

    @Override // defpackage.jbk
    public jib NC() {
        dbsg i;
        if (this.b == btpf.TABLET_LANDSCAPE) {
            i = dbpy.a;
        } else {
            i = dbsg.i(this.h ? this.f : this.g);
        }
        String str = this.e;
        boolean z = this.i;
        boolean z2 = this.h;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: aabg
            private final aabi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.h();
            }
        };
        jhz jhzVar = new jhz();
        jhzVar.a = str;
        jhzVar.u = irg.b();
        jhzVar.q = irg.a();
        jhzVar.A = z;
        jhzVar.i = cqrt.g(2131231588, irg.b());
        jhzVar.o = cjtd.a(dtxo.bt);
        jhzVar.j = cqrt.l(R.string.BACK_BUTTON);
        jhzVar.f(onClickListener);
        jhzVar.d = irn.O();
        jhzVar.x = !z2;
        if (i.a()) {
            jhzVar.c((jho) i.b());
        }
        return jhzVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.h = z;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aaco aacoVar) {
        this.i = !aacoVar.a();
        cqkx.p(this);
    }
}
