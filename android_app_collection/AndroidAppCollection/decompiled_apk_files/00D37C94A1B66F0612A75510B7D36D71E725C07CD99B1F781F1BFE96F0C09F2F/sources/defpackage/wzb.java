package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: wzb  reason: default package */
/* loaded from: classes4.dex */
public final class wzb {
    private final String a;
    private final snc b;
    private final wxb c;

    public wzb(wkn wknVar, snc sncVar, wxb wxbVar) {
        this.a = wknVar.e;
        this.b = sncVar;
        this.c = wxbVar;
        wxbVar.a();
    }

    public final wzd a() {
        return new wzd(this.a, new Random(this.b.c()), this.c);
    }
}
