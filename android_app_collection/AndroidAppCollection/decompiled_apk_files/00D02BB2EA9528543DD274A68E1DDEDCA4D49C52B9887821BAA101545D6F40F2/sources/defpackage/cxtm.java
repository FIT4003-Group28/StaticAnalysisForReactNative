package defpackage;

import android.view.inputmethod.InputMethodManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxtm  reason: default package */
/* loaded from: classes5.dex */
public final class cxtm implements cxwd {
    final /* synthetic */ cxtp a;

    public cxtm(cxtp cxtpVar) {
        this.a = cxtpVar;
    }

    @Override // defpackage.cxwd
    public final void a() {
        cxtp cxtpVar = this.a;
        cxtpVar.b.getWindow().setStatusBarColor(cxtpVar.k);
        cxtpVar.c.setVisibility(8);
        cxtpVar.a.setImportantForAccessibility(0);
        ((InputMethodManager) cxtpVar.b.getSystemService("input_method")).hideSoftInputFromWindow(cxtpVar.a.getWindowToken(), 0);
        cxpn cxpnVar = cxtpVar.j.h;
        cxpnVar.n = false;
        cxpnVar.e.setText("");
        cxpnVar.j.a("TimeToAutocompleteSelection").b();
        cxtv cxtvVar = cxtpVar.i;
        cxtvVar.e.d(cxtpVar.j.i.h());
        cxtpVar.i.c.r();
    }
}
