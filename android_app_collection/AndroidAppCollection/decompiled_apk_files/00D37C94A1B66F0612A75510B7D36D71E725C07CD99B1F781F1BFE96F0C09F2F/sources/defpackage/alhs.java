package defpackage;

import android.content.Context;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: alhs  reason: default package */
/* loaded from: classes.dex */
public final class alhs {
    public final Context a;
    private final ExecutorService b;
    private final yrr c;
    private final asfs d;
    private awyv e;

    public alhs(ExecutorService executorService, yrr yrrVar, Context context, asfs asfsVar) {
        this.b = executorService;
        this.c = yrrVar;
        this.a = context;
        this.d = asfsVar;
    }

    public final awyv a() {
        if (this.e == null) {
            final URL url = new URL(this.d.d);
            CronetEngine a = this.c.a(new yjd() { // from class: alhq
                @Override // defpackage.yjd
                public final Object a(Object obj, Object obj2) {
                    alhs alhsVar = alhs.this;
                    URL url2 = url;
                    alhr alhrVar = new alhr(alhsVar);
                    ExperimentalCronetEngine.Builder builder = (ExperimentalCronetEngine.Builder) obj;
                    builder.mo560setLibraryLoader((CronetEngine.Builder.LibraryLoader) alhrVar);
                    builder.mo558enableQuic(true);
                    builder.mo555enableHttp2(false);
                    builder.mo559enableSdch(false);
                    if (url2.getDefaultPort() != -1) {
                        builder.mo553addQuicHint(url2.getHost(), url2.getDefaultPort(), url2.getDefaultPort());
                    }
                    builder.setExperimentalOptions("{\"QUIC\": {\"connection_options\": \"IFWa,AKD3\"}}");
                    try {
                        return ((ExperimentalCronetEngine.Builder) obj).mo554build();
                    } catch (Throwable th) {
                        String valueOf = String.valueOf(obj2);
                        zep.d(valueOf.length() != 0 ? "Failed to construct CronetEngine using ".concat(valueOf) : new String("Failed to construct CronetEngine using "), th);
                        return null;
                    }
                }
            });
            this.e = awwd.b(a != null ? new awyx(a, new zgi(1), this.b) : new awye());
        }
        return this.e;
    }
}
