package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgyv  reason: default package */
/* loaded from: classes3.dex */
public class bgyv implements bgyo {
    final /* synthetic */ bgyw a;
    private final int b;
    private final boolean c;
    private final cjtd d;

    public bgyv(bgyw bgywVar, int i, boolean z) {
        this.a = bgywVar;
        this.b = i;
        this.c = z;
        cjta b = cjtd.b();
        b.d = dtxv.bm;
        b.i(i);
        this.d = b.a();
    }

    @Override // defpackage.bgyo
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bgyo
    public String b() {
        return this.a.e.get(this.b);
    }

    @Override // defpackage.bgyo
    public Boolean c() {
        return Boolean.valueOf(this.a.b != null);
    }

    @Override // defpackage.bgyo
    public Boolean d() {
        return Boolean.valueOf(this.b == this.a.a);
    }

    @Override // defpackage.bgyo
    public Boolean e() {
        Integer num = this.a.b;
        boolean z = false;
        if (num != null && this.b == num.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgyo
    public Boolean f() {
        int i;
        bgyw bgywVar = this.a;
        Integer num = bgywVar.b;
        boolean z = false;
        if (num != null && (i = this.b) > bgywVar.a && i < num.intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgyo
    public String h() {
        Integer num;
        String b = b();
        int i = this.b;
        bgyw bgywVar = this.a;
        if (i != bgywVar.a || (num = bgywVar.b) == null || i != num.intValue()) {
            int i2 = this.b;
            bgyw bgywVar2 = this.a;
            if (i2 == bgywVar2.a) {
                return bgywVar2.d.getString(R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_START_MONTH, new Object[]{b});
            }
            Integer num2 = bgywVar2.b;
            return (num2 == null || i2 != num2.intValue()) ? b : this.a.d.getString(R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_END_MONTH, new Object[]{b});
        }
        String string = this.a.d.getString(R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_START_MONTH, new Object[]{b});
        String string2 = this.a.d.getString(R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_END_MONTH, new Object[]{b});
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(". ");
        sb.append(string2);
        return sb.toString();
    }

    @Override // defpackage.bgyo
    public cjtd i() {
        return this.d;
    }

    @Override // defpackage.bgyo
    public cqkl g() {
        int i;
        bgyw bgywVar = this.a;
        if (bgywVar.b != null || (i = this.b) < bgywVar.a) {
            bgywVar.a = this.b;
            bgywVar.b = null;
        } else {
            bgywVar.b = Integer.valueOf(i);
        }
        View o = cqkx.o(this);
        if (o != null) {
            bgyw bgywVar2 = this.a;
            bgywVar2.c.f(o, bgywVar2.n());
        }
        cqkx.p(this.a);
        return cqkl.a;
    }
}
