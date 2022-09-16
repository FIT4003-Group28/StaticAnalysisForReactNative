package defpackage;

import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnf  reason: default package */
/* loaded from: classes3.dex */
final class gnf implements Runnable {
    final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    final Map b;
    final String c;
    final /* synthetic */ gng d;

    public gnf(gng gngVar, TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint, Map map, String str) {
        this.d = gngVar;
        this.a = timeDelayedEndpoint$CreateTimeDelayedEndpoint;
        this.b = map;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aafx.d(this.d.a, this.a.e, this.b);
        aafx.d(this.d.a, this.a.g, this.b);
        aafo aafoVar = this.d.a;
        apzg apzgVar = this.a.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, this.b);
        this.d.b.remove(this.c);
    }
}
