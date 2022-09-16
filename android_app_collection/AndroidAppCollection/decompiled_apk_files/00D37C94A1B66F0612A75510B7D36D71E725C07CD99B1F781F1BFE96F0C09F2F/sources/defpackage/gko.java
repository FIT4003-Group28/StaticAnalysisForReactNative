package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gko  reason: default package */
/* loaded from: classes3.dex */
public final class gko implements aafl {
    public final dt a;
    public final yzj b;
    public final aafo c;
    public final Executor d;
    public final abab e;
    protected AlertDialog f;

    public gko(dt dtVar, abab ababVar, yzj yzjVar, aafo aafoVar, Executor executor) {
        this.a = dtVar;
        this.e = ababVar;
        this.b = yzjVar;
        this.c = aafoVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        arag aragVar = null;
        if (this.f == null) {
            this.f = new AlertDialog.Builder(this.a).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: gkl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final gko gkoVar = gko.this;
                final apzg apzgVar2 = apzgVar;
                final Map map2 = map;
                abab ababVar = gkoVar.e;
                aazz aazzVar = new aazz(ababVar.e, ababVar.a.c());
                NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) apzgVar2.qm(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
                aazzVar.a = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.c;
                aazzVar.b = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.e;
                aazzVar.j(aafx.a(apzgVar2));
                dt dtVar = gkoVar.a;
                abab ababVar2 = gkoVar.e;
                ylx.n(dtVar, ababVar2.b.b(aazzVar, gkoVar.d), new zdt() { // from class: gkm
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        gko gkoVar2 = gko.this;
                        Throwable th = (Throwable) obj;
                        zep.d("Error rating", th);
                        gkoVar2.b.e(th);
                    }
                }, new zdt() { // from class: gkn
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        gko gkoVar2 = gko.this;
                        apzg apzgVar3 = apzgVar2;
                        Map map3 = map2;
                        aryh aryhVar = (aryh) obj;
                        zag.q(gkoVar2.a, R.string.notifications_settings_changed, 1);
                        gkoVar2.c.d(((NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) apzgVar3.qm(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint)).f, map3);
                    }
                });
            }
        });
        if (apzgVar.qn(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint)) {
            NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) apzgVar.qm(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
            AlertDialog alertDialog = this.f;
            if ((notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.b & 8) != 0 && (aragVar = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.d) == null) {
                aragVar = arag.a;
            }
            alertDialog.setMessage(ajgl.b(aragVar));
        } else {
            this.f.setMessage("");
        }
        this.f.show();
    }
}
