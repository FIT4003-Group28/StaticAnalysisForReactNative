package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.AddAccountActivity;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cvzd  reason: default package */
/* loaded from: classes.dex */
public abstract class cvzd<T> {
    public Context a;

    public abstract dbsg<cwjs<T>> a();

    public abstract cvzg<T> b();

    public abstract dbsg<cvyw<T>> c();

    public abstract cwdt<T> d();

    public abstract dbsg<ExecutorService> e();

    public abstract cwkn f();

    public abstract boolean g();

    public abstract cwjw<T> h();

    public abstract dbsg<cvzn> i();

    public abstract cvze<T> j();

    public final cvze<T> k() {
        cvzn cvznVar;
        ThreadFactory a = cwir.a();
        if (!e().a()) {
            o(Executors.newCachedThreadPool(a));
        }
        ExecutorService b = e().b();
        if (!a().a()) {
            throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
        }
        n(new cvvg(this.a, b, l(), a().b()));
        if (!c().a()) {
            final cvyx cvyxVar = new cvyx(l());
            cvzh cvzhVar = new cvzh();
            cvzhVar.b(new cvyu() { // from class: cvyz
                @Override // defpackage.cvyu, defpackage.cvub
                public final void a(View view, Object obj) {
                    Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                    intent.addFlags(32768);
                    intent.addFlags(ImageMetadata.LENS_APERTURE);
                    view.getContext().startActivity(intent);
                }
            });
            cvzhVar.d(new cvyu() { // from class: cvza
                @Override // defpackage.cvyu, defpackage.cvub
                public final void a(View view, Object obj) {
                    view.getContext().startActivity(new Intent(view.getContext(), AddAccountActivity.class));
                }
            });
            cvzhVar.c(new cvyu(cvyxVar) { // from class: cvzb
                private final cvyx a;

                {
                    this.a = cvyxVar;
                }

                @Override // defpackage.cvyu, defpackage.cvub
                public final void a(View view, Object obj) {
                    if (obj == null) {
                        return;
                    }
                    Activity a2 = cwij.a(view.getContext());
                    cwfn.f(obj);
                    cvxg.b(a2, 2, obj);
                }
            });
            p(cvzhVar.a());
        }
        Application application = null;
        if (d().a().a()) {
            cvznVar = i().c(new cvzn());
            s(cvznVar);
            t(new cvzl(h(), cvznVar));
        } else {
            cvznVar = null;
        }
        final boolean z = m() != null;
        if (z) {
            l();
            v(new cwlh(b(), cvznVar, m()));
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(a);
        cznn cznmVar = g() ? new cznm() : new czna(this.a, "STREAMZ_ONEGOOGLE_ANDROID");
        Context context = this.a;
        if (context instanceof Application) {
            application = (Application) context;
        }
        u(cwkn.a(newSingleThreadScheduledExecutor, cznmVar, application));
        if (!g()) {
            b.execute(new Runnable(this, z) { // from class: cvzc
                private final cvzd a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cvzd cvzdVar = this.a;
                    boolean z2 = this.b;
                    cvzdVar.f().f.a().a(cvzdVar.a.getPackageName(), Boolean.valueOf(cwjh.a(cvzdVar.a)), Boolean.valueOf(z2));
                }
            });
        }
        return j();
    }

    public abstract cwfn l();

    public abstract cskk m();

    public abstract void n(cvuu<T> cvuuVar);

    public abstract void o(ExecutorService executorService);

    public abstract void p(cvyw<T> cvywVar);

    public abstract void q(cwdl cwdlVar);

    public abstract void r(cwdt<T> cwdtVar);

    public abstract void s(cvzn cvznVar);

    public abstract void t(cwjw<T> cwjwVar);

    public abstract void u(cwkn cwknVar);

    public abstract void v(cwla cwlaVar);
}
