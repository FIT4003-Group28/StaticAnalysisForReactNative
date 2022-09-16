package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akos  reason: default package */
/* loaded from: classes.dex */
public final class akos implements ajry {
    private final Context a;
    private final akll b;

    public akos(Context context, akll akllVar) {
        this.a = context;
        this.b = akllVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new akot(this.a, this.b);
    }
}
