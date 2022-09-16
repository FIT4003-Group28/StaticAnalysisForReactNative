package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agpe  reason: default package */
/* loaded from: classes.dex */
public final class agpe implements ajox, ynl {
    public final aahf a;
    public final afvn b;
    public final yni c;
    private final Executor e;
    private final aahn f;
    private final boolean h;
    private final boolean i;
    private final aomw j;
    private final amfg k;
    private Boolean g = null;
    final Map d = new HashMap();

    public agpe(aahf aahfVar, afvn afvnVar, yni yniVar, Executor executor, aahn aahnVar, amfg amfgVar, boolean z, boolean z2, aomw aomwVar, byte[] bArr) {
        this.a = aahfVar;
        this.b = afvnVar;
        this.c = yniVar;
        this.e = executor;
        this.f = aahnVar;
        this.k = amfgVar;
        this.h = z;
        this.i = z2;
        this.j = aomwVar;
    }

    private final String g(String str) {
        String str2;
        asvd asvdVar;
        synchronized (this) {
            str2 = (String) this.d.get(str);
        }
        if (str2 != null || d()) {
            return str2;
        }
        aahe a = this.a.a(this.b.c());
        aahn aahnVar = this.f;
        ArrayList arrayList = new ArrayList();
        aahp.d(agni.a, 1, str, aahnVar, arrayList);
        List list = (List) a.e(aahp.b(aahnVar, arrayList)).U();
        if (list.isEmpty() || (asvdVar = (asvd) a.f((String) list.get(0)).g(asvd.class).W()) == null || (asvdVar.b.b & 4) == 0) {
            return null;
        }
        String localImageUrl = asvdVar.getLocalImageUrl();
        synchronized (this) {
            this.d.put(str, localImageUrl);
        }
        return localImageUrl;
    }

    @Override // defpackage.ajox
    public final String a(String str) {
        if (this.b.c().z()) {
            return null;
        }
        String g = g(str);
        try {
            if (this.i && g == null) {
                Uri parse = Uri.parse(str);
                if (this.j.i(parse)) {
                    String uri = this.j.j(new aonc(), parse).toString();
                    if (!str.equals(uri) && (g = g(uri)) != null) {
                        synchronized (this) {
                            this.d.put(str, g);
                        }
                    }
                }
            }
        } catch (tiu e) {
            zep.d("Failed to remove FIFE options during offline lookup!", e);
        }
        return g;
    }

    public final void b() {
        if (c()) {
            final afvm c = this.b.c();
            this.e.execute(new Runnable() { // from class: agpd
                @Override // java.lang.Runnable
                public final void run() {
                    agpe agpeVar = agpe.this;
                    afvm afvmVar = c;
                    if (!agpeVar.d() || !agpeVar.c()) {
                        return;
                    }
                    afvm c2 = agpeVar.b.c();
                    if (!c2.equals(afvmVar)) {
                        return;
                    }
                    aahe a = agpeVar.a.a(c2);
                    HashMap hashMap = new HashMap();
                    for (String str : (List) a.j(197).U()) {
                        asvd asvdVar = (asvd) a.f(str).g(asvd.class).W();
                        if (asvdVar != null && !asvdVar.getLocalImageUrl().isEmpty()) {
                            hashMap.put(asvdVar.getRemoteImageUrl(), asvdVar.getLocalImageUrl());
                        }
                    }
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    synchronized (agpeVar) {
                        if (agpeVar.b.c().equals(afvmVar)) {
                            agpeVar.d.clear();
                            agpeVar.d.putAll(hashMap);
                        }
                    }
                }
            });
        }
    }

    public final boolean c() {
        return !this.b.c().z();
    }

    public final boolean d() {
        boolean z = false;
        if (!this.h) {
            return false;
        }
        if (this.g == null) {
            if (this.k.b() != 2) {
                z = true;
            }
            this.g = Boolean.valueOf(z);
        }
        return this.g.booleanValue();
    }

    public final synchronized void e() {
        this.d.clear();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                b();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                e();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
