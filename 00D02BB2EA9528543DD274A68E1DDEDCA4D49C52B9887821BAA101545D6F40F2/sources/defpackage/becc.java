package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.webkit.URLUtil;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: becc  reason: default package */
/* loaded from: classes3.dex */
public class becc implements bdzx {
    private final cjqy a;
    private final Activity b;
    private final aesb c;
    private final dxio<afha> d;
    @dzsi
    private bwrs<ilo> e;
    @dzsi
    private cjtd f;

    public becc(Activity activity, cjqy cjqyVar, aesb aesbVar, dxio<afha> dxioVar) {
        this.b = activity;
        this.a = cjqyVar;
        this.c = aesbVar;
        this.d = dxioVar;
    }

    @Override // defpackage.bdzx
    public Boolean a() {
        ilo iloVar = (ilo) bwrs.b(this.e);
        boolean z = false;
        if (iloVar != null && iloVar.bN()) {
            iloVar.cp();
            if (!dbsj.d(iloVar.B)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdzx
    public CharSequence b() {
        ilo iloVar = (ilo) bwrs.b(this.e);
        if (!a().booleanValue() || iloVar == null) {
            return "";
        }
        iloVar.cp();
        String e = dbsj.e(iloVar.B);
        String string = this.b.getString(R.string.SAVED_FROM, new Object[]{e});
        if (!c().booleanValue()) {
            return string;
        }
        int color = this.b.getResources().getColor(R.color.mod_daynight_blue500);
        int indexOf = string.indexOf(e);
        int length = e.length();
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(color), indexOf, length + indexOf, 0);
        return spannableString;
    }

    @Override // defpackage.bdzx
    public Boolean c() {
        ilo iloVar = (ilo) bwrs.b(this.e);
        boolean z = false;
        if (a().booleanValue() && iloVar != null && !dbsj.d(iloVar.co())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdzx
    public cqkl d() {
        ilo iloVar = (ilo) bwrs.b(this.e);
        if (iloVar == null) {
            return cqkl.a;
        }
        this.a.i(cjtd.a(dtxy.my));
        this.c.D(iloVar, 8, dtxy.my);
        String co = iloVar.co();
        if (!dbsj.d(co) && URLUtil.isValidUrl(co) && (URLUtil.isHttpUrl(co) || URLUtil.isHttpsUrl(co))) {
            this.d.a().k(this.b, co, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdzx
    @dzsi
    public cjtd e() {
        return this.f;
    }

    public void f(bwrs<ilo> bwrsVar) {
        this.e = bwrsVar;
        this.f = cjtd.a(dtxy.my);
    }
}
