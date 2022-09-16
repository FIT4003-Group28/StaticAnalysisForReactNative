package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jej  reason: default package */
/* loaded from: classes3.dex */
public final class jej implements ynl {
    public final dt a;
    public final Resources b;
    public final akfg c;
    public final fcu d;

    public jej(dt dtVar, akfg akfgVar, fcu fcuVar) {
        this.a = dtVar;
        this.b = dtVar.getResources();
        this.c = akfgVar;
        this.d = fcuVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                final agog agogVar = (agog) obj;
                agqv agqvVar = agogVar.a;
                if (agqvVar == null || agqvVar.j == null) {
                    return null;
                }
                ylx.n(this.a, anii.h(this.d.a.a(), fcq.d, anjk.a), hmv.o, new zdt() { // from class: jei
                    @Override // defpackage.zdt
                    public final void a(Object obj2) {
                        jej jejVar = jej.this;
                        agog agogVar2 = agogVar;
                        if (!Boolean.TRUE.equals((Boolean) obj2)) {
                            int days = (int) TimeUnit.SECONDS.toDays(agogVar2.a.j.a());
                            akfh l = jejVar.c.l();
                            l.k(jejVar.b.getQuantityString(R.plurals.offline_go_online_to_renew_snackbar_message, days, Integer.valueOf(days)));
                            l.j(false);
                            jejVar.c.n(l.b());
                            ylx.n(jejVar.a, jejVar.d.a.b(new fcq()), hmv.p, ylx.b);
                        }
                    }
                });
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{agog.class};
    }
}
