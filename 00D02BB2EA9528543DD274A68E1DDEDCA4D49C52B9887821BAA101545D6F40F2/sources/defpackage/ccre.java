package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccre  reason: default package */
/* loaded from: classes4.dex */
final class ccre<T> implements degu<T> {
    public final deig<T> a = deig.d();
    private final Executor b;
    private final cctt c;
    private final dbty<dehn<T>> d;

    public ccre(Executor executor, cctt ccttVar, dbty<dehn<T>> dbtyVar) {
        this.b = executor;
        this.c = ccttVar;
        this.d = dbtyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            this.a.cancel(false);
        } else if (th instanceof InterruptedException) {
            this.a.k(th);
        } else {
            bttq bttqVar = th instanceof ccss ? ((ccss) th).a : bttq.HTTP_SERVER_ERROR;
            cctt ccttVar = this.c;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ccrd
                private final ccre a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c();
                }
            };
            if (bttq.NO_CONNECTIVITY.equals(bttqVar)) {
                ccttVar.a(R.string.OFFERING_WRITE_REQUEST_ERROR_NO_CONNECTION, onClickListener);
            } else {
                ccttVar.a(R.string.OFFERING_WRITE_REQUEST_ERROR_SERVER_ERROR, onClickListener);
            }
        }
    }

    @Override // defpackage.degu
    public final void b(T t) {
        this.a.j(t);
    }

    public final void c() {
        deha.q(this.d.a(), this, this.b);
    }
}
