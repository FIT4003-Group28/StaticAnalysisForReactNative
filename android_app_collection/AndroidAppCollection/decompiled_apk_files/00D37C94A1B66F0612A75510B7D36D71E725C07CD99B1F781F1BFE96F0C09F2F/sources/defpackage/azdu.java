package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azdu  reason: default package */
/* loaded from: classes2.dex */
public final class azdu extends azdm {
    final Callable b;

    public azdu(ayok ayokVar, Callable callable) {
        super(ayokVar);
        this.b = callable;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        this.a.az(new azdt(ayomVar, this.b));
    }
}
