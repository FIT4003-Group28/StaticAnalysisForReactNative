package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: usd  reason: default package */
/* loaded from: classes4.dex */
public final class usd {
    public final upg a;
    public final String b;
    public final int c;
    private final uqe d;

    public usd(uqe uqeVar, int i, upg upgVar, String str) {
        this.d = uqeVar;
        this.a = upgVar;
        this.c = i;
        this.b = str;
    }

    public final ankt a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        ankt a = z ? this.d.a() : this.d.b();
        amnt.g(a, new usc(this, z, currentTimeMillis), anjk.a);
        return a;
    }
}
