package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwsn  reason: default package */
/* loaded from: classes5.dex */
public final class cwsn implements Factory<SharedPreferences> {
    private final dzsj<Context> a;
    private final dzsj<dbsg<dbty<SharedPreferences>>> b;

    public cwsn(dzsj<Context> dzsjVar, dzsj<dbsg<dbty<SharedPreferences>>> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        final Context context = (Context) ((dxjd) this.a).a;
        SharedPreferences sharedPreferences = (SharedPreferences) ((dbty) ((dbsg) ((dxjd) this.b).a).c(new dbty(context) { // from class: cwrv
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getSharedPreferences("primes", 0);
            }
        })).a();
        dxjg.f(sharedPreferences);
        return sharedPreferences;
    }
}
