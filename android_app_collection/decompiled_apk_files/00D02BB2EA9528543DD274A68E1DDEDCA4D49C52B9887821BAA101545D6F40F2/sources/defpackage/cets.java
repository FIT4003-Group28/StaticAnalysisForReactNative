package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cets  reason: default package */
/* loaded from: classes4.dex */
public class cets implements cetc {
    public final v<axfk> a;
    public Boolean b = false;
    private final gga c;
    private final Boolean d;
    private final Runnable e;
    private final cjtd f;
    private final dbrn<Integer, String> g;
    private final int h;

    public cets(gga ggaVar, v<axfk> vVar, dbsg<v<Boolean>> dbsgVar, Boolean bool, Runnable runnable, cjtd cjtdVar, dbrn<Integer, String> dbrnVar, int i, cqhn cqhnVar, final cetu cetuVar, m mVar) {
        this.c = ggaVar;
        this.a = vVar;
        this.d = bool;
        this.e = runnable;
        this.f = cjtdVar;
        this.g = dbrnVar;
        this.h = i;
        vVar.b(mVar, new aa(cetuVar) { // from class: cetq
            private final cetu a;

            {
                this.a = cetuVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                axfk axfkVar = (axfk) obj;
                cqkx.p(this.a);
            }
        });
        if (dbsgVar.a()) {
            dbsgVar.b().b(mVar, new aa(this) { // from class: cetr
                private final cets a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    cets cetsVar = this.a;
                    Boolean bool2 = (Boolean) obj;
                    dbsk.s(bool2);
                    cetsVar.b = bool2;
                    cqkx.p(cetsVar);
                }
            });
        }
    }

    @Override // defpackage.cetc
    public String a() {
        axfk h = this.a.h();
        dbsk.s(h);
        return Integer.toString(h.a().b().intValue());
    }

    @Override // defpackage.cetc
    public String b() {
        dbrn<Integer, String> dbrnVar = this.g;
        axfk h = this.a.h();
        dbsk.s(h);
        return dbrnVar.a(h.a().b());
    }

    @Override // defpackage.cetc
    public String c() {
        axfk h = this.a.h();
        dbsk.s(h);
        int intValue = h.a().b().intValue();
        String quantityString = this.c.getResources().getQuantityString(this.h, intValue, Integer.valueOf(intValue));
        return d().booleanValue() ? dbrz.e(", ").i(quantityString, this.c.getString(R.string.FOLLOWER_COUNT_UPDATE_DESCRIPTION), new Object[0]) : quantityString;
    }

    @Override // defpackage.cetc
    public Boolean d() {
        return this.b;
    }

    @Override // defpackage.cetc
    public Boolean e() {
        return this.d;
    }

    @Override // defpackage.cetc
    public cqkl f() {
        this.e.run();
        return cqkl.a;
    }

    @Override // defpackage.cetc
    public cjtd g() {
        return this.f;
    }

    public boolean h() {
        axfk h = this.a.h();
        dbsk.s(h);
        return h.a().a();
    }
}
