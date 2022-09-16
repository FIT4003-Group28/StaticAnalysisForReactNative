package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayay  reason: default package */
/* loaded from: classes3.dex */
public final class ayay {
    public final gga a;
    public final dxio<cztz> b;
    public final bvrb c;
    public final axwy d;
    public final axwi e;
    public final batm f;
    private final btpc g;
    private final btvo h;

    public ayay(gga ggaVar, dxio<cztz> dxioVar, bvrb bvrbVar, axwy axwyVar, axwi axwiVar, btpc btpcVar, batm batmVar, btvo btvoVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = bvrbVar;
        this.d = axwyVar;
        this.e = axwiVar;
        this.g = btpcVar;
        this.f = batmVar;
        this.h = btvoVar;
    }

    public final void a() {
        if (!this.a.aZ) {
            return;
        }
        final boolean z = this.h.getPlaceListsParameters().o;
        this.f.a(new Runnable(this, z) { // from class: ayam
            private final ayay a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ayay ayayVar = this.a;
                boolean z2 = this.b;
                ayayVar.b.a().d(ayayVar.a.getWindowManager(), true);
                cztq a = cztt.a(ayayVar.b.a());
                a.c = ayayVar.a.getString(true != z2 ? R.string.LIST_FOLLOWED : R.string.LIST_SAVED);
                cztq a2 = a.a(R.string.LIST_VIEW_ALL, new View.OnClickListener(ayayVar) { // from class: ayav
                    private final ayay a;

                    {
                        this.a = ayayVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.d.n();
                    }
                });
                a2.d(cztr.LONG);
                a2.c();
            }
        });
    }

    public final void b(final baad baadVar, final ayax ayaxVar) {
        if (!this.a.aZ) {
            return;
        }
        final boolean z = this.h.getPlaceListsParameters().o;
        this.f.a(new Runnable(this, z, ayaxVar, baadVar) { // from class: ayan
            private final ayay a;
            private final boolean b;
            private final ayax c;
            private final baad d;

            {
                this.a = this;
                this.b = z;
                this.c = ayaxVar;
                this.d = baadVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ayay ayayVar = this.a;
                boolean z2 = this.b;
                final ayax ayaxVar2 = this.c;
                final baad baadVar2 = this.d;
                ayayVar.b.a().d(ayayVar.a.getWindowManager(), true);
                cztq a = cztt.a(ayayVar.b.a());
                a.c = ayayVar.a.getString(true != z2 ? R.string.LIST_UNFOLLOWED : R.string.LIST_REMOVE_SAVED);
                cztq a2 = a.a(R.string.UNDO, new View.OnClickListener(ayayVar, ayaxVar2, baadVar2) { // from class: ayau
                    private final ayay a;
                    private final ayax b;
                    private final baad c;

                    {
                        this.a = ayayVar;
                        this.b = ayaxVar2;
                        this.c = baadVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ayay ayayVar2 = this.a;
                        ayax ayaxVar3 = this.b;
                        baad baadVar3 = this.c;
                        ayaxVar3.a();
                        deha.q(ayayVar2.e.n(baadVar3), new ayaw(ayayVar2, ayaxVar3), ayayVar2.c.h());
                    }
                });
                a2.d(cztr.LONG);
                a2.c();
            }
        });
    }

    public final void c() {
        this.f.a(new Runnable(this) { // from class: ayao
            private final ayay a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                new AlertDialog.Builder(this.a.a).setTitle(R.string.LIST_NOT_FOUND_ALERT_DIALOG_TITLE).setMessage(R.string.LIST_NOT_FOUND_ALERT_DIALOG_MESSAGE).setPositiveButton(R.string.OK_BUTTON, ayat.a).show();
            }
        });
    }

    public final void d() {
        this.f.a(new Runnable(this) { // from class: ayap
            private final ayay a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckos.b(this.a.a.findViewById(16908290), R.string.LIST_DOES_NOT_ALLOW_EDITING, 0).c();
            }
        });
    }

    public final boolean e() {
        if (!this.g.i()) {
            this.f.a(new Runnable(this) { // from class: ayaq
                private final ayay a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ayay ayayVar = this.a;
                    ((InputMethodManager) ayayVar.a.getSystemService("input_method")).hideSoftInputFromWindow(ayayVar.a.getWindow().getDecorView().getWindowToken(), 0);
                    ayayVar.g(R.string.OFFLINE_ERROR);
                }
            });
            return false;
        }
        return true;
    }

    public final void f() {
        this.f.a(new Runnable(this) { // from class: ayar
            private final ayay a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(R.string.LIST_SHARING_SERVICE_UNAVAILABLE);
            }
        });
    }

    public final void g(int i) {
        h(this.a.getString(i));
    }

    public final void h(String str) {
        if (!this.a.aZ) {
            return;
        }
        bvrj.UI_THREAD.c();
        cztq a = cztt.a(this.b.a());
        a.c = str;
        a.d(cztr.LONG);
        a.c();
    }
}
