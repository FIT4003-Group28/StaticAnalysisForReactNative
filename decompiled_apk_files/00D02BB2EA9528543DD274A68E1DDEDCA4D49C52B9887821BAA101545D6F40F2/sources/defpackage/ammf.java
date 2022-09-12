package defpackage;
/* compiled from: PG */
/* renamed from: ammf  reason: default package */
/* loaded from: classes.dex */
public final class ammf {
    public long a = 0;
    public alwn b;

    public ammf(alwn alwnVar) {
        this.b = alwnVar;
    }

    public final synchronized void a(alwn alwnVar) {
        this.b = alwnVar;
        b();
    }

    public final synchronized void b() {
        this.a++;
    }
}
