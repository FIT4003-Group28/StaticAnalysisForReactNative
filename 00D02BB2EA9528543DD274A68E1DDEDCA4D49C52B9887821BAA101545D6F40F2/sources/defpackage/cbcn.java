package defpackage;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbcn  reason: default package */
/* loaded from: classes4.dex */
public class cbcn implements cbrd {
    @dzsi
    public ilo a;
    public final dxio<cqhn> b;
    @dzsi
    public String c;
    public Boolean d = true;
    private final ges e;
    private final bwqv f;
    @dzsi
    private final ilo g;
    private final dxio<hwd> h;

    public cbcn(@dzsi ilo iloVar, ges gesVar, bwqv bwqvVar, dxio<cqhn> dxioVar, dxio<hwd> dxioVar2) {
        this.g = iloVar;
        this.e = gesVar;
        this.f = bwqvVar;
        this.b = dxioVar;
        this.h = dxioVar2;
    }

    @dzsi
    private final String l() {
        if (this.a == null) {
            return this.e.J().getString(R.string.UGC_EVENTS_MISSING_LOCATION);
        }
        return null;
    }

    @Override // defpackage.cbrd
    public CharSequence a() {
        return this.e.aE.getString(R.string.EVENT_CREATION_LOCATION_HINT);
    }

    @Override // defpackage.cbrd
    @dzsi
    public akqq b() {
        ilo iloVar = this.a;
        if (iloVar != null) {
            return iloVar.aj();
        }
        return null;
    }

    @Override // defpackage.cbrd
    public akqi c() {
        ilo iloVar = this.a;
        return iloVar != null ? iloVar.ai() : akqi.a;
    }

    @Override // defpackage.cbrd
    public CharSequence d() {
        ilo iloVar = this.a;
        if (iloVar == null) {
            return "";
        }
        if (iloVar.ai().equals(akqi.a)) {
            return this.e.J().getString(R.string.UGC_EVENTS_LATLNG_DROPPED_PIN_TEXT);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.n());
        sb.append("\n");
        sb.append(this.a.B());
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), this.a.n().length(), spannableString.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(ibm.p().b(this.e.J())), this.a.n().length(), spannableString.length(), 0);
        return spannableString;
    }

    @Override // defpackage.cbrd
    public cqkl e() {
        ges gesVar = this.e;
        if (!gesVar.aD) {
            return cqkl.a;
        }
        this.e.aZ(cbdc.i(this.f, gesVar.aE, this.a));
        return cqkl.a;
    }

    @Override // defpackage.cbrd
    @dzsi
    public String f() {
        return this.c;
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        String l = l();
        if (l != null) {
            this.c = l;
            cqkx.p(this);
            return false;
        }
        return true;
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        return Boolean.valueOf(l() == null);
    }

    @Override // defpackage.cbrd
    public Boolean i() {
        return this.d;
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        ilo iloVar = this.g;
        boolean z = true;
        if (iloVar == null) {
            if (this.a == null) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(!iloVar.equals(this.a));
    }

    public void k() {
        this.d = true;
        this.b.a();
        cqkx.p(this);
        MapViewContainer mapViewContainer = (MapViewContainer) cqhu.a(this.e.P, cbkz.a);
        if (mapViewContainer == null || this.h.a() == null) {
            return;
        }
        mapViewContainer.h(this.h.a());
    }
}
