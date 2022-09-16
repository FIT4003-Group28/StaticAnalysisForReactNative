package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akox  reason: default package */
/* loaded from: classes.dex */
public final class akox implements ajry {
    private final Context a;

    public akox(Context context) {
        this.a = context;
    }

    public final akoy a() {
        return new akoy(this.a);
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return a();
    }
}
