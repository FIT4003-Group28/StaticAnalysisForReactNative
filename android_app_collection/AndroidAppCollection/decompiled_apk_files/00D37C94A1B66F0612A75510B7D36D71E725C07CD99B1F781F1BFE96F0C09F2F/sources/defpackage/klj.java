package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: klj  reason: default package */
/* loaded from: classes3.dex */
public final class klj implements ajry {
    private final Context a;
    private final axnm b;
    private final ajhl c;
    private final acti d;
    private final /* synthetic */ int e;

    public klj(Context context, axnm axnmVar, ajhl ajhlVar, acti actiVar) {
        this.a = context;
        this.b = axnmVar;
        this.c = ajhlVar;
        this.d = actiVar;
    }

    public klj(Context context, axnm axnmVar, ajhl ajhlVar, acti actiVar, int i) {
        this.e = i;
        this.a = context;
        this.b = axnmVar;
        this.c = ajhlVar;
        this.d = actiVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        if (this.e == 0) {
            return new klk(this.a, this.b, this.c, this.d, viewGroup);
        }
        return new kkd(this.a, this.b, this.c, this.d, viewGroup);
    }
}
