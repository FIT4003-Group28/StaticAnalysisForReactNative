package defpackage;

import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: shg  reason: default package */
/* loaded from: classes7.dex */
final class shg implements cqkn<sbg> {
    final /* synthetic */ shh a;

    public shg(shh shhVar) {
        this.a = shhVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(sbg sbgVar, View view) {
        sbg sbgVar2 = sbgVar;
        if (!sbgVar2.e().booleanValue()) {
            this.a.b = sbgVar2.h();
            Iterator<sbg> it = this.a.a.iterator();
            while (it.hasNext()) {
                sbg next = it.next();
                next.f(next == sbgVar2);
            }
            cqkx.p(this.a);
        }
    }
}
