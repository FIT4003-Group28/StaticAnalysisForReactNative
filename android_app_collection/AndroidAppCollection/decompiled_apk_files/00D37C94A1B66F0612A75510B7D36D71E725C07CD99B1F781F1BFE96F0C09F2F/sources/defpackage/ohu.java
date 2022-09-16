package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
/* compiled from: PG */
/* renamed from: ohu  reason: default package */
/* loaded from: classes3.dex */
public final class ohu implements fqb {
    final /* synthetic */ wan a;

    public ohu(wan wanVar) {
        this.a = wanVar;
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        wan wanVar = this.a;
        if (wanVar.c || wanVar.b() == null) {
            return;
        }
        wax b = wanVar.b();
        b.getClass();
        wanVar.d = true;
        Bundle bundle = b.m;
        Fragment$SavedState c = wanVar.a.getSupportFragmentManager().c(b);
        ex l = wanVar.a.getSupportFragmentManager().l();
        l.m(b);
        wanVar.b = new wax();
        wanVar.b.ag(c);
        wanVar.b.ae(bundle);
        l.r(wanVar.b, "update_image_fragment");
        l.d();
        wanVar.d = false;
        if (!wanVar.e) {
            return;
        }
        wanVar.d();
        wanVar.e = false;
    }
}
