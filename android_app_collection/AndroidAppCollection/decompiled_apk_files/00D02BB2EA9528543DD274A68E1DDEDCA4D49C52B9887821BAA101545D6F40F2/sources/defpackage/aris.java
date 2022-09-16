package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aris  reason: default package */
/* loaded from: classes2.dex */
public class aris implements izw {
    public static final ddho a = dtxv.eI;
    public final bwft b;
    public final arfm c;
    public final gn d;
    public final String e;
    private final List<izx> f;

    public aris(bwft bwftVar, arfm arfmVar, gn gnVar, String str) {
        this.b = bwftVar;
        this.c = arfmVar;
        this.d = gnVar;
        this.e = str;
        ArrayList f = dchl.f(2);
        f.add(new ivd(cqrt.g(2131231745, ibm.x()), cqrt.l(R.string.MY_MAPS_DETAILS_SHARE_BUTTON), ibm.x(), new ivc(this) { // from class: ariq
            private final aris a;

            {
                this.a = this;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                String str2;
                aris arisVar = this.a;
                bwft bwftVar2 = arisVar.b;
                String str3 = "";
                if (arisVar.a()) {
                    dvcr dvcrVar = arisVar.c.C().c().e().b;
                    if (dvcrVar == null) {
                        dvcrVar = dvcr.h;
                    }
                    str2 = dvcrVar.b;
                } else {
                    str2 = str3;
                }
                if (arisVar.a()) {
                    dvcr dvcrVar2 = arisVar.c.C().c().e().b;
                    if (dvcrVar2 == null) {
                        dvcrVar2 = dvcr.h;
                    }
                    dnpq dnpqVar = dvcrVar2.g;
                    if (dnpqVar == null) {
                        dnpqVar = dnpq.g;
                    }
                    str3 = dnpqVar.c;
                }
                ddho ddhoVar = aris.a;
                bwdt bwdtVar = new bwdt(str3);
                bwdtVar.a = str2;
                bwdtVar.b();
                bwdtVar.d = 5;
                ((bwez) bwftVar2).n(bwdtVar.a(), new bwfs[0], null, ddhoVar);
            }
        }, cjtd.a(a)));
        f.add(new ivd(cqrt.g(2131232205, ibm.x()), cqrt.l(R.string.MY_MAPS_DETAILS_CLOSE_BUTTON), ibm.x(), new ivc(this) { // from class: arir
            private final aris a;

            {
                this.a = this;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                aris arisVar = this.a;
                arisVar.d.h(arisVar.e, 1);
                arisVar.c.k();
            }
        }, cjtd.a(dtxv.es)));
        this.f = f;
    }

    public final boolean a() {
        return this.c.C().c().c == arfj.MAP_LOADED;
    }

    @Override // defpackage.izw
    public cjtd b() {
        return cjtd.b;
    }

    @Override // defpackage.izw
    public List<izx> c() {
        return this.f;
    }
}
