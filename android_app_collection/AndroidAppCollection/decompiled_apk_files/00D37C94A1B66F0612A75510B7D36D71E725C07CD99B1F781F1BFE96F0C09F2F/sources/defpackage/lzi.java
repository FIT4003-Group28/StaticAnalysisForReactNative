package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: lzi  reason: default package */
/* loaded from: classes3.dex */
final class lzi implements View.OnClickListener {
    final /* synthetic */ lzj a;
    private final List b;
    private final Object c;

    public lzi(lzj lzjVar, Object obj, apzg apzgVar) {
        this.a = lzjVar;
        this.c = obj;
        if (apzgVar != null) {
            this.b = amuk.r(apzgVar);
        } else {
            this.b = amuk.q();
        }
    }

    public lzi(lzj lzjVar, Object obj, List list) {
        this.a = lzjVar;
        this.c = obj;
        this.b = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.c, this.b);
    }
}
