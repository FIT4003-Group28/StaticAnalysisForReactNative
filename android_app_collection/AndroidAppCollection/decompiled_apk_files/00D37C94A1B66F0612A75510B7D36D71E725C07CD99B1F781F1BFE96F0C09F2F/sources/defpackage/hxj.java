package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: hxj  reason: default package */
/* loaded from: classes3.dex */
public final class hxj extends hxk {
    public final ReelWatchActivity a;
    public final iak b;
    public final azqb c;
    public final ifk d;
    public final fqd e;
    public final yiv f;
    public final hyu g;
    public final ypf h;
    public final yvs i;
    public final aacz j;
    private final hqp l;

    public hxj(ReelWatchActivity reelWatchActivity, hqp hqpVar, iak iakVar, azqb azqbVar, ifk ifkVar, aacz aaczVar, fqd fqdVar, yiv yivVar, hyu hyuVar, ypf ypfVar, yvs yvsVar, byte[] bArr, byte[] bArr2) {
        this.a = reelWatchActivity;
        this.l = hqpVar;
        this.b = iakVar;
        this.c = azqbVar;
        this.d = ifkVar;
        this.j = aaczVar;
        this.e = fqdVar;
        this.f = yivVar;
        this.g = hyuVar;
        this.h = ypfVar;
        this.i = yvsVar;
    }

    public static Optional a(Intent intent) {
        return Optional.ofNullable(intent).map(glk.k);
    }

    public final void b() {
        final Intent intent = this.a.getIntent();
        azqb azqbVar = this.c;
        String str = azqbVar == null ? " !reelBackstack;" : "";
        if (azqbVar != null) {
            if (intent == null) {
                str = str.concat(" !intent;");
            } else {
                apzg b = ((gtm) azqbVar.get()).b();
                if (b != null && b.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    return;
                }
                Optional map = a(intent).map(glk.l);
                map.ifPresent(new Consumer() { // from class: hxi
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        hxj hxjVar = hxj.this;
                        Intent intent2 = intent;
                        ((gtm) hxjVar.c.get()).e((apzg) obj, intent2.getExtras());
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return consumer.getClass();
                    }
                });
                if (!map.isPresent()) {
                    str = str.concat(" !command;");
                }
            }
        }
        if (!amps.e(str)) {
            if (this.l != null) {
                String valueOf = String.valueOf(str);
                hqp.C(2, valueOf.length() != 0 ? "ReelWatchActivity.replaceFragment failed:".concat(valueOf) : new String("ReelWatchActivity.replaceFragment failed:"));
            }
            this.a.finish();
        }
    }
}
