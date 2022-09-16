package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ngt  reason: default package */
/* loaded from: classes3.dex */
public final class ngt extends ngo {
    private final akys j;
    private final nhe k;

    public ngt(aafo aafoVar, luy luyVar, lva lvaVar, akys akysVar, Executor executor, gte gteVar, acti actiVar, BrowseResponseModel browseResponseModel, appd appdVar) {
        super(aafoVar, luyVar, lvaVar, actiVar, browseResponseModel, appdVar);
        this.j = akysVar;
        this.k = new nhe(gteVar, executor, new Runnable() { // from class: ngr
            @Override // java.lang.Runnable
            public final void run() {
                ngt.this.b().ifPresent(khv.g);
            }
        }, 1);
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        return ((appd) this.a).f;
    }

    @Override // defpackage.ngj
    public final void e() {
        aunb aunbVar;
        appd appdVar = (appd) this.a;
        if (appdVar.d == 55) {
            aunbVar = (aunb) appdVar.e;
        } else {
            aunbVar = aunb.a;
        }
        apzg apzgVar = ((ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) aunbVar.qm(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.channelReelAvatarRenderer)).d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (!apzgVar.qn(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand)) {
            return;
        }
        this.j.d(this.k);
    }

    @Override // defpackage.ngo
    public final avtn f() {
        appe appeVar = ((appd) this.a).n;
        if (appeVar == null) {
            appeVar = appe.a;
        }
        if ((appeVar.b & 4) != 0) {
            appe appeVar2 = ((appd) this.a).n;
            if (appeVar2 == null) {
                appeVar2 = appe.a;
            }
            avtn avtnVar = appeVar2.e;
            return avtnVar == null ? avtn.a : avtnVar;
        }
        return null;
    }

    @Override // defpackage.ngj
    public final void g() {
        this.j.e(this.k);
    }
}
