package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mfd  reason: default package */
/* loaded from: classes3.dex */
final class mfd implements View.OnClickListener {
    final /* synthetic */ mfe a;

    public mfd(mfe mfeVar) {
        this.a = mfeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apos a = this.a.c.a();
        if (mfe.e(a)) {
            this.a.f.b();
            HashMap hashMap = new HashMap();
            hashMap.put("ALLOW_RELOAD", true);
            aafo aafoVar = this.a.d;
            apzg apzgVar = a.l;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
            return;
        }
        mfe mfeVar = this.a;
        mfeVar.e.G(!mfeVar.b.isSelected());
    }
}
