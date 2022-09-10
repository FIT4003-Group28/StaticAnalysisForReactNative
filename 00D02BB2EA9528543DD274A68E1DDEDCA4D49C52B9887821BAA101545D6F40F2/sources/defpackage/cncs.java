package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cncs  reason: default package */
/* loaded from: classes5.dex */
public final class cncs {
    public int a = 1;
    private final Context b;
    private final cncc c;
    private final cncd d;

    public cncs(Context context, cncc cnccVar, cncd cncdVar) {
        this.b = context;
        dbsk.s(cnccVar);
        this.c = cnccVar;
        this.d = cncdVar;
    }

    public final cncu a() {
        return new cncu(this.b, this.c, this.d, this.a);
    }
}
