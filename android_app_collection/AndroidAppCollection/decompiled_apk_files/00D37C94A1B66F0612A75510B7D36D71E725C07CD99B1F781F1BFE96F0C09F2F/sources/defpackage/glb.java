package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: glb  reason: default package */
/* loaded from: classes3.dex */
public final class glb implements aafl {
    public final Context a;
    public final abdu b;
    public final yni c;
    public final Executor d;
    public final akys e;
    private AlertDialog f;

    public glb(Context context, abdu abduVar, yni yniVar, Executor executor, akys akysVar) {
        this.a = context;
        this.b = abduVar;
        this.c = yniVar;
        this.d = executor;
        this.e = akysVar;
    }

    public final void b() {
        zag.q(this.a, R.string.delete_inprogress_upload_failed, 1);
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        if (this.f == null) {
            this.f = new AlertDialog.Builder(this.a).setMessage(R.string.delete_upload_dialog_confirmation).setNegativeButton(R.string.delete_upload_dialog_negative, (DialogInterface.OnClickListener) null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.delete_upload_dialog_positive), new DialogInterface.OnClickListener() { // from class: gkx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final glb glbVar = glb.this;
                final apzg apzgVar2 = apzgVar;
                final Map map2 = map;
                aqxo.y(apzgVar2.qn(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint));
                if (!((DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) apzgVar2.qm(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint)).d.isEmpty()) {
                    final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) apzgVar2.qm(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
                    aqxo.y(!deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d.isEmpty());
                    final akys akysVar = glbVar.e;
                    final String str = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d;
                    ankt v = anlz.v(new aniq() { // from class: akyl
                        @Override // defpackage.aniq
                        public final ankt a() {
                            akys akysVar2 = akys.this;
                            String str2 = str;
                            if (akysVar2.f.b(str2) == null) {
                                return anlz.q(false);
                            }
                            ((alci) akysVar2.l.get()).v(str2);
                            return anlz.q(true);
                        }
                    }, akysVar.c);
                    anlz.A(v, new akyr(akysVar), anjk.a);
                    ylx.k(v, anjk.a, new gky(glbVar, 1), new ylw() { // from class: gla
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj) {
                            final glb glbVar2 = glb.this;
                            DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2 = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
                            final apzg apzgVar3 = apzgVar2;
                            final Map map3 = map2;
                            Boolean bool = (Boolean) obj;
                            if (bool == null || !bool.booleanValue()) {
                                if (!deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2.c.isEmpty()) {
                                    DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3 = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) apzgVar3.qm(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
                                    aqxo.y(!deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3.c.isEmpty());
                                    abdt a = glbVar2.b.a();
                                    a.a = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3.c;
                                    if (!apzgVar3.c.H()) {
                                        a.j(apzgVar3.c);
                                    } else {
                                        a.i();
                                    }
                                    ylx.k(glbVar2.b.d(a), glbVar2.d, new gky(glbVar2), new ylw() { // from class: gkz
                                        @Override // defpackage.ylw, defpackage.zdt
                                        public final void a(Object obj2) {
                                            glb glbVar3 = glb.this;
                                            apzg apzgVar4 = apzgVar3;
                                            Map map4 = map3;
                                            if (((asgb) obj2).c) {
                                                glbVar3.c.d(new aawi(apzgVar4, zew.I(map4, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
                                                zag.q(glbVar3.a, R.string.delete_inprogress_upload_done, 1);
                                            }
                                        }
                                    });
                                    return;
                                }
                                glbVar2.b();
                            }
                        }
                    });
                    return;
                }
                glbVar.b();
            }
        });
        this.f.show();
    }
}
