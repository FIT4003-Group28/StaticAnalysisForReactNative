package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: anjo  reason: default package */
/* loaded from: classes.dex */
public final class anjo implements aniq {
    final /* synthetic */ Callable a;

    public anjo(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        return anlz.q(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
