package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfl  reason: default package */
/* loaded from: classes.dex */
public final class acfl implements ajry {
    final /* synthetic */ acfm a;
    private final /* synthetic */ int b;

    public acfl(acfm acfmVar) {
        this.a = acfmVar;
    }

    public acfl(acfm acfmVar, int i) {
        this.b = i;
        this.a = acfmVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        if (this.b == 0) {
            acfq acfqVar = this.a.a;
            Context context = acfqVar.c;
            ajmr ajmrVar = acfqVar.l;
            acth acthVar = new acth() { // from class: acfk
                @Override // defpackage.acth
                public final acti oi() {
                    return acfl.this.a.a.i;
                }
            };
            acfq acfqVar2 = this.a.a;
            return new acme(context, ajmrVar, acthVar, null, acfqVar2.m, acfqVar2.k, acfqVar2.r);
        }
        acfq acfqVar3 = this.a.a;
        return new acmd(acfqVar3.c, null, acfqVar3.k);
    }
}
