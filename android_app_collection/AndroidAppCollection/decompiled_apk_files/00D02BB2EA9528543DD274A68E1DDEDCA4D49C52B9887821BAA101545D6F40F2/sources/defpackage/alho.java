package defpackage;
/* compiled from: PG */
/* renamed from: alho  reason: default package */
/* loaded from: classes.dex */
public final class alho {
    public final alaq a;
    @dzsi
    @Deprecated
    public final cjtd b;
    @dzsi
    public final akra c;

    public alho(alaq alaqVar, @dzsi cjtd cjtdVar) {
        this(alaqVar, cjtdVar, null);
    }

    public alho(alaq alaqVar, @dzsi cjtd cjtdVar, @dzsi akra akraVar) {
        this.a = alaqVar;
        this.b = cjtdVar;
        this.c = akraVar;
    }

    public alho(alaq alaqVar) {
        if (!dbsj.d("") || !dbsj.d("")) {
            cjta b = cjtd.b();
            b.b = "";
            b.g("");
            this.b = b.a();
        } else {
            this.b = null;
        }
        this.a = alaqVar;
        this.c = null;
    }
}
