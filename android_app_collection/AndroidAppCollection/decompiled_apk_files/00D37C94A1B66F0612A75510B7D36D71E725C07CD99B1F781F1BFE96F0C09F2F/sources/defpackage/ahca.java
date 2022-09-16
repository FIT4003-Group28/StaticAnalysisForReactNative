package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahca  reason: default package */
/* loaded from: classes.dex */
public final class ahca {
    public final Activity a;
    public final aafo b;
    public final agvq c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final AlertDialog i;
    public final TextView j;
    public final akbm k;
    public final akbm l;
    public final ajgy m;
    public apoj n;
    public apoj o;
    public acti p;
    public final NonScrollableListView q;
    public final ahbu r;
    public DialogInterface.OnDismissListener s;
    private final ajmy t;

    public ahca(Activity activity, aafo aafoVar, agvq agvqVar, ajmy ajmyVar, akbn akbnVar, final ajgz ajgzVar, final akdh akdhVar) {
        ahbr ahbrVar;
        this.a = activity;
        this.b = aafoVar;
        this.c = agvqVar;
        this.t = ajmyVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.upsell_dialog_with_header_images, (ViewGroup) null);
        NonScrollableListView nonScrollableListView = (NonScrollableListView) inflate.findViewById(R.id.offline_stream_selection_list);
        this.q = nonScrollableListView;
        ahbu ahbuVar = new ahbu(activity, nonScrollableListView);
        this.r = ahbuVar;
        nonScrollableListView.c = ahbuVar;
        ListAdapter listAdapter = nonScrollableListView.b;
        if (listAdapter != null && (ahbrVar = nonScrollableListView.d) != null) {
            listAdapter.unregisterDataSetObserver(ahbrVar);
        }
        nonScrollableListView.b = ahbuVar;
        nonScrollableListView.a();
        if (nonScrollableListView.d == null) {
            nonScrollableListView.d = new ahbr(nonScrollableListView);
        }
        ahbuVar.registerDataSetObserver(nonScrollableListView.d);
        this.d = (ImageView) inflate.findViewById(R.id.background_image);
        this.e = (ImageView) inflate.findViewById(R.id.logo);
        this.f = (TextView) inflate.findViewById(R.id.dialog_title);
        this.g = (TextView) inflate.findViewById(R.id.dialog_subtitle);
        this.h = (TextView) inflate.findViewById(R.id.dialog_message);
        TextView textView = (TextView) inflate.findViewById(R.id.dismiss_button);
        this.j = textView;
        akbm a = akbnVar.a(textView);
        this.l = a;
        akbm a2 = akbnVar.a((TextView) inflate.findViewById(R.id.action_button));
        this.k = a2;
        final AlertDialog create = new AlertDialog.Builder(activity).setView(inflate).create();
        this.i = create;
        create.getClass();
        this.m = new ajgy() { // from class: ahby
            @Override // defpackage.ajgy
            public final void lL() {
                create.dismiss();
            }
        };
        create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ahbv
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ahca ahcaVar = ahca.this;
                akdh akdhVar2 = akdhVar;
                ahcaVar.l.onClick(ahcaVar.j);
                akdhVar2.a = false;
            }
        });
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ahbx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ahca ahcaVar = ahca.this;
                ajgz ajgzVar2 = ajgzVar;
                akdh akdhVar2 = akdhVar;
                ajgzVar2.a(ahcaVar.m);
                akdhVar2.a = true;
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ahbw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ahca ahcaVar = ahca.this;
                ajgz ajgzVar2 = ajgzVar;
                akdh akdhVar2 = akdhVar;
                ajgzVar2.d(ahcaVar.m);
                DialogInterface.OnDismissListener onDismissListener = ahcaVar.s;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                akdhVar2.a = false;
            }
        });
        akbi akbiVar = new akbi() { // from class: ahbz
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                ahca ahcaVar = ahca.this;
                acti actiVar = ahcaVar.p;
                if (actiVar != null) {
                    apoj apojVar = (apoj) aopcVar.instance;
                    if ((apojVar.b & 16384) != 0) {
                        apzg apzgVar = apojVar.o;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        if (!apzgVar.qn(atno.b)) {
                            apzg apzgVar2 = ((apoj) aopcVar.instance).o;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            apzg f = actiVar.f(apzgVar2);
                            if (f == null) {
                                aopcVar.copyOnWrite();
                                apoj apojVar2 = (apoj) aopcVar.instance;
                                apojVar2.o = null;
                                apojVar2.b &= -16385;
                            } else {
                                aopcVar.copyOnWrite();
                                apoj apojVar3 = (apoj) aopcVar.instance;
                                apojVar3.o = f;
                                apojVar3.b |= 16384;
                            }
                        }
                    }
                }
                ahcaVar.i.dismiss();
            }
        };
        a.d = akbiVar;
        a2.d = akbiVar;
    }

    public final void a(ImageView imageView, avhn avhnVar) {
        if (avhnVar == null) {
            imageView.setVisibility(8);
            return;
        }
        this.t.k(imageView, avhnVar, ajmu.b);
        imageView.setVisibility(0);
    }
}
