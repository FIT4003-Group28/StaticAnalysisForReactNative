package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cksi  reason: default package */
/* loaded from: classes4.dex */
public final class cksi {
    public final crfk a;
    public final Locale b;
    public final int c;
    public final cksh d;
    public final String e;

    public cksi(cksg cksgVar) {
        crfk crfkVar = cksgVar.a;
        dbsk.s(crfkVar);
        this.a = crfkVar;
        Locale locale = cksgVar.b;
        dbsk.s(locale);
        this.b = locale;
        cksh ckshVar = cksgVar.c;
        dbsk.s(ckshVar);
        this.d = ckshVar;
        this.c = cksgVar.e;
        this.e = cksgVar.d;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("structuredSpokenText", this.a);
        b.b("locale", this.b);
        b.f("epoch", this.c);
        b.b("synthesisMode", this.d);
        b.b("voiceName", this.e);
        b.c();
        return b.toString();
    }
}
