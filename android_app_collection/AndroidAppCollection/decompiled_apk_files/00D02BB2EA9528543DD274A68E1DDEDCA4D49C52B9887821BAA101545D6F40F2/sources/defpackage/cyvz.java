package defpackage;

import com.google.android.libraries.social.populous.core.SessionContext;
/* compiled from: PG */
/* renamed from: cyvz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyvz {
    protected abstract dbsg<SessionContext> a();

    protected abstract cywa b();

    public abstract void c(cyei cyeiVar);

    public abstract void d(cygp cygpVar);

    public abstract void e(SessionContext sessionContext);

    public abstract void f(boolean z);

    public final cywa g() {
        if (!a().a()) {
            e(SessionContext.g());
        }
        return b();
    }
}
