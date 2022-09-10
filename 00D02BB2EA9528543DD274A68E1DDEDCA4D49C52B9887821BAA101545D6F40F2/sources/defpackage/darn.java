package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: darn  reason: default package */
/* loaded from: classes5.dex */
public class darn<T> extends daul {
    public final dark a;
    private final String b;
    private final String e;
    private final darx f;
    private final dasa g;
    private final Class<T> h;

    /* JADX INFO: Access modifiers changed from: protected */
    public darn(dark darkVar, String str, darx darxVar, Class<T> cls) {
        dasa dasaVar = new dasa();
        this.g = dasaVar;
        this.h = cls;
        this.a = darkVar;
        this.b = "POST";
        this.e = str;
        this.f = darxVar;
        String str2 = darkVar.d;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(str2.length() + 23);
            sb.append(str2);
            sb.append(" ");
            sb.append("Google-API-Java-Client");
            dasaVar.j(sb.toString());
        } else {
            dasaVar.j("Google-API-Java-Client");
        }
        dasaVar.h("X-Goog-Api-Client", String.format(darm.a.b, darm.a(darkVar.getClass().getSimpleName())));
    }

    public dark b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IOException c(dasf dasfVar) {
        throw null;
    }

    public final T e() {
        dbsk.a(true);
        dbsk.a(true);
        String str = this.b;
        dasd dasdVar = b().a;
        dark darkVar = this.a;
        String valueOf = String.valueOf(darkVar.b);
        String valueOf2 = String.valueOf(darkVar.c);
        dasc a = dasdVar.a(str, new darw(daso.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), this.e, this)), this.f);
        new dard().b(a);
        a.k = b().a();
        if (this.f == null && (this.b.equals("POST") || this.b.equals("PUT") || this.b.equals("PATCH"))) {
            a.d = new dart();
        }
        a.b.putAll(this.g);
        a.n = new darv();
        a.m = new darl(this, a.m, a);
        return (T) a.a().f(this.h);
    }

    public final void f(String str, Object obj) {
        super.a(str, obj);
    }
}
