package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvxw  reason: default package */
/* loaded from: classes5.dex */
public final class cvxw<T> extends abg<acl> {
    public T a;
    public dcdc<T> e;
    public final cwfn f;
    private final Context g;
    private final cvuu<T> h;
    private final dcdc<cwic> i;
    private final cwla j;
    private final dbsg<cvwn<T>> k;
    private final Class<T> l;
    private final boolean m;
    private final cvxr<T> n;
    private final List<T> o = new ArrayList();
    private final cvxj<T> p = new cvxu(this);
    private final cwiy q;
    private final int r;
    private final cvzg s;

    public cvxw(Context context, cvxy<T> cvxyVar, dcdc<cwic> dcdcVar, cvxq<T> cvxqVar, dtgb dtgbVar, cwla cwlaVar, int i, dbsg<cvwn<T>> dbsgVar) {
        dbsk.s(context);
        this.g = context;
        cvya cvyaVar = (cvya) cvxyVar;
        cvuu<T> cvuuVar = (cvuu<T>) cvyaVar.a;
        dbsk.s(cvuuVar);
        this.h = cvuuVar;
        cwfn cwfnVar = cvyaVar.e;
        dbsk.s(cwfnVar);
        this.f = cwfnVar;
        cvzg cvzgVar = cvyaVar.f;
        dbsk.s(cvzgVar);
        this.s = cvzgVar;
        Class<T> cls = (Class<T>) cvyaVar.b;
        dbsk.s(cls);
        this.l = cls;
        this.m = cvyaVar.c;
        this.i = dcdcVar;
        this.j = cwlaVar;
        this.k = dbsgVar;
        cwjx cwjxVar = cvyaVar.d;
        dbsk.s(cwjxVar);
        dbsk.s(dtgbVar);
        this.n = new cvxr<>(cvzgVar, cwjxVar, dtgbVar, cwlaVar, cvxqVar);
        this.q = new cwiy(context);
        this.r = i;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        return dbsd.a(String.valueOf(charSequence), String.valueOf(charSequence2));
    }

    public final void a() {
        czhz.b();
        ArrayList arrayList = new ArrayList(this.o);
        ArrayList arrayList2 = new ArrayList(this.e);
        T t = this.a;
        if (t != null) {
            arrayList2.remove(t);
        }
        ts a = tx.a(new cvxv(this, arrayList, arrayList2));
        this.o.clear();
        this.o.addAll(arrayList2);
        a.a(this);
    }

    @Override // defpackage.abg
    public final int c() {
        return this.o.size() + this.i.size();
    }

    @Override // defpackage.abg
    public final acl d(ViewGroup viewGroup, int i) {
        if (i == 0) {
            AccountParticle accountParticle = (AccountParticle) LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), 2132017749)).inflate(R.layout.account_list_item, viewGroup, false);
            od.y(accountParticle, od.w(accountParticle) + accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start) + this.r, accountParticle.getPaddingTop(), od.x(accountParticle) + this.r, accountParticle.getPaddingBottom());
            return new cvxo(accountParticle, this.f, this.h, this.m, this.k);
        }
        Context context = this.g;
        cwla cwlaVar = this.j;
        cwiy cwiyVar = this.q;
        cwif cwifVar = new cwif(context, cwlaVar, viewGroup, cwie.f(cwiyVar.a(cwix.COLOR_ON_SURFACE), cwiyVar.a(cwix.TEXT_PRIMARY), cwiyVar.a(cwix.COLOR_PRIMARY_GOOGLE), cwiyVar.a(cwix.COLOR_ON_PRIMARY_GOOGLE)));
        cwifVar.E(this.r);
        return cwifVar;
    }

    @Override // defpackage.abg
    public final void e(acl aclVar, int i) {
        if (aclVar instanceof cvxo) {
            final cvxo cvxoVar = (cvxo) aclVar;
            final cvxr<T> cvxrVar = this.n;
            final T t = this.o.get(i);
            cvxrVar.d.c(cvxoVar.a, 90144);
            View.OnClickListener onClickListener = new View.OnClickListener(cvxrVar, t) { // from class: cvxp
                private final cvxr a;
                private final Object b;

                {
                    this.a = cvxrVar;
                    this.b = t;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cvxr cvxrVar2 = this.a;
                    Object obj = this.b;
                    cvxrVar2.a.a(cvxrVar2.f.e(), cvxrVar2.b);
                    cvxrVar2.d.d(csgw.a(), view);
                    cvxrVar2.e.a(obj);
                    cvxrVar2.a.a(cvxrVar2.f.e(), cvxrVar2.c);
                }
            };
            cvxoVar.s.setAccount(t);
            if (cvxoVar.t.a()) {
                cvxoVar.t.b().a().a().a().b(cvxoVar.t.b().b(), new aa(cvxoVar) { // from class: cvxm
                    private final cvxo a;

                    {
                        this.a = cvxoVar;
                    }

                    @Override // defpackage.aa
                    public final void m(Object obj) {
                        Integer num = (Integer) obj;
                        this.a.C();
                    }
                });
            }
            cvxoVar.C();
            cvxoVar.a.setOnClickListener(onClickListener);
            AccountParticle accountParticle = (AccountParticle) cvxoVar.a;
            accountParticle.e.setAlpha(1.0f);
            accountParticle.f.setAlpha(1.0f);
            accountParticle.d.setAlpha(1.0f);
        } else if (!(aclVar instanceof cwif)) {
        } else {
            ((cwif) aclVar).C(this.i.get(i - this.o.size()));
        }
    }

    @Override // defpackage.abg
    public final int i(int i) {
        return i < this.o.size() ? 0 : 1;
    }

    @Override // defpackage.abg
    public final void l(acl aclVar) {
        if (aclVar instanceof cvxo) {
            this.n.d.e(((cvxo) aclVar).a);
        } else if (!(aclVar instanceof cwif)) {
        } else {
            ((cwif) aclVar).D();
        }
    }

    @Override // defpackage.abg
    public final void q(RecyclerView recyclerView) {
        this.s.i(this.p);
        this.a = (T) this.s.e();
        this.e = dcdc.r(this.s.l());
        a();
    }

    @Override // defpackage.abg
    public final void r(RecyclerView recyclerView) {
        this.s.k(this.p);
        this.o.clear();
    }
}
