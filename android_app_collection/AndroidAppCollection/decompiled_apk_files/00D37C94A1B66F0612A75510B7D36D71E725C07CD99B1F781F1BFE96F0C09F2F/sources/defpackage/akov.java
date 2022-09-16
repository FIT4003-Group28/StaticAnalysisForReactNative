package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akov  reason: default package */
/* loaded from: classes.dex */
public final class akov implements ajry {
    private final Context a;
    private final aafo b;
    private final /* synthetic */ int c;

    public akov(Context context, aafo aafoVar) {
        this.a = context;
        this.b = aafoVar;
    }

    public akov(Context context, aafo aafoVar, int i) {
        this.c = i;
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        if (this.c == 0) {
            return new akow(this.a, this.b);
        }
        return new ebh(this.a, this.b);
    }
}
