package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cqch  reason: default package */
/* loaded from: classes5.dex */
public class cqch extends cqbg {
    private dskf ad;
    public cqcp ae;
    public cqbn af;
    public Account ag;
    public cqbw ah;
    private dsmh ai;
    private final AtomicBoolean aj = new AtomicBoolean(false);

    private final void aM(int i) {
        if (!this.aj.getAndSet(true)) {
            this.ah.b(i);
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        super.Qi(context);
        Account account = (Account) this.o.getParcelable("Account");
        this.ag = account;
        dbsk.t(account, "No account provided. Did you call setArguments() before attaching the fragment?");
        dskf dskfVar = (dskf) this.o.getSerializable("SettingId");
        this.ad = dskfVar;
        dbsk.t(dskfVar, "No setting provided. Did you call setArguments() before attaching the fragment?");
        dsmh dsmhVar = (dsmh) this.o.getSerializable("FlowId");
        this.ai = dsmhVar;
        dbsk.t(dsmhVar, "No uiFlowId provided. Did you call setArguments() before attaching the fragment?");
        cqcp cqcpVar = (cqcp) av.b(this, new cqcn(J().getApplication(), this.ag, this.ad, this.ai)).a(cqcp.class);
        this.ae = cqcpVar;
        cqcpVar.d.b(this, new aa(this) { // from class: cqcb
            private final cqch a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dgyj dgyjVar;
                cqch cqchVar = this.a;
                cqcm cqcmVar = cqcm.CONSENT_DATA_LOADING;
                switch (((cqcm) obj).ordinal()) {
                    case 0:
                        cqchVar.af.setUiState(cqbm.CONSENT_DATA_LOADING);
                        return;
                    case 1:
                        dslz dslzVar = cqchVar.ae.h;
                        if (dslzVar.b == 1) {
                            dgyjVar = (dgyj) dslzVar.c;
                        } else {
                            dgyjVar = dgyj.g;
                        }
                        cqchVar.af.setAccountName(cqchVar.ag.name);
                        cqbn cqbnVar = cqchVar.af;
                        dczt dcztVar = dgyjVar.a;
                        if (dcztVar == null) {
                            dcztVar = dczt.b;
                        }
                        cqbnVar.setTitle(cqbt.a(dcztVar));
                        cqchVar.af.setDescriptionParagraphs(cqbt.b(dgyjVar.b));
                        cqchVar.af.setAdditionalInfoParagraphs(cqbt.b(dgyjVar.c));
                        cqchVar.af.setFooterParagraphs(cqbt.b(dgyjVar.d));
                        cqchVar.af.setPositiveButtonCaption(dgyjVar.e);
                        cqchVar.af.setNegativeButtonCaption(dgyjVar.f);
                        cqchVar.af.setUiState(cqbm.WAITING_FOR_USER_DECISION);
                        return;
                    case 2:
                        cqchVar.af.setUiState(cqbm.CONSENT_WRITE_IN_PROGRESS);
                        return;
                    case 3:
                        cqchVar.aJ(1);
                        cqchVar.f();
                        return;
                    case 4:
                        Toast.makeText(cqchVar.H(), (int) R.string.non_retriable_error_message, 0).show();
                        cqchVar.aJ(4);
                        cqchVar.f();
                        return;
                    case 5:
                        Toast.makeText(cqchVar.H(), (int) R.string.already_consented_message, 0).show();
                        cqchVar.aJ(5);
                        cqchVar.f();
                        return;
                    case 6:
                        cqchVar.af.setUiState(cqbm.CONSENT_DATA_LOADING_FAILED);
                        return;
                    default:
                        return;
                }
            }
        });
        this.ae.e.b(this, new aa(this) { // from class: cqcc
            private final cqch a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.af.setAccountDisplayName((String) obj);
            }
        });
        this.ae.f.b(this, new aa(this) { // from class: cqcd
            private final cqch a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.af.setAccountAvatar((Bitmap) obj);
            }
        });
        this.ah = cqbv.a(context, Integer.valueOf(this.ae.i), this.ai, this.ag, this.ad);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aJ(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqbg
    public final void aK() {
        aM(12);
    }

    @Override // defpackage.cqbg, defpackage.fd
    public final void ah(View view, Bundle bundle) {
        super.ah(view, bundle);
        cqbn cqbnVar = (cqbn) view;
        this.af = cqbnVar;
        cqbnVar.setPositiveButtonCallback(new View.OnClickListener(this) { // from class: cqce
            private final cqch a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cqch cqchVar = this.a;
                cqchVar.ah.b(9);
                cqchVar.ae.c(cqcm.CONSENT_WRITE_IN_PROGRESS);
            }
        });
        this.af.setNegativeButtonCallback(new View.OnClickListener(this) { // from class: cqcf
            private final cqch a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cqch cqchVar = this.a;
                cqchVar.ah.b(10);
                cqchVar.aJ(2);
                cqchVar.f();
            }
        });
        this.af.setRetryLoadingButtonCallback(new View.OnClickListener(this) { // from class: cqcg
            private final cqch a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cqch cqchVar = this.a;
                cqchVar.ah.b(6);
                cqchVar.ae.c(cqcm.CONSENT_DATA_LOADING);
            }
        });
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aM(11);
        aJ(this.ae.d.h() == cqcm.CONSENT_DATA_LOADING_FAILED ? 4 : 3);
    }
}
