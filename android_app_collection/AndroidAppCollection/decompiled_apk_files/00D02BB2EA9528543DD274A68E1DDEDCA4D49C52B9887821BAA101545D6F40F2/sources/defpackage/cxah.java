package defpackage;
/* compiled from: PG */
/* renamed from: cxah  reason: default package */
/* loaded from: classes.dex */
public abstract class cxah {
    public abstract cxai a();

    public abstract void b(boolean z);

    public abstract void c(int i);

    public final cxai d() {
        cxai a = a();
        boolean z = true;
        if (a.d() != null && a.e()) {
            z = false;
        }
        dbsk.b(z, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
        return a;
    }

    public final void e(boolean z) {
        c(true != z ? 2 : 3);
    }
}
