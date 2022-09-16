package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wex  reason: default package */
/* loaded from: classes4.dex */
public final class wex implements ajry {
    private final Context a;
    private final wfh b;
    private final /* synthetic */ int c;

    public wex(Context context, wfh wfhVar, int i) {
        this.c = i;
        context.getClass();
        this.a = context;
        this.b = wfhVar;
    }

    public wex(Context context, wfh wfhVar) {
        context.getClass();
        this.a = context;
        this.b = wfhVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        if (this.c == 0) {
            return new wez(this.a, this.b);
        }
        return new vyq(this.a, this.b);
    }
}
