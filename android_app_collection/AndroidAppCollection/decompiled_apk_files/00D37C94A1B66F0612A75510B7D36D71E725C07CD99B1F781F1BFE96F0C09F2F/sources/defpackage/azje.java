package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azje  reason: default package */
/* loaded from: classes2.dex */
public final class azje extends azdm {
    final TimeUnit b;

    public azje(ayok ayokVar, TimeUnit timeUnit) {
        super(ayokVar);
        this.b = timeUnit;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        this.a.az(new azjd(ayomVar, this.b));
    }
}
