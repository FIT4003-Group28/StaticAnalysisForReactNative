package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgzv  reason: default package */
/* loaded from: classes4.dex */
final class cgzv implements View.OnClickListener {
    final /* synthetic */ dspd a;
    final /* synthetic */ List b;
    final /* synthetic */ chac c;

    public cgzv(chac chacVar, dspd dspdVar, List list) {
        this.c = chacVar;
        this.a = dspdVar;
        this.b = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cgzz cgzzVar = this.c.e;
        if (cgzzVar != null) {
            cgzzVar.bo(this.a, this.b, false);
        }
    }
}
