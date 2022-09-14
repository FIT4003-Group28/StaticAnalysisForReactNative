package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cgzb  reason: default package */
/* loaded from: classes4.dex */
final class cgzb implements View.OnClickListener {
    final /* synthetic */ cgzf a;

    public cgzb(cgzf cgzfVar) {
        this.a = cgzfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.c.a);
        arrayList.addAll(this.a.c.b);
        this.a.b.t(view, arrayList);
    }
}
