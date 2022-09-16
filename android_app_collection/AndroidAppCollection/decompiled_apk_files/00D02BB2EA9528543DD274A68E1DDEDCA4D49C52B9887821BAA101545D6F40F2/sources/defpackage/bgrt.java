package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgrt  reason: default package */
/* loaded from: classes3.dex */
public final class bgrt extends cqiw<bgsk> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bgsk bgskVar, Context context, cqiv cqivVar) {
        bgsk bgskVar2 = bgskVar;
        if (bgskVar2.b().d().booleanValue()) {
            cqivVar.a(new bgrn(), bgskVar2.b());
        }
        cqivVar.a(new bgrs(), bgskVar2);
        cqivVar.a(new bfza(), bgskVar2.d());
        cqivVar.a(new bgre(), bgskVar2.e());
        List<brve> c = bgskVar2.c();
        for (int i2 = 0; i2 < c.size(); i2++) {
            cqivVar.a(new brua(), c.get(i2));
            if (i2 != c.size() - 1) {
                cqivVar.a(new brkn(), cqkp.T);
                cqivVar.a(new bgrq(), cqkp.T);
                cqivVar.a(new brkn(), cqkp.T);
            }
        }
        cqkp f = bgskVar2.f();
        if (f != null) {
            cqivVar.a(new acnn(), f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bgsk> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.x(irg.a()), cqqx.v(bgro.a), cqqx.x(bgrp.a), iue.b(cjtd.a(dtxn.ey))));
    }
}
