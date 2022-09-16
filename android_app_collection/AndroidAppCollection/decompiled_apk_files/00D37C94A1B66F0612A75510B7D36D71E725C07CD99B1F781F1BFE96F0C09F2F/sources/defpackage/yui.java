package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;
/* compiled from: PG */
/* renamed from: yui  reason: default package */
/* loaded from: classes4.dex */
public final class yui extends NetworkQualityRttListener {
    public final azpa a;
    public final amqo b;
    private final azqb c;

    public yui(Executor executor, azqb azqbVar) {
        super(executor);
        this.a = azpa.as(atnw.EFFECTIVE_CONNECTION_TYPE_UNKNOWN);
        this.c = azqbVar;
        this.b = aqxo.i(new amqo() { // from class: yuh
            @Override // defpackage.amqo
            public final Object get() {
                return yui.this.a.n().I().l(250L, TimeUnit.MILLISECONDS).A();
            }
        });
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        atnw atnwVar;
        azpa azpaVar = this.a;
        int effectiveConnectionType = ((ExperimentalCronetEngine) this.c.get()).getEffectiveConnectionType();
        if (effectiveConnectionType == 1) {
            atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_OFFLINE;
        } else if (effectiveConnectionType == 2) {
            atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
        } else if (effectiveConnectionType == 3) {
            atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_2G;
        } else if (effectiveConnectionType == 4) {
            atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_3G;
        } else if (effectiveConnectionType == 5) {
            atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_4G;
        } else {
            atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        }
        azpaVar.c(atnwVar);
    }
}
