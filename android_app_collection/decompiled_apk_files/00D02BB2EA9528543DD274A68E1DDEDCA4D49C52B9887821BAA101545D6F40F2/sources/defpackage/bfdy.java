package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: bfdy  reason: default package */
/* loaded from: classes3.dex */
public class bfdy implements bfdx {
    private final Activity a;
    private final cqat b;
    private final String c;
    private boolean e;
    private boolean f;
    private cjtd g = cjtd.b;
    private final EnumMap<dgbf, String> d = new EnumMap<>(dgbf.class);

    public bfdy(Activity activity, cqat cqatVar) {
        this.a = activity;
        this.b = cqatVar;
        this.c = activity.getString(R.string.SEARCH_LIST_GAS_PRICE_ASTERISK);
    }

    @Override // defpackage.bfdx
    public String a(dgbf dgbfVar) {
        if (this.d.containsKey(dgbfVar)) {
            return this.d.get(dgbfVar);
        }
        return this.a.getString(R.string.PLACE_GAS_PRICE_NO_DATA);
    }

    @Override // defpackage.bfdx
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bfdx
    public String c() {
        return this.a.getString(R.string.PLACE_GAS_PRICE_STALENESS_WARNING_ASTERISK, new Object[]{this.c});
    }

    @Override // defpackage.bfdx
    public cjtd d() {
        return this.g;
    }

    @Override // defpackage.bfdx
    public String e(dgbf dgbfVar) {
        if (this.d.containsKey(dgbfVar)) {
            return this.d.get(dgbfVar);
        }
        return this.a.getString(R.string.PLACE_GAS_PRICE_NO_DATA_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        dgbi dgbiVar = iloVar.h().al;
        if (dgbiVar == null) {
            dgbiVar = dgbi.b;
        }
        for (dgbg dgbgVar : dgbiVar.a) {
            dgbf b = dgbf.b(dgbgVar.c);
            if (b == null) {
                b = dgbf.UNKNOWN_TYPE;
            }
            if (b != dgbf.UNKNOWN_TYPE && (dgbgVar.a & 1) != 0) {
                String str = dgbgVar.b;
                if (bfdq.a(dgbgVar, this.b)) {
                    this.e = true;
                    str = this.a.getString(R.string.PLACE_GAS_PRICE, new Object[]{str, this.c});
                }
                EnumMap<dgbf, String> enumMap = this.d;
                dgbf b2 = dgbf.b(dgbgVar.c);
                if (b2 == null) {
                    b2 = dgbf.UNKNOWN_TYPE;
                }
                enumMap.put((EnumMap<dgbf, String>) b2, (dgbf) str);
                this.f = true;
            }
        }
        cjta c = cjtd.c(iloVar.a());
        c.d = dtxy.iI;
        this.g = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.f = false;
        this.e = false;
        this.g = cjtd.b;
        this.d.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.f);
    }
}
