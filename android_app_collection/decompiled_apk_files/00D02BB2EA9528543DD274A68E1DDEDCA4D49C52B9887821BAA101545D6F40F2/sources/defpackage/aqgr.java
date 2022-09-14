package defpackage;
/* compiled from: PG */
/* renamed from: aqgr  reason: default package */
/* loaded from: classes2.dex */
public final class aqgr {
    private final ckcw a;
    private final bvjj b;

    public aqgr(ckcw ckcwVar, bvjj bvjjVar) {
        this.a = ckcwVar;
        this.b = bvjjVar;
    }

    public final synchronized dbsg<String> a() {
        String z;
        z = this.b.z(bvjk.ge, null);
        ((ckcm) this.a.a(ckgs.f)).a(z != null);
        return dbsg.j(z);
    }

    public final synchronized void b(String str) {
        this.b.ac(bvjk.ge, str);
    }

    public final synchronized void c() {
        this.b.P(bvjk.ge);
    }
}
