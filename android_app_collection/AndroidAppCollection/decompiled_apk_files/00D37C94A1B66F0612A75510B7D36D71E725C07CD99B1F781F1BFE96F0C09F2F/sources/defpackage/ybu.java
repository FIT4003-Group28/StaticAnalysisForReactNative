package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.YpcUpgradeDialogRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ybu  reason: default package */
/* loaded from: classes4.dex */
public final class ybu extends yas implements ydp {
    public ybm ae;
    public boolean af;
    DialogInterface.OnDismissListener ag;
    public ydt ah;
    public acth ai;
    public aafo aj;
    public aaqp ak;
    private Context al;
    private ashp am;

    @Override // defpackage.ydp
    public final void h() {
        dismiss();
    }

    @Override // defpackage.yas, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        this.al = context;
    }

    @Override // defpackage.ydp
    public final void mE() {
        ybm ybmVar = this.ae;
        if (ybmVar != null) {
            ybmVar.c(null);
        }
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        dismiss();
        ybm ybmVar = this.ae;
        if (ybmVar != null) {
            ybmVar.e(ashnVar);
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (this.m.containsKey("get_cart_response")) {
            this.am = (ashp) this.ak.a(this.m.getByteArray("get_cart_response"), ashp.a);
        }
        mN(0, 0);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aunb aunbVar;
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand;
        awjf awjfVar;
        aunb aunbVar2;
        layoutInflater.getClass();
        if (this.am != null) {
            this.d.setCanceledOnTouchOutside(true);
            View inflate = layoutInflater.inflate(R.layout.upgrade_dialog_wrapper, viewGroup, false);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.upgrade_dialog_view);
            ashp ashpVar = this.am;
            if (ashpVar.c == 15) {
                aunbVar = (aunb) ashpVar.d;
            } else {
                aunbVar = aunb.a;
            }
            aopa mo52toBuilder = ((awjf) aunbVar.qm(YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer)).mo52toBuilder();
            awjf awjfVar2 = (awjf) mo52toBuilder.mo39build();
            aunb aunbVar3 = awjfVar2.f;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apzg apzgVar = ((apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer)).n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                aunb aunbVar4 = awjfVar2.f;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                apzg apzgVar2 = ((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer)).n;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) apzgVar2.qm(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
            } else {
                inlineAuthCommandOuterClass$InlineAuthCommand = null;
            }
            HashMap hashMap = new HashMap();
            if (inlineAuthCommandOuterClass$InlineAuthCommand != null) {
                this.af = true;
                aafo aafoVar = this.aj;
                apzg apzgVar3 = inlineAuthCommandOuterClass$InlineAuthCommand.c;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new ybt(aafoVar, apzgVar3, this.ae));
                aopa mo52toBuilder2 = inlineAuthCommandOuterClass$InlineAuthCommand.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand2 = (InlineAuthCommandOuterClass$InlineAuthCommand) mo52toBuilder2.instance;
                inlineAuthCommandOuterClass$InlineAuthCommand2.c = null;
                inlineAuthCommandOuterClass$InlineAuthCommand2.b &= -2;
                InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand3 = (InlineAuthCommandOuterClass$InlineAuthCommand) mo52toBuilder2.mo39build();
                awjf awjfVar3 = (awjf) mo52toBuilder.instance;
                if ((awjfVar3.b & 4) == 0) {
                    awjfVar = (awjf) mo52toBuilder.mo39build();
                } else {
                    aunb aunbVar5 = awjfVar3.f;
                    if (aunbVar5 == null) {
                        aunbVar5 = aunb.a;
                    }
                    apoj apojVar = (apoj) aunbVar5.qm(ButtonRendererOuterClass.buttonRenderer);
                    apzg apzgVar4 = apojVar.n;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    aopc aopcVar = (aopc) apzgVar4.mo52toBuilder();
                    aopcVar.e(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand3);
                    apzg apzgVar5 = (apzg) aopcVar.mo39build();
                    aopc aopcVar2 = (aopc) apojVar.mo52toBuilder();
                    aopcVar2.copyOnWrite();
                    apoj apojVar2 = (apoj) aopcVar2.instance;
                    apzgVar5.getClass();
                    apojVar2.n = apzgVar5;
                    apojVar2.b |= 8192;
                    apoj apojVar3 = (apoj) aopcVar2.mo39build();
                    aunb aunbVar6 = ((awjf) mo52toBuilder.instance).f;
                    if (aunbVar6 == null) {
                        aunbVar6 = aunb.a;
                    }
                    aopc aopcVar3 = (aopc) aunbVar6.mo52toBuilder();
                    aopcVar3.e(ButtonRendererOuterClass.buttonRenderer, apojVar3);
                    mo52toBuilder.copyOnWrite();
                    awjf awjfVar4 = (awjf) mo52toBuilder.instance;
                    aunb aunbVar7 = (aunb) aopcVar3.mo39build();
                    aunbVar7.getClass();
                    awjfVar4.f = aunbVar7;
                    awjfVar4.b |= 4;
                    awjfVar = (awjf) mo52toBuilder.mo39build();
                }
                mo52toBuilder = awjfVar.mo52toBuilder();
                aopa mo52toBuilder3 = this.am.mo52toBuilder();
                ashp ashpVar2 = this.am;
                if (ashpVar2.c == 15) {
                    aunbVar2 = (aunb) ashpVar2.d;
                } else {
                    aunbVar2 = aunb.a;
                }
                aopc aopcVar4 = (aopc) aunbVar2.mo52toBuilder();
                aopcVar4.e(YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer, (awjf) mo52toBuilder.mo39build());
                mo52toBuilder3.copyOnWrite();
                ashp ashpVar3 = (ashp) mo52toBuilder3.instance;
                aunb aunbVar8 = (aunb) aopcVar4.mo39build();
                aunbVar8.getClass();
                ashpVar3.d = aunbVar8;
                ashpVar3.c = 15;
                this.am = (ashp) mo52toBuilder3.mo39build();
            } else {
                this.af = false;
                hashMap.put("PostTransactionCallback", this);
            }
            ydt ydtVar = this.ah;
            Context context = this.al;
            ybs ybsVar = new ybs(this, 1);
            ybs ybsVar2 = new ybs(this);
            context.getClass();
            aafo aafoVar2 = (aafo) ydtVar.a.get();
            aafoVar2.getClass();
            akbn akbnVar = (akbn) ydtVar.b.get();
            akbnVar.getClass();
            yds ydsVar = new yds(context, aafoVar2, akbnVar, ybsVar, ybsVar2, hashMap);
            frameLayout.addView(ydsVar.c);
            ajrs ajrsVar = new ajrs();
            ajrsVar.a(this.ai.oi());
            this.ag = ydsVar;
            ydsVar.oK(ajrsVar, (awjf) mo52toBuilder.mo39build());
            return inflate;
        }
        dismiss();
        ybm ybmVar = this.ae;
        if (ybmVar != null && this.d == null) {
            ybmVar.c(null);
        }
        return null;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ybm ybmVar = this.ae;
        if (ybmVar != null) {
            ybmVar.b();
        }
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.ag;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
