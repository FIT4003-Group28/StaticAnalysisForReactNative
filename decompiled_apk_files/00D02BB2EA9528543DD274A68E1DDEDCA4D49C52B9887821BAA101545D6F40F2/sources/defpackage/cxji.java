package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxji  reason: default package */
/* loaded from: classes.dex */
public final class cxji {
    public static volatile boolean a = false;
    private static cxji d = null;
    private static volatile boolean e = false;
    public final Context b;
    private final dbty<dehq> g;
    private final dbty<cxkb> h;
    private static final Object c = new Object();
    private static final dbty<dehq> f = dbud.a(cxjh.a);

    public cxji(final Context context) {
        this(context, f, dbud.a(new dbty(context) { // from class: cxje
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new cxkf(coxs.a(this.a));
            }
        }));
    }

    public static void a(final Context context) {
        dbty<dehq> dbtyVar = f;
        dbty a2 = dbud.a(new dbty(context) { // from class: cxjf
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new cxkf(coxs.a(this.a));
            }
        });
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        synchronized (c) {
            if (d != null) {
                throw new IllegalStateException("Cannot call PhenotypeContext#setContext twice");
            }
            if (e) {
                throw new IllegalStateException("Cannot set setContext after a flag was already read");
            }
            d = new cxji(applicationContext, dbtyVar, a2);
        }
    }

    public static cxji b() {
        e = true;
        cxji cxjiVar = d;
        if (cxjiVar != null) {
            return cxjiVar;
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public final dehq c() {
        return this.g.a();
    }

    public final cxkb d() {
        return this.h.a();
    }

    public cxji(Context context, dbty<dehq> dbtyVar, dbty<cxkb> dbtyVar2) {
        Context applicationContext = context.getApplicationContext();
        dbsk.s(applicationContext);
        dbsk.s(dbtyVar);
        dbsk.s(dbtyVar2);
        this.b = applicationContext;
        this.g = dbud.a(dbtyVar);
        this.h = dbud.a(dbtyVar2);
    }
}
