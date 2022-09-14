package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bdbg  reason: default package */
/* loaded from: classes3.dex */
public final class bdbg implements bdah {
    private final bdbi a;
    private final bbtw b;

    public bdbg(bdbi bdbiVar, bbtw bbtwVar) {
        this.a = bdbiVar;
        this.b = bbtwVar;
    }

    @Override // defpackage.bdah
    @dzsi
    public final /* bridge */ /* synthetic */ jbt a(bczw bczwVar) {
        bdbi bdbiVar = this.a;
        dwfl a = bczwVar.a();
        bbtw bbtwVar = this.b;
        Activity activity = (Activity) ((dxjd) bdbiVar.a).a;
        bdbi.a(activity, 1);
        bcaz a2 = bdbiVar.b.a();
        bdbi.a(a2, 2);
        gfw gfwVar = (gfw) ((dxjd) bdbiVar.c).a;
        bdbi.a(gfwVar, 3);
        bdbi.a(a, 4);
        bdbi.a(bbtwVar, 5);
        return new bdbh(activity, a2, gfwVar, a, bbtwVar);
    }
}
