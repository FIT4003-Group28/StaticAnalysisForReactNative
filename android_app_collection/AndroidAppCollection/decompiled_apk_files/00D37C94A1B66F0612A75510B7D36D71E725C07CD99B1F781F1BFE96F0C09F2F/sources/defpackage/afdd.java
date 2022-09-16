package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: afdd  reason: default package */
/* loaded from: classes.dex */
public final class afdd {
    public final /* synthetic */ VideoStreamingData a;
    public final /* synthetic */ aess b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PlayerConfigModel d;
    public final /* synthetic */ aflm e;
    public final /* synthetic */ afdv f;

    public afdd(afdv afdvVar, VideoStreamingData videoStreamingData, aess aessVar, String str, PlayerConfigModel playerConfigModel, aflm aflmVar) {
        this.f = afdvVar;
        this.a = videoStreamingData;
        this.b = aessVar;
        this.c = str;
        this.d = playerConfigModel;
        this.e = aflmVar;
    }

    public final void a(Exception exc) {
        Future future = this.f.z;
        if (future != null) {
            future.cancel(true);
            this.f.z = null;
        }
        afdv afdvVar = this.f;
        afkn afknVar = new afkn(afkl.MANIFEST, "net.connect", this.f.g(), exc);
        afknVar.f();
        afdvVar.V(afknVar);
    }
}
