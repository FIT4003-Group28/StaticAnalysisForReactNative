package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqei  reason: default package */
/* loaded from: classes5.dex */
public final class cqei {
    final /* synthetic */ Context a;
    final /* synthetic */ cqen b;

    public cqei(cqen cqenVar, Context context) {
        this.b = cqenVar;
        this.a = context;
    }

    public final void a() {
        cqem cqemVar = new cqem();
        final Context context = this.a;
        cqemVar.execute(new Runnable(this, context) { // from class: cqeh
            private final cqei a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqei cqeiVar = this.a;
                Context context2 = this.b;
                Toast.makeText(context2, context2.getResources().getString(R.string.retryable_error_message), 0).show();
                cqeiVar.b.j.b(14);
                cqeiVar.b.c(cqek.WAITING_FOR_USER_DECISION);
            }
        });
    }
}
