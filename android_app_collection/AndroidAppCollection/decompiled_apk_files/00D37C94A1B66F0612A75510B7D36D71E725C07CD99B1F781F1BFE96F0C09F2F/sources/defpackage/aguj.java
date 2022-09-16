package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aguj  reason: default package */
/* loaded from: classes.dex */
public final class aguj implements ynl {
    public final aadd a;
    public final azqb b;
    public final azqb c;
    public String d;
    public String e;
    public boolean f;
    private final ScheduledExecutorService g;

    public aguj(aadd aaddVar, azqb azqbVar, azqb azqbVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = aaddVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.g = scheduledExecutorService;
    }

    protected final synchronized void a(ahhw ahhwVar) {
        String e = ahhwVar.e();
        PlayerResponseModel b = ahhwVar.b();
        if (e == null || b == null || e.equals(this.d)) {
            return;
        }
        this.d = e;
        this.e = b.B();
        this.f = false;
    }

    protected final synchronized void b(final aesr aesrVar) {
        this.g.execute(new Runnable() { // from class: agui
            @Override // java.lang.Runnable
            public final void run() {
                agqm b;
                aguj agujVar = aguj.this;
                aesr aesrVar2 = aesrVar;
                atqv atqvVar = agujVar.a.a().g;
                if (atqvVar == null) {
                    atqvVar = atqv.a;
                }
                if (!atqvVar.e || TextUtils.isEmpty(agujVar.d) || TextUtils.isEmpty(agujVar.e) || agujVar.f || !((agrf) agujVar.b.get()).h()) {
                    return;
                }
                agvx a = ((agrf) agujVar.b.get()).a();
                agqv e = a.m().e(agujVar.e);
                if (e == null) {
                    return;
                }
                if ((e.i() != agqp.PLAYABLE && !e.v()) || (b = a.d().b(agujVar.e, null)) == null) {
                    return;
                }
                FormatStreamModel e2 = aesrVar2.e();
                FormatStreamModel f = aesrVar2.f();
                FormatStreamModel a2 = b.a();
                FormatStreamModel c = b.c();
                if ((e2 == null || a2 == null || e2.e() != a2.e()) && (f == null || c == null || f.e() != c.e())) {
                    return;
                }
                aopa createBuilder = awbs.a.createBuilder();
                int i = e.c;
                byte[] bArr = e.d;
                if (i != -1 && i != 0) {
                    createBuilder.copyOnWrite();
                    awbs awbsVar = (awbs) createBuilder.instance;
                    awbsVar.b |= 2;
                    awbsVar.d = i;
                } else if (bArr != null) {
                    aoob x = aoob.x(bArr);
                    createBuilder.copyOnWrite();
                    awbs awbsVar2 = (awbs) createBuilder.instance;
                    awbsVar2.b |= 1;
                    awbsVar2.c = x;
                } else {
                    aoob x2 = aoob.x(aadi.b);
                    createBuilder.copyOnWrite();
                    awbs awbsVar3 = (awbs) createBuilder.instance;
                    awbsVar3.b |= 1;
                    awbsVar3.c = x2;
                }
                agql agqlVar = b.b;
                agql agqlVar2 = b.a;
                ((agpt) agujVar.c.get()).d(agujVar.d, e.m.b(), (awbs) createBuilder.mo39build(), a2 == null ? 0 : a2.e(), c == null ? 0 : c.e(), !(agqlVar2 != null && agqlVar2.i() && (agqlVar == null || agqlVar.i())));
                agujVar.f = true;
            }
        });
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((aesr) obj);
                return null;
            } else if (i == 1) {
                a((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aesr.class, ahhw.class};
    }
}
