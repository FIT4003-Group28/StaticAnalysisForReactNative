package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
/* compiled from: PG */
/* renamed from: barg  reason: default package */
/* loaded from: classes3.dex */
public class barg implements baqf {
    private final gga a;
    private final cklf b;
    private final cqkj c;
    private gdf d;

    public barg(gga ggaVar, cqkj cqkjVar, cklf cklfVar) {
        this.a = ggaVar;
        this.b = cklfVar;
        this.c = cqkjVar;
    }

    @Override // defpackage.baqf
    public cqkl a() {
        this.b.a("answers_cards_android");
        gdf gdfVar = this.d;
        dbsk.s(gdfVar);
        gdfVar.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.baqf
    public cqkl b() {
        bszv.ba(this.a, btki.aU(1));
        gdf gdfVar = this.d;
        dbsk.s(gdfVar);
        gdfVar.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.baqf
    public cqkl c() {
        gdf gdfVar = this.d;
        dbsk.s(gdfVar);
        gdfVar.dismiss();
        return cqkl.a;
    }

    public void d() {
        cqkf e = this.c.e(new bamg());
        e.e(this);
        gdf gdfVar = new gdf((Context) this.a, false);
        this.d = gdfVar;
        Window window = gdfVar.getWindow();
        dbsk.s(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        gdf gdfVar2 = this.d;
        dbsk.s(gdfVar2);
        gdfVar2.setContentView(e.c());
        gdf gdfVar3 = this.d;
        dbsk.s(gdfVar3);
        gdfVar3.show();
    }
}
