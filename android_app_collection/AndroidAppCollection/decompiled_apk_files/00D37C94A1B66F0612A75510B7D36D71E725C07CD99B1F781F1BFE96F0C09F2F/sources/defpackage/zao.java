package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: zao  reason: default package */
/* loaded from: classes4.dex */
public final class zao {
    public View a;
    public zam b;
    public zan c;
    private final ViewTreeObserver.OnPreDrawListener e;
    private WeakReference f;
    private boolean h;
    private zaj g = new zaj();
    public zaj d = new zaj();

    public zao(View view) {
        view.getClass();
        this.a = view;
        this.e = new ViewTreeObserver.OnPreDrawListener() { // from class: zak
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                zao.this.b();
                return true;
            }
        };
        this.h = false;
    }

    public final View a() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void b() {
        View a = a();
        if (a != null) {
            zaj zajVar = this.g;
            this.g = this.d;
            zaj.c(zajVar, a, this.a);
            this.d = zajVar;
            if (this.c == null) {
                return;
            }
            zaj zajVar2 = this.g;
            boolean e = zajVar.e();
            boolean e2 = zajVar2.e();
            if ((!e && !e2) || zajVar.equals(zajVar2)) {
                return;
            }
            this.c.sa(this.d);
        }
    }

    public final void c(View view) {
        if (view == a()) {
            b();
            return;
        }
        this.f = new WeakReference(view);
        zam zamVar = this.b;
        if (zamVar != null) {
            zamVar.e(view);
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (view != null && !this.h) {
            viewTreeObserver.addOnPreDrawListener(this.e);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.e);
            this.h = false;
        }
        if (view == null) {
            if (!this.d.e()) {
                return;
            }
            this.d.d();
            Optional.ofNullable(this.c).ifPresent(new Consumer() { // from class: zal
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    ((zan) obj).sa(zao.this.d);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
            return;
        }
        b();
    }

    public final void d() {
        c(null);
    }
}
