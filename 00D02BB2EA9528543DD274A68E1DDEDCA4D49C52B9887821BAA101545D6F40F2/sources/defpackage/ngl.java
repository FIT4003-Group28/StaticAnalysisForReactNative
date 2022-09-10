package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ngl  reason: default package */
/* loaded from: classes7.dex */
public class ngl implements ngh {
    public final CharSequence a;
    public final kcv b;
    public final Context c;
    public final Executor d;
    private boolean e;
    private final afwo f;
    private final afwm g;
    private final bvjj h;
    private final bvjk i;
    private final ddho j;
    private final btxv k;

    public ngl(afwo afwoVar, afwm afwmVar, bvjj bvjjVar, bvjk bvjkVar, boolean z, ddho ddhoVar, CharSequence charSequence, kcv kcvVar, btxv btxvVar, Context context, Executor executor) {
        this.a = charSequence;
        this.e = bvjjVar.m(bvjkVar, false);
        this.f = afwoVar;
        this.g = afwmVar;
        this.h = bvjjVar;
        this.i = bvjkVar;
        this.j = ddhoVar;
        this.b = kcvVar;
        this.k = btxvVar;
        this.c = context;
        this.d = executor;
    }

    @Override // defpackage.nfx
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.ngh
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.ngh
    public cqkl c(Boolean bool) {
        this.e = bool.booleanValue();
        afwm afwmVar = this.g;
        bvjk bvjkVar = this.i;
        boolean booleanValue = b().booleanValue();
        this.h.S(bvjkVar, booleanValue);
        this.f.c(afwmVar, booleanValue);
        if (bool.booleanValue()) {
            this.k.a(new ngk(this));
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ngh
    public Boolean d() {
        return false;
    }

    @Override // defpackage.ngh
    public CharSequence e() {
        return "";
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
        b.d = this.j;
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
