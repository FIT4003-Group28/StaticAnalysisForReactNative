package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.maps.R;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmlb  reason: default package */
/* loaded from: classes3.dex */
public class bmlb implements bmkz {
    private final gga a;
    private final btvo c;
    private final boxa d;
    private final begg e;
    private final dxio<afha> f;
    private final bljq g;
    private cjtd j;
    private bwrs<ilo> l;
    private bmbf m;
    private boolean n;
    private boolean o;
    private boolean p;
    private dnpq q;
    private CharSequence r;
    private boolean s;
    private final List<CharSequence> b = dchl.a();
    private CharSequence h = "";
    private CharSequence i = "";
    private CharSequence k = "";

    public bmlb(gga ggaVar, btvo btvoVar, boxa boxaVar, ckcw ckcwVar, cqhn cqhnVar, begg beggVar, dxio<afha> dxioVar, bljr bljrVar, blkj blkjVar) {
        this.a = ggaVar;
        this.c = btvoVar;
        this.d = boxaVar;
        this.e = beggVar;
        this.f = dxioVar;
        this.g = bljrVar.a(2);
    }

    private final void A(CharSequence charSequence) {
        this.i = charSequence;
        if (charSequence.length() > 0) {
            charSequence = this.a.getResources().getString(R.string.ACCESSIBILITY_PLACE_DESCRIPTION, charSequence);
        }
        this.k = charSequence;
    }

    private final boolean B() {
        return C() || k().booleanValue() || n().booleanValue() || (i().booleanValue() && !this.o);
    }

    private final boolean C() {
        return this.e.i(bege.ABOUT);
    }

    private static cjtd z(ilo iloVar, ddho ddhoVar) {
        cjta c = cjtd.c(iloVar.bZ());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bmkz
    public Boolean a(int i) {
        return Boolean.valueOf(i < this.b.size());
    }

    @Override // defpackage.bmkz
    public CharSequence b(int i) {
        return (!a(i).booleanValue() || i >= this.b.size()) ? "" : this.b.get(i);
    }

    @Override // defpackage.bmkz
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.bmkz
    public cjtd d() {
        return this.j;
    }

    @Override // defpackage.bmkz
    public CharSequence e() {
        String string;
        if (s().booleanValue()) {
            return null;
        }
        CharSequence charSequence = this.k;
        if (!B()) {
            return charSequence;
        }
        String str = " ";
        if (n().booleanValue()) {
            if (this.i.length() == 0) {
                String valueOf = String.valueOf(o());
                String valueOf2 = String.valueOf(p());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
                sb.append(valueOf);
                sb.append(str);
                sb.append(valueOf2);
                string = sb.toString();
            } else {
                string = "";
            }
        } else if (k().booleanValue()) {
            string = this.a.getString(R.string.ACCESSIBILITY_READ_MORE);
        } else {
            string = this.a.getString(R.string.ACCESSIBILITY_INSTRUCTION_EXPAND);
        }
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = charSequence;
        if (charSequence.length() <= 0) {
            str = "";
        }
        charSequenceArr[1] = str;
        charSequenceArr[2] = string;
        return TextUtils.concat(charSequenceArr);
    }

    @Override // defpackage.bmkz
    public CharSequence f() {
        return this.h;
    }

    @Override // defpackage.bmkz
    public Boolean g() {
        return Boolean.valueOf(this.h.length() > 0);
    }

    @Override // defpackage.bmkz
    public cqkl h() {
        if (C()) {
            this.e.k(bege.ABOUT);
            return cqkl.a;
        }
        if (n().booleanValue()) {
            dnps bZ = dnqe.i.bZ();
            dnqb dnqbVar = dnqb.PLACE_CARD;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar = (dnqe) bZ.b;
            dnqeVar.b = dnqbVar.ah;
            dnqeVar.a = 1 | dnqeVar.a;
            this.d.s(this.l, bZ.bK());
        } else if (i().booleanValue() && !this.o) {
            this.o = true;
            cqkx.p(this);
        } else if (this.q != null) {
            this.f.a().k(this.a, this.q.c, 1);
        } else if (!this.o) {
            this.o = true;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmkz
    public Boolean i() {
        boolean z = false;
        if (y().booleanValue() && this.s) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmkz
    public Boolean j() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.bmkz
    public Boolean k() {
        if (!this.s || !y().booleanValue()) {
            return Boolean.valueOf(this.p);
        }
        return false;
    }

    @Override // defpackage.bmkz
    public CharSequence l() {
        CharSequence charSequence = this.r;
        return charSequence == null ? "" : charSequence;
    }

    @Override // defpackage.bmkz
    public cjtd m() {
        if (!B() || !s().booleanValue()) {
            if (!B()) {
                return null;
            }
            return cjtd.a(dtxy.nl);
        }
        return cjtd.a(dtxy.ho);
    }

    @Override // defpackage.bmkz
    public Boolean n() {
        boolean z = false;
        if (this.c.getUgcParameters().q() && !this.s && !y().booleanValue() && !this.p) {
            dobr dobrVar = this.l.c().h().aF;
            if (dobrVar == null) {
                dobrVar = dobr.g;
            }
            if (dobrVar.d) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmkz
    public CharSequence o() {
        return this.a.getString(R.string.SCALABLE_ATTRIBUTE_EDITING_PLACESHEET_ENTRYPOINT_HEADER);
    }

    @Override // defpackage.bmkz
    public CharSequence p() {
        return this.a.getString(R.string.SCALABLE_ATTRIBUTE_EDITING_PLACESHEET_ENTRYPOINT_SUB_HEADING);
    }

    @Override // defpackage.bmkz
    @dzsi
    public bmbf q() {
        if (!this.c.getPlaceSheetParameters().M() || this.l.c() == null || this.l.c().cA().a.size() <= 0) {
            return null;
        }
        return this.m;
    }

    @Override // defpackage.bmkz
    public cjtd r() {
        if (q() != null) {
            cjta c = cjtd.c(this.l.c().bZ());
            c.d = dtxy.ho;
            return c.a();
        }
        return cjtd.b;
    }

    @Override // defpackage.bmkz
    public Boolean s() {
        boolean z = false;
        if (this.c.getPlaceSheetParameters().M() && this.n) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        this.l = bwrsVar;
        doal doalVar = iloVar.h().ae;
        if (doalVar == null) {
            doalVar = doal.c;
        }
        gga ggaVar = this.a;
        this.b.clear();
        for (doai doaiVar : doalVar.b) {
            List<CharSequence> list = this.b;
            SpannableString spannableString = new SpannableString(doaiVar.a);
            spannableString.setSpan(new TextAppearanceSpan(ggaVar, R.style.QuBody2), 0, spannableString.length(), 0);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
            SpannableString spannableString2 = new SpannableString(ggaVar.getString(R.string.QUICK_FACTS_ATTRIBUTE_VALUE_SEPARATOR));
            spannableString2.setSpan(new TextAppearanceSpan(ggaVar, R.style.QuBody2), 0, spannableString2.length(), 0);
            SpannableString spannableString3 = new SpannableString(dbrz.e(ggaVar.getString(R.string.QUICK_FACTS_VALUE_SEPARATOR)).j().g(doaiVar.b));
            spannableString3.setSpan(new TextAppearanceSpan(ggaVar, R.style.QuBody1), 0, spannableString3.length(), 0);
            list.add(TextUtils.concat(spannableString, spannableString2, spannableString3));
        }
        gga ggaVar2 = this.a;
        LinkedList h = dchl.h();
        for (doai doaiVar2 : doalVar.b) {
            for (dnpq dnpqVar : doaiVar2.c) {
                SpannableString spannableString4 = new SpannableString(dnpqVar.d);
                spannableString4.setSpan(new bmla(this.f.a(), ggaVar2, dnpqVar), 0, spannableString4.length(), 0);
                h.add(spannableString4);
            }
        }
        String str = "";
        if (h.isEmpty()) {
            this.h = str;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ggaVar2.getString(R.string.QUICK_FACTS_SOURCES_INCLUDE));
            spannableStringBuilder.append((CharSequence) h.removeFirst());
            while (!h.isEmpty()) {
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) h.removeFirst());
            }
            this.h = spannableStringBuilder;
        }
        this.p = bmbd.a(iloVar.cA()).c.size() > 0;
        this.n = false;
        this.i = str;
        this.k = str;
        this.j = null;
        String bD = iloVar.bD();
        if (dbsj.d(bD)) {
            if (doalVar.a.size() > 0) {
                String str2 = doalVar.a.get(0).a;
                if (doalVar.a.size() > 1) {
                    doak doakVar = doalVar.a.get(1);
                    dnpq dnpqVar2 = doakVar.b;
                    if (dnpqVar2 == null) {
                        dnpqVar2 = dnpq.g;
                    }
                    this.q = dnpqVar2;
                    dnpq dnpqVar3 = doakVar.b;
                    if (dnpqVar3 == null) {
                        dnpqVar3 = dnpq.g;
                    }
                    String str3 = str;
                    if (!dnpqVar3.d.isEmpty()) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dnpqVar3.d);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(ibm.x().b(this.a)), 0, spannableStringBuilder2.length(), 0);
                        str3 = spannableStringBuilder2;
                    }
                    this.r = str3;
                }
                if (str2.length() > 0) {
                    A(str2);
                    this.j = z(iloVar, dtxz.J);
                }
            } else if (iloVar.cA().a.size() > 0) {
                this.n = true;
            }
        } else {
            A(alp.a().b(bD));
            this.j = z(iloVar, dtxz.K);
        }
        if ((!y().booleanValue() || !this.s) && n().booleanValue()) {
            this.j = z(iloVar, dtxo.ab);
        }
        this.o = false;
        bmbm bmbmVar = new bmbm(false, iloVar);
        this.m = bmbmVar;
        bmbmVar.c(iloVar.cA().a);
    }

    @Override // defpackage.bega
    public void u() {
        this.l = null;
        this.b.clear();
        this.h = "";
        this.p = false;
        this.i = "";
        this.k = "";
        this.j = null;
        this.q = null;
        this.r = "";
        this.n = false;
        this.o = false;
        this.m = null;
        this.g.c();
    }

    @Override // defpackage.bmkz
    public blja v() {
        return this.g;
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = true;
        if (this.i.length() <= 0 && !s().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void x(boolean z) {
        this.s = true;
    }

    public Boolean y() {
        return Boolean.valueOf(!this.b.isEmpty());
    }
}
