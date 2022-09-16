package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePostCommandOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xvf  reason: default package */
/* loaded from: classes4.dex */
final class xvf implements View.OnClickListener {
    final /* synthetic */ xvj a;
    private final /* synthetic */ int b;

    public xvf(xvj xvjVar) {
        this.a = xvjVar;
    }

    public xvf(xvj xvjVar, int i) {
        this.b = i;
        this.a = xvjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim;
        int i = this.b;
        if (i == 0) {
            xxe xxeVar = this.a.am;
            if (xxeVar == null) {
                return;
            }
            xxeVar.c();
        } else if (i == 1) {
            xxe xxeVar2 = this.a.am;
            if (xxeVar2 == null) {
                return;
            }
            xxeVar2.c();
        } else if (i == 2) {
            xxe xxeVar3 = this.a.am;
            if (xxeVar3 == null) {
                return;
            }
            xxeVar3.c();
        } else if (i != 3) {
            if (i == 4) {
                xxe xxeVar4 = this.a.am;
                if (xxeVar4 == null) {
                    return;
                }
                xxeVar4.c();
                return;
            }
            xxe xxeVar5 = this.a.am;
            if (xxeVar5 != null) {
                xxeVar5.c();
            }
            Dialog dialog = this.a.d;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            if (this.a.al.getText().toString().trim().length() > 0) {
                new AlertDialog.Builder(this.a.mJ()).setMessage(R.string.discard_post).setNegativeButton(R.string.comments_discard_negative_button, new gzj(11)).setPositiveButton(R.string.comments_discard_positive_button, new xvi(dialog)).setCancelable(false).create().show();
            } else {
                dialog.dismiss();
            }
        } else {
            xvj xvjVar = this.a;
            if (xvjVar.an) {
                aplp aplpVar = xvjVar.ak;
                if ((aplpVar.b & 512) != 0) {
                    aafo aafoVar = xvjVar.ah;
                    apzg apzgVar = aplpVar.k;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                    return;
                }
            }
            if (xvjVar.aq == null) {
                return;
            }
            xxe xxeVar6 = xvjVar.am;
            if (xxeVar6 != null) {
                trim = xxeVar6.a();
            } else {
                trim = xvjVar.al.getText().toString().trim();
            }
            if (trim.length() <= 0) {
                return;
            }
            int length = trim.length();
            xvj xvjVar2 = this.a;
            if (length > xvjVar2.ak.i) {
                return;
            }
            xkj xkjVar = xvjVar2.aq;
            xkm xkmVar = xkjVar.a;
            aplp aplpVar2 = xkjVar.b;
            xkmVar.c.d = trim;
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xkmVar.c);
            aunb aunbVar = aplpVar2.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apzg apzgVar2 = ((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer)).n;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aqix aqixVar = (aqix) apzgVar2.qm(CreatePostCommandOuterClass.createPostCommand);
            arny arnyVar = aqixVar.c;
            if (arnyVar == null) {
                arnyVar = arny.a;
            }
            aopa mo52toBuilder = arnyVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            arny arnyVar2 = (arny) mo52toBuilder.instance;
            trim.getClass();
            arnyVar2.b = 4 | arnyVar2.b;
            arnyVar2.g = trim;
            aopa mo52toBuilder2 = aqixVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aqix aqixVar2 = (aqix) mo52toBuilder2.instance;
            arny arnyVar3 = (arny) mo52toBuilder.mo39build();
            arnyVar3.getClass();
            aqixVar2.c = arnyVar3;
            aqixVar2.b = 1 | aqixVar2.b;
            aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
            aopcVar.e(CreatePostCommandOuterClass.createPostCommand, (aqix) mo52toBuilder2.mo39build());
            xkmVar.b.c((apzg) aopcVar.mo39build(), hashMap);
            this.a.d.dismiss();
        }
    }
}
