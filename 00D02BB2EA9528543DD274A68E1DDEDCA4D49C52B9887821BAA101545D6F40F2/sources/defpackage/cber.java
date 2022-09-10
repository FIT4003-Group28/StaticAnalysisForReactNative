package defpackage;

import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cber  reason: default package */
/* loaded from: classes4.dex */
public class cber implements cbrq {
    private final gga a;
    private final ges b;
    private final dxio<bdhl> c;
    private final CharSequence d;
    @dzsi
    private ilo e;
    private boolean f;

    public cber(ges gesVar, @dzsi dive diveVar, gga ggaVar, dxio<bdhl> dxioVar) {
        this.b = gesVar;
        this.a = ggaVar;
        this.c = dxioVar;
        this.f = false;
        if (diveVar != null) {
            Iterator<dwfl> it = diveVar.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ((it.next().a & ImageMetadata.LENS_APERTURE) == 0) {
                        this.f = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.d = ggaVar.getString(R.string.UGC_EVENTS_CHOOSE_PHOTO_FOR_VENUE_PROMO_TITLE);
    }

    @Override // defpackage.cbrq
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.cbrq
    public CharSequence b() {
        ilo iloVar = this.e;
        return iloVar != null ? this.a.getString(R.string.UGC_EVENTS_CHOOSE_PHOTO_FOR_VENUE_PROMO_SUBTITLE, new Object[]{iloVar.n()}) : "";
    }

    @Override // defpackage.cbrq
    public jic c() {
        ckql ckqlVar = new ckql();
        ckqlVar.e = true;
        ilo iloVar = this.e;
        return new jic((iloVar == null || iloVar.bF().a.isEmpty()) ? "" : iloVar.bF().a.get(0).h, ckqc.FULLY_QUALIFIED, null, 0, null, ckqlVar);
    }

    @Override // defpackage.cbrq
    public cqkl d() {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return cqkl.a;
        }
        ges gesVar = this.b;
        bdhe k = bdhg.k();
        k.c(iloVar.ai().o());
        k.g(this.a.getString(R.string.UGC_EVENTS_ADD_PHOTOS));
        k.f(iloVar.n());
        bdhb bdhbVar = (bdhb) k;
        bdhbVar.d = 4;
        bdhbVar.c = this.a.getString(R.string.SUGGEST_PHOTO_FROM_A_PLACE, new Object[]{iloVar.n()});
        this.c.a().e(gesVar, k.a());
        return cqkl.a;
    }

    public void e(ilo iloVar) {
        this.e = iloVar;
    }

    @Override // defpackage.cbrq
    public String f() {
        ilo iloVar = this.e;
        return (iloVar == null || iloVar.aG() <= 5) ? "" : this.a.getString(R.string.UGC_EVENTS_CHOOSE_PHOTO_FOR_VENUE_PROMO_PHOTOS_COUNT, new Object[]{String.valueOf(this.e.aG() - 1)});
    }

    @Override // defpackage.cbrq
    public Boolean g() {
        ilo iloVar = this.e;
        boolean z = false;
        if (iloVar != null && iloVar.aG() > 5 && this.e.bF().a.size() > 0 && !this.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
