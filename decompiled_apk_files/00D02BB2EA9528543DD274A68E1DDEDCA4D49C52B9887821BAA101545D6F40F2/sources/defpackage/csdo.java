package defpackage;
/* compiled from: PG */
/* renamed from: csdo  reason: default package */
/* loaded from: classes5.dex */
public abstract class csdo {
    public abstract dcdg<String, String> a();

    public abstract csdp b();

    public abstract void c(int i);

    public abstract void d(boolean z);

    public final csdp e() {
        csdp b = b();
        boolean z = false;
        dbsk.m((b.c() != null) == (b.b() != null), "downloadBytes and downloadMicros must be set together");
        dbsk.m((b.e() != null) == (b.d() != null), "uploadBytes and uploadMicros must be set together");
        if (b.h()) {
            dbsk.m(b.a() == null, "latencyMicros can't be set if noConnectivity is true");
            dbsk.m(b.b() == null, "downloadMicros can't be set if noConnectivity is true");
            dbsk.m(b.c() == null, "downloadBytes can't be set if noConnectivity is true");
            dbsk.m(b.d() == null, "uploadMicros can't be set if noConnectivity is true");
            if (b.e() == null) {
                z = true;
            }
            dbsk.m(z, "uploadBytes can't be set if noConnectivity is true");
        }
        return b;
    }

    public final void f(String str, String str2) {
        a().f(str, str2);
    }
}
