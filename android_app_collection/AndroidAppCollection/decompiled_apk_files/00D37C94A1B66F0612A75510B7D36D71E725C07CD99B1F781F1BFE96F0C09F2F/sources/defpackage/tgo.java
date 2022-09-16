package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Looper;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.api.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: tgo  reason: default package */
/* loaded from: classes4.dex */
public class tgo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static tgm e(int i, int i2, int[] iArr) {
        return f(i, i2, iArr, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static tgm f(int i, int i2, int[] iArr, boolean z) {
        int i3 = (i + i2) - 1;
        if (z) {
            i3++;
        }
        int i4 = 0;
        if (!z || i != 0) {
            i4 = r(iArr, i);
        } else {
            i = 0;
        }
        if (i2 > 0) {
            i2 += r(iArr, i3) - i4;
        }
        return new tgm(i + i4, i2);
    }

    public static boolean g(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        return (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aoqu] */
    public static aoqu h(ByteBuffer byteBuffer, aorb aorbVar, aoos aoosVar) {
        aoog N = aoog.N(byteBuffer);
        ?? l = aorbVar.l(N, aoosVar);
        try {
            N.B(0);
            return l;
        } catch (aopx e) {
            throw e;
        }
    }

    public static aoqu i(ByteBuffer byteBuffer, aorb aorbVar) {
        return h(byteBuffer, aorbVar, aoos.b());
    }

    public static axnb j(aodt aodtVar, int i, int i2) {
        boolean z = true;
        aqxo.p(i >= 0);
        if (i2 < 0) {
            z = false;
        }
        aqxo.p(z);
        axnb axnbVar = null;
        if (aodtVar != null && aodtVar.aa() != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < aodtVar.aa(); i4++) {
                axnb ab = aodtVar.ab(i4);
                if (ab != null) {
                    int aH = i - ((int) ab.aH());
                    int aG = i2 - ((int) ab.aG());
                    int i5 = (aH * aH) + (aG * aG);
                    if (axnbVar == null || i5 < i3) {
                        axnbVar = ab;
                        i3 = i5;
                    }
                }
            }
        }
        return axnbVar;
    }

    public static void k(Status status, rvh rvhVar) {
        l(status, null, rvhVar);
    }

    public static void l(Status status, Object obj, rvh rvhVar) {
        if (status.c()) {
            rvhVar.b(obj);
        } else {
            rvhVar.a(new qsp(status));
        }
    }

    public static boolean m(Status status, Object obj, rvh rvhVar) {
        if (status.c()) {
            return rvhVar.d(obj);
        }
        return rvhVar.c(new qsp(status));
    }

    public static qvb n(Object obj, String str) {
        qnm.n(obj, "Listener must not be null");
        qnm.n(str, "Listener type must not be null");
        qnm.m(str, "Listener type must not be empty");
        return new qvb(obj, str);
    }

    public static qvd o(Object obj, Looper looper, String str) {
        qnm.n(obj, "Listener must not be null");
        qnm.n(looper, "Looper must not be null");
        qnm.n(str, "Listener type must not be null");
        return new qvd(looper, obj, str);
    }

    public static MediaQueueData p(MediaQueueData mediaQueueData) {
        return new MediaQueueData(mediaQueueData);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void q(JSONObject jSONObject, MediaQueueData mediaQueueData) {
        char c;
        mediaQueueData.a();
        if (jSONObject == null) {
            return;
        }
        mediaQueueData.a = qpl.e(jSONObject, "id");
        mediaQueueData.b = qpl.e(jSONObject, "entity");
        String optString = jSONObject.optString("queueType");
        char c2 = 65535;
        switch (optString.hashCode()) {
            case -1803151310:
                if (optString.equals("PODCAST_SERIES")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1758903120:
                if (optString.equals("RADIO_STATION")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1632865838:
                if (optString.equals("PLAYLIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1319760993:
                if (optString.equals("AUDIOBOOK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1088524588:
                if (optString.equals("TV_SERIES")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (optString.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 73549584:
                if (optString.equals("MOVIE")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 393100598:
                if (optString.equals("VIDEO_PLAYLIST")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 902303413:
                if (optString.equals("LIVE_TV")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mediaQueueData.c = 1;
                break;
            case 1:
                mediaQueueData.c = 2;
                break;
            case 2:
                mediaQueueData.c = 3;
                break;
            case 3:
                mediaQueueData.c = 4;
                break;
            case 4:
                mediaQueueData.c = 5;
                break;
            case 5:
                mediaQueueData.c = 6;
                break;
            case 6:
                mediaQueueData.c = 7;
                break;
            case 7:
                mediaQueueData.c = 8;
                break;
            case '\b':
                mediaQueueData.c = 9;
                break;
        }
        mediaQueueData.d = qpl.e(jSONObject, "name");
        JSONObject optJSONObject = jSONObject.has("containerMetadata") ? jSONObject.optJSONObject("containerMetadata") : null;
        if (optJSONObject != null) {
            MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata();
            mediaQueueContainerMetadata.a();
            String optString2 = optJSONObject.optString("containerType", "");
            int hashCode = optString2.hashCode();
            if (hashCode != 6924225) {
                if (hashCode == 828666841 && optString2.equals("GENERIC_CONTAINER")) {
                    c2 = 0;
                }
            } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                c2 = 1;
            }
            if (c2 == 0) {
                mediaQueueContainerMetadata.a = 0;
            } else if (c2 == 1) {
                mediaQueueContainerMetadata.a = 1;
            }
            mediaQueueContainerMetadata.b = qpl.e(optJSONObject, "title");
            JSONArray optJSONArray = optJSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                mediaQueueContainerMetadata.c = new ArrayList();
                List list = mediaQueueContainerMetadata.c;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        MediaMetadata mediaMetadata = new MediaMetadata(0);
                        mediaMetadata.b(optJSONObject2);
                        list.add(mediaMetadata);
                    }
                }
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                mediaQueueContainerMetadata.d = new ArrayList();
                qqc.b(mediaQueueContainerMetadata.d, optJSONArray2);
            }
            mediaQueueContainerMetadata.e = optJSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.e);
            mediaQueueData.e = new MediaQueueContainerMetadata(mediaQueueContainerMetadata);
        }
        Integer g = trz.g(jSONObject.optString("repeatMode"));
        if (g != null) {
            mediaQueueData.f = g.intValue();
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("items");
        if (optJSONArray3 != null) {
            mediaQueueData.g = new ArrayList();
            List list2 = mediaQueueData.g;
            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    try {
                        list2.add(new MediaQueueItem(optJSONObject3));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        mediaQueueData.h = jSONObject.optInt("startIndex", mediaQueueData.h);
        if (!jSONObject.has("startTime")) {
            return;
        }
        mediaQueueData.i = qpl.b(jSONObject.optDouble("startTime", mediaQueueData.i));
    }

    private static int r(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch >= 0) {
            while (binarySearch < iArr.length - 1) {
                int i2 = binarySearch + 1;
                if (iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
        }
        return binarySearch >= 0 ? binarySearch + 1 : (-binarySearch) - 1;
    }

    public void a() {
        throw null;
    }

    public void b(int i) {
        throw null;
    }

    public void c(int i) {
        throw null;
    }

    public void d(int i) {
        throw null;
    }
}
