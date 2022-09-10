package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ctlg  reason: default package */
/* loaded from: classes5.dex */
public class ctlg<ValueT> extends cuss<ValueT> {
    public final Executor a;
    protected final ctlp b;
    protected final ctlf c;
    protected final ctir d;

    public ctlg(Context context, dbrn dbrnVar, ctir ctirVar, Uri uri, ctlp ctlpVar) {
        if (ctlpVar.h() != null) {
            dbsk.m(this instanceof ctlj, "filterPredicate isn't valid in parent monitor");
        }
        this.a = dehx.b(cstj.b().a);
        this.b = ctlpVar;
        this.d = ctirVar;
        this.c = new ctlf(this, context, dbrnVar, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String e(int i, int i2) {
        String valueOf = i2 >= 0 ? String.valueOf(i2) : "2147483647";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(i);
        sb.append(", ");
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cuss
    public void a(ValueT valuet) {
        super.a(valuet);
    }

    @Override // defpackage.cuss
    protected final synchronized void b() {
        final ctlf ctlfVar = this.c;
        ctlfVar.getClass();
        m(new Runnable(ctlfVar) { // from class: ctla
            private final ctlf a;

            {
                this.a = ctlfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
    }

    @Override // defpackage.cuss
    protected final synchronized void c() {
        final ctlf ctlfVar = this.c;
        ctlfVar.getClass();
        m(new Runnable(ctlfVar) { // from class: ctlb
            private final ctlf a;

            {
                this.a = ctlfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ValueT d() {
        cstq.a();
        return (ValueT) ctiv.b(this.d, new Callable(this) { // from class: ctlc
            private final ctlg a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctlg ctlgVar = this.a;
                ctir ctirVar = ctlgVar.d;
                ctlf ctlfVar = ctlgVar.c;
                Cursor a = ctirVar.a(ctlfVar.j, ctlfVar.k, ctlfVar.l, ctlfVar.m, ctlfVar.n, ctlfVar.o);
                try {
                    Object a2 = ctlgVar.c.a.a(a);
                    if (a != null) {
                        a.close();
                    }
                    return a2;
                } catch (Throwable th) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        });
    }
}
