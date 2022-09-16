package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import com.google.protos.youtube.api.innertube.TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abwr  reason: default package */
/* loaded from: classes.dex */
public final class abwr implements aafl {
    public static final /* synthetic */ int b = 0;
    public final abzn a;
    private final Context c;
    private final abws d;
    private final afre e;
    private final zsn f;
    private final Executor g;
    private final ankw h;
    private nx i;

    public abwr(Context context, abzn abznVar, abws abwsVar, afre afreVar, zsn zsnVar, Executor executor, ankw ankwVar) {
        this.c = context;
        this.a = abznVar;
        this.d = abwsVar;
        this.e = afreVar;
        this.f = zsnVar;
        this.g = executor;
        this.h = ankwVar;
    }

    public final void b(String str, asvk asvkVar, abzi abziVar) {
        this.a.k(asvkVar, str, 0, abziVar);
    }

    public final void c(abzj abzjVar, apzg apzgVar, avxr avxrVar) {
        this.a.d(((MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint) apzgVar.qm(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint)).c, avxrVar, abzjVar);
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        final Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        String str = null;
        if (!apzgVar.qn(CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.createBroadcastEndpoint) || !(I instanceof abwl)) {
            if (!apzgVar.qn(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint) || !(I instanceof abzj)) {
                if (!apzgVar.qn(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint) || !(I instanceof abzh)) {
                    if (!apzgVar.qn(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint) || !(I instanceof abvz)) {
                        if (!apzgVar.qn(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint) || !(I instanceof abvz)) {
                            if (!apzgVar.qn(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint) || !(I instanceof abzi)) {
                                if (!apzgVar.qn(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint) || !(I instanceof atgl)) {
                                    if (!apzgVar.qn(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint) || !(I instanceof abzf)) {
                                        String valueOf = String.valueOf(apzgVar.toString());
                                        throw new aafy(valueOf.length() != 0 ? "Unhandled command: ".concat(valueOf) : new String("Unhandled command: "));
                                    }
                                    final abzf abzfVar = (abzf) I;
                                    if (this.i == null) {
                                        nw nwVar = new nw(this.c);
                                        nwVar.f(R.string.lc_confirm_delete_scheduled_stream);
                                        nwVar.h(17039360, null);
                                        this.i = nwVar.b();
                                    }
                                    this.i.a.g(-1, this.c.getString(17039370), new DialogInterface.OnClickListener() { // from class: abwm
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            abwr abwrVar = abwr.this;
                                            apzg apzgVar2 = apzgVar;
                                            abwrVar.a.a(((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apzgVar2.qm(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c, abzfVar);
                                        }
                                    });
                                    this.i.show();
                                    return;
                                }
                                this.d.m(((StartStreamEndpointOuterClass$StartStreamEndpoint) apzgVar.qm(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint)).b, (atgl) I, (Boolean) map.get("ARG_IS_PORTRAIT"));
                                return;
                            }
                            final String str2 = ((GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint) apzgVar.qm(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint)).b;
                            final abzi abziVar = (abzi) I;
                            if (akdr.g(this.c)) {
                                this.e.b(new afrd() { // from class: abwp
                                    @Override // defpackage.afrd
                                    public final void a(asvk asvkVar) {
                                        abwr.this.b(str2, asvkVar, abziVar);
                                    }
                                });
                                return;
                            } else {
                                b(str2, null, abziVar);
                                return;
                            }
                        }
                        ((abvz) I).a(((EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint) apzgVar.qm(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint)).b);
                        return;
                    }
                    ((abvz) I).b(((TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint) apzgVar.qm(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint)).b);
                    return;
                }
                this.a.c((abzh) I);
                return;
            }
            ankw ankwVar = this.h;
            final zsn zsnVar = this.f;
            ylx.k(ankwVar.qp(new Callable() { // from class: abwq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zsn.this.b();
                }
            }), this.g, new ylv() { // from class: abwn
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    abwr.this.c((abzj) I, apzgVar, null);
                }
            }, new ylw() { // from class: abwo
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    abwr.this.c((abzj) I, apzgVar, (avxr) obj);
                }
            });
            return;
        }
        abwl abwlVar = (abwl) I;
        StreamMetadata l = abwlVar.l();
        arbt arbtVar = l.k;
        if (arbtVar != null && (arbtVar.b & 4) != 0) {
            str = arbtVar.e;
        }
        this.a.j(l.a, l.b, l.c, l.d, l.e, l.f, l.g, l.m, l.l, l.i, l.j, str, abwlVar);
    }
}
