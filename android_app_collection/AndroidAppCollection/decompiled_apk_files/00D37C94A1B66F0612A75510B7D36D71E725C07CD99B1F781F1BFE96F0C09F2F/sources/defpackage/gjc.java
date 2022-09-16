package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gjc  reason: default package */
/* loaded from: classes3.dex */
public final class gjc implements aafl {
    private final yrj a;
    private final lmo b;
    private final lnd c;

    public gjc(yrj yrjVar, lmo lmoVar, lnd lndVar) {
        this.a = yrjVar;
        this.b = lmoVar;
        this.c = lndVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arag aragVar;
        arag aragVar2;
        if (this.a.o()) {
            lnd lndVar = this.c;
            Activity activity = (Activity) lndVar.a.get();
            activity.getClass();
            ajxz ajxzVar = (ajxz) lndVar.b.get();
            ajxzVar.getClass();
            aafo aafoVar = (aafo) lndVar.c.get();
            aafoVar.getClass();
            acut acutVar = (acut) lndVar.d.get();
            acutVar.getClass();
            yni yniVar = (yni) lndVar.e.get();
            yniVar.getClass();
            final lnc lncVar = new lnc(activity, ajxzVar, aafoVar, acutVar, yniVar);
            CreationEntryEndpointOuterClass$CreationEntryEndpoint creationEntryEndpointOuterClass$CreationEntryEndpoint = (CreationEntryEndpointOuterClass$CreationEntryEndpoint) apzgVar.qm(CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint);
            creationEntryEndpointOuterClass$CreationEntryEndpoint.getClass();
            nx nxVar = lncVar.f;
            if (nxVar != null && nxVar.isShowing()) {
                return;
            }
            lncVar.d.d(acuo.a(36216), apzgVar, null);
            View inflate = lncVar.a.getLayoutInflater().inflate(R.layout.creation_entry_sheet, (ViewGroup) null, false);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.creation_entry_point_items);
            apow apowVar = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
            if (apowVar == null) {
                apowVar = apow.a;
            }
            aqxo.y(1 == (apowVar.b & 1));
            apow apowVar2 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
            if (apowVar2 == null) {
                apowVar2 = apow.a;
            }
            apov apovVar = apowVar2.c;
            if (apovVar == null) {
                apovVar = apov.a;
            }
            if ((apovVar.b & 1) != 0) {
                TextView textView = (TextView) inflate.findViewById(R.id.creation_sheet_title);
                apow apowVar3 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
                if (apowVar3 == null) {
                    apowVar3 = apow.a;
                }
                apov apovVar2 = apowVar3.c;
                if (apovVar2 == null) {
                    apovVar2 = apov.a;
                }
                arag aragVar3 = apovVar2.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                textView.setText(ajgl.b(aragVar3));
            }
            apow apowVar4 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
            if (apowVar4 == null) {
                apowVar4 = apow.a;
            }
            apov apovVar3 = apowVar4.c;
            if (apovVar3 == null) {
                apovVar3 = apov.a;
            }
            for (apou apouVar : apovVar3.c) {
                final apoj apojVar = apouVar.b;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                View inflate2 = lncVar.a.getLayoutInflater().inflate(R.layout.creation_entry_item, (ViewGroup) linearLayout, false);
                TextView textView2 = (TextView) inflate2.findViewById(R.id.text);
                if ((apojVar.b & 256) != 0) {
                    aragVar = apojVar.i;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView2.setText(ajgl.b(aragVar));
                if ((apojVar.b & 256) != 0) {
                    aragVar2 = apojVar.i;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                inflate2.setContentDescription(ajgl.b(aragVar2));
                lj.M(inflate2, new yyu());
                if ((apojVar.b & 32) != 0) {
                    ajxz ajxzVar2 = lncVar.b;
                    arhs arhsVar = apojVar.g;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    ((ImageView) inflate2.findViewById(R.id.image)).setImageResource(ajxzVar2.a(b));
                }
                inflate2.setOnClickListener(new View.OnClickListener() { // from class: lnb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        apzg apzgVar2;
                        lnc lncVar2 = lnc.this;
                        apoj apojVar2 = apojVar;
                        lncVar2.f.dismiss();
                        if ((apojVar2.b & 16384) != 0 && ((acsx) lncVar2.d).i != null) {
                            apzg apzgVar3 = apojVar2.o;
                            if (apzgVar3 == null) {
                                apzgVar3 = apzg.a;
                            }
                            aopa mo52toBuilder = ((atnp) apzgVar3.qm(atno.b)).mo52toBuilder();
                            String str = ((acsx) lncVar2.d).i.a;
                            mo52toBuilder.copyOnWrite();
                            atnp atnpVar = (atnp) mo52toBuilder.instance;
                            str.getClass();
                            atnpVar.b |= 1;
                            atnpVar.c = str;
                            aopc aopcVar = (aopc) apojVar2.mo52toBuilder();
                            apzg apzgVar4 = apojVar2.o;
                            if (apzgVar4 == null) {
                                apzgVar4 = apzg.a;
                            }
                            aopc aopcVar2 = (aopc) apzgVar4.mo52toBuilder();
                            aopcVar2.e(atno.b, (atnp) mo52toBuilder.mo39build());
                            aopcVar.copyOnWrite();
                            apoj apojVar3 = (apoj) aopcVar.instance;
                            apzg apzgVar5 = (apzg) aopcVar2.mo39build();
                            apzgVar5.getClass();
                            apojVar3.o = apzgVar5;
                            apojVar3.b |= 16384;
                            apojVar2 = (apoj) aopcVar.mo39build();
                        }
                        aafo aafoVar2 = lncVar2.c;
                        if ((apojVar2.b & 16384) != 0) {
                            apzgVar2 = apojVar2.o;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                        } else {
                            apzgVar2 = null;
                        }
                        aafoVar2.c(apzgVar2, null);
                    }
                });
                lncVar.d.n(new acte(apojVar.t));
                linearLayout.addView(inflate2);
            }
            nx nxVar2 = lncVar.f;
            if (nxVar2 == null) {
                nw nwVar = new nw(lncVar.a, R.style.CreationEntryDialog);
                nwVar.p(inflate);
                lncVar.f = nwVar.b();
                lncVar.f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: lna
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        lnc lncVar2 = lnc.this;
                        lncVar2.e.g(lncVar2);
                    }
                });
                lncVar.f.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: lmz
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        lnc lncVar2 = lnc.this;
                        lncVar2.e.m(lncVar2);
                    }
                });
                lncVar.f.show();
                Window window = lncVar.f.getWindow();
                int dimensionPixelSize = lncVar.a.getResources().getDimensionPixelSize(R.dimen.creation_sheet_dialog_width);
                if (dimensionPixelSize <= 0) {
                    dimensionPixelSize = -1;
                }
                window.setLayout(dimensionPixelSize, -2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                return;
            }
            nxVar2.a.c(inflate);
            lncVar.f.show();
            return;
        }
        this.b.b();
    }
}
