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
/* renamed from: cqec  reason: default package */
/* loaded from: classes5.dex */
public class cqec extends cqbg {
    private dgyd ad;
    public cqen ae;
    public cqbn af;
    public Account ag;
    public cqew ah;
    private final AtomicBoolean ai = new AtomicBoolean(false);

    private final void aN(int i) {
        if (!this.ai.getAndSet(true)) {
            this.ah.b(i);
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        super.Qi(context);
        Account account = (Account) this.o.getParcelable("Account");
        this.ag = account;
        dbsk.t(account, "No account provided. Did you call setArguments() before attaching the fragment?");
        dgyd dgydVar = (dgyd) this.o.getSerializable("FlowId");
        this.ad = dgydVar;
        dbsk.t(dgydVar, "No flowId provided. Did you call setArguments() before attaching the fragment?");
        cqen cqenVar = (cqen) av.b(this, new cqel(J().getApplication(), this.ag, this.ad)).a(cqen.class);
        this.ae = cqenVar;
        cqenVar.d.b(this, new aa(this) { // from class: cqdw
            private final cqec a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dgyj dgyjVar;
                cqec cqecVar = this.a;
                cqek cqekVar = cqek.CONSENT_DATA_LOADING;
                switch (((cqek) obj).ordinal()) {
                    case 0:
                        cqecVar.af.setUiState(cqbm.CONSENT_DATA_LOADING);
                        return;
                    case 1:
                        dgyb dgybVar = cqecVar.ae.k;
                        if (dgybVar.a == 1) {
                            dgyjVar = (dgyj) dgybVar.b;
                        } else {
                            dgyjVar = dgyj.g;
                        }
                        cqecVar.af.setAccountName(cqecVar.ag.name);
                        cqbn cqbnVar = cqecVar.af;
                        dczt dcztVar = dgyjVar.a;
                        if (dcztVar == null) {
                            dcztVar = dczt.b;
                        }
                        cqbnVar.setTitle(cqbt.a(dcztVar));
                        cqecVar.af.setDescriptionParagraphs(cqbt.b(dgyjVar.b));
                        cqecVar.af.setAdditionalInfoParagraphs(cqbt.b(dgyjVar.c));
                        cqecVar.af.setFooterParagraphs(cqbt.b(dgyjVar.d));
                        cqecVar.af.setPositiveButtonCaption(dgyjVar.e);
                        cqecVar.af.setNegativeButtonCaption(dgyjVar.f);
                        cqecVar.af.setUiState(cqbm.WAITING_FOR_USER_DECISION);
                        return;
                    case 2:
                        cqecVar.af.setUiState(cqbm.CONSENT_WRITE_IN_PROGRESS);
                        return;
                    case 3:
                        cqecVar.aJ(1);
                        cqecVar.f();
                        return;
                    case 4:
                        Toast.makeText(cqecVar.H(), (int) R.string.non_retriable_error_message, 0).show();
                        cqecVar.aJ(4);
                        cqecVar.f();
                        return;
                    case 5:
                        Toast.makeText(cqecVar.H(), (int) R.string.already_consented_message, 0).show();
                        cqecVar.aJ(5);
                        cqecVar.f();
                        return;
                    case 6:
                        if (dyab.b(cqecVar.H())) {
                            cqbn cqbnVar2 = cqecVar.af;
                            cqen cqenVar2 = cqecVar.ae;
                            dbsk.l(true ^ dbsj.d(cqenVar2.l));
                            cqbnVar2.setErrorMessage(cqenVar2.l);
                        }
                        cqecVar.af.setUiState(cqbm.CONSENT_DATA_LOADING_FAILED);
                        return;
                    default:
                        return;
                }
            }
        });
        this.ae.e.b(this, new aa(this) { // from class: cqdx
            private final cqec a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.af.setAccountDisplayName((String) obj);
            }
        });
        this.ae.f.b(this, new aa(this) { // from class: cqdy
            private final cqec a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.af.setAccountAvatar((Bitmap) obj);
            }
        });
        this.ah = cqev.a(context, this.ag, this.ae.i, this.ad);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aJ(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqbg
    public final void aK() {
        aN(12);
    }

    public final void aM(Account account, dgyd dgydVar) {
        dbsk.t(account, "No account provided.");
        dbsk.t(dgydVar, "No flowId provided.");
        Bundle bundle = new Bundle();
        bundle.putParcelable("Account", account);
        bundle.putSerializable("FlowId", dgydVar);
        B(bundle);
    }

    @Override // defpackage.cqbg, defpackage.fd
    public final void ah(View view, Bundle bundle) {
        super.ah(view, bundle);
        cqbn cqbnVar = (cqbn) view;
        this.af = cqbnVar;
        cqbnVar.setPositiveButtonCallback(new View.OnClickListener(this) { // from class: cqdz
            private final cqec a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cqec cqecVar = this.a;
                cqecVar.ah.b(9);
                cqecVar.ae.c(cqek.CONSENT_WRITE_IN_PROGRESS);
            }
        });
        this.af.setNegativeButtonCallback(new View.OnClickListener(this) { // from class: cqea
            private final cqec a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cqec cqecVar = this.a;
                cqecVar.ah.b(10);
                cqecVar.aJ(2);
                cqecVar.f();
            }
        });
        this.af.setRetryLoadingButtonCallback(new View.OnClickListener(this) { // from class: cqeb
            private final cqec a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cqec cqecVar = this.a;
                cqecVar.ah.b(6);
                cqecVar.ae.c(cqek.CONSENT_DATA_LOADING);
            }
        });
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aN(11);
        aJ(this.ae.d.h() == cqek.CONSENT_DATA_LOADING_FAILED ? 4 : 3);
    }
}
