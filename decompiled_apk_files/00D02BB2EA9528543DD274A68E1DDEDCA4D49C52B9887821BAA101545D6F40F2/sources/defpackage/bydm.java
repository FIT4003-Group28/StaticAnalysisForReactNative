package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bydm  reason: default package */
/* loaded from: classes4.dex */
public abstract class bydm {
    public static bydl g(Context context) {
        byde bydeVar = new byde();
        bydeVar.a = Integer.valueOf(ibm.D().b(context));
        bydeVar.b(0);
        bydeVar.c(0);
        bydeVar.b = Integer.valueOf(ibm.S().b(context));
        bydeVar.d(false);
        if (context != null) {
            bydeVar.c = context;
            return bydeVar;
        }
        throw new NullPointerException("Null context");
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract boolean e();

    public abstract Context f();
}
