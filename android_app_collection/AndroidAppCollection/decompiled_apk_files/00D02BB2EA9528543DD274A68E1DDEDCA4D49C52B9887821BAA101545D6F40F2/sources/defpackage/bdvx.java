package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdvx  reason: default package */
/* loaded from: classes3.dex */
public final class bdvx implements begr {
    public final bwrs<ilo> a;
    public final boolean b;
    final /* synthetic */ bdvy c;

    public bdvx(bdvy bdvyVar, bwrs<ilo> bwrsVar, boolean z) {
        this.c = bdvyVar;
        this.a = bwrsVar;
        this.b = z;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        ilo c = this.a.c();
        dbsk.s(c);
        ily f = iloVar.f(c);
        ilo d = f.d();
        if (c.j() && !d.j()) {
            f = c.g();
            f.e = true;
            f.d = d;
        }
        this.c.b.b(new bdvw(this, d, f), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, final ilo iloVar, final bttq bttqVar) {
        bdvy bdvyVar = this.c;
        if (bdvyVar.f && bdvyVar.a.a()) {
            this.c.a.b().runOnUiThread(new Runnable(this, iloVar, bttqVar) { // from class: bdvv
                private final bdvx a;
                private final ilo b;
                private final bttq c;

                {
                    this.a = this;
                    this.b = iloVar;
                    this.c = bttqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bdvx bdvxVar = this.a;
                    ilo iloVar2 = this.b;
                    bttq bttqVar2 = this.c;
                    bdvxVar.a.d(iloVar2);
                    if (bdvxVar.c.e.a()) {
                        bdvxVar.c.e.b().d(ckmk.SEARCH_LIST_ITEM_CLICK_TO_FINAL_PLACE_SHEET, btzy.f(bttqVar2));
                    }
                    if (bdvxVar.b) {
                        Toast.makeText(bdvxVar.c.a.b(), (int) R.string.NET_FAIL_TITLE, 0).show();
                    }
                }
            });
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.c) {
            this.c.g.remove(this.a);
        }
    }
}
