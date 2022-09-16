package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ahne  reason: default package */
/* loaded from: classes.dex */
public final class ahne {
    private final ViewGroup a;
    private final Context b;
    private final Handler c;
    private final azqb d;

    public ahne(ViewGroup viewGroup, Context context, Handler handler, azqb azqbVar) {
        this.a = viewGroup;
        this.b = context;
        this.c = handler;
        this.d = azqbVar;
    }

    public final ahnh a(ahoo ahooVar, float f, float f2) {
        return new ahnh(this.a, this.b, this.c, this.d, ahooVar, f, f2);
    }
}
