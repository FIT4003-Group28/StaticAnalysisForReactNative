package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: addy  reason: default package */
/* loaded from: classes.dex */
final class addy implements yiw {
    final /* synthetic */ adea a;

    public addy(adea adeaVar) {
        this.a = adeaVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        adit aditVar = (adit) obj;
        int d = zhn.d(this.a.a, R.attr.ytErrorBackground);
        this.a.f.j(d);
        this.a.f.D(ColorStateList.valueOf(d));
        this.a.f.q(-1);
        this.a.f.o(2131232473);
        adea adeaVar = this.a;
        adeaVar.f.s(zhn.f(adeaVar.a, R.attr.ytTextPrimary));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        adit aditVar = (adit) obj;
        this.a.f.q(-1);
        this.a.f.o(2131232127);
        adea adeaVar = this.a;
        adeaVar.f.s(zhn.f(adeaVar.a, R.attr.ytCallToAction));
        this.a.i.getBackground().setColorFilter(zhn.d(this.a.a, R.attr.ytCallToAction), PorterDuff.Mode.MULTIPLY);
        adea adeaVar2 = this.a;
        adeaVar2.i.setTextColor(zhn.d(adeaVar2.a, R.attr.ytTextPrimaryInverse));
        this.a.i.setEnabled(true);
        this.a.i.setTag(((adif) obj2).h().c);
    }
}
