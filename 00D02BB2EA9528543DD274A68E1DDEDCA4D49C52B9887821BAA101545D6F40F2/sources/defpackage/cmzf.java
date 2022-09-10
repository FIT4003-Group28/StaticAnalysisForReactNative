package defpackage;
/* compiled from: PG */
/* renamed from: cmzf  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmzf {
    public abstract cmzg a();

    public final void b() {
        cmzg a = a();
        boolean z = false;
        if ((a.b() == 2) == (a.a() != null)) {
            z = true;
        }
        dbsk.m(z, "legacyConnectionResult must be set iff failureReason is LEGACY_GMSCORE_FAILURE");
    }
}
