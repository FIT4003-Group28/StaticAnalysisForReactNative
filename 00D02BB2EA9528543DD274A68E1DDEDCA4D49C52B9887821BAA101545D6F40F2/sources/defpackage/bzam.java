package defpackage;

import android.app.Service;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzam  reason: default package */
/* loaded from: classes4.dex */
public final class bzam extends byzq {
    private final vtn a;
    private final byzt e;

    public bzam(vyl vylVar, Service service, vtn vtnVar, btvo btvoVar, byzt byztVar) {
        super(vylVar, service, btvoVar);
        this.a = vtnVar;
        this.e = byztVar;
    }

    @Override // defpackage.byzz
    public final byzy a(bzdk bzdkVar, byzg byzgVar) {
        throw null;
    }

    public final vyk b(bzdk bzdkVar, bzdg bzdgVar) {
        int i;
        if (!this.d.getTransitTrackingParameters().p) {
            vyl vylVar = this.b;
            vyl vylVar2 = this.b;
            return vylVar.c(vylVar.a(f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_TAKE, new Object[0])), vylVar2.e(bzdgVar.z(), vyl.d(vylVar2.a), false));
        }
        dcdc<dpce> z = bzdgVar.z();
        String q = alcf.q(z);
        Iterable<dpce> o = alcf.o(z);
        if (q == null) {
            i = bzdkVar.p() ? R.dimen.transit_guidebook_line_max_width_no_gps : R.dimen.transit_guidebook_line_max_width;
        } else {
            i = bzdkVar.p() ? R.dimen.transit_line_max_width_no_gps : R.dimen.transit_line_max_width;
        }
        zua zuaVar = new zua(this.c, dcdc.q(o), l(R.dimen.notification_title_directions_icon_size), new Rect(l(R.dimen.notification_title_vehicle_line_padding), 0, l(R.dimen.notification_title_vehicle_line_padding), 0), l(i));
        vyl vylVar3 = this.b;
        vyk[] vykVarArr = new vyk[3];
        vykVarArr[0] = vylVar3.a(f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_TAKE, new Object[0]));
        vykVarArr[1] = this.b.b(zuaVar, zuaVar.c());
        vyl vylVar4 = this.b;
        if (q == null) {
            q = "";
        }
        vykVarArr[2] = vylVar4.a(q);
        return vylVar3.c(vykVarArr);
    }

    public final vyk m(bzdg bzdgVar) {
        vyk a = this.e.a(bzdgVar, true);
        return a == null ? this.b.a("") : a;
    }

    public final dbty<Drawable> n(bzdg bzdgVar) {
        return new bzap(0.0f, bzdgVar.m(), bzdgVar.A(), false, this.a, e());
    }
}
