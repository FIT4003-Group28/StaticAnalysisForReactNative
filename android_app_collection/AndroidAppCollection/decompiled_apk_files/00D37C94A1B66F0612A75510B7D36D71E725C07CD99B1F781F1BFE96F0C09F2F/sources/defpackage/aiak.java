package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aiak  reason: default package */
/* loaded from: classes.dex */
public final class aiak implements airt, ynl {
    private final /* synthetic */ int a;

    public aiak(int i) {
        this.a = i;
    }

    public aiak(Context context) {
        new AlertDialog.Builder(context).setTitle(context.getString(R.string.playback_rate_title)).setNegativeButton(R.string.cancel, gzj.k);
    }

    public static final void a(ahhw ahhwVar) {
        if (ahhwVar.c() != aika.NEW) {
            ahhwVar.c();
        }
        ahhwVar.b();
    }

    public static final void b(ahhw ahhwVar) {
        ahhwVar.c().e();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (this.a != 0) {
            if (i == -1) {
                return new Class[]{ahhw.class};
            }
            if (i == 0) {
                b((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (i == -1) {
            return new Class[]{ahhw.class};
        } else {
            if (i == 0) {
                a((ahhw) obj);
                return null;
            }
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("unsupported op code: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.a != 0 ? new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 16L)).h(aiwv.l(1)).aa(new aaga(18), aaga.n)} : new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 65536L)).h(aiwv.l(1)).aa(new ahqs(18), ahqs.s)};
    }
}
