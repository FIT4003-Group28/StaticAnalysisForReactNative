package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahen  reason: default package */
/* loaded from: classes2.dex */
class ahen implements agzm {
    public boolean a;
    final /* synthetic */ aheo b;
    private int c;

    public ahen(aheo aheoVar) {
        this.b = aheoVar;
    }

    @Override // defpackage.agzm
    public Integer a() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.agzm
    public CharSequence b() {
        Resources resources = this.b.a.getResources();
        int i = this.c;
        return resources.getQuantityString(R.plurals.LOCALSTREAM_SAVED_PLACE_COUNT_TEXT, i, Integer.valueOf(i));
    }

    @Override // defpackage.agzm
    public cqtd c() {
        return cqtt.h(cqtt.d(cqrt.j(iup.e(R.raw.localstream_bookmark_background_svg), ibm.L()), iup.e(R.raw.localstream_bookmark_want_to_go_overlay_svg)), 0.8f);
    }

    @Override // defpackage.agzm
    public CharSequence d() {
        return b();
    }

    @Override // defpackage.agzm
    public cjtd e() {
        return cjtd.a(dtxu.bX);
    }

    @Override // defpackage.agzm
    public cqkl f(View view) {
        this.b.e.a().H();
        return cqkl.a;
    }

    @Override // defpackage.agzm
    public void g() {
        bvqj.c(deew.g(this.b.d.a().e(), new ahem(this), this.b.f), new bvqg(this) { // from class: ahek
            private final ahen a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final ahen ahenVar = this.a;
                baad baadVar = (baad) obj;
                if (baadVar != null) {
                    final int k = baadVar.k();
                    ahenVar.b.g.execute(new Runnable(ahenVar, k) { // from class: ahel
                        private final ahen a;
                        private final int b;

                        {
                            this.a = ahenVar;
                            this.b = k;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.h(this.b);
                        }
                    });
                }
            }
        }, this.b.f);
    }

    @Override // defpackage.agzm
    public void h(int i) {
        bvrj.UI_THREAD.c();
        this.c = i;
        this.a = true;
        cqkx.p(this.b);
    }

    @Override // defpackage.agzm
    public void i(boolean z) {
        this.b.k(false);
    }
}
