package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajyv  reason: default package */
/* loaded from: classes.dex */
public final class ajyv {
    public final ajxf a;
    public final Object b;
    public final View.OnClickListener c;
    public final ajyw d;

    public ajyv(ajxf ajxfVar, Object obj, View.OnClickListener onClickListener, ajyw ajywVar) {
        this.a = ajxfVar;
        this.b = obj;
        this.c = onClickListener;
        this.d = ajywVar;
    }

    public static ajyu a() {
        return new ajyu();
    }

    public final ajyv b(ajxf ajxfVar) {
        return new ajyv(ajxfVar, this.b, this.c, this.d);
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("event", this.a);
        c.b("eventId", this.b);
        c.b("onRetry", this.d);
        c.b("onMore", this.c);
        c.b("moreLabel", null);
        return c.toString();
    }
}
