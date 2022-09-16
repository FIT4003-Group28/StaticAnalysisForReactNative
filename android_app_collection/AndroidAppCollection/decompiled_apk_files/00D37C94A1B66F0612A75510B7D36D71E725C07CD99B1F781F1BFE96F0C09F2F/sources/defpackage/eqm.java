package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.command.modal.ModalDialogController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ModalEndpointOuterClass$ModalEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqm  reason: default package */
/* loaded from: classes3.dex */
public final class eqm implements aafl {
    private final ModalDialogController a;

    public eqm(ModalDialogController modalDialogController) {
        this.a = modalDialogController;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        atif atifVar;
        ModalEndpointOuterClass$ModalEndpoint modalEndpointOuterClass$ModalEndpoint = (ModalEndpointOuterClass$ModalEndpoint) apzgVar.qm(ModalEndpointOuterClass$ModalEndpoint.modalEndpoint);
        atie atieVar = modalEndpointOuterClass$ModalEndpoint.b;
        if (atieVar == null) {
            atieVar = atie.a;
        }
        if (atieVar.b == 106613512) {
            atie atieVar2 = modalEndpointOuterClass$ModalEndpoint.b;
            if (atieVar2 == null) {
                atieVar2 = atie.a;
            }
            if (atieVar2.b == 106613512) {
                atifVar = (atif) atieVar2.c;
            } else {
                atifVar = atif.a;
            }
            final ModalDialogController modalDialogController = this.a;
            final boolean z = modalEndpointOuterClass$ModalEndpoint.c;
            if (atifVar == null) {
                return;
            }
            apok apokVar = atifVar.d;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return;
            }
            if (z) {
                modalDialogController.e.a();
            }
            modalDialogController.g();
            if (!modalDialogController.k) {
                modalDialogController.g = LayoutInflater.from(modalDialogController.a).inflate(R.layout.modal_dialog_button_panel, (ViewGroup) null);
                modalDialogController.h = (TextView) modalDialogController.g.findViewById(R.id.dialog_message);
                modalDialogController.j = modalDialogController.d.a((TextView) modalDialogController.g.findViewById(R.id.negative_button));
                akbj akbjVar = modalDialogController.j;
                aopc aopcVar = (aopc) apoj.a.createBuilder();
                arag h = ajgl.h(modalDialogController.a.getString(R.string.cancel));
                aopcVar.copyOnWrite();
                apoj apojVar = (apoj) aopcVar.instance;
                h.getClass();
                apojVar.i = h;
                apojVar.b |= 256;
                aopcVar.copyOnWrite();
                apoj apojVar2 = (apoj) aopcVar.instance;
                apojVar2.d = 13;
                apojVar2.c = 1;
                akbjVar.b((apoj) aopcVar.mo39build(), modalDialogController.c.oi());
                modalDialogController.i = modalDialogController.d.a((TextView) modalDialogController.g.findViewById(R.id.positive_button));
                modalDialogController.i.d = new akbi() { // from class: eqo
                    @Override // defpackage.akbi
                    public final void oL(aopc aopcVar2) {
                        ModalDialogController.this.g();
                    }
                };
                modalDialogController.k = true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(modalDialogController.a);
            arag aragVar = atifVar.b;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            modalDialogController.f = builder.setTitle(ajgl.b(aragVar)).setView(modalDialogController.g).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eqn
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ModalDialogController modalDialogController2 = ModalDialogController.this;
                    if (modalDialogController2.g.getParent() instanceof ViewGroup) {
                        ((ViewGroup) modalDialogController2.g.getParent()).removeView(modalDialogController2.g);
                    }
                    modalDialogController2.f = null;
                }
            }).create();
            modalDialogController.f.show();
            TextView textView = modalDialogController.h;
            arag aragVar2 = atifVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView.setText(ajgl.c(aragVar2, modalDialogController.b));
            akbj akbjVar2 = modalDialogController.i;
            apok apokVar2 = atifVar.d;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar3 = apokVar2.c;
            if (apojVar3 == null) {
                apojVar3 = apoj.a;
            }
            akbjVar2.b(apojVar3, modalDialogController.c.oi());
            modalDialogController.j.d = new akbi() { // from class: eqp
                @Override // defpackage.akbi
                public final void oL(aopc aopcVar2) {
                    ModalDialogController modalDialogController2 = ModalDialogController.this;
                    boolean z2 = z;
                    modalDialogController2.g();
                    if (z2) {
                        modalDialogController2.e.b();
                    }
                }
            };
        }
    }
}
