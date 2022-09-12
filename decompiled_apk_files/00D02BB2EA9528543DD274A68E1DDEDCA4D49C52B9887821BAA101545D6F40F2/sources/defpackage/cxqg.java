package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxqg  reason: default package */
/* loaded from: classes5.dex */
final class cxqg implements View.OnClickListener {
    final /* synthetic */ Channel a;
    final /* synthetic */ Channel b;
    final /* synthetic */ cxqh c;

    public cxqg(cxqh cxqhVar, Channel channel, Channel channel2) {
        this.c = cxqhVar;
        this.a = channel;
        this.b = channel2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.c.h.f(this.a)) {
            cxqh cxqhVar = this.c;
            cxqhVar.n = true;
            cxqhVar.h.e(this.b);
            cxqh cxqhVar2 = this.c;
            cxqhVar2.h.c(this.a, cxqhVar2.b.b());
            this.c.n = false;
        }
        this.c.j.dismiss();
    }
}
