package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kv  reason: default package */
/* loaded from: classes3.dex */
public final class kv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect a(View view) {
        return view.getClipBounds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(View view) {
        return view.isInLayout();
    }

    public static float d(EdgeEffect edgeEffect) {
        if (akg.e()) {
            return na.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float e(EdgeEffect edgeEffect, float f, float f2) {
        if (!akg.e()) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        return na.b(edgeEffect, f, f2);
    }

    public static EdgeEffect f(Context context, AttributeSet attributeSet) {
        if (akg.e()) {
            return na.c(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static bga g(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        bfz bfzVar = new bfz(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        bfzVar.d(mediaRoute2Info.getConnectionState());
        bfzVar.l(mediaRoute2Info.getVolumeHandling());
        bfzVar.m(mediaRoute2Info.getVolumeMax());
        bfzVar.k(mediaRoute2Info.getVolume());
        bfzVar.h(mediaRoute2Info.getExtras());
        bfzVar.g(true);
        bfzVar.a.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            bfzVar.e(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bfzVar.a.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        bfzVar.h(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        bfzVar.f(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bfzVar.i(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            bfzVar.c(parcelableArrayList);
        }
        return bfzVar.a();
    }

    public static List h(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }
}
