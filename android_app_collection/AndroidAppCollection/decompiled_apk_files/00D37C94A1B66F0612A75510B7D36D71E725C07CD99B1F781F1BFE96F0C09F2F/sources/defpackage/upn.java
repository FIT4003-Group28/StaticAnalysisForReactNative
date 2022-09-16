package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: upn  reason: default package */
/* loaded from: classes4.dex */
public final class upn implements tnl {
    final /* synthetic */ Context a;

    public upn(Context context) {
        this.a = context;
    }

    @Override // defpackage.tnl
    public final /* synthetic */ ampq a(tlp tlpVar) {
        return amon.a;
    }

    @Override // defpackage.tnl
    public final /* synthetic */ ampq b(tlp tlpVar) {
        return amon.a;
    }

    @Override // defpackage.tnl
    public final ankt c(tlp tlpVar, ankt anktVar) {
        aopa createBuilder = aoum.a.createBuilder();
        aouk a = aoul.a();
        String packageName = this.a.getPackageName();
        a.copyOnWrite();
        ((aoul) a.instance).o(packageName);
        createBuilder.copyOnWrite();
        aoum aoumVar = (aoum) createBuilder.instance;
        aoul aoulVar = (aoul) a.mo39build();
        aoulVar.getClass();
        aoumVar.c = aoulVar;
        aoumVar.b |= 1;
        return anlz.q(createBuilder.mo39build());
    }

    @Override // defpackage.tnl
    public final /* synthetic */ ankt d(tlp tlpVar, ankt anktVar) {
        return tnk.c();
    }

    @Override // defpackage.tnl
    public final String e(tlp tlpVar) {
        return "ONEGOOGLE_MOBILE";
    }

    @Override // defpackage.tnl
    public final /* synthetic */ ankt f() {
        throw null;
    }

    @Override // defpackage.tnl
    public final void g(tlp tlpVar) {
    }
}
