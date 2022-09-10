package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bibw  reason: default package */
/* loaded from: classes3.dex */
public class bibw implements bibq {
    private final gga a;
    private final dxio<axwo> b;
    private final dxio<axwy> c;
    @dzsi
    private final azwu d;
    private final boolean e;
    private final alp f;

    public bibw(gga ggaVar, dxio<axwo> dxioVar, dxio<axwy> dxioVar2, @dzsi azwu azwuVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = azwuVar;
        this.e = azwuVar == null;
        this.f = alp.a();
    }

    private final baab d() {
        azwu azwuVar = this.d;
        dbsk.s(azwuVar);
        return azwuVar.b();
    }

    private final boolean g() {
        return !this.e && h();
    }

    private final boolean h() {
        if (!this.e) {
            azwu azwuVar = this.d;
            dbsk.s(azwuVar);
            return azwuVar.f();
        }
        return false;
    }

    @Override // defpackage.bibq
    public cqss a() {
        if (g()) {
            return irg.e();
        }
        if (this.e) {
            return cqrt.c(R.color.place_list_starred);
        }
        baab baabVar = baab.FAVORITES;
        int ordinal = d().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 5) {
            return baam.c(d());
        }
        return ibm.a();
    }

    @Override // defpackage.bibq
    public jic b() {
        int i;
        if (g()) {
            azwu azwuVar = this.d;
            dbsk.s(azwuVar);
            return new jic(dbsj.e(azwuVar.i()), ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0);
        }
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        if (this.e) {
            i = 2131231731;
        } else {
            baab baabVar = baab.FAVORITES;
            int ordinal = d().ordinal();
            if (ordinal == 0) {
                i = 2131231631;
            } else if (ordinal == 1) {
                i = 2131231624;
            } else if (ordinal != 5) {
                throw new IllegalStateException("Invalid list type");
            } else {
                i = 2131231641;
            }
        }
        return new jic((String) null, ckqcVar, cqrt.g(i, irg.a()), 0);
    }

    @Override // defpackage.bibq
    public cjtd c() {
        return cjtd.a(h() ? dtxy.md : dtxy.me);
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.e) {
            this.c.a().G();
        } else {
            azwu azwuVar = this.d;
            dbsk.s(azwuVar);
            this.b.a().f(azwuVar.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        String string;
        if (this.e) {
            return this.a.getString(R.string.DEFAULT_LIST_STARRED_PLACES);
        }
        alp alpVar = this.f;
        azwu azwuVar = this.d;
        dbsk.s(azwuVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(alpVar.b(azwuVar.c()));
        if (h()) {
            azwu azwuVar2 = this.d;
            dbsk.s(azwuVar2);
            if (azwuVar2.h() != null) {
                azwu azwuVar3 = this.d;
                dbsk.s(azwuVar3);
                string = dbsj.e(azwuVar3.h());
            } else {
                string = this.a.getString(R.string.LIST_DEFAULT_AUTHOR_NAME);
            }
            SpannableString spannableString = new SpannableString(this.f.b(string));
            spannableString.setSpan(new ForegroundColorSpan(irg.H().b(this.a)), 0, spannableString.length(), 33);
            SpannableString spannableString2 = new SpannableString(" · ");
            spannableString2.setSpan(new ForegroundColorSpan(irg.H().b(this.a)), 0, 3, 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return spannableStringBuilder;
    }
}
