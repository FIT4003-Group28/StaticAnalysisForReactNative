package defpackage;

import android.view.View;
import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: ngw  reason: default package */
/* loaded from: classes7.dex */
public class ngw implements ngh {
    @dzsi
    private final ddho a;
    private final dbty<Boolean> b;
    private final ngv c;
    private final CharSequence d;
    private final CharSequence e;
    private final CharSequence f;

    public ngw(dbty<Boolean> dbtyVar, ngv ngvVar, @dzsi ddho ddhoVar, CharSequence charSequence) {
        this(dbtyVar, ngvVar, ddhoVar, charSequence, "", "");
    }

    public ngw(dbty<Boolean> dbtyVar, ngv ngvVar, @dzsi ddho ddhoVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.b = dbtyVar;
        this.c = ngvVar;
        this.a = ddhoVar;
        this.d = charSequence;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.nfx
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.ngh
    public Boolean b() {
        return this.b.a();
    }

    @Override // defpackage.ngh
    public cqkl c(Boolean bool) {
        ngv ngvVar = this.c;
        boolean booleanValue = bool.booleanValue();
        neb nebVar = (neb) ngvVar;
        nee neeVar = nebVar.a;
        bxtx bxtxVar = nebVar.b;
        neeVar.a.S(bvjk.jG, booleanValue);
        if (!booleanValue) {
            bxtxVar.a();
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ngh
    public Boolean d() {
        return Boolean.valueOf(e().length() > 0);
    }

    @Override // defpackage.ngh
    public CharSequence e() {
        return b().booleanValue() ? this.e : this.f;
    }

    @Override // defpackage.ngh
    @dzsi
    public cjtd f() {
        cjta b = cjtd.b();
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = b().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.d = this.a;
        return b.a();
    }

    @Override // defpackage.ngh
    public View.OnClickListener g() {
        return nge.a(this);
    }

    @Override // defpackage.ngh
    public CompoundButton.OnCheckedChangeListener h() {
        return nge.b(this);
    }
}
