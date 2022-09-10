package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjjh  reason: default package */
/* loaded from: classes4.dex */
public final class cjjh extends dzvy implements dzut<dztc> {
    final /* synthetic */ cjjj a;
    final /* synthetic */ dzwc b;
    final /* synthetic */ cjjf c;
    final /* synthetic */ View d;

    public cjjh(cjjj cjjjVar, dzwc dzwcVar, cjjf cjjfVar, View view) {
        this.a = cjjjVar;
        this.b = dzwcVar;
        this.c = cjjfVar;
        this.d = view;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ dztc a() {
        cjtd e;
        if (!this.b.a && (e = this.c.e()) != null) {
            this.b.a = true;
            this.a.a.f(this.d).d(e);
        }
        return dztc.a;
    }
}
