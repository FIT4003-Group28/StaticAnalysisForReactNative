package defpackage;

import android.util.Pair;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ghe  reason: default package */
/* loaded from: classes3.dex */
final class ghe implements Callable {
    final /* synthetic */ ghf a;

    public ghe(ghf ghfVar) {
        this.a = ghfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        airr airrVar = (airr) this.a.a.get();
        return Pair.create(airrVar.q(), Long.valueOf(airrVar.n().b()));
    }
}
