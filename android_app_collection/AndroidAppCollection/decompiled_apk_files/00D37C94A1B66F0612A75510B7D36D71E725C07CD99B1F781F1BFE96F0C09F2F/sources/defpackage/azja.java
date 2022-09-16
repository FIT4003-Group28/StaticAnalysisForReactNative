package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azja  reason: default package */
/* loaded from: classes2.dex */
public final class azja extends azdm {
    final TimeUnit b;
    final ayor c;

    public azja(ayok ayokVar, TimeUnit timeUnit, ayor ayorVar) {
        super(ayokVar);
        this.b = timeUnit;
        this.c = ayorVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        this.a.az(new aziz(new azox(ayomVar), this.b, this.c.a()));
    }
}
