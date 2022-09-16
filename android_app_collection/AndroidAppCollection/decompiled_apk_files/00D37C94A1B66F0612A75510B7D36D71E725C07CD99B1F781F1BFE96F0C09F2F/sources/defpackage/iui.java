package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CloseStreamEndScreenCommandOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iui  reason: default package */
/* loaded from: classes3.dex */
public final class iui implements aafl {
    private final Activity a;
    private final aafo b;
    private final /* synthetic */ int c;

    public iui(Activity activity, aafo aafoVar) {
        this.a = activity;
        this.b = aafoVar;
    }

    public iui(Activity activity, aafo aafoVar, int i) {
        this.c = i;
        this.a = activity;
        this.b = aafoVar;
    }

    public iui(Activity activity, aafo aafoVar, int i, byte[] bArr) {
        this.c = i;
        this.a = activity;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    private final void b(apem apemVar, Map map) {
        if ((apemVar.b & 4) == 0) {
            zag.q(this.a, R.string.error_generic, 0);
            return;
        }
        aafo aafoVar = this.b;
        apzg apzgVar = apemVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, map);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arag aragVar;
        apoj apojVar;
        arag aragVar2;
        int i = this.c;
        if (i == 0) {
            if (apzgVar.qn(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint)) {
                LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint = (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint) apzgVar.qm(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint);
                asql asqlVar = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b;
                if (asqlVar == null) {
                    asqlVar = asql.a;
                }
                if ((asqlVar.b & 1) == 0) {
                    return;
                }
                asql asqlVar2 = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b;
                if (asqlVar2 == null) {
                    asqlVar2 = asql.a;
                }
                asqn asqnVar = asqlVar2.c;
                if (asqnVar == null) {
                    asqnVar = asqn.a;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
                if ((asqnVar.b & 1) != 0) {
                    aragVar = asqnVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                AlertDialog.Builder message = builder.setTitle(ajgl.b(aragVar)).setMessage(ajgl.k("\n\n", aafv.c((arag[]) asqnVar.d.toArray(new arag[0]), this.b, true)));
                asqm asqmVar = asqnVar.e;
                if (asqmVar == null) {
                    asqmVar = asqm.a;
                }
                if (asqmVar.b != 65153809) {
                    message.setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
                } else {
                    asqm asqmVar2 = asqnVar.e;
                    if (asqmVar2 == null) {
                        asqmVar2 = asqm.a;
                    }
                    if (asqmVar2.b == 65153809) {
                        apojVar = (apoj) asqmVar2.c;
                    } else {
                        apojVar = apoj.a;
                    }
                    if ((apojVar.b & 256) != 0) {
                        aragVar2 = apojVar.i;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    message.setPositiveButton(ajgl.b(aragVar2), (DialogInterface.OnClickListener) null);
                }
                message.create().show();
            }
        } else {
            if (i == 1) {
                Intent C = zgt.C();
                apem apemVar = (apem) apzgVar.qm(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                C.setClassName(apemVar.c, apemVar.d);
                for (asmc asmcVar : apemVar.e) {
                    C.putExtra(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
                }
                if (!this.a.getPackageManager().queryIntentActivities(C, 128).isEmpty()) {
                    try {
                        this.a.startActivity(C);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        b(apemVar, map);
                        return;
                    }
                }
                b(apemVar, map);
                return;
            }
            apyv apyvVar = (apyv) apzgVar.qm(CloseStreamEndScreenCommandOuterClass.closeStreamEndScreenCommand);
            if ((apyvVar.b & 1) != 0) {
                aafo aafoVar = this.b;
                apzg apzgVar2 = apyvVar.c;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar.a(apzgVar2);
            }
            this.a.finish();
        }
    }
}
