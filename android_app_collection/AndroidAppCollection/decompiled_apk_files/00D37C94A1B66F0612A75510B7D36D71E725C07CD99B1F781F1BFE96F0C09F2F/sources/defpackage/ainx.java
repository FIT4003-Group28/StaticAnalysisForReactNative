package defpackage;
/* compiled from: PG */
/* renamed from: ainx  reason: default package */
/* loaded from: classes.dex */
public final class ainx {
    public int a = 1;

    public final synchronized void a() {
        this.a = 2;
    }

    public final synchronized void b() {
        this.a = 1;
    }

    public final synchronized void c() {
        this.a = 3;
    }
}
