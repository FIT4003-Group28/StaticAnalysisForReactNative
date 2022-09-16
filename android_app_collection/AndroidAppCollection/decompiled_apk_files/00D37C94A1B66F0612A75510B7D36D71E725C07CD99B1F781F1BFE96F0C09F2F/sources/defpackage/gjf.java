package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gjf  reason: default package */
/* loaded from: classes3.dex */
public final class gjf implements aafl {
    public final Activity a;
    public final yni b;
    public final yzj c;
    public final Executor d;
    public final abdu e;
    private AlertDialog f;

    public gjf(Activity activity, yni yniVar, abdu abduVar, yzj yzjVar, Executor executor) {
        this.a = activity;
        yniVar.getClass();
        this.b = yniVar;
        abduVar.getClass();
        this.e = abduVar;
        yzjVar.getClass();
        this.c = yzjVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        if (this.f == null) {
            this.f = new AlertDialog.Builder(this.a).setMessage(R.string.delete_upload_confirmation).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.delete_video_positive_button_text), new DialogInterface.OnClickListener() { // from class: gjd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final gjf gjfVar = gjf.this;
                final apzg apzgVar2 = apzgVar;
                final Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                abdt a = gjfVar.e.a();
                a.j(aafx.a(apzgVar2));
                a.a = ((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apzgVar2.qm(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c;
                ylx.l(gjfVar.e.d(a), gjfVar.d, new gmb(gjfVar.c, 1), new ylw() { // from class: gje
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        gjf gjfVar2 = gjf.this;
                        apzg apzgVar3 = apzgVar2;
                        Object obj2 = I;
                        asgb asgbVar = (asgb) obj;
                        zag.q(gjfVar2.a, R.string.delete_upload_done, 1);
                        gjfVar2.b.d(new aawi(apzgVar3, obj2));
                    }
                }, anlf.a);
            }
        });
        this.f.show();
    }
}
