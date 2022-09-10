package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byoq  reason: default package */
/* loaded from: classes4.dex */
public final class byoq extends gen {
    public cqkj a;
    @dzsi
    private int ad;
    public dxio<cjqy> b;
    public bysl c;
    public bypx d;
    private cqkf<bysf> e;
    private bysf g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bysf> e = this.a.e(new byrd(new byqn()));
        this.e = e;
        e.e(this.g);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.ad != 0) {
            this.b.a().i(cjtd.a(dtyc.bB));
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
        String string = this.o.getString("notification_type");
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
        super.l(bundle);
        byop byopVar = new byop(this);
        int i2 = this.ad;
        if (i2 == 1) {
            this.g = bysk.l(this.c, byopVar);
        } else if (i2 != 2) {
        } else {
            this.g = bysk.m(this.c, byopVar);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.bQ;
    }
}
