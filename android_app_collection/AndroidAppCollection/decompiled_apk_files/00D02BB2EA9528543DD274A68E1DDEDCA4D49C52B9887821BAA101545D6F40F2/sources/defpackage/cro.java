package defpackage;

import android.app.AlertDialog;
import android.text.Html;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cro  reason: default package */
/* loaded from: classes5.dex */
public class cro implements cto {
    private final CharSequence a;
    private final CharSequence b;
    private final bxmh c;
    private final ges d;
    private final begg e;
    private final cjqy f;
    private final gga g;

    public cro(ges gesVar, CharSequence charSequence, CharSequence charSequence2, bxmh bxmhVar, cjqy cjqyVar, begg beggVar) {
        this.d = gesVar;
        gga ggaVar = gesVar.aE;
        dbsk.s(ggaVar);
        this.g = ggaVar;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bxmhVar;
        this.e = beggVar;
        this.f = cjqyVar;
    }

    @Override // defpackage.cto
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.cto
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.cto
    public Boolean c() {
        CharSequence charSequence = this.b;
        boolean z = false;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cto
    public cqkl d() {
        crn crnVar = new crn(this.c, this.g, this.e, this.f);
        AlertDialog.Builder title = new AlertDialog.Builder(this.d.J()).setTitle(R.string.AAP_CONFIRM_PLACE);
        dwjj dwjjVar = this.c.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        title.setMessage(Html.fromHtml(this.d.Rn().getString(R.string.AAP_SUGGEST_ACCEPT_SUGGESTION, dxbpVar.c, dxbpVar.d))).setPositiveButton(R.string.YES_BUTTON, crnVar).setNegativeButton(R.string.NO_BUTTON, crnVar).show();
        return cqkl.a;
    }
}
