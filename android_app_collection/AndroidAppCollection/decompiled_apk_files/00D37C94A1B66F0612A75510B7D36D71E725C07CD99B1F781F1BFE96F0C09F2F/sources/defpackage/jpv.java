package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jpv  reason: default package */
/* loaded from: classes3.dex */
public final class jpv {
    private final Context a;
    private final aafo b;
    private final acti c;
    private final ahcz d;
    private final yrj e;
    private final ajgz f;

    public jpv(Context context, aafo aafoVar, acti actiVar, ahcz ahczVar, yrj yrjVar, ajgz ajgzVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = actiVar;
        this.d = ahczVar;
        this.e = yrjVar;
        this.f = ajgzVar;
    }

    public final void a(ampq ampqVar, Long l, ahda ahdaVar) {
        if (!ampqVar.h() || !(ampqVar.c() instanceof aqft)) {
            if (this.e.o()) {
                this.d.f(ahdaVar);
                return;
            }
            long longValue = l.longValue();
            aopa createBuilder = aqft.a.createBuilder();
            arag g = ajgl.g(this.a.getString(R.string.offline_go_online_to_renew_dialog_title));
            createBuilder.copyOnWrite();
            aqft aqftVar = (aqft) createBuilder.instance;
            g.getClass();
            aqftVar.c = g;
            aqftVar.b |= 1;
            long max = Math.max(1L, TimeUnit.SECONDS.toDays(longValue));
            createBuilder.ab(ajgl.g(this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, (int) max, Long.valueOf(max))));
            arag g2 = ajgl.g(this.a.getString(R.string.ok));
            createBuilder.copyOnWrite();
            aqft aqftVar2 = (aqft) createBuilder.instance;
            g2.getClass();
            aqftVar2.p = g2;
            aqftVar2.b |= 2097152;
            ajgx.p(this.a, (aqft) createBuilder.mo39build(), this.b, this.c, this.f, null, null);
            return;
        }
        ajgx.m(this.a, (aqft) ampqVar.c(), this.b, this.c, this.f);
    }
}
