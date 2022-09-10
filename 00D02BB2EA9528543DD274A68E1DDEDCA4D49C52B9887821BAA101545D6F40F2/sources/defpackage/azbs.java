package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azbs  reason: default package */
/* loaded from: classes3.dex */
public class azbs implements azbb {
    public final gga a;
    public final axwi b;
    public final ayay c;
    public final Executor d;
    public final Executor e;
    public final dcdc<ilo> f;
    public final cjqy g;
    public final ayzf j;
    private final aydu k;
    @dzsi
    private aydt l;
    public String h = "";
    public String i = "";
    private boolean m = false;

    public azbs(gga ggaVar, axwi axwiVar, aydu ayduVar, ayay ayayVar, Executor executor, Executor executor2, cjqy cjqyVar, dcdc dcdcVar, ayzf ayzfVar) {
        this.a = ggaVar;
        this.b = axwiVar;
        this.g = cjqyVar;
        this.k = ayduVar;
        this.c = ayayVar;
        this.d = executor;
        this.e = executor2;
        this.f = dcdcVar;
        this.j = ayzfVar;
    }

    @Override // defpackage.azbb
    public jib a() {
        jhz a = jhz.a();
        a.a = this.a.getString(R.string.CREATE_NEW_LIST);
        a.f(new View.OnClickListener(this) { // from class: azbl
            private final azbs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        a.o = cjtd.a(dtyb.j);
        boolean z = true;
        a.x = true;
        jhm a2 = jhm.a();
        a2.a = this.a.getString(R.string.GENERIC_CREATE_BUTTON);
        a2.h = 2;
        a2.d(new View.OnClickListener(this) { // from class: azbm
            private final azbs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final azbs azbsVar = this.a;
                if (azbsVar.b().k() == baac.PRIVATE || azbsVar.c.e()) {
                    baad a3 = azbsVar.b.a(dbsj.e(azbsVar.h));
                    if (!dbsj.d(azbsVar.i)) {
                        a3.H(azbsVar.i);
                    }
                    dcdc<ilo> dcdcVar = azbsVar.f;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        a3.b(azbsVar.b.d(a3, dcdcVar.get(i)));
                    }
                    azbsVar.h(true);
                    final baac k = azbsVar.b().k();
                    deha.q(deew.g(degp.q(azbsVar.b.j(a3)), new defg(azbsVar, k) { // from class: azbn
                        private final azbs a;
                        private final baac b;

                        {
                            this.a = azbsVar;
                            this.b = k;
                        }

                        @Override // defpackage.defg
                        public final dehn a(Object obj) {
                            azbs azbsVar2 = this.a;
                            baad baadVar = (baad) obj;
                            if (this.b != baac.PRIVATE) {
                                return azbsVar2.b.l(baadVar, azbsVar2.b().k());
                            }
                            return deha.a(baadVar);
                        }
                    }, azbsVar.e), new azbr(azbsVar), azbsVar.d);
                }
            }
        });
        if (dbsj.d(this.h) || this.m) {
            z = false;
        }
        a2.n = z;
        a2.f = cjtd.a(dtyb.k);
        a.c(a2.c());
        return a.b();
    }

    @Override // defpackage.azbb
    public Boolean c() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.azbb
    public String d() {
        baac baacVar = baac.PRIVATE;
        int ordinal = b().k().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.a.getString(R.string.SHARED_LIST_NAME_HINT);
            }
            return ordinal != 2 ? "" : this.a.getString(R.string.PUBLIC_LIST_NAME_HINT);
        }
        return this.a.getString(R.string.PRIVATE_LIST_NAME_HINT);
    }

    @Override // defpackage.azbb
    public String e() {
        return this.a.getString(R.string.EDIT_LIST_DESCRIPTION_HINT);
    }

    @Override // defpackage.azbb
    public cqgl f() {
        return new cqgl(this) { // from class: azbp
            private final azbs a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                azbs azbsVar = this.a;
                String charSequence2 = charSequence.toString();
                if (!charSequence2.equals(azbsVar.i)) {
                    azbsVar.i = charSequence2;
                }
            }
        };
    }

    @Override // defpackage.azbb
    public cqgl g() {
        return new cqgl(this) { // from class: azbo
            private final azbs a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                azbs azbsVar = this.a;
                String s = dbra.b.s(dbsj.e(charSequence.toString()));
                if (!s.equals(azbsVar.h)) {
                    azbsVar.h = s;
                    cqkx.p(azbsVar);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(boolean z) {
        this.m = z;
        cqkx.p(this);
    }

    @Override // defpackage.azbb
    /* renamed from: i */
    public aydt b() {
        if (this.l == null) {
            aydu ayduVar = this.k;
            aydg aydgVar = new aydg(this) { // from class: azbq
                private final azbs a;

                {
                    this.a = this;
                }

                @Override // defpackage.aydg
                public final void a() {
                    cqkx.p(this.a);
                }
            };
            axwg a = ayduVar.a.a();
            aydu.a(a, 1);
            aydr a2 = ayduVar.c.a();
            aydu.a(a2, 2);
            this.l = new aydt(a, a2, aydgVar);
        }
        aydt aydtVar = this.l;
        dbsk.s(aydtVar);
        return aydtVar;
    }
}
