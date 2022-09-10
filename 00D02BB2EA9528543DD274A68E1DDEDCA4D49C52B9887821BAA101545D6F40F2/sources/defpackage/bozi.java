package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bozi  reason: default package */
/* loaded from: classes3.dex */
final class bozi implements bpae {
    final /* synthetic */ bozj a;
    @dzsi
    private final bpuh b;

    public bozi(@dzsi bozj bozjVar, bpuh bpuhVar) {
        this.a = bozjVar;
        this.b = bpuhVar;
    }

    final void a(bpuh bpuhVar) {
        if (bpuhVar.equals(bpuh.CAROUSEL)) {
            this.a.a.d();
            this.a.f.a();
        }
        if (bpuhVar.equals(bpuh.EXTENT_PICKING)) {
            bozj bozjVar = this.a;
            bozjVar.i = bozjVar.a.g == bpuh.CAROUSEL ? 3 : 2;
            final bpag bpagVar = this.a.g;
            bpagVar.d();
            bpagVar.e();
            for (final bozq bozqVar : bpagVar.c) {
                bpagVar.b.f(bozqVar);
                bpagVar.b.a(bozqVar, new bozr(bpagVar, bozqVar) { // from class: bozy
                    private final bpag a;
                    private final bozq b;

                    {
                        this.a = bpagVar;
                        this.b = bozqVar;
                    }

                    @Override // defpackage.bozr
                    public final void a() {
                        this.a.k(this.b);
                    }
                });
            }
            bpagVar.i();
        } else {
            this.a.g.b();
        }
        if (bpuhVar.equals(bpuh.ROUTE_SELECTION)) {
            this.a.n();
        } else {
            this.a.a.h = 0L;
        }
        this.a.h(bpuhVar);
    }

    @Override // defpackage.bpae
    public final void b(int i, int i2) {
        if (i == 2) {
            this.a.c.a();
            this.a.h = true;
            i = 2;
        }
        bpuh bpuhVar = bpuh.UNKNOWN_MODE;
        int i3 = i2 - 1;
        if (i3 == 1) {
            bozj bozjVar = this.a;
            bozjVar.h = false;
            cqkx.p(bozjVar);
            boyc boycVar = this.a.c;
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener(this) { // from class: bozh
                private final bozi a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    bozi boziVar = this.a;
                    boziVar.a.a.g = bpuh.EXTENT_PICKING;
                    boziVar.a.g();
                }
            };
            if (boycVar.a != null) {
                return;
            }
            Activity activity = boycVar.b;
            dbsk.s(activity);
            boycVar.a = new ProgressDialog(activity, 0);
            boycVar.a.setCancelable(true);
            boycVar.a.setCanceledOnTouchOutside(false);
            ProgressDialog progressDialog = boycVar.a;
            Activity activity2 = boycVar.b;
            dbsk.s(activity2);
            progressDialog.setMessage(activity2.getString(R.string.VIEWPORT_CHECK_WAIT));
            boycVar.a.setOnCancelListener(onCancelListener);
            boycVar.a.show();
        } else if (i3 == 2 || i3 == 3) {
            this.a.e.e(true);
        } else if (i3 != 4) {
            if (i3 != 5) {
                this.a.e.e(false);
                this.a.g.g.remove(this);
                return;
            }
            bozj bozjVar2 = this.a;
            bozjVar2.h = true;
            bozjVar2.e.e(false);
            boyb boybVar = this.a.d;
            Toast toast = boybVar.b;
            if (toast != null) {
                toast.cancel();
                boybVar.b = null;
            }
            boybVar.b = Toast.makeText(boybVar.a, (int) R.string.EXTENT_PICKER_ERROR_LOADING_ROAD_EDITING_TILES, 0);
            boybVar.b.setGravity(17, 0, 100);
            boybVar.b.show();
            a(bpuh.CAROUSEL);
        } else {
            bozj bozjVar3 = this.a;
            bozjVar3.h = true;
            bozjVar3.e.e(false);
            if (bpuh.ROUTE_SELECTION.equals(this.b)) {
                if (this.a.a.e.size() > 1) {
                    a(bpuh.ROUTE_SELECTION);
                    return;
                } else {
                    a(bpuh.CAROUSEL);
                    return;
                }
            }
            boyt boytVar = this.a.a;
            if (boytVar.h == 0 || boytVar.e.size() <= 1) {
                bpag bpagVar = this.a.g;
                dccx F = dcdc.F();
                F.i(bpagVar.c);
                F.i(bpagVar.f);
                F.i(bpagVar.e);
                if (F.f().size() > 1) {
                    if (i == 3 || i == 4) {
                        return;
                    }
                    a(bpuh.EXTENT_PICKING);
                    return;
                }
                bpuh bpuhVar2 = this.b;
                if (bpuhVar2 != null) {
                    a(bpuhVar2);
                    return;
                }
                this.a.g.b();
                this.a.b.a();
                return;
            }
            a(bpuh.ROUTE_SELECTION);
        }
    }
}
