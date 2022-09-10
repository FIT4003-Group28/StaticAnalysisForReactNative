package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.directions.destinations.settings.Ue3Preference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: smx  reason: default package */
/* loaded from: classes7.dex */
public final class smx {
    final View.OnClickListener a;
    public final Context b;
    cjkr c;
    public WeakReference<smz> d = new WeakReference<>(null);

    public smx(Context context, final wdt wdtVar, final Executor executor) {
        this.b = context;
        this.a = new View.OnClickListener(this, wdtVar, executor) { // from class: smv
            private final smx a;
            private final wdt b;
            private final Executor c;

            {
                this.a = this;
                this.b = wdtVar;
                this.c = executor;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final smx smxVar = this.a;
                wdt wdtVar2 = this.b;
                Executor executor2 = this.c;
                wcw wcwVar = (wcw) wdtVar2;
                btlu j = wcwVar.d.j();
                if (j != null) {
                    dcpd<bvjk> it = rgt.a.values().iterator();
                    while (it.hasNext()) {
                        wcwVar.c.T(it.next(), j, true);
                    }
                }
                final wdh wdhVar = wcwVar.a;
                wdhVar.b.c(new Callable(wdhVar) { // from class: wdb
                    private final wdh a;

                    {
                        this.a = wdhVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        wdh wdhVar2 = this.a;
                        synchronized (wdhVar2.c) {
                            axwe axweVar = wdhVar2.c;
                            axweVar.d(axweVar.a());
                            wdhVar2.c.e();
                        }
                        return null;
                    }
                }).Pk(new Runnable(smxVar) { // from class: smw
                    private final smx a;

                    {
                        this.a = smxVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Ue3Preference ue3Preference;
                        smz smzVar = this.a.d.get();
                        if (smzVar == null || (ue3Preference = smzVar.ag) == null || smzVar.I) {
                            return;
                        }
                        ue3Preference.y(false);
                    }
                }, executor2);
            }
        };
    }
}
