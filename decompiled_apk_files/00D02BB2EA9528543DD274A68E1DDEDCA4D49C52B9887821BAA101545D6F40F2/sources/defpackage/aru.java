package defpackage;

import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/* compiled from: PG */
/* renamed from: aru  reason: default package */
/* loaded from: classes2.dex */
final class aru {
    public static aqn a(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        aqm aqmVar = new aqm(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        aqmVar.c(mediaRoute2Info.getConnectionState());
        aqmVar.k(mediaRoute2Info.getVolumeHandling());
        aqmVar.l(mediaRoute2Info.getVolumeMax());
        aqmVar.j(mediaRoute2Info.getVolume());
        aqmVar.g(mediaRoute2Info.getExtras());
        aqmVar.f(true);
        aqmVar.a.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            aqmVar.d(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            aqmVar.a.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        aqmVar.g(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        aqmVar.e(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        aqmVar.h(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            aqmVar.b(parcelableArrayList);
        }
        return aqmVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> b(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        return (List) list.stream().filter(arr.a).map(ars.a).collect(Collectors.toList());
    }
}
