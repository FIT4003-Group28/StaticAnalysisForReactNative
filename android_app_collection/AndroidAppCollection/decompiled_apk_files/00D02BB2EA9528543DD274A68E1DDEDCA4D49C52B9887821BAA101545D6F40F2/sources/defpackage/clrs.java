package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: clrs  reason: default package */
/* loaded from: classes5.dex */
public final class clrs {
    public final Handler a;
    public final clrt b;

    public clrs(Handler handler, clrt clrtVar) {
        this.a = clrtVar == null ? null : handler;
        this.b = clrtVar;
    }

    public final void a(final clte clteVar) {
        clteVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable(this, clteVar) { // from class: clro
                private final clrs a;
                private final clte b;

                {
                    this.a = this;
                    this.b = clteVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    clrs clrsVar = this.a;
                    clte clteVar2 = this.b;
                    clteVar2.a();
                    clrt clrtVar = clrsVar.b;
                    int i = cmny.a;
                    clrtVar.H(clteVar2);
                }
            });
        }
    }
}
