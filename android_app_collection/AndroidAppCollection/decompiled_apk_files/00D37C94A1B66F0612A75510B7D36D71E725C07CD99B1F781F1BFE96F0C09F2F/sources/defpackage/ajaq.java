package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ajaq  reason: default package */
/* loaded from: classes.dex */
public final class ajaq implements ajbf {
    public final WeakReference a;
    public WeakReference b = new WeakReference(null);
    private final aiix c;

    public ajaq(ajao ajaoVar, aiix aiixVar) {
        this.a = new WeakReference(ajaoVar);
        this.c = aiixVar;
    }

    @Override // defpackage.ajbf
    public final long a() {
        if (this.c.C()) {
            ajff ajffVar = (ajff) this.b.get();
            if (ajffVar == null) {
                return 0L;
            }
            return ajffVar.p().i;
        }
        ajah ajahVar = (ajah) this.a.get();
        if (ajahVar == null) {
            return 0L;
        }
        return ajahVar.k();
    }

    @Override // defpackage.ajbf
    public final long b() {
        if (this.c.C()) {
            ajff ajffVar = (ajff) this.b.get();
            if (ajffVar == null) {
                return 0L;
            }
            return ajffVar.p().e;
        }
        ajah ajahVar = (ajah) this.a.get();
        if (ajahVar == null) {
            return 0L;
        }
        return ajahVar.l();
    }

    @Override // defpackage.ajbf
    public final PlayerResponseModel c() {
        ajff ajffVar = (ajff) this.b.get();
        if (ajffVar != null) {
            return ajffVar.c();
        }
        return null;
    }

    @Override // defpackage.ajbf
    public final ajbk d() {
        ajff ajffVar = (ajff) this.b.get();
        if (ajffVar != null) {
            return ajffVar.n();
        }
        return null;
    }

    @Override // defpackage.ajbf
    public final ajfq e() {
        ajao ajaoVar = (ajao) this.a.get();
        if (ajaoVar != null) {
            return ajaoVar.g;
        }
        return null;
    }

    @Override // defpackage.ajbf
    public final ajfa g() {
        ajah ajahVar = (ajah) this.a.get();
        if (ajahVar != null) {
            return ajahVar.an();
        }
        return null;
    }
}
