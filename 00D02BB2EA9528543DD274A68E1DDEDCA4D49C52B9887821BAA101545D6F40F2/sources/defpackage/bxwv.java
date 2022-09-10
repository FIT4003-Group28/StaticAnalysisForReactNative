package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxwv  reason: default package */
/* loaded from: classes4.dex */
public class bxwv implements bxwr {
    private final Context a;
    private final eeu b;
    private final dzsj<avik> c;
    private final Executor d;
    private List<jbf> e = dcdc.e();

    public bxwv(Context context, eeu eeuVar, dzsj<avik> dzsjVar, Executor executor) {
        this.a = context;
        this.b = eeuVar;
        this.c = dzsjVar;
        this.d = executor;
    }

    @Override // defpackage.bxwr
    public List<jbf> a() {
        return this.e.size() > 3 ? this.e.subList(0, 3) : this.e;
    }

    @Override // defpackage.bxwr
    public CharSequence b() {
        return this.a.getString(R.string.OFFLINE_MAPS_TITLE);
    }

    @Override // defpackage.bxwr
    public CharSequence c() {
        return this.a.getString(R.string.OFFLINE_MAPS_CARD_BUTTON);
    }

    @Override // defpackage.bxwr
    public cqkl d() {
        if (!((efh) this.b).b) {
            return cqkl.a;
        }
        this.c.a().j();
        return cqkl.a;
    }

    public boolean e() {
        return this.e.isEmpty();
    }

    public void f(List<jbf> list) {
        this.e = list;
        this.d.execute(new Runnable(this) { // from class: bxwu
            private final bxwv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
    }
}
