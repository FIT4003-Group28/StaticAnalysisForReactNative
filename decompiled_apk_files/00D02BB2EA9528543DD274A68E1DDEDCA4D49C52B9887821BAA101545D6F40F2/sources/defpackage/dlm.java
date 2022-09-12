package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dlm  reason: default package */
/* loaded from: classes6.dex */
public final class dlm {
    public final Application a;
    public final Executor b;
    public final dlj c;
    public final bubp d;
    public final bvtd e;

    public dlm(Application application, Executor executor, bubp bubpVar, dlj dljVar, bvtd bvtdVar) {
        this.a = application;
        this.b = executor;
        this.d = bubpVar;
        this.c = dljVar;
        this.e = bvtdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends dyhj<T>> dln a(dlk<T> dlkVar) {
        return new dln(this, dlkVar);
    }
}
