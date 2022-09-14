package com.google.firebase.crashlytics.c.p;

import android.content.Context;
import c.e.a.a.e;
import c.e.a.a.f;
import c.e.a.a.i.r;
import c.e.a.b.g.i;
import com.google.firebase.crashlytics.c.h.q;
import com.google.firebase.crashlytics.c.j.v;
import com.google.firebase.crashlytics.c.j.x.h;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final h f9101b = new h();

    /* renamed from: c  reason: collision with root package name */
    private static final String f9102c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    private static final String f9103d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    private static final e<v, byte[]> f9104e = b.a();

    /* renamed from: a  reason: collision with root package name */
    private final f<v> f9105a;

    c(f<v> fVar, e<v, byte[]> eVar) {
        this.f9105a = fVar;
    }

    public static c a(Context context) {
        r.a(context);
        return new c(r.b().a(new com.google.android.datatransport.cct.a(f9102c, f9103d)).a("FIREBASE_CRASHLYTICS_REPORT", v.class, c.e.a.a.b.a("json"), f9104e), f9104e);
    }

    private static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(i iVar, q qVar, Exception exc) {
        if (exc != null) {
            iVar.b(exc);
        } else {
            iVar.b((i) qVar);
        }
    }

    public c.e.a.b.g.h<q> a(q qVar) {
        v a2 = qVar.a();
        i iVar = new i();
        this.f9105a.a(c.e.a.a.c.b(a2), a.a(iVar, qVar));
        return iVar.a();
    }
}
