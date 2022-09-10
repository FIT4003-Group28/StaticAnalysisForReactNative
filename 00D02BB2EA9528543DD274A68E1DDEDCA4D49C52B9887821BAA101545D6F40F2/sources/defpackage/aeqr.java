package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeqr  reason: default package */
/* loaded from: classes2.dex */
public class aeqr implements bsgz {
    private final Resources a;
    private final dcdc<Integer> b;
    private int c;

    public aeqr(Resources resources, cqhn cqhnVar, dcdc<Integer> dcdcVar, Integer num) {
        this.a = resources;
        dbsk.a(dcdcVar.contains(num));
        this.b = dcdcVar;
        this.c = dcdcVar.indexOf(num);
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < this.b.size());
    }

    public Integer a() {
        dbsk.z(this.c, this.b.size());
        return this.b.get(this.c);
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(this.b.size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(i == this.c);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return (i < 0 || i >= this.b.size()) ? "" : this.b.get(i).toString();
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        this.c = i;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        return cjtd.a(dtxp.u);
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.a.getText(R.string.RESTRICTION_HOTEL_OCCUPANCY);
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public CharSequence j(int i) {
        String string;
        CharSequence e = e(i);
        if (e.toString().isEmpty()) {
            return "";
        }
        if (i == this.c) {
            string = this.a.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.a.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.a.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, e, string);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }
}
