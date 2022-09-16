package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: luh  reason: default package */
/* loaded from: classes3.dex */
final class luh implements View.OnClickListener {
    final /* synthetic */ apzg a;
    final /* synthetic */ lui b;

    public luh(lui luiVar, apzg apzgVar) {
        this.b = luiVar;
        this.a = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.b.b);
        hashMap.put("parent_ve_type", Integer.valueOf(this.b.c));
        this.b.a.c(this.a, hashMap);
    }
}
