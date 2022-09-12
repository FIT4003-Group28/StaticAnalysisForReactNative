package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: dcn  reason: default package */
/* loaded from: classes5.dex */
public final class dcn {
    public final dxio<cvin> a;
    private final Executor b;
    private final Object c = new Object();
    private final Map<String, dehn<dck>> d = new HashMap();

    public dcn(dxio<cvin> dxioVar, Executor executor) {
        this.a = dxioVar;
        this.b = executor;
    }

    public final dehn<dck> a(final String str, final File file, final String str2) {
        final deig d = deig.d();
        synchronized (this.c) {
            dehn<dck> dehnVar = this.d.get(str);
            if (dehnVar != null) {
                return dehnVar;
            }
            this.d.put(str, d);
            try {
                this.b.execute(new Runnable(this, str, file, str2, d) { // from class: dcl
                    private final dcn a;
                    private final String b;
                    private final File c;
                    private final String d;
                    private final deig e;

                    {
                        this.a = this;
                        this.b = str;
                        this.c = file;
                        this.d = str2;
                        this.e = d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dcn dcnVar = this.a;
                        String str3 = this.b;
                        File file2 = this.c;
                        String str4 = this.d;
                        cvie a = dcnVar.a.a().a(str3, file2, String.valueOf(str4).concat(".tmp"), new dcm(dcnVar, str3, str4, this.e));
                        a.f(cvid.WIFI_OR_CELLULAR);
                        a.d();
                    }
                });
            } catch (RejectedExecutionException unused) {
                b(str);
                d.j(dck.b(new File(file, str2)));
            }
            return d;
        }
    }

    public final void b(String str) {
        synchronized (this.c) {
            this.d.remove(str);
        }
    }
}
