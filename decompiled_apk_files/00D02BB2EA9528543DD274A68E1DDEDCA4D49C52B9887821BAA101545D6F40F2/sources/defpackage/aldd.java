package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aldd  reason: default package */
/* loaded from: classes2.dex */
public final class aldd {
    public final dbty<akxa> a;
    public final aufc b;
    public final dbty<dehn<alee>> c;
    public final dbty<dehn<alee>> d;
    public final dbty<dehn<alee>> e;
    public final dbty<dehn<alee>> f;
    public final dbty<dehn<alee>> g;
    public final dbty<dehn<alee>> h;
    public final dbty<dehn<alee>> i;
    public final dbty<dehn<alem>> j;
    public final dbty<dehn<aleq>> k;

    public aldd(final dxio<akto> dxioVar, final dxio<akvz> dxioVar2, final Resources resources, aufc aufcVar) {
        this.b = aufcVar;
        this.c = dbud.a(new dbty(resources, dxioVar2) { // from class: alcr
            private final Resources a;
            private final dxio b;

            {
                this.a = resources;
                this.b = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return aldd.a(R.drawable.blue_walking_dot, R.drawable.blue_walking_dot_dim, R.drawable.blue_walking_alternate_dot, this.a, (akvz) this.b.a(), 1);
            }
        });
        this.d = dbud.a(new dbty(resources, dxioVar2) { // from class: alcs
            private final Resources a;
            private final dxio b;

            {
                this.a = resources;
                this.b = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return aldd.a(R.drawable.blue_walking_dot_night, R.drawable.blue_walking_dot_night, R.drawable.blue_walking_alternate_dot_dim, this.a, (akvz) this.b.a(), 1);
            }
        });
        this.e = dbud.a(new dbty(resources, dxioVar2) { // from class: alct
            private final Resources a;
            private final dxio b;

            {
                this.a = resources;
                this.b = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return aldd.a(R.drawable.indeterminate_route_dot, R.drawable.indeterminate_route_dot_dim, R.drawable.indeterminate_route_alternate_dot, this.a, (akvz) this.b.a(), 2);
            }
        });
        this.f = dbud.a(new dbty(resources, dxioVar2) { // from class: alcu
            private final Resources a;
            private final dxio b;

            {
                this.a = resources;
                this.b = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return aldd.a(R.drawable.blue_walking_dot_dim, R.drawable.blue_walking_dot_dim, R.drawable.blue_walking_alternate_dot, this.a, (akvz) this.b.a(), 1);
            }
        });
        this.g = dbud.a(new dbty(resources, dxioVar2) { // from class: alcv
            private final Resources a;
            private final dxio b;

            {
                this.a = resources;
                this.b = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return aldd.a(R.drawable.indeterminate_route_dot, R.drawable.indeterminate_route_dot_dim, R.drawable.indeterminate_route_alternate_dot_dim, this.a, (akvz) this.b.a(), 2);
            }
        });
        this.h = dbud.a(new dbty(resources, dxioVar2) { // from class: alcw
            private final Resources a;
            private final dxio b;

            {
                this.a = resources;
                this.b = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return aldd.a(R.drawable.blue_walking_dot_night, R.drawable.blue_walking_dot_night, R.drawable.blue_walking_alternate_dot_dim, this.a, (akvz) this.b.a(), 1);
            }
        });
        this.i = dbud.a(new dbty(dxioVar2) { // from class: alcx
            private final dxio a;

            {
                this.a = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar3 = this.a;
                return deha.a(new aleg(((akvz) dxioVar3.a()).a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE), ((akvz) dxioVar3.a()).a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_INACTIVE), ((akvz) dxioVar3.a()).a(dmqc.LEGEND_STYLE_SECONDARY_ROUTE)));
            }
        });
        this.j = dbud.a(new dbty(dxioVar2) { // from class: alcy
            private final dxio a;

            {
                this.a = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return deha.a(new alem((akvz) this.a.a()));
            }
        });
        this.k = dbud.a(new dbty(dxioVar2) { // from class: alcz
            private final dxio a;

            {
                this.a = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return deha.a(new aleq((akvz) this.a.a()));
            }
        });
        this.a = dbud.a(new dbty(dxioVar) { // from class: alda
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new akxa((akto) this.a.a());
            }
        });
    }

    public static dehn<alee> a(int i, int i2, int i3, Resources resources, akvz akvzVar, int i4) {
        akuh b = aldg.b(resources, i, akvzVar, bntp.POLYLINE, i4);
        akuh b2 = aldg.b(resources, i2, akvzVar, bntp.POLYLINE_DIMMED, i4);
        akuh b3 = aldg.b(resources, i3, akvzVar, bntp.POLYLINE_DEACTIVATED_WITH_STAMPS, i4);
        dehn<akuh> a = aldg.a(b);
        dehn<akuh> a2 = aldg.a(b2);
        dehn<akuh> a3 = aldg.a(b3);
        deig d = deig.d();
        deha.q(deha.i(a, a2, a3), new alef(d), dege.a);
        return d;
    }
}
