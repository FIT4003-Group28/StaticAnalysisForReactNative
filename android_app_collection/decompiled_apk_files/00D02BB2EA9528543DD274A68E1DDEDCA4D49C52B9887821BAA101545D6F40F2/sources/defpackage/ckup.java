package defpackage;

import android.content.Context;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: ckup  reason: default package */
/* loaded from: classes4.dex */
public final class ckup {
    public static final Object a = new Object();
    @dzsi
    public static ckup b;
    public boolean c;
    @dzsi
    public bvqm d;
    private final bvrb e;

    public ckup(bvrb bvrbVar) {
        EnumSet.noneOf(ckuo.class);
        dbsk.s(bvrbVar);
        this.e = bvrbVar;
    }

    public final synchronized void a(Context context) {
        this.c = true;
        if (this.d != null) {
            return;
        }
        this.d = bvqm.a(context, bvrj.WEARABLE_DATA, this.e);
    }

    public final synchronized void b() {
        if (!this.c) {
            return;
        }
        this.c = false;
        this.e.b(new Runnable(this) { // from class: ckun
            private final ckup a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckup ckupVar = this.a;
                synchronized (ckupVar) {
                    if (ckupVar.c) {
                        return;
                    }
                    bvqm bvqmVar = ckupVar.d;
                    if (bvqmVar == null) {
                        return;
                    }
                    bvqmVar.quit();
                    ckupVar.d = null;
                }
            }
        }, bvrj.WEARABLE_DATA);
    }
}
