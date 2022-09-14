package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afjm  reason: default package */
/* loaded from: classes.dex */
public final class afjm extends afhx {
    private final Uri c;
    private final bvjj d;
    private final dxio<btao> e;
    private static final dcep<String> b = dcep.C("force_disable_hats_surveys_for_testing", "primes_local_storage");
    public static final dbsl<afga> a = afjl.a;

    public afjm(Intent intent, @dzsi String str, bvjj bvjjVar, dxio<btao> dxioVar) {
        super(intent, str, afid.GMM_SETTINGS);
        this.d = bvjjVar;
        this.c = afhg.b(intent);
        this.e = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        if (b.contains(this.c.getQueryParameter("key"))) {
            bvjk bvjkVar = new bvjk(this.c.getQueryParameter("key"), bvjk.b);
            String queryParameter = this.c.getQueryParameter("type");
            if (queryParameter == null) {
                queryParameter = "s";
            }
            if (this.c.getQueryParameterNames().contains("value")) {
                String queryParameter2 = this.c.getQueryParameter("value");
                if ("s".equals(queryParameter)) {
                    this.d.ac(bvjkVar, queryParameter2);
                } else if (!"b".equals(queryParameter)) {
                    return;
                } else {
                    this.d.S(bvjkVar, Boolean.parseBoolean(queryParameter2));
                }
            }
            String str = null;
            if ("s".equals(queryParameter)) {
                str = this.d.z(bvjkVar, null);
            } else if ("b".equals(queryParameter) && this.d.d.contains(bvjkVar.toString())) {
                str = String.valueOf(this.d.m(bvjkVar, false));
            }
            String valueOf = String.valueOf(bvjkVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(str);
            sb.toString();
            if (!this.c.getQueryParameterNames().contains("restart")) {
                return;
            }
            this.e.a();
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_GMM_SETTINGS;
    }
}
