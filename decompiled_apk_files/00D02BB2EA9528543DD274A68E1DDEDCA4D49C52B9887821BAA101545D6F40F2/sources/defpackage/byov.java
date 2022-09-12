package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byov  reason: default package */
/* loaded from: classes4.dex */
public final class byov extends gen {
    public cqkj a;
    @dzsi
    private int ad;
    public dxio<cjqy> b;
    public bysp c;
    public bypy d;
    private cqkf<bysf> e;
    private bysf g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bysf> e = this.a.e(new byrd(new byqo()));
        this.e = e;
        e.e(this.g);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        int i = this.ad;
        if (i != 0) {
            this.b.a().i(cjtd.a(i == 1 ? dtyc.bM : dtxs.S));
            return false;
        }
        return false;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gdf gdfVar = new gdf(J(), (byte[]) null);
        Window window = gdfVar.getWindow();
        window.setBackgroundDrawableResource(R.color.black_transparent);
        window.setLayout(-1, -1);
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        char c;
        int i;
        super.l(bundle);
        Bundle bundle2 = this.o;
        String string = bundle2.getString("notification_type");
        dbsk.s(string);
        int hashCode = string.hashCode();
        if (hashCode != -247000507) {
            if (hashCode == 38088495 && string.equals("TRANSIT_TO_PLACE")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (string.equals("TRAFFIC_TO_PLACE")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            i = 1;
        } else if (c != 1) {
            throw new IllegalArgumentException();
        } else {
            i = 2;
        }
        this.ad = i;
        String string2 = bundle2.getString("notification_session_id");
        String string3 = bundle2.getString("notification_ogi");
        byou byouVar = new byou(this);
        int i2 = this.ad;
        if (i2 == 1) {
            this.g = byso.l(this.c, string2, string3, byouVar);
        } else if (i2 != 2) {
        } else {
            this.g = byso.m(this.c, string2, string3, byouVar);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.bQ;
    }
}
