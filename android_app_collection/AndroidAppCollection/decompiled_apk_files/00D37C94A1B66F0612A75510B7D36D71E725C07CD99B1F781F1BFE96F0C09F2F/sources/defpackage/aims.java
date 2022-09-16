package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aims  reason: default package */
/* loaded from: classes.dex */
public final class aims implements Runnable {
    private final aikk a;
    private final aypx b;
    private final /* synthetic */ int c;

    public aims(aikk aikkVar, aypx aypxVar) {
        this.a = aikkVar;
        this.b = aypxVar;
    }

    public aims(aikk aikkVar, aypx aypxVar, int i) {
        this.c = i;
        this.a = aikkVar;
        this.b = aypxVar;
    }

    private final void a() {
        if (!this.a.a) {
            Object obj = amon.a;
            Object obj2 = amon.a;
            try {
                obj = ampq.i((WatchNextResponseModel) this.a.get());
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                zep.d("Problem fetching WatchNext response", e);
                if (e instanceof CancellationException) {
                    return;
                }
                obj2 = ampq.j(e);
            }
            try {
                aypx aypxVar = this.b;
                if (aypxVar == null || this.a.a) {
                    return;
                }
                aypxVar.a(obj, obj2);
            } catch (Exception e2) {
                zep.d("Fail to apply completeContinuation in watchNextFutureListener", e2);
            }
        }
    }

    private final void b() {
        Object obj = amon.a;
        Object obj2 = amon.a;
        aikk aikkVar = this.a;
        if (!aikkVar.a) {
            try {
                obj = ampq.i((PlayerResponseModel) aikkVar.get());
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                zep.d("Problem fetching player response", e);
                if (e instanceof CancellationException) {
                    return;
                }
                obj2 = ampq.j(e);
            }
            try {
                aypx aypxVar = this.b;
                if (aypxVar == null || this.a.a) {
                    return;
                }
                aypxVar.a(obj, obj2);
            } catch (Exception e2) {
                zep.d("Fail to apply completeContinuation in PlaybackFutureListener", e2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ylr.c();
            a();
            return;
        }
        ylr.c();
        b();
    }
}
