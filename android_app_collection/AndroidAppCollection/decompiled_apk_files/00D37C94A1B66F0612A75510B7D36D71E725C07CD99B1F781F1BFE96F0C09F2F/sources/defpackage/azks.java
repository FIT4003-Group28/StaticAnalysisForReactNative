package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azks  reason: default package */
/* loaded from: classes2.dex */
public final class azks extends ayos {
    final ayov a;
    final TimeUnit b;
    final ayor c;

    public azks(ayov ayovVar, TimeUnit timeUnit, ayor ayorVar) {
        this.a = ayovVar;
        this.b = timeUnit;
        this.c = ayorVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        ayqm ayqmVar = new ayqm();
        ayotVar.sj(ayqmVar);
        this.a.W(new azkr(this, ayqmVar, ayotVar));
    }
}
