package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.List;
/* compiled from: PG */
/* renamed from: agup  reason: default package */
/* loaded from: classes.dex */
public interface agup {
    WatchNextResponseModel a(WatchNextResponseModel watchNextResponseModel, Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar);

    WatchNextResponseModel b(Context context, agqo agqoVar, String str, byte[] bArr);

    WatchNextResponseModel c(Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar);

    WatchNextResponseModel g(WatchNextResponseModel watchNextResponseModel, Context context, agqf agqfVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, apjj apjjVar);

    WatchNextResponseModel h(Context context, agqo agqoVar, PlaybackStartDescriptor playbackStartDescriptor);

    WatchNextResponseModel i(Context context, agqf agqfVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, apjj apjjVar);

    void n();
}
