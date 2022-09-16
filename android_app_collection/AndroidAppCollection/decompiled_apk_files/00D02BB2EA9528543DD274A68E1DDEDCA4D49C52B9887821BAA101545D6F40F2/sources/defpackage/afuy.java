package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: afuy  reason: default package */
/* loaded from: classes2.dex */
public class afuy implements afuz {
    private final Context a;
    private final afwt b;
    private final dxio<afha> c;
    private final String d;
    @dzsi
    private final String e;

    public afuy(Context context, afwt afwtVar, dxio<afha> dxioVar, String str, @dzsi String str2, @dzsi String str3, @dzsi String str4) {
        boolean z = false;
        if (str2 == null || (str3 != null && str4 != null)) {
            z = true;
        }
        dbsk.a(z);
        this.a = context;
        this.b = afwtVar;
        this.c = dxioVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.izt
    @dzsi
    public cqtd a() {
        return null;
    }

    @Override // defpackage.izt
    @dzsi
    public CharSequence b() {
        return null;
    }

    @Override // defpackage.izt
    public Boolean c() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        return n(cjqmVar);
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.izt
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.izt
    @dzsi
    public cjtd j() {
        return null;
    }

    @Override // defpackage.jbi
    /* renamed from: k */
    public String m() {
        return this.d;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        if (this.e == null) {
            return cqkl.a;
        }
        this.b.q();
        this.c.a().k(this.a, this.e, 4);
        return cqkl.a;
    }

    @Override // defpackage.afuz
    public Boolean o() {
        return false;
    }

    @Override // defpackage.afuz
    public Boolean p() {
        return true;
    }

    @Override // defpackage.afuz
    public View.AccessibilityDelegate q() {
        return new View.AccessibilityDelegate();
    }

    @Override // defpackage.afuz
    public Boolean r() {
        return false;
    }

    @Override // defpackage.afuz
    public Boolean s() {
        return false;
    }

    @Override // defpackage.afuz
    public CompoundButton.OnCheckedChangeListener t() {
        return afux.a;
    }

    @Override // defpackage.afuz
    public Boolean u() {
        return false;
    }

    @Override // defpackage.afuz
    public Boolean v() {
        return false;
    }
}
