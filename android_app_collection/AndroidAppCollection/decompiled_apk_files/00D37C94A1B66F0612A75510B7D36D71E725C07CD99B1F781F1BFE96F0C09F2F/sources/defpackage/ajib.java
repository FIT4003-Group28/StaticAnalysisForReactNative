package defpackage;

import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajib  reason: default package */
/* loaded from: classes.dex */
public final class ajib extends xo {
    private final swq d;
    private final List e;
    private final acti f;
    private final Object g;

    public ajib(swq swqVar, List list, acti actiVar, Object obj) {
        this.d = swqVar;
        this.e = new ArrayList(list);
        this.f = actiVar;
        this.g = obj;
        mr();
    }

    @Override // defpackage.xo
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new ajia(new dci(viewGroup.getContext()));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        ajia ajiaVar = (ajia) yoVar;
        int i2 = ajia.v;
        dci dciVar = ajiaVar.t;
        cyv cyvVar = dciVar.t;
        swq swqVar = this.d;
        tcz a = tda.a();
        a.a = ajiaVar.t;
        a.f(false);
        a.l = amuk.r(ajjh.c(this.g));
        tda a2 = a.a();
        byte[] byteArray = ((awnn) this.e.get(i)).toByteArray();
        acti actiVar = this.f;
        czf c = ComponentTree.c(cyvVar, swqVar.a(cyvVar, a2, byteArray, actiVar != null ? ajjk.v(actiVar) : null, ajiaVar.u));
        c.d = false;
        dciVar.G(c.a());
        zgd.v(ajiaVar.t, -1, -2);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        ajia ajiaVar = (ajia) yoVar;
        int i = ajia.v;
        ajiaVar.u.c();
        ajiaVar.t.E();
        ajiaVar.t.K();
        ajiaVar.t.G(null);
    }
}
