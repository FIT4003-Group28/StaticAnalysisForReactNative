package defpackage;

import android.graphics.PorterDuff;
/* compiled from: PG */
/* renamed from: cqvc  reason: default package */
/* loaded from: classes5.dex */
public abstract class cqvc implements cqur {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqvc g(cqpw cqpwVar, cqtd cqtdVar, @dzsi cqss cqssVar, @dzsi PorterDuff.Mode mode) {
        return new cqsi(cqpwVar, cqtdVar, cqssVar, mode);
    }

    @Override // defpackage.cqur
    public final boolean NJ() {
        return cqvl.b(c()) || cqvl.b(d());
    }

    public abstract cqpw a();

    public abstract cqtd c();

    @dzsi
    public abstract cqss d();

    @dzsi
    public abstract PorterDuff.Mode e();

    public abstract int f();
}
