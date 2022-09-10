package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btf  reason: default package */
/* loaded from: classes.dex */
public final class btf<T> implements buj<T> {
    public bui<? super T> a;
    private final bte b;
    private final cac c;

    public btf(bte bteVar, cac cacVar) {
        this.b = bteVar;
        this.c = cacVar;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super T> buiVar) {
        btb btbVar;
        boolean z;
        this.a = buiVar;
        bte bteVar = this.b;
        cac cacVar = this.c;
        synchronized (bteVar) {
            btbVar = bteVar.d.get(cacVar);
            if (btbVar == null) {
                btbVar = bteVar.c.a(cacVar);
                bteVar.d.put(cacVar, btbVar);
                z = true;
            } else {
                z = false;
            }
            synchronized (btbVar.g) {
                btbVar.a.add(this);
            }
        }
        if (z) {
            btbVar.c = broVar;
            bti btiVar = bteVar.e;
            String b = cacVar.b();
            int intValue = bte.a.get(broVar).intValue();
            Map<String, String> c = cacVar.c();
            dcpd<String> it = amdu.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (b.contains(it.next())) {
                        break;
                    }
                } else {
                    bvoo.h("Found a non-Google domain url - [%s]", b);
                    break;
                }
            }
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) ((amdu) btiVar).c.mo29newUrlRequestBuilder(b, btbVar, dege.a).mo42allowDirectExecutor().mo46setPriority(intValue);
            if (ckqj.e(b)) {
                amdr amdrVar = new amdr();
                amdrVar.a = Boolean.valueOf(dbqa.e("gz0.googleusercontent.com", (CharSequence) dbsg.j(Uri.parse(b).getHost()).c("")));
                String str = amdrVar.a == null ? " zeroRated" : "";
                if (!str.isEmpty()) {
                    throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
                }
                builder.addRequestAnnotation(new amds(amdrVar.a.booleanValue()));
            }
            for (Map.Entry<String, String> entry : c.entrySet()) {
                String key = entry.getKey();
                if (!dbqa.e("Accept-Encoding", key) && !dbqa.e("User-Agent", key)) {
                    builder.mo41addHeader(entry.getKey(), entry.getValue());
                }
            }
            btbVar.d = builder.mo43build();
            btbVar.d.start();
            if (!btbVar.e) {
                return;
            }
            btbVar.d.cancel();
        }
    }

    @Override // defpackage.buj
    public final void b() {
    }

    @Override // defpackage.buj
    public final void c() {
        btb btbVar;
        UrlRequest urlRequest;
        bte bteVar = this.b;
        cac cacVar = this.c;
        synchronized (bteVar) {
            btbVar = bteVar.d.get(cacVar);
        }
        if (btbVar != null) {
            synchronized (btbVar.g) {
                btbVar.a.remove(this);
                if (btbVar.a.isEmpty()) {
                    btbVar.e = true;
                    btbVar.g.d.remove(btbVar.b);
                }
            }
            if (!btbVar.e || (urlRequest = btbVar.d) == null) {
                return;
            }
            urlRequest.cancel();
        }
    }

    @Override // defpackage.buj
    public final Class<T> d() {
        return InputStream.class;
    }

    @Override // defpackage.buj
    public final int e() {
        return 2;
    }
}
