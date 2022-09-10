package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.google.android.apps.gmm.customchevron.webview.CustomChevronWebViewCallbacks;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ppd  reason: default package */
/* loaded from: classes7.dex */
public final class ppd implements pnw {
    public final bvjj a;
    public final dxio<araj> b;
    public final bvrb c;
    public dbsg<String> d = dbpy.a;
    private final Activity e;
    private final pnq f;
    private final cqhn g;
    private final Executor h;
    private final cqkj i;
    private final bvvw j;

    public ppd(Activity activity, pnq pnqVar, cqhn cqhnVar, bvjj bvjjVar, dxio<araj> dxioVar, Executor executor, bvrb bvrbVar, cqkj cqkjVar, bvvw bvvwVar) {
        this.e = activity;
        this.f = pnqVar;
        this.g = cqhnVar;
        this.a = bvjjVar;
        this.b = dxioVar;
        this.h = executor;
        this.c = bvrbVar;
        this.i = cqkjVar;
        this.j = bvvwVar;
    }

    @Override // defpackage.pnw
    public final void a(String str, dvdy dvdyVar, Runnable runnable) {
        gdf gdfVar = new gdf((Context) this.e, false);
        gdfVar.setOnDismissListener(new poz(this));
        ppa ppaVar = new ppa(this, gdfVar);
        pow powVar = new pow(dvdyVar, this.e.getResources(), this.g, new ppb(this, dvdyVar, gdfVar, runnable), ppaVar);
        deha.q(this.f.b(str, dvdyVar.i, dvdyVar.b), new ppc(this, dvdyVar, powVar), this.h);
        cqkf e = this.i.e(new pos());
        e.e(powVar);
        gdfVar.setContentView(e.c());
        gdfVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        gdfVar.show();
    }

    @Override // defpackage.pnw
    public final void b(String str, String str2, String str3, int i, Runnable runnable) {
        bvvw bvvwVar = this.j;
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i2 = bvxuVar.a | 1;
        bvxuVar.a = i2;
        bvxuVar.b = str;
        int i3 = i2 | 8;
        bvxuVar.a = i3;
        bvxuVar.e = true;
        bvxuVar.a = i3 | 16;
        bvxuVar.f = 1;
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar2.j = bK;
        bvxuVar2.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu.b((bvxu) bZ.b);
        bvvwVar.j(bZ.bK(), new CustomChevronWebViewCallbacks(str2, str3, i, runnable), dtxl.iv);
    }

    public final void c() {
        if (!pot.c(this.a.s(bvjk.jm, 0))) {
            this.f.s();
        }
    }
}
