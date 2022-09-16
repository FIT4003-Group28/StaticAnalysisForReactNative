package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: adld  reason: default package */
/* loaded from: classes.dex */
public final class adld implements ajbf {
    public PlayerResponseModel a;
    private final WeakReference b;

    public adld(ajah ajahVar) {
        aqxo.y(true);
        this.b = new WeakReference(ajahVar);
    }

    @Override // defpackage.ajbf
    public final long a() {
        return 0L;
    }

    @Override // defpackage.ajbf
    public final long b() {
        ajah ajahVar = (ajah) this.b.get();
        if (ajahVar != null) {
            return ajahVar.l();
        }
        return 0L;
    }

    @Override // defpackage.ajbf
    public final PlayerResponseModel c() {
        return this.a;
    }

    @Override // defpackage.ajbf
    public final ajbk d() {
        return null;
    }

    @Override // defpackage.ajbf
    public final ajfq e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.b.clear();
    }

    @Override // defpackage.ajbf
    public final ajfa g() {
        return null;
    }
}
