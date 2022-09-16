package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avhz  reason: default package */
/* loaded from: classes2.dex */
public class avhz {
    public final Activity a;
    public final gdc b;
    public final dxio<afha> c;
    private final crzm<avkc> d;
    private final btpc e;

    public avhz(Activity activity, crzm<avkc> crzmVar, btpc btpcVar, gdc gdcVar, dxio<afha> dxioVar) {
        this.d = crzmVar;
        this.a = activity;
        this.e = btpcVar;
        this.b = gdcVar;
        this.c = dxioVar;
    }

    private final gcz c() {
        gcz a = this.b.a();
        a.i(R.string.NETWORK_UNAVAILABLE);
        a.d(R.string.PROBLEM_CONNECTING_TO_THE_NETWORK_TEXT);
        a.g(new gdd() { // from class: avhq
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        return a;
    }

    public final boolean a(final avhy avhyVar, @dzsi dspd dspdVar) {
        if (!this.e.j()) {
            if (dspdVar != null) {
                gcz c = c();
                c.h(R.string.TRY_AGAIN, null, new gdd(avhyVar) { // from class: avho
                    private final avhy a;

                    {
                        this.a = avhyVar;
                    }

                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                        this.a.b();
                    }
                });
                c.e(R.string.CANCEL_BUTTON, null, new gdd() { // from class: avhp
                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                    }
                });
                c.b();
            } else {
                gcz c2 = c();
                c2.h(R.string.OK_BUTTON, null, new gdd() { // from class: avhf
                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                    }
                });
                c2.b();
            }
            return true;
        }
        avkc l = this.d.l();
        dbsk.s(l);
        if (!l.b()) {
            return false;
        }
        gcz a = this.b.a();
        a.i(R.string.OFFLINE_DOWNLOAD_OVER_CELL_NETWORK_DIALOG_QUESTION_TITLE);
        a.d(R.string.OFFLINE_DOWNLOAD_OVER_CELL_NETWORK_QUESTION_DIALOG_DESCRIPTION);
        a.i = cjtd.a(dtxx.bI);
        a.h(R.string.OFFLINE_DOWNLOAD_OVER_CELL_NETWORK_QUESTION_CONFIRM, cjtd.a(dtxx.bK), new gdd(avhyVar) { // from class: avhr
            private final avhy a;

            {
                this.a = avhyVar;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.a();
            }
        });
        a.e(R.string.CANCEL_BUTTON, cjtd.a(dtxx.bJ), new gdd() { // from class: avhs
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        a.g(new gdd() { // from class: avht
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        a.b();
        return true;
    }

    public final void b() {
        gcz a = this.b.a();
        a.i(R.string.OFFLINE_MAPS_LOW_STORAGE_SPACE_ALERT_TITLE);
        a.d(R.string.OFFLINE_MAPS_LOW_STORAGE_SPACE_ALERT_BODY);
        a.i = cjtd.a(dtxx.aK);
        a.h(R.string.OK_BUTTON, null, new gdd() { // from class: avhu
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        a.g(new gdd() { // from class: avhv
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        a.b();
    }
}
