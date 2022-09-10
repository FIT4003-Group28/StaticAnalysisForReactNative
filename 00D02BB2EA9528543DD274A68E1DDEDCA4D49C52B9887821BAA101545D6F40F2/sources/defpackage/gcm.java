package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gcm  reason: default package */
/* loaded from: classes.dex */
public final class gcm {
    public final gga a;
    public final gcl b = new gcl(this);
    private final Executor c;
    private final gce d;

    public gcm(gga ggaVar, Executor executor, gce gceVar) {
        this.a = ggaVar;
        this.c = executor;
        this.d = gceVar;
    }

    private static boolean e(@dzsi View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof RecyclerView) && ((RecyclerView) view).K()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (e(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        if (!bvrj.UI_THREAD.b() || e(this.a.findViewById(16908290))) {
            this.c.execute(new Runnable(this) { // from class: gcj
                private final gcm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        } else {
            b();
        }
    }

    public final void b() {
        if (c()) {
            try {
                gcd gcdVar = gcd.FOLLOW_SYSTEM;
                int ordinal = this.d.f().ordinal();
                if (ordinal == 0) {
                    return;
                }
                int i = 16;
                if (ordinal == 1) {
                    i = 32;
                }
                Resources resources = this.a.getResources();
                Configuration configuration = new Configuration(resources.getConfiguration());
                configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                gga ggaVar = this.a;
                int i2 = ggaVar.bb;
                if (i2 == 0) {
                    return;
                }
                ggaVar.setTheme(i2);
                this.a.getTheme().applyStyle(i2, true);
            } catch (Exception e) {
                throw new gck(String.format("Exception while attempting to correct dark mode with message=%s", e.getMessage()), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        gce gceVar = this.d;
        if (gceVar instanceof gcc) {
            return ((gcc) gceVar).a;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        boolean a = gct.a(this.a.getResources().getConfiguration());
        gcd gcdVar = gcd.FOLLOW_SYSTEM;
        int ordinal = this.d.f().ordinal();
        return ordinal != 1 ? ordinal != 2 || !a : a;
    }
}
