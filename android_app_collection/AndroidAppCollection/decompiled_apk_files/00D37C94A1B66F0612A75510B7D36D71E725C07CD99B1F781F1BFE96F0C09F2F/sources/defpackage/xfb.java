package defpackage;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xfb  reason: default package */
/* loaded from: classes4.dex */
public final class xfb implements xew, yiw {
    public final afvn a;
    public final Executor b;
    public final afzo c;
    public final xey d;
    public final aalj e;

    public xfb(afvn afvnVar, Executor executor, afzo afzoVar, xey xeyVar, aalj aaljVar) {
        afvnVar.getClass();
        this.a = afvnVar;
        executor.getClass();
        this.b = executor;
        afzoVar.getClass();
        this.c = afzoVar;
        xeyVar.getClass();
        this.d = xeyVar;
        this.e = aaljVar;
    }

    public static final Uri j(apae apaeVar) {
        try {
            return zgt.i(apaeVar.c);
        } catch (MalformedURLException unused) {
            zep.l(String.format("Badly formed uri in ABR path: %s", apaeVar.c));
            return null;
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((afya) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Ping failed ");
        sb.append(valueOf);
        zep.d(sb.toString(), exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        afya afyaVar = (afya) obj;
        Void r2 = (Void) obj2;
    }

    @Override // defpackage.xew
    public final void c(apae apaeVar, afzn... afznVarArr) {
        d(apaeVar, Collections.emptyList(), true, afznVarArr);
    }

    @Override // defpackage.xew
    public final void d(apae apaeVar, List list, boolean z, afzn... afznVarArr) {
        Uri j = j(apaeVar);
        if (j == null || Uri.EMPTY.equals(j)) {
            return;
        }
        Uri g = g(j, afznVarArr);
        i(g, apaeVar, h(g, list, z));
    }

    @Override // defpackage.xew
    public final boolean e(List list, afzn... afznVarArr) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((apae) it.next(), afznVarArr);
        }
        return true;
    }

    @Override // defpackage.xew
    public final void f(List list) {
        e(list, afzn.f);
    }

    public final Uri g(Uri uri, afzn... afznVarArr) {
        try {
            return this.c.a(uri, afznVarArr);
        } catch (zhy e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Failed to substitute URI macros ");
            sb.append(valueOf);
            zep.l(sb.toString());
            return null;
        }
    }

    public final void i(final Uri uri, final apae apaeVar, final afwt afwtVar) {
        this.b.execute(new Runnable() { // from class: xez
            @Override // java.lang.Runnable
            public final void run() {
                xfb xfbVar = xfb.this;
                Uri uri2 = uri;
                afwt afwtVar2 = afwtVar;
                apae apaeVar2 = apaeVar;
                String.valueOf(String.valueOf(uri2)).length();
                afwtVar2.a(new xex(apaeVar2.e));
                afwtVar2.d = apaeVar2.f;
                aalj aaljVar = xfbVar.e;
                if (aaljVar != null) {
                    afwtVar2.e = aaljVar.a();
                }
                xfbVar.d.a(afwtVar2, afzr.a);
            }
        });
    }

    public final afwt h(Uri uri, List list, boolean z) {
        byte[] bArr;
        if (!z) {
            try {
                StringBuilder sb = new StringBuilder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                    sb.append('=');
                    sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                    sb.append('&');
                }
                bArr = sb.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Failed to encode post body. ");
                sb2.append(valueOf);
                zep.b(sb2.toString());
                bArr = null;
            }
            return this.d.d(uri, bArr, this.a.c());
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return this.d.c(buildUpon.build(), this.a.c());
    }
}
