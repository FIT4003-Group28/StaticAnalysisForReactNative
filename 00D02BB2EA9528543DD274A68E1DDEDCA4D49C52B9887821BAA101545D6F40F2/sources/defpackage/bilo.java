package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bilo  reason: default package */
/* loaded from: classes3.dex */
public final class bilo extends ges {
    @dzsi
    public Point a;
    public cqkj b;
    public efg c;
    public bixb d;
    private biwi e;
    private cqkf<biwi> f;
    private boolean g;

    public static bilo g(String str, @dzsi String str2, @dzsi Point point) {
        bilo biloVar = new bilo();
        Bundle bundle = new Bundle();
        bundle.putParcelable("animation_start_point", point);
        bundle.putString("olc", str);
        bundle.putString("locality", str2);
        biloVar.B(bundle);
        return biloVar;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf<biwi> c = this.b.c(new bint(), null);
        this.f = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        String string;
        String string2;
        Point point;
        super.l(bundle);
        if (bundle != null) {
            string = bundle.getString("olc");
        } else {
            string = this.o.getString("olc");
        }
        String str = string;
        boolean z = bundle == null;
        if (bundle == null) {
            string2 = this.o.getString("locality");
        } else {
            string2 = bundle.getString("locality");
        }
        String str2 = string2;
        bixb bixbVar = this.d;
        cklf a = bixbVar.a.a();
        bixb.a(a, 1);
        gga a2 = bixbVar.b.a();
        bixb.a(a2, 2);
        btpc a3 = bixbVar.c.a();
        bixb.a(a3, 3);
        bixb.a(str, 4);
        this.e = new bixa(a, a2, a3, str, str2);
        if (bundle == null) {
            point = (Point) this.o.getParcelable("animation_start_point");
        } else {
            point = (Point) bundle.getParcelable("animation_start_point");
        }
        this.a = point;
        this.g = !z;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.ch;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.f.e(this.e);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.f(false);
        egjVar.e(this);
        egjVar.A(egf.a());
        if (!this.g) {
            egjVar.x(new biln(this));
        }
        this.c.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("olc", this.e.a());
        bundle.putString("locality", this.e.b());
        bundle.putParcelable("animation_start_point", this.a);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.e(null);
        super.u();
    }
}
