package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ceq  reason: default package */
/* loaded from: classes2.dex */
public final class ceq extends cff {
    public Intent a;

    public ceq() {
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public ceq(Intent intent) {
        this.a = intent;
    }

    public ceq(cew cewVar) {
        super(cewVar);
    }

    public ceq(String str) {
        super(str);
    }

    public ceq(String str, Exception exc) {
        super(str, exc);
    }
}
