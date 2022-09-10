package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: pqd  reason: default package */
/* loaded from: classes7.dex */
public final class pqd {
    private final cqkj a;
    private final Activity b;

    public pqd(cqkj cqkjVar, Activity activity) {
        this.a = cqkjVar;
        this.b = activity;
    }

    public final Dialog a(pqe pqeVar, @dzsi ddho ddhoVar) {
        cqkf c = this.a.c(new pqv(), null);
        c.e(pqeVar);
        gdf gdfVar = new gdf((Context) this.b, false);
        gdfVar.getWindow().requestFeature(1);
        View c2 = c.c();
        cjqg.p(c2, pqeVar, ddhoVar);
        gdfVar.setContentView(c2);
        return gdfVar;
    }
}
