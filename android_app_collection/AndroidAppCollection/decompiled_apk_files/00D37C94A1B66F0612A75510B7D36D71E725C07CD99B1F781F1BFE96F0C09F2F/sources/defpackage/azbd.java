package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azbd  reason: default package */
/* loaded from: classes2.dex */
public final class azbd extends azai {
    final ayqe b;
    final ayqe c;
    final Callable d;

    public azbd(ayof ayofVar, ayqe ayqeVar, ayqe ayqeVar2, Callable callable) {
        super(ayofVar);
        this.b = ayqeVar;
        this.c = ayqeVar2;
        this.d = callable;
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        this.a.X(new azbc(ayodVar, this.b, this.c, this.d));
    }
}
