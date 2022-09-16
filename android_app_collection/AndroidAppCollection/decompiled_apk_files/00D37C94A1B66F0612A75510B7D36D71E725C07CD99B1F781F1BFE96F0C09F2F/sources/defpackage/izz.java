package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: izz  reason: default package */
/* loaded from: classes3.dex */
public final class izz {
    public static final String a = zep.a("MDX.AutonavController");
    public final fjk b;
    public final adoa c;
    public final adwt d;
    public adnt e;
    public boolean f = false;
    public adwj g;
    final ixv h;
    public final adwm i;
    private final RecyclerView j;

    public izz(adoa adoaVar, RecyclerView recyclerView, oeq oeqVar, adwt adwtVar) {
        this.c = adoaVar;
        this.j = recyclerView;
        fjk fjkVar = oeqVar.c;
        fjkVar.getClass();
        this.b = fjkVar;
        this.h = new ixv(new izx(this));
        this.d = adwtVar;
        this.i = new izy(this);
        this.g = adwtVar.i;
    }

    public final void b() {
        a();
        PlayerResponseModel playerResponseModel = this.g.k.a;
        if (playerResponseModel == null || amps.e(playerResponseModel.B())) {
            this.h.c(false);
            return;
        }
        this.h.d(playerResponseModel, new izv(this, playerResponseModel));
        this.h.c(true);
        Optional.ofNullable((LinearLayoutManager) this.j.n).ifPresent(new Consumer() { // from class: izw
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((LinearLayoutManager) obj).aa(izz.this.b.c.a() - 1, 0);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    public final void a() {
        int i = this.g.k.b;
        if (this.f) {
            boolean z = true;
            if (i != 1) {
                this.h.b(true);
                if (i != 2) {
                    z = false;
                }
                this.h.a(z);
                if (z) {
                    return;
                }
                this.h.c(false);
                return;
            }
        }
        this.h.b(false);
    }
}
