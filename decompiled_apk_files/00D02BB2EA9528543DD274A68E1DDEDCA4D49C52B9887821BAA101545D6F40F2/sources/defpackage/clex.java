package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: clex  reason: default package */
/* loaded from: classes5.dex */
public final class clex {
    private static volatile cley b;
    public final clgk a;

    public clex(clgk clgkVar, final clgo clgoVar) {
        this.a = clgkVar;
        clgoVar.a.execute(new Runnable(clgoVar) { // from class: clgm
            private final clgo a;

            {
                this.a = clgoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final clgo clgoVar2 = this.a;
                clgoVar2.d.k(new clie(clgoVar2) { // from class: clgn
                    private final clgo a;

                    {
                        this.a = clgoVar2;
                    }

                    @Override // defpackage.clie
                    public final Object a() {
                        clgo clgoVar3 = this.a;
                        for (clew clewVar : clgoVar3.b.g()) {
                            clgoVar3.c.a(clewVar, 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static void a(Context context) {
        if (b == null) {
            synchronized (clex.class) {
                if (b == null) {
                    cleo cleoVar = new cleo();
                    dxjg.b(context);
                    cleoVar.a = context;
                    dxjg.a(cleoVar.a, Context.class);
                    b = new clep(cleoVar.a);
                }
            }
        }
    }

    public static clex b() {
        cley cleyVar = b;
        if (cleyVar == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return ((clep) cleyVar).a.a();
    }
}
