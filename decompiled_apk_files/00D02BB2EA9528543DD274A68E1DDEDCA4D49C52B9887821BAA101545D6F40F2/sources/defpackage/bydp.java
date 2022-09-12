package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bydp  reason: default package */
/* loaded from: classes4.dex */
public class bydp implements Serializable {
    private static final dcqe c = dcqe.c("bydp");
    public final byea a;
    @dzsi
    private transient List<String> d;
    @dzsi
    private transient Configuration f;
    public final List<byef> b = dchl.a();
    @dzsi
    private bvrt<dgfu> e = null;

    public bydp(byea byeaVar) {
        this.a = byeaVar;
    }

    private final boolean m(byef byefVar) {
        return byefVar.b == this.a;
    }

    public final void a(dgfu dgfuVar) {
        this.e = bvrt.b(dgfuVar);
    }

    @dzsi
    public final String b() {
        dgfu dgfuVar = (dgfu) bvrt.f(this.e, (dssr) dgfu.c.cu(7), dgfu.c);
        if (dgfuVar != null) {
            return dgfuVar.a;
        }
        return null;
    }

    public final boolean c() {
        int a;
        dgfu dgfuVar = (dgfu) bvrt.f(this.e, (dssr) dgfu.c.cu(7), dgfu.c);
        return (dgfuVar == null || (a = dgfw.a(dgfuVar.b)) == 0 || a != 2) ? false : true;
    }

    public final boolean d() {
        return !dbsj.d(b());
    }

    public final boolean e() {
        return d() && (c() || !f());
    }

    public final boolean f() {
        return this.b.isEmpty();
    }

    public final String g(Context context) {
        return context.getString(this.a.j);
    }

    @dzsi
    public final byef h(Calendar calendar) {
        for (byef byefVar : this.b) {
            if (byefVar.h(calendar)) {
                return byefVar;
            }
        }
        return null;
    }

    @dzsi
    public final byef i() {
        byef byefVar = null;
        for (byef byefVar2 : this.b) {
            if (byefVar2.b.equals(this.a) && (byefVar == null || j(byefVar2, byefVar) < 0)) {
                byefVar = byefVar2;
            }
        }
        return byefVar;
    }

    public final void k(byef byefVar) {
        byea byeaVar = this.a;
        if (byeaVar == byefVar.b || (byeaVar == byefVar.c && !byefVar.m())) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).compareTo(byefVar) == 0) {
                    return;
                }
            }
            this.b.add(byefVar);
            this.f = null;
            this.d = null;
            return;
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(byefVar.b);
        String valueOf3 = String.valueOf(byefVar.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 79 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Tried to create a time interval with a mismatched day.  Expected ");
        sb.append(valueOf);
        sb.append(" but got ");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.toString();
        bvoo.k(new IllegalArgumentException());
    }

    public final String l(Context context) {
        List f;
        dbrz e = dbrz.e("\n");
        if (dbsd.a(context.getResources().getConfiguration(), this.f)) {
            f = this.d;
            dbsk.s(f);
        } else {
            this.f = context.getResources().getConfiguration();
            if (!f()) {
                for (byef byefVar : this.b) {
                    if (m(byefVar)) {
                        List f2 = dchl.f(this.b.size());
                        Collections.sort(this.b);
                        for (byef byefVar2 : this.b) {
                            if (byefVar2.f()) {
                                f2.add(context.getString(R.string.OPEN_24_HOURS));
                            } else if (m(byefVar2)) {
                                dbsk.s(context);
                                f2.add(bvtb.o(context, TimeUnit.MILLISECONDS.toSeconds(byefVar2.e.getTimeInMillis()), byefVar2.d, TimeUnit.MILLISECONDS.toSeconds(byefVar2.f.getTimeInMillis()), byefVar2.d));
                            }
                        }
                        this.d = f2;
                        f = f2;
                    }
                }
            }
            f = dcdc.f(context.getString(R.string.CLOSED, context.getString(this.a.j)));
            this.d = f;
        }
        return new String(e.g(f));
    }

    public static int j(byef byefVar, byef byefVar2) {
        byea byeaVar = byefVar.b;
        if (byeaVar != byefVar2.b || byefVar.c != byefVar2.c) {
            if (byeaVar.c() == byefVar2.b || byefVar.c.c() == byefVar2.c) {
                return -1;
            }
            if (byefVar.b == byefVar2.b.c() || byefVar.c == byefVar2.c.c()) {
                return 1;
            }
            bvoo.h("invalid TimeInterval comparison: [%s - %s] vs [%s - %s]", byefVar.b, byefVar.c, byefVar2.b, byefVar2.c);
            return 0;
        } else if (byefVar.e.compareTo(byefVar2.e) == 0) {
            return byefVar.f.compareTo(byefVar2.f);
        } else {
            return byefVar.e.compareTo(byefVar2.e);
        }
    }
}
