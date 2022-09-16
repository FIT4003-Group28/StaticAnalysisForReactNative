package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aego  reason: default package */
/* loaded from: classes.dex */
public final class aego {
    private final aegq a;
    private final Executor b;
    private final aegt c;
    private final aegi d;

    public aego(aegi aegiVar, aegq aegqVar, Executor executor, aegt aegtVar) {
        aegiVar.getClass();
        this.d = aegiVar;
        aegqVar.getClass();
        this.a = aegqVar;
        executor.getClass();
        this.b = executor;
        aegtVar.getClass();
        this.c = aegtVar;
    }

    public final void a(PlayerResponseModel playerResponseModel, long j, long j2, aegn aegnVar) {
        b(playerResponseModel, j, j2, aegnVar, null);
    }

    public final aegm b(PlayerResponseModel playerResponseModel, long j, long j2, aegn aegnVar, afmv afmvVar) {
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        if (videoStreamingData != null && !videoStreamingData.B() && j2 > 0) {
            ArrayList arrayList = new ArrayList(2);
            try {
                aegu c = this.a.c(playerResponseModel.c, playerResponseModel.c(), playerResponseModel.c().aQ(), this.c.c(true, playerResponseModel.c(), null, afmvVar));
                FormatStreamModel[] formatStreamModelArr = c.b;
                if (formatStreamModelArr.length > 0 && !formatStreamModelArr[0].J()) {
                    arrayList.add(formatStreamModelArr[0]);
                }
                FormatStreamModel formatStreamModel = c.c;
                if (formatStreamModel != null && !formatStreamModel.J()) {
                    arrayList.add(formatStreamModel);
                }
            } catch (aegw unused) {
            }
            if (!arrayList.isEmpty()) {
                String B = playerResponseModel.B();
                aqxo.p(!arrayList.isEmpty());
                aegm aegmVar = new aegm(this.d, B, arrayList, j, j2, aegnVar);
                this.b.execute(aegmVar.g);
                return aegmVar;
            }
            aegnVar.i(2);
        }
        return null;
    }
}
