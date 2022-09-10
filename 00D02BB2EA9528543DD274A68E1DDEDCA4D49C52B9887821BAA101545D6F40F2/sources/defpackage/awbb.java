package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awbb  reason: default package */
/* loaded from: classes3.dex */
public final class awbb implements away {
    public final dxio<cztz> a;
    private final Application b;
    private final Executor c;

    public awbb(Application application, Executor executor, dxio<cztz> dxioVar) {
        this.b = application;
        this.c = executor;
        this.a = dxioVar;
    }

    @Override // defpackage.away
    public final void a() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_AUTODOWNLOAD_DELETE_TOAST));
    }

    @Override // defpackage.away
    public final void b(final Runnable runnable) {
        final String string = this.b.getString(R.string.OFFLINE_AREA_DETAIL_MAP_TOAST);
        final String string2 = this.b.getString(R.string.OFFLINE_AUTODOWNLOAD_DIALOG_MANAGE_BUTTON);
        this.c.execute(new Runnable(this, string, string2, runnable) { // from class: awaz
            private final awbb a;
            private final String b;
            private final String c;
            private final Runnable d;

            {
                this.a = this;
                this.b = string;
                this.c = string2;
                this.d = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awbb awbbVar = this.a;
                String str = this.b;
                String str2 = this.c;
                final Runnable runnable2 = this.d;
                cztq a = cztt.a(awbbVar.a.a());
                a.c = str;
                a.d(cztr.EXTRA_LONG);
                a.f(str2, new View.OnClickListener(runnable2) { // from class: awba
                    private final Runnable a;

                    {
                        this.a = runnable2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.run();
                    }
                });
                a.c();
            }
        });
    }

    @Override // defpackage.away
    public final void c() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_DOWNLOAD_WHEN_CONNECTIVITY_RETURNS_TOAST));
    }

    @Override // defpackage.away
    public final void d() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_ONBOARDING_DOWNLOAD_FROM_NOTIFICATION_TOAST_NO_REGION));
    }

    @Override // defpackage.away
    public final void e() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_ONBOARDING_DOWNLOAD_FROM_NOTIFICATION_TOAST));
    }

    @Override // defpackage.away
    public final void f() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_ONBOARD_DOWNLOAD_TOAST));
    }

    @Override // defpackage.away
    public final void g() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_ONBOARD_SKIP_TEXT));
    }

    @Override // defpackage.away
    public final void h() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_TOAST_TEXT_REGION_ALREADY_EXISTS));
    }

    @Override // defpackage.away
    public final void i() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.h(executor, application, application.getString(R.string.OFFLINE_MAPS_CARD_SIGN_IN_PROMPT));
    }

    @Override // defpackage.away
    public final void j() {
        Executor executor = this.c;
        Application application = this.b;
        cjxu.l(executor, application, application.getString(R.string.OFFLINE_TOO_MANY_REGIONS));
    }
}
