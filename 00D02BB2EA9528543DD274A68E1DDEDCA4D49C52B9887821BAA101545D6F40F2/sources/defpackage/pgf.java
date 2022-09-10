package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import com.google.android.libraries.geller.portable.Geller;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: pgf  reason: default package */
/* loaded from: classes7.dex */
public final class pgf {
    private final Context a;
    private final dehp b;
    @dzsi
    private Geller c = null;

    static {
        NativeHelper.a();
    }

    public pgf(Application application, dehp dehpVar) {
        this.a = application;
        this.b = dehpVar;
    }

    public final synchronized Geller a() {
        if (this.c == null) {
            Context context = this.a;
            dehp dehpVar = this.b;
            cqzk cqzkVar = new cqzk(context, dehpVar, dehpVar);
            cqzkVar.e = false;
            cqzkVar.i = new cqzq();
            this.c = new Geller(cqzkVar);
        }
        return this.c;
    }

    public final dehn<Geller> b() {
        return this.b.c(new Callable(this) { // from class: pge
            private final pgf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
