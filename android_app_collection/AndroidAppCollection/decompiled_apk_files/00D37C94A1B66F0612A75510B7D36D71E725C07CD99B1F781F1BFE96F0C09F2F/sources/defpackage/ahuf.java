package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahuf  reason: default package */
/* loaded from: classes.dex */
public final class ahuf implements ajep {
    final /* synthetic */ ahhw a;
    final /* synthetic */ ahug b;

    public ahuf(ahug ahugVar, ahhw ahhwVar) {
        this.b = ahugVar;
        this.a = ahhwVar;
    }

    @Override // defpackage.ajep
    public final void a() {
    }

    @Override // defpackage.ajep
    public final void b(final ajey ajeyVar) {
        Executor executor = this.b.a;
        final ahhw ahhwVar = this.a;
        executor.execute(new Runnable() { // from class: ahue
            @Override // java.lang.Runnable
            public final void run() {
                ahuf ahufVar = ahuf.this;
                ahhw ahhwVar2 = ahhwVar;
                ajey ajeyVar2 = ajeyVar;
                ahug ahugVar = ahufVar.b;
                ajfq e = ahhwVar2.d().e();
                PlayerResponseModel b = ahhwVar2.b();
                aopu<askq> aopuVar = b.a.F;
                long millis = TimeUnit.SECONDS.toMillis(b.a());
                long j = b.c.e;
                boolean z = false;
                boolean z2 = false;
                for (askq askqVar : aopuVar) {
                    if (askqVar.d.size() != 0) {
                        if (!z && ahug.b(askqVar)) {
                            e.C(0L, 0L, null, ahugVar.c(e, askqVar, j));
                            z = true;
                        } else if (millis > 0 && !z2 && askqVar != null && (askqVar.b & 1) != 0) {
                            askr askrVar = askqVar.c;
                            if (askrVar == null) {
                                askrVar = askr.a;
                            }
                            int C = akzj.C(askrVar.b);
                            if (C != 0 && C == 3) {
                                e.C(millis, millis, null, ahugVar.c(e, askqVar, j));
                                z2 = true;
                            }
                        }
                    }
                }
                ajeyVar2.a();
            }
        });
    }
}
