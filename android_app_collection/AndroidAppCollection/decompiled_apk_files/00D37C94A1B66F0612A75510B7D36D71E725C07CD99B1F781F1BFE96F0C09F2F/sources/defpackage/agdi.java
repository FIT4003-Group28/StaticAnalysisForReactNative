package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: agdi  reason: default package */
/* loaded from: classes.dex */
public final class agdi implements afzf {
    final /* synthetic */ agdj a;

    public agdi(agdj agdjVar) {
        this.a = agdjVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ateu ateuVar;
        ateu ateuVar2;
        arxu arxuVar = (arxu) obj;
        agdj agdjVar = this.a;
        if (!agdjVar.c) {
            final agdm agdmVar = agdjVar.b;
            ates atesVar = arxuVar.c;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            atep atepVar = atesVar.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
            if ((atepVar.b & 4) != 0) {
                atev atevVar = atepVar.d;
                if (atevVar == null) {
                    atevVar = atev.a;
                }
                if (atevVar.b == 82258301) {
                    atev atevVar2 = atepVar.d;
                    if (atevVar2 == null) {
                        atevVar2 = atev.a;
                    }
                    if (atevVar2.b == 82258301) {
                        ateuVar = (ateu) atevVar2.c;
                    } else {
                        ateuVar = ateu.a;
                    }
                    if ((ateuVar.b & 1) != 0) {
                        agdh agdhVar = agdmVar.c;
                        atev atevVar3 = atepVar.d;
                        if (atevVar3 == null) {
                            atevVar3 = atev.a;
                        }
                        if (atevVar3.b == 82258301) {
                            ateuVar2 = (ateu) atevVar3.c;
                        } else {
                            ateuVar2 = ateu.a;
                        }
                        arag aragVar = ateuVar2.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        String str = aragVar.d;
                        CharSequence[] charSequenceArr = new CharSequence[atepVar.c.size()];
                        for (int i = 0; i < atepVar.c.size(); i++) {
                            aten atenVar = (aten) atepVar.c.get(i);
                            if ((atenVar.b & 2) != 0) {
                                ater aterVar = atenVar.d;
                                if (aterVar == null) {
                                    aterVar = ater.a;
                                }
                                if ((aterVar.b & 1) != 0) {
                                    ater aterVar2 = atenVar.d;
                                    if (aterVar2 == null) {
                                        aterVar2 = ater.a;
                                    }
                                    arag aragVar2 = aterVar2.c;
                                    if (aragVar2 == null) {
                                        aragVar2 = arag.a;
                                    }
                                    charSequenceArr[i] = aragVar2.d;
                                }
                            }
                        }
                        nw nwVar = new nw(agdhVar.a);
                        nwVar.o(str);
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: agdf
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                agdm agdmVar2 = agdm.this;
                                ater aterVar3 = ((aten) agdmVar2.b.c.get(i2)).d;
                                if (aterVar3 == null) {
                                    aterVar3 = ater.a;
                                }
                                apzg apzgVar = aterVar3.e;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                agdmVar2.a.c(apzgVar, null);
                            }
                        };
                        ns nsVar = nwVar.a;
                        nsVar.o = charSequenceArr;
                        nsVar.q = onClickListener;
                        nwVar.a.m = new DialogInterface.OnDismissListener() { // from class: agdg
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                agdm.this.c.a.finish();
                            }
                        };
                        nwVar.q();
                    }
                }
            }
            agdmVar.b = atepVar;
        }
    }
}
