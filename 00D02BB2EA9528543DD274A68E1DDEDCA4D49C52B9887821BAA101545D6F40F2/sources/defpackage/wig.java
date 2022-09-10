package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wig  reason: default package */
/* loaded from: classes7.dex */
public final class wig implements wgi {
    public final wdt a;
    public final Executor b;
    public final SavedTrip c;

    public wig(wdt wdtVar, Executor executor, SavedTrip savedTrip) {
        this.a = wdtVar;
        this.b = executor;
        this.c = savedTrip;
    }

    @Override // defpackage.wgi
    public final dehn<wgj> a() {
        return deew.h(this.a.c(), new dbrn(this) { // from class: wib
            private final wig a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final wig wigVar = this.a;
                return new wif(wigVar, dcbg.b((dcdc) obj).t(wic.a).p(new dbsl(wigVar) { // from class: wid
                    private final wig a;

                    {
                        this.a = wigVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        return this.a.c.a().equals(((SavedTrip) obj2).a());
                    }
                }));
            }
        }, dege.a);
    }
}
