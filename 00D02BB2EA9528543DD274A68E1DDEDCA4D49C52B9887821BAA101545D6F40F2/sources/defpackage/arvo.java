package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arvo  reason: default package */
/* loaded from: classes2.dex */
public final class arvo {
    public final Context a;
    private final btvo b;
    private final bttf c;

    public arvo(btvo btvoVar, Context context, bttf bttfVar) {
        this.b = btvoVar;
        this.a = context;
        this.c = bttfVar;
    }

    public final boolean a() {
        return dxfd.a.b(this.a);
    }

    public final boolean b() {
        return this.b.getMediaIntegrationParameters().b.contains(this.c.a());
    }

    public final boolean c() {
        return this.b.getMediaIntegrationParameters().c;
    }
}
