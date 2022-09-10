package defpackage;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ndz  reason: default package */
/* loaded from: classes7.dex */
public final class ndz implements ndv {
    @dzsi
    private final akqi a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final dspd f;
    private final ndx g;
    private final ndy h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    @dzsi
    private final String m;
    private final boolean n;
    private final bxmg o;
    private final View.OnFocusChangeListener p = new ndw();

    public ndz(@dzsi akqi akqiVar, String str, String str2, String str3, String str4, dspd dspdVar, ndx ndxVar, ndy ndyVar, int i, boolean z, boolean z2, boolean z3, String str5, boolean z4, bxmg bxmgVar) {
        this.a = akqiVar;
        dbsk.s(str);
        this.b = str;
        this.c = str2;
        dbsk.s(str3);
        this.d = str3;
        dbsk.s(str4);
        this.e = str4;
        dbsk.s(dspdVar);
        this.f = dspdVar;
        dbsk.s(ndxVar);
        this.g = ndxVar;
        dbsk.s(ndyVar);
        this.h = ndyVar;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str5;
        this.n = z4;
        this.o = bxmgVar;
    }

    private static CharSequence k(String str, String str2) {
        int indexOf;
        if (!str2.isEmpty() && (indexOf = str.toLowerCase(Locale.getDefault()).indexOf(str2.toLowerCase(Locale.getDefault()))) != -1) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StyleSpan(1), indexOf, str2.length() + indexOf, 0);
            return spannableString;
        }
        return str;
    }

    @Override // defpackage.ndv
    public CharSequence a() {
        return k(this.b, this.d);
    }

    @Override // defpackage.ndv
    public CharSequence b() {
        return dbsj.d(this.c) ? "" : k(this.c, this.d);
    }

    @Override // defpackage.ndv
    public Boolean c() {
        boolean z = false;
        if (!this.j && this.f.u()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ndv
    public Boolean d() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.ndv
    public Boolean e() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.ndv
    public cjtd f() {
        cjta b = cjtd.b();
        b.g(this.m);
        b.d = c().booleanValue() ? dtxm.bq : dtxm.bm;
        b.i(this.i);
        return b.a();
    }

    @Override // defpackage.ndv
    public cjtd g() {
        cjta b = cjtd.b();
        b.g(this.m);
        b.d = dtxm.bl;
        return b.a();
    }

    @Override // defpackage.ndv
    public cqkl h() {
        ldm ldmVar;
        ndx ndxVar = this.g;
        String str = this.e;
        if (this.f.u()) {
            ldmVar = null;
        } else {
            amvg P = amvh.P();
            P.c = this.a;
            P.k = false;
            P.b = this.e;
            P.c(this.f);
            ldmVar = new ldm(P.a(), this.e, this.b, this.c);
        }
        ndxVar.a(str, ldmVar, this.n, this.o);
        return cqkl.a;
    }

    @Override // defpackage.ndv
    public cqkl i() {
        View l;
        ndy ndyVar = this.h;
        CharSequence a = a();
        kqz kqzVar = (kqz) ndyVar;
        if (kqzVar.a.q != null) {
            String charSequence = a.toString();
            dbsk.s(charSequence);
            kqzVar.a.q.k(charSequence);
            EditText l2 = kqzVar.a.l();
            l2.setText(charSequence);
            l2.setSelection(charSequence.length());
            krc krcVar = kqzVar.a;
            if (krc.q(krcVar.o)) {
                if (krcVar.b.h()) {
                    View c = krcVar.l.c();
                    int i = krq.a;
                    l = (ViewGroup) c.findViewById(R.id.edittext_card_view_id);
                } else {
                    l = krcVar.l();
                }
            } else {
                l = krcVar.l();
            }
            nol.b(l);
            kqzVar.a.h.a(l2);
        }
        return cqkl.a;
    }

    @Override // defpackage.ndv
    public View.OnFocusChangeListener j() {
        return this.p;
    }
}
