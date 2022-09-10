package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zhh  reason: default package */
/* loaded from: classes7.dex */
public class zhh implements zbo {
    public final gga a;
    public final vtn b;
    public final qbt c;
    public final afha d;
    public final dcdc<GmmNotice> e;
    @dzsi
    private final zbm f;
    private final boolean g;

    public zhh(gga ggaVar, btvo btvoVar, vtn vtnVar, qbt qbtVar, afha afhaVar, dcdc<GmmNotice> dcdcVar) {
        this.a = ggaVar;
        this.b = vtnVar;
        this.c = qbtVar;
        this.d = afhaVar;
        boolean z = btvoVar.getDirectionsPageParameters().J;
        zhg zhgVar = null;
        GmmNotice gmmNotice = (GmmNotice) dcft.r(dcdcVar, null);
        if (gmmNotice == null) {
            this.f = null;
            this.e = dcdc.e();
            this.g = false;
            return;
        }
        dozy b = dozy.b(gmmNotice.c().f);
        if (!(b == null ? dozy.UNKNOWN : b).equals(dozy.BUSYNESS) || !z) {
            this.g = false;
        } else {
            int size = dcdcVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    gmmNotice = null;
                    break;
                }
                GmmNotice gmmNotice2 = dcdcVar.get(i);
                dozy b2 = dozy.b(gmmNotice2.c().f);
                i++;
                if (!(b2 == null ? dozy.UNKNOWN : b2).equals(dozy.BUSYNESS)) {
                    gmmNotice = gmmNotice2;
                    break;
                }
            }
            this.g = true;
        }
        this.f = gmmNotice != null ? new zhg(this, gmmNotice) : zhgVar;
        if (z) {
            dccx dccxVar = new dccx();
            int size2 = dcdcVar.size();
            for (int i2 = 0; i2 < size2; i2++) {
                GmmNotice gmmNotice3 = dcdcVar.get(i2);
                dozy b3 = dozy.b(gmmNotice3.c().f);
                if (!(b3 == null ? dozy.UNKNOWN : b3).equals(dozy.BUSYNESS)) {
                    dccxVar.g(gmmNotice3);
                }
            }
            dcdcVar = dccxVar.f();
        }
        this.e = dcdcVar;
    }

    @Override // defpackage.zbo
    @dzsi
    public zbm a() {
        return this.f;
    }

    @Override // defpackage.zbo
    @dzsi
    public zbn b() {
        if (this.g) {
            return zhf.a;
        }
        return null;
    }

    public CharSequence c() {
        String string = this.e.size() > 1 ? this.a.getString(R.string.SEE_MORE_UPDATES, new Object[]{Integer.valueOf(this.e.size() - 1)}) : this.a.getString(R.string.LEARN_MORE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.y().b(this.a)), 0, string.length(), 33);
        return spannableStringBuilder;
    }

    @Override // defpackage.zbq
    public Boolean r() {
        return true;
    }

    @Override // defpackage.zbq
    @dzsi
    public cjtd s() {
        throw null;
    }
}
