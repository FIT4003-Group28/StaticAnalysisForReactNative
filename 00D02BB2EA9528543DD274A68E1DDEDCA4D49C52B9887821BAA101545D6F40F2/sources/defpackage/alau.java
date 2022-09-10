package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: alau  reason: default package */
/* loaded from: classes2.dex */
public class alau implements Serializable, alaq {
    @dzsi
    private final cjqm a;
    public final String q;
    public final akra r;

    public alau(String str, akra akraVar, @dzsi cjqm cjqmVar) {
        this.q = str;
        this.r = akraVar;
        this.a = cjqmVar;
    }

    @Override // defpackage.alaq
    public final dbsg<cjqm> g() {
        return dbsg.j(this.a);
    }

    @Override // defpackage.alaq
    public final akra l() {
        return this.r;
    }
}
