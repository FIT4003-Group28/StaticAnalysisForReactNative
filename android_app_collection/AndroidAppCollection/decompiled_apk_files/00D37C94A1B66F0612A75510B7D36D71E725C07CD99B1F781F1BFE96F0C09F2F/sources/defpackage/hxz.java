package defpackage;

import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import j$.util.function.Consumer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxz  reason: default package */
/* loaded from: classes3.dex */
public final class hxz implements aafl {
    public static final /* synthetic */ int a = 0;
    private final ibm b;
    private final /* synthetic */ int c;

    public hxz(ibm ibmVar) {
        this.b = ibmVar;
    }

    public hxz(ibm ibmVar, int i) {
        this.c = i;
        this.b = ibmVar;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        if (this.c == 0) {
            this.b.a().ifPresent(fyb.g);
        } else {
            this.b.a().ifPresent(new Consumer() { // from class: hxx
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    apzg apzgVar2 = apzg.this;
                    int i = hxz.a;
                    ((ibn) obj).q(((FlagVideoEndpointOuterClass$FlagVideoEndpoint) apzgVar2.qm(FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint)).b);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
        }
    }
}
