package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ike  reason: default package */
/* loaded from: classes3.dex */
public abstract class ike extends ems implements ijq, iiy {
    public yni A;
    public aynx B;
    public aadd C;
    public ajyi D;
    public azqb E;
    public acti F;
    public ajyx G;
    public afqw H;
    public akdr I;

    /* renamed from: J  reason: collision with root package name */
    public ajsg f214J;
    public akar K;
    public afqv L;
    public akdv M;
    ajzq R;
    public tdb y;
    public yzj z;
    public final ikf N = new ikf(this);
    public boolean O = false;
    public boolean P = false;
    final ikc Q = new ikc(this);
    private final aypj g = new aypj();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean A() {
        aadd aaddVar = this.C;
        if (aaddVar != null) {
            asuw asuwVar = aaddVar.a().c;
            if (asuwVar == null) {
                asuwVar = asuw.a;
            }
            return asuwVar.k;
        }
        return false;
    }

    protected boolean B() {
        return this.O;
    }

    @Override // defpackage.ijq
    public final aynr i(asvl asvlVar) {
        if (!A() || akdr.g(this)) {
            return w(asvlVar);
        }
        return aynr.j(new ijy(this, asvlVar));
    }

    public abstract int l();

    public abstract View m();

    public abstract ViewAnimatorHelper n();

    @Override // defpackage.ems, defpackage.acth
    public acti oi() {
        return this.F;
    }

    @Override // defpackage.abp, android.app.Activity
    public void onBackPressed() {
        if (n().a() != R.id.location_search_view) {
            if (this.N.e()) {
                this.N.b();
                return;
            } else if (B()) {
                new AlertDialog.Builder(this).setTitle(R.string.stop_upload_dialog_title).setMessage(R.string.stop_upload_dialog_body).setPositiveButton(R.string.stop_upload_dialog_positive, new DialogInterface.OnClickListener() { // from class: ijx
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ike.this.x();
                    }
                }).setNegativeButton(R.string.stop_upload_dialog_negative, gzj.c).setOnCancelListener(iju.a).show();
                return;
            } else {
                x();
                return;
            }
        }
        this.Q.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.g.e()) {
            this.g.qr();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onPause() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        if (recyclerView != null && recyclerView.hasFocus()) {
            recyclerView.clearFocus();
        }
        super.onPause();
    }

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        akdv akdvVar = this.M;
        if (akdvVar == null || !akdvVar.b(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public abstract ampq p();

    public abstract void s();

    public abstract void u(aopa aopaVar);

    public final aynr w(asvl asvlVar) {
        return aynr.j(new ijy(this, asvlVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
        this.N.a();
        if (isTaskRoot()) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, ajsa] */
    public final void y(aakw aakwVar, arxj arxjVar) {
        ylr.c();
        if (this.R == null) {
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.ab(1);
            recyclerView.ag(linearLayoutManager);
            akaq a = this.K.a(aari.n, this.F);
            ?? r14 = this.D.get();
            r14.f(atat.class, new ajsc(this.E));
            ajzq ajzqVar = new ajzq(null, recyclerView, this.f214J, this.G, aari.n, this.A, a, this.z, this.F, r14, akai.Ws, ajzs.d, this.C, this.B);
            this.R = ajzqVar;
            ajzqVar.c();
        }
        this.R.h();
        this.R.K(aakwVar);
        if ((arxjVar.b & 2) != 0) {
            ampq p = p();
            if (p.h()) {
                aopa createBuilder = avgo.a.createBuilder();
                aopa createBuilder2 = awoa.a.createBuilder();
                String uri = ((ikd) p.c()).a.toString();
                createBuilder2.copyOnWrite();
                awoa awoaVar = (awoa) createBuilder2.instance;
                uri.getClass();
                awoaVar.c = 1;
                awoaVar.d = uri;
                createBuilder.copyOnWrite();
                avgo avgoVar = (avgo) createBuilder.instance;
                awoa awoaVar2 = (awoa) createBuilder2.mo39build();
                awoaVar2.getClass();
                avgoVar.c = awoaVar2;
                avgoVar.b |= 1;
                String str = ((ikd) p.c()).b;
                createBuilder.copyOnWrite();
                avgo avgoVar2 = (avgo) createBuilder.instance;
                avgoVar2.b |= 2;
                avgoVar2.d = str;
                this.y.b(arxjVar.d, ((avgo) createBuilder.mo39build()).toByteArray());
            }
        }
        if ((arxjVar.b & 1) != 0) {
            this.g.a(this.y.a(arxjVar.c).I(ikb.a).V(gam.s).J(gam.t).X(aypa.a()).as(new ayqb() { // from class: ika
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    ike ikeVar = ike.this;
                    atfi atfiVar = (atfi) obj;
                    ikeVar.O = atfiVar.b;
                    ikeVar.P = atfiVar.c;
                    ikeVar.s();
                }
            }));
        }
    }

    public final void z() {
        m().setVisibility(0);
        n().b(l());
    }
}
