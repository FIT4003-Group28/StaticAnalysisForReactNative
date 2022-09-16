package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azjc  reason: default package */
/* loaded from: classes2.dex */
public final class azjc extends azdm {
    final TimeUnit b;
    final ayor c;

    public azjc(ayoi ayoiVar, TimeUnit timeUnit, ayor ayorVar) {
        super(ayoiVar);
        this.b = timeUnit;
        this.c = ayorVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        this.a.az(new azjb(ayomVar, this.b, this.c.a()));
    }
}
