package defpackage;

import android.content.Intent;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: afhs  reason: default package */
/* loaded from: classes.dex */
public abstract class afhs<T> extends afhx {
    @dzsi
    protected deig<T> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public afhs(Intent intent, @dzsi String str, afid afidVar) {
        super(intent, str, afidVar);
    }

    @Override // defpackage.afhx
    public void a() {
        bvrj.UI_THREAD.c();
        dehn<T> h = h();
        h.Pk(new afhr(this, h), dege.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(ExecutionException executionException);

    public final synchronized dehn<T> h() {
        if (this.a == null) {
            deig<T> d = deig.d();
            this.a = d;
            i(d);
        }
        return this.a;
    }

    protected abstract void i(deig<T> deigVar);
}
