package defpackage;
/* compiled from: PG */
/* renamed from: cwxp  reason: default package */
/* loaded from: classes.dex */
public abstract class cwxp implements cwuw {
    public static final cwxo f() {
        cwxm cwxmVar = new cwxm();
        cwxmVar.a = Float.valueOf(100.0f);
        cwxmVar.b = 1;
        return cwxmVar;
    }

    @Override // defpackage.cwuw
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.cwuw
    public abstract int b();

    public abstract float c();

    @dzsi
    public abstract dzsj<dzze> d();

    public final boolean e() {
        return b() == 3;
    }
}
