package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cwgx  reason: default package */
/* loaded from: classes5.dex */
public final class cwgx<T> {
    public final cvze<T> a;
    public final cvxj<T> b;
    private final cwql c;
    private final cwqi d;
    private final cwqi e;
    private final cwqi f;
    private final cwqi g;
    private final cwqi h;
    private final cwqi i;
    private final cwqi j;
    private final cwqi k;
    private final cwqi l = cwgj.a;
    private int m;

    public cwgx(final cvze<T> cvzeVar, final cwql cwqlVar, final dtgb dtgbVar) {
        dbsk.b(cvzeVar.f().f().isEmpty(), "Custom actions should be set using CollapsibleAccountManagementFeature and common actions using setCommonActions.");
        this.a = cvzeVar;
        this.c = cwqlVar;
        cwpe cwpeVar = new cwpe();
        cwpeVar.c(cwqd.a);
        cwpeVar.b(cwqe.a);
        boolean z = false;
        cwpeVar.a(false);
        cwpeVar.d(new cwqf());
        cwpeVar.c(new cwqk(this) { // from class: cwgp
            private final cwgx a;

            {
                this.a = this;
            }

            @Override // defpackage.cwqk
            public final void a(View view) {
                cwgx cwgxVar = this.a;
                cwgxVar.a.k().a(view, true != cwgxVar.a.c().e().a() ? 90575 : 90576);
                cwgxVar.d(37);
            }
        });
        cwpeVar.b(new cwqj(this) { // from class: cwgq
            private final cwgx a;

            {
                this.a = this;
            }

            @Override // defpackage.cwqj
            public final void a() {
                this.a.d(38);
            }
        });
        cwpeVar.d(cvzeVar.k());
        cwpeVar.a(cvzeVar.c().k());
        String str = cwpeVar.a == null ? " onViewCreatedCallback" : "";
        str = cwpeVar.b == null ? str.concat(" onDismissCallback") : str;
        str = cwpeVar.c == null ? String.valueOf(str).concat(" visualElements") : str;
        str = cwpeVar.d == null ? String.valueOf(str).concat(" isExperimental") : str;
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        cwpf cwpfVar = new cwpf(cwpeVar.a, cwpeVar.b, cwpeVar.c, cwpeVar.d.booleanValue());
        if (cwqlVar.ai == null) {
            dbsk.m(cwqlVar.ag == null ? true : z, "initialize() must be called before setViewProviders()");
            cwqlVar.ai = cwpfVar;
            final cwin cwinVar = cwqlVar.aj;
            dbsk.m(cwinVar.b.a(), "Object was not initialized");
            cwjf.a(new Runnable(cwinVar) { // from class: cwil
                private final cwin a;

                {
                    this.a = cwinVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
        final cwgt cwgtVar = new cwgt(cwqlVar);
        this.d = new cwqi(cvzeVar, cwgtVar, dtgbVar) { // from class: cwha
            private final cvze a;
            private final cwii b;
            private final dtgb c;

            {
                this.a = cvzeVar;
                this.b = cwgtVar;
                this.c = dtgbVar;
            }

            @Override // defpackage.cwqi
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final cvze cvzeVar2 = this.a;
                cwii cwiiVar = this.b;
                dtgb dtgbVar2 = this.c;
                cvxe cvxeVar = new cvxe(layoutInflater.getContext());
                cweh c = cvzeVar2.c().c();
                final cvwv cvwvVar = new cvwv(cvzeVar2.o());
                cvwt cvwtVar = new cvwt();
                cvwtVar.a(new cvww());
                cvwtVar.a = new nc(cvzeVar2) { // from class: cwhb
                    private final cvze a;

                    {
                        this.a = cvzeVar2;
                    }

                    @Override // defpackage.nc
                    public final Object a() {
                        cvze cvzeVar3 = this.a;
                        dbsg<cvzn> g = cvzeVar3.g();
                        if (!g.a() || !g.b().a) {
                            return cvzeVar3.a().e();
                        }
                        return null;
                    }
                };
                cwjw<AccountT> e = cvzeVar2.e();
                if (e != 0) {
                    cvwtVar.b = e;
                    if (dtgbVar2 != null) {
                        cvwtVar.c = dtgbVar2;
                        cwla k = cvzeVar2.k();
                        if (k != null) {
                            cvwtVar.d = k;
                            cvub<AccountT> cvubVar = (cvub) c.a().c(new cvub(cvwvVar) { // from class: cwhc
                                private final cvwv a;

                                {
                                    this.a = cvwvVar;
                                }

                                @Override // defpackage.cvub
                                public final void a(View view, Object obj) {
                                    cvxg.a(cwij.a(view.getContext()), 501, this.a.a, obj, "https://www.google.com/policies/privacy");
                                }
                            });
                            if (cvubVar != 0) {
                                cvwtVar.e = cvubVar;
                                cvub<AccountT> cvubVar2 = (cvub) c.b().c(new cvub(cvwvVar) { // from class: cwhd
                                    private final cvwv a;

                                    {
                                        this.a = cvwvVar;
                                    }

                                    @Override // defpackage.cvub
                                    public final void a(View view, Object obj) {
                                        cvxg.a(cwij.a(view.getContext()), 504, this.a.a, obj, "https://myaccount.google.com/termsofservice");
                                    }
                                });
                                if (cvubVar2 != 0) {
                                    cvwtVar.f = cvubVar2;
                                    dbsg<Integer> c2 = c.c();
                                    dbsg<cvub<AccountT>> d = c.d();
                                    dbsk.a(c2.a() == d.a());
                                    if (c2 != null) {
                                        cvwtVar.g = c2;
                                        if (d != 0) {
                                            cvwtVar.h = d;
                                            cvwtVar.a(cwiiVar);
                                            String str2 = cvwtVar.a == null ? " accountSupplier" : "";
                                            if (cvwtVar.b == null) {
                                                str2 = str2.concat(" eventLogger");
                                            }
                                            if (cvwtVar.c == null) {
                                                str2 = String.valueOf(str2).concat(" logContext");
                                            }
                                            if (cvwtVar.d == null) {
                                                str2 = String.valueOf(str2).concat(" visualElements");
                                            }
                                            if (cvwtVar.e == null) {
                                                str2 = String.valueOf(str2).concat(" privacyPolicyClickListener");
                                            }
                                            if (cvwtVar.f == null) {
                                                str2 = String.valueOf(str2).concat(" termsOfServiceClickListener");
                                            }
                                            if (cvwtVar.i == null) {
                                                str2 = String.valueOf(str2).concat(" clickRunnables");
                                            }
                                            if (!str2.isEmpty()) {
                                                String valueOf2 = String.valueOf(str2);
                                                throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
                                            }
                                            cvwu cvwuVar = new cvwu(cvwtVar.a, cvwtVar.b, cvwtVar.c, cvwtVar.d, cvwtVar.e, cvwtVar.f, cvwtVar.g, cvwtVar.h, cvwtVar.i);
                                            cvxeVar.j = cvwuVar.b();
                                            cvxeVar.k = cvwuVar.c();
                                            cvxeVar.o = cvwuVar.d();
                                            cvxeVar.l = cvwuVar.a();
                                            cvxeVar.n = cvwuVar.i();
                                            cvxeVar.h.clear();
                                            cvxeVar.c.setOnClickListener(cvxeVar.i(cvwuVar.e(), 18));
                                            cvxeVar.d.setOnClickListener(cvxeVar.i(cvwuVar.f(), 19));
                                            if (cvwuVar.h().a()) {
                                                dbsk.a(cvwuVar.g().a());
                                                cvxeVar.e.setText(cvwuVar.g().b().intValue());
                                                cvxeVar.e.setOnClickListener(cvxeVar.i((cvub) cvwuVar.h().b(), 22));
                                                cvxeVar.g.setVisibility(0);
                                                cvxeVar.e.setVisibility(0);
                                                cvxe.h(cvxeVar.f, 0);
                                                cvxeVar.d(8388613, 1, 8388611);
                                                cvxeVar.h.add(new cvxc(cvxeVar));
                                                cvxeVar.h.add(new cvxb(cvxeVar));
                                            }
                                            cvxeVar.h.add(new cvxd(cvxeVar));
                                            cvxeVar.m = new cvxa(cvxeVar);
                                            cvxeVar.o.b(cvxeVar.c, 90532);
                                            cvxeVar.o.b(cvxeVar.d, 90533);
                                            cvxeVar.o.b(cvxeVar.e, 90534);
                                            int dimensionPixelSize = cvxeVar.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing);
                                            cvxeVar.setPadding(cvxeVar.getPaddingLeft() + dimensionPixelSize, cvxeVar.getPaddingTop(), cvxeVar.getPaddingRight() + dimensionPixelSize, cvxeVar.getPaddingBottom());
                                            return cvxeVar;
                                        }
                                        throw new NullPointerException("Null customItemClickListener");
                                    }
                                    throw new NullPointerException("Null customItemLabelStringId");
                                }
                                throw new NullPointerException("Null termsOfServiceClickListener");
                            }
                            throw new NullPointerException("Null privacyPolicyClickListener");
                        }
                        throw new NullPointerException("Null visualElements");
                    }
                    throw new NullPointerException("Null logContext");
                }
                throw new NullPointerException("Null eventLogger");
            }
        };
        this.e = cwhq.a;
        this.f = cwhr.a;
        this.g = new cwqi(cvzeVar, cwgtVar, dtgbVar) { // from class: cwgk
            private final cvze a;
            private final cwii b;
            private final dtgb c;

            {
                this.a = cvzeVar;
                this.b = cwgtVar;
                this.c = dtgbVar;
            }

            @Override // defpackage.cwqi
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final cvze cvzeVar2 = this.a;
                cwii cwiiVar = this.b;
                final dtgb dtgbVar2 = this.c;
                cwhv cwhvVar = new cwhv(layoutInflater.getContext());
                View findViewById = cwhvVar.findViewById(R.id.sign_in_button);
                cwiw cwiwVar = new cwiw(new View.OnClickListener(cvzeVar2, dtgbVar2) { // from class: cwhu
                    private final cvze a;
                    private final dtgb b;

                    {
                        this.a = cvzeVar2;
                        this.b = dtgbVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cvze cvzeVar3 = this.a;
                        dtgb dtgbVar3 = this.b;
                        cwjw e = cvzeVar3.e();
                        dsqp dsqpVar = (dsqp) dtgbVar3.cu(5);
                        dsqpVar.bC(dtgbVar3);
                        dtga dtgaVar = (dtga) dsqpVar;
                        if (dtgaVar.c) {
                            dtgaVar.bF();
                            dtgaVar.c = false;
                        }
                        dtgb dtgbVar4 = (dtgb) dtgaVar.b;
                        dtgb dtgbVar5 = dtgb.g;
                        dtgbVar4.b = 10;
                        dtgbVar4.a |= 1;
                        e.a(null, dtgaVar.bK());
                        cvzeVar3.b().b().a(view, null);
                    }
                });
                cwiwVar.c = cwiiVar.a();
                cwiwVar.d = cwiiVar.b();
                findViewById.setOnClickListener(cwiwVar.a());
                cwjc.a(cwhvVar.a, new cvzt(cwhvVar.getContext(), cvzeVar2.k(), cvzeVar2.c().g(), new cvzv(cwhvVar.getContext(), cvzeVar2, cwiiVar, dtgbVar2).a(), cwhvVar.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing)));
                cwhvVar.a.setNestedScrollingEnabled(false);
                RecyclerView recyclerView = cwhvVar.a;
                cwhvVar.getContext();
                recyclerView.setLayoutManager(new aag());
                return cwhvVar;
            }
        };
        this.h = new cwqi(cwqlVar, cvzeVar, cwgtVar, dtgbVar) { // from class: cwgl
            private final cwql a;
            private final cvze b;
            private final cwii c;
            private final dtgb d;

            {
                this.a = cwqlVar;
                this.b = cvzeVar;
                this.c = cwgtVar;
                this.d = dtgbVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
            @Override // defpackage.cwqi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View a(android.view.LayoutInflater r18, android.view.ViewGroup r19) {
                /*
                    Method dump skipped, instructions count: 339
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwgl.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
            }
        };
        this.i = new cwqi(this, cwqlVar, cvzeVar, cwgtVar, dtgbVar) { // from class: cwgm
            private final cwgx a;
            private final cwql b;
            private final cvze c;
            private final cwii d;
            private final dtgb e;

            {
                this.a = this;
                this.b = cwqlVar;
                this.c = cvzeVar;
                this.d = cwgtVar;
                this.e = dtgbVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x0301  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0337  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0362  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0394  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x03d1  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x03d3  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x03de  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0433  */
            @Override // defpackage.cwqi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View a(android.view.LayoutInflater r37, android.view.ViewGroup r38) {
                /*
                    Method dump skipped, instructions count: 1086
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwgm.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
            }
        };
        this.j = new cwqi(cvzeVar, cwgtVar, dtgbVar) { // from class: cwgn
            private final cvze a;
            private final cwii b;
            private final dtgb c;

            {
                this.a = cvzeVar;
                this.b = cwgtVar;
                this.c = dtgbVar;
            }

            @Override // defpackage.cwqi
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final cvze cvzeVar2 = this.a;
                cwii cwiiVar = this.b;
                final dtgb dtgbVar2 = this.c;
                cwht cwhtVar = new cwht(layoutInflater.getContext());
                dbsk.a(cvzeVar2.c().a().a());
                MaterialButton materialButton = (MaterialButton) cwhtVar.findViewById(R.id.turn_off_incognito_button);
                cwef b = cvzeVar2.c().a().b();
                materialButton.setText(b.b());
                materialButton.setIcon(b.e(cwhtVar.getContext()));
                cwiw cwiwVar = new cwiw(new View.OnClickListener(cvzeVar2, dtgbVar2) { // from class: cwhs
                    private final cvze a;
                    private final dtgb b;

                    {
                        this.a = cvzeVar2;
                        this.b = dtgbVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cvze cvzeVar3 = this.a;
                        dtgb dtgbVar3 = this.b;
                        cvzeVar3.g().b().a(false);
                        cwjw e = cvzeVar3.e();
                        dsqp dsqpVar = (dsqp) dtgbVar3.cu(5);
                        dsqpVar.bC(dtgbVar3);
                        dtga dtgaVar = (dtga) dsqpVar;
                        if (dtgaVar.c) {
                            dtgaVar.bF();
                            dtgaVar.c = false;
                        }
                        dtgb dtgbVar4 = (dtgb) dtgaVar.b;
                        dtgb dtgbVar5 = dtgb.g;
                        dtgbVar4.b = 7;
                        dtgbVar4.a |= 1;
                        e.b(dtgaVar.bK());
                    }
                });
                cwiwVar.c = cwiiVar.a();
                cwiwVar.d = cwiiVar.b();
                materialButton.setOnClickListener(cwiwVar.a());
                Context context = cwhtVar.getContext();
                cwla k = cvzeVar2.k();
                cwee g = cvzeVar2.c().g();
                cvzv cvzvVar = new cvzv(cwhtVar.getContext(), cvzeVar2, cwiiVar, dtgbVar2);
                cvzvVar.a = true;
                cvzvVar.b = true;
                cwjc.a(cwhtVar.a, new cvzt(context, k, g, cvzvVar.a(), cwhtVar.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing)));
                cwhtVar.a.setNestedScrollingEnabled(false);
                RecyclerView recyclerView = cwhtVar.a;
                cwhtVar.getContext();
                recyclerView.setLayoutManager(new aag());
                return cwhtVar;
            }
        };
        this.k = cwgo.a;
        this.b = new cwgu(this);
        cwgw cwgwVar = new cwgw(this, cvzeVar);
        cwqlVar.ak = cwgwVar;
        if (!cwqlVar.ae) {
            return;
        }
        cwgwVar.a();
    }

    public static final dbsg<cvwn<T>> b(cvze<T> cvzeVar, cwql cwqlVar) {
        if (cvzeVar.c().h().a()) {
            cvwm<T> b = cvzeVar.c().h().b();
            czhz.b();
            dbsk.b(cwqlVar.P != null, "getViewLifecycleOwner is only allowed when fragment.getView() is not null");
            return dbsg.i(new cvwr(b, cwqlVar.x()));
        }
        return dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ View c(LayoutInflater layoutInflater) {
        View view = new View(layoutInflater.getContext());
        view.setVisibility(8);
        return view;
    }

    public final void d(int i) {
        cwjw<T> e = this.a.e();
        T e2 = this.a.a().e();
        dtga bZ = dtgb.g.bZ();
        dtgh dtghVar = dtgh.ACCOUNT_MENU_COMPONENT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtgb dtgbVar = (dtgb) bZ.b;
        dtgbVar.c = dtghVar.u;
        dtgbVar.a |= 2;
        dtgb dtgbVar2 = (dtgb) bZ.b;
        dtgbVar2.e = 8;
        dtgbVar2.a |= 32;
        dtgb dtgbVar3 = (dtgb) bZ.b;
        dtgbVar3.d = 3;
        int i2 = 8 | dtgbVar3.a;
        dtgbVar3.a = i2;
        dtgbVar3.b = i - 1;
        dtgbVar3.a = i2 | 1;
        e.a(e2, bZ.bK());
    }

    public final void a() {
        int i = !this.a.a().a ? 1 : (!this.a.g().a() || !this.a.g().b().a) ? this.a.a().l().isEmpty() ? 3 : true != this.a.a().d() ? 4 : 5 : 2;
        if (i != this.m) {
            this.m = i;
            dbsk.l(true);
            cwpg cwpgVar = new cwpg();
            int i2 = i - 1;
            cwqi cwqiVar = i2 != 0 ? i2 != 3 ? this.e : this.f : this.l;
            if (cwqiVar == null) {
                throw new NullPointerException("Null headerViewProvider");
            }
            cwpgVar.a = cwqiVar;
            cwqi cwqiVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? this.i : this.h : this.g : this.j : this.k;
            if (cwqiVar2 == null) {
                throw new NullPointerException("Null contentViewProvider");
            }
            cwpgVar.b = cwqiVar2;
            cwqi cwqiVar3 = i == 1 ? this.l : this.d;
            if (cwqiVar3 == null) {
                throw new NullPointerException("Null footerViewProvider");
            }
            cwpgVar.c = cwqiVar3;
            cwpgVar.d = Integer.valueOf(i == 4 ? R.string.og_choose_an_account_ : R.string.og_account_menu_popover_title);
            cwql cwqlVar = this.c;
            String str = cwpgVar.a == null ? " headerViewProvider" : "";
            if (cwpgVar.b == null) {
                str = str.concat(" contentViewProvider");
            }
            if (cwpgVar.c == null) {
                str = String.valueOf(str).concat(" footerViewProvider");
            }
            if (cwpgVar.d == null) {
                str = String.valueOf(str).concat(" title");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            cwph cwphVar = new cwph(cwpgVar.a, cwpgVar.b, cwpgVar.c, cwpgVar.d.intValue());
            czhz.b();
            cwqlVar.ag = cwphVar;
            ExpandableDialogView expandableDialogView = cwqlVar.ah;
            if (expandableDialogView != null) {
                cwql.aK(cwphVar, expandableDialogView);
                SparseArray<Parcelable> sparseArray = cwqlVar.af;
                if (sparseArray != null) {
                    cwqlVar.ah.restoreHierarchyState(sparseArray);
                    cwqlVar.af = null;
                }
            }
            Dialog dialog = cwqlVar.d;
            if (dialog == null) {
                return;
            }
            dialog.setTitle(cwphVar.d);
        }
    }
}
