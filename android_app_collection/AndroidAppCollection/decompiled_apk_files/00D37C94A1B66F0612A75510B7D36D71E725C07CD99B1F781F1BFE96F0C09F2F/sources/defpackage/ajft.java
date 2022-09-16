package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Observable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: ajft  reason: default package */
/* loaded from: classes.dex */
public final class ajft extends Observable implements ynl {
    public final ScheduledExecutorService a;
    public ScheduledFuture b;
    ajfs c;

    public ajft(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    private final void d() {
        ajfs ajfsVar = this.c;
        if (ajfsVar != null) {
            ajfsVar.b();
            this.c = null;
        }
    }

    public final void b(ahhw ahhwVar) {
        awam awamVar;
        aika aikaVar = aika.NEW;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal != 6) {
            if (ordinal != 7) {
                if (ordinal == 8) {
                    return;
                }
                d();
                return;
            }
            PlayerResponseModel b = ahhwVar.b();
            if (b == null) {
                return;
            }
            d();
            awaj w = b.w();
            if (w == null) {
                awamVar = null;
            } else {
                awamVar = w.c;
                if (awamVar == null) {
                    awamVar = awam.b;
                }
            }
            if (awamVar == null) {
                return;
            }
            ajfs ajfsVar = new ajfs(this, awamVar, b.w());
            this.c = ajfsVar;
            ajfsVar.b = SystemClock.elapsedRealtime();
            ajfsVar.j = 1;
        }
    }

    public final void c(ahia ahiaVar) {
        ajfs ajfsVar = this.c;
        if (ajfsVar == null) {
            return;
        }
        switch (ahiaVar.a()) {
            case 2:
                ajfsVar.a();
                ajfsVar.d(3);
                return;
            case 3:
            case 6:
                ajfsVar.a();
                ajfsVar.d(7);
                return;
            case 4:
            case 7:
            case 8:
                d();
                return;
            case 5:
                ajfsVar.a();
                aika aikaVar = aika.NEW;
                int i = ajfsVar.j;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    ajfsVar.d(2);
                    ajfsVar.c(ajfsVar.c - ajfsVar.f);
                    return;
                } else if (i2 == 2) {
                    ajfsVar.d(4);
                    ajfsVar.c(ajfsVar.d - ajfsVar.h);
                    return;
                } else if (i2 != 4 && i2 != 6) {
                    return;
                } else {
                    ajfsVar.d(6);
                    return;
                }
            case 9:
            case 10:
                ajfsVar.a();
                ajfsVar.d(5);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ahhw) obj);
                return null;
            } else if (i == 1) {
                c((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahia.class};
    }
}
