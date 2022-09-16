package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aism  reason: default package */
/* loaded from: classes.dex */
public final class aism implements aimk {
    final /* synthetic */ aiso a;

    public aism(aiso aisoVar) {
        this.a = aisoVar;
    }

    @Override // defpackage.aimk
    public final void a(int i) {
    }

    @Override // defpackage.aimk
    public final void b(aikd aikdVar) {
        this.a.b.d(aikdVar);
    }

    @Override // defpackage.aimk
    public final void c() {
        aiso aisoVar = this.a;
        ajah ajahVar = aisoVar.e.a;
        aiix aiixVar = aisoVar.f;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayqi.c((AtomicReference) aiixVar.c.a().as(new ldk(atomicBoolean, 9)));
        if (!atomicBoolean.get() || ajahVar == null) {
            return;
        }
        ajahVar.J(ajahVar.u().g(), ajahVar.u().h(), ajahVar.w());
    }

    @Override // defpackage.aimk
    public final void d(PlayerResponseModel playerResponseModel) {
    }

    @Override // defpackage.aimk
    public final void e() {
        this.a.g.b.c(new ahhi());
    }

    @Override // defpackage.aimk
    public final void f(aikd aikdVar) {
        this.a.a.f(aikdVar);
    }

    @Override // defpackage.aimk
    public final void g(WatchNextResponseModel watchNextResponseModel) {
    }
}
