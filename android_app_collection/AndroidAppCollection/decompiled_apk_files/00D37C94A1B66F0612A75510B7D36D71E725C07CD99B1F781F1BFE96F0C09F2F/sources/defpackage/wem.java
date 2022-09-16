package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wem  reason: default package */
/* loaded from: classes4.dex */
public final class wem implements ajry {
    private final Context a;
    private final int b;
    private final acti c;

    public wem(Context context, int i, acti actiVar) {
        context.getClass();
        this.a = context;
        this.b = i;
        actiVar.getClass();
        this.c = actiVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new wen(this.a, this.b, this.c);
    }
}
