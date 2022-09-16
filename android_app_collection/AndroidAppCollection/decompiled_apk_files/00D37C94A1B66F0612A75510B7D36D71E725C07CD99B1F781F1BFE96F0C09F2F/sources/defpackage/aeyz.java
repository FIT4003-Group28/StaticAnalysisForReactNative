package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aeyz  reason: default package */
/* loaded from: classes.dex */
public class aeyz implements aeyq {
    public final Handler a;
    public final aeyq b;
    protected final Handler c;

    public aeyz(Handler handler, aeyq aeyqVar, Handler handler2) {
        this.a = handler;
        this.b = aeyqVar;
        this.c = handler2;
    }

    public final void a(final String str, final afip afipVar) {
        this.a.post(new Runnable() { // from class: aeyy
            @Override // java.lang.Runnable
            public final void run() {
                aeyz aeyzVar = aeyz.this;
                ((aexh) aeyzVar.b).b.i(str, afipVar);
            }
        });
    }
}
