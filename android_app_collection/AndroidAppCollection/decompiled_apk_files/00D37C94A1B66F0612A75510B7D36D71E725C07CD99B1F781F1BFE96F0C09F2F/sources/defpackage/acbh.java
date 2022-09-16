package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: acbh  reason: default package */
/* loaded from: classes.dex */
public final class acbh {
    private static final String a = String.valueOf(acbh.class.getName()).concat(":MEDIA_FORMAT_KEY_MIN_BITRATE");
    private static final String b = String.valueOf(acbh.class.getName()).concat(":MEDIA_FORMAT_KEY_MAX_BITRATE");
    private static acbh c;
    private SparseArray d;
    private SparseArray e;
    private acbf f;
    private final MediaCodecList g;

    private acbh(Context context, SharedPreferences sharedPreferences, MediaCodecList mediaCodecList) {
        String str;
        acbf acbfVar;
        this.g = mediaCodecList;
        if (sharedPreferences.getInt(":ENCODING_PROFILE_CACHE_VERSION", 12) == 13) {
            String string = sharedPreferences.getString(":ENCODING_PROFILE_CACHE_VALUE", null);
            if (!TextUtils.isEmpty(string)) {
                SparseArray sparseArray = new SparseArray(4);
                SparseArray sparseArray2 = new SparseArray(4);
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("OBJECT_KEY_AUDIO_PARAMS");
                    acbfVar = new acbf(jSONObject2.getInt("OBJECT_KEY_MAX_BITRATE"), jSONObject2.getBoolean("OBJECT_KEY_SPECIFY_PROFILE"));
                    acbfVar.c = jSONObject2.getInt("OBJECT_KEY_CHANNEL_COUNT");
                    acbfVar.b = jSONObject2.getInt("OBJECT_KEY_SAMPLE_RATE");
                    acbfVar.e = true;
                    n(sparseArray, jSONObject.getJSONArray("OBJECT_KEY_VIDEO_LANDSCAPE_PARAMS_ARRAY"));
                    n(sparseArray2, jSONObject.getJSONArray("OBJECT_KEY_VIDEO_PORTRAIT_PARAMS_ARRAY"));
                } catch (JSONException e) {
                    Log.e("EncodingProfiles", "Could not extract encoding profiles from cache", e);
                    acbfVar = null;
                }
                if (acbfVar != null && sparseArray.size() != 0 && sparseArray2.size() != 0) {
                    this.f = acbfVar;
                    this.d = sparseArray;
                    this.e = sparseArray2;
                }
            }
        }
        if (this.f == null || this.d == null || this.e == null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            SparseArray sparseArray3 = new SparseArray(3);
            if (max >= 1920 && min >= 1080) {
                sparseArray3.put(1, new ArrayList(amuk.z(new acbg(1920, 1080, d(1500), e(4), true), new acbg(1920, 1080, d(1500), e(4), false), new acbg(1920, 1080, d(1500), e(3), true), new acbg(1920, 1080, d(1500), e(3), false), new acbg(1920, 1080, d(1500), e(2), false), new acbg(1920, 1072, d(1500), e(4), true), new acbg(1920, 1072, d(1500), e(4), false), new acbg(1920, 1072, d(1500), e(3), true), new acbg(1920, 1072, d(1500), e(3), false), new acbg(1920, 1072, d(1500), e(2), false))));
            }
            if (max >= 1280 && min >= 720) {
                sparseArray3.put(2, new ArrayList(amuk.u(new acbg(1280, 720, d(1100), d(2500), true), new acbg(1280, 720, d(1100), d(2500), false), new acbg(1280, 720, d(1100), e(2), true), new acbg(1280, 720, d(1100), e(2), false))));
            }
            if (max >= 856 && min >= 480) {
                sparseArray3.put(3, new ArrayList(amuk.A(new acbg(856, 480, d(600), d(1500), true), new acbg(856, 480, d(600), d(1500), false), new acbg(856, 480, d(550), d(1200), true), new acbg(856, 480, d(550), d(1200), false), new acbg(720, 480, d(600), d(1500), true), new acbg(720, 480, d(600), d(1500), false), new acbg(720, 480, d(500), d(1200), true), new acbg(720, 480, d(500), d(1200), false), new acbg(640, 480, d(500), d(1500), true), new acbg(640, 480, d(500), d(1500), false), new acbg(640, 480, d(400), d(1200), true), new acbg(640, 480, d(400), d(1200), false), new acbg(848, 480, d(600), d(1500), true), new acbg(848, 480, d(600), d(1500), false), new acbg(848, 480, d(550), d(1200), true), new acbg(848, 480, d(550), d(1200), false))));
            }
            if (max >= 640 && min >= 360) {
                sparseArray3.put(4, new ArrayList(amuk.A(new acbg(640, 360, d(300), e(1), true), new acbg(640, 360, d(300), e(1), false), new acbg(640, 360, d(300), d(800), true), new acbg(640, 360, d(300), d(800), false), new acbg(480, 360, d(300), e(1), true), new acbg(480, 360, d(300), e(1), false), new acbg(480, 360, d(300), d(800), true), new acbg(480, 360, d(300), d(800), false), new acbg(640, 352, d(300), e(1), true), new acbg(640, 352, d(300), e(1), false), new acbg(640, 352, d(300), d(800), true), new acbg(640, 352, d(300), d(800), false), new acbg[0])));
            }
            if (max >= 428 && min >= 240) {
                sparseArray3.put(5, new ArrayList(amuk.A(new acbg(428, 240, d(200), d(700), true), new acbg(428, 240, d(200), d(700), false), new acbg(428, 240, d(200), d(650), true), new acbg(428, 240, d(200), d(650), false), new acbg(320, 240, d(200), d(700), true), new acbg(320, 240, d(200), d(700), false), new acbg(320, 240, d(200), d(650), true), new acbg(320, 240, d(200), d(650), false), new acbg(432, 240, d(200), d(700), true), new acbg(432, 240, d(200), d(700), false), new acbg(432, 240, d(200), d(650), true), new acbg(432, 240, d(200), d(650), false), new acbg[0])));
            }
            int min2 = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int max2 = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            SparseArray sparseArray4 = new SparseArray(3);
            if (min2 >= 812 && max2 >= 1440) {
                sparseArray4.put(1, new ArrayList(amuk.z(new acbg(812, 1440, e(1), e(3), true), new acbg(812, 1440, e(1), e(3), false), new acbg(812, 1440, e(1), e(2), true), new acbg(812, 1440, e(1), e(2), false), new acbg(812, 1440, e(1), d(1500), false), new acbg(816, 1440, e(1), e(3), true), new acbg(816, 1440, e(1), e(3), false), new acbg(816, 1440, e(1), e(2), true), new acbg(816, 1440, e(1), e(2), false), new acbg(816, 1440, e(1), d(1500), false))));
            }
            if (min2 >= 608 && max2 >= 1080) {
                sparseArray4.put(2, new ArrayList(amuk.z(new acbg(608, 1080, d(750), e(2), true), new acbg(608, 1080, d(750), e(2), false), new acbg(608, 1080, d(750), d(1500), true), new acbg(608, 1080, d(750), d(1500), false), new acbg(608, 1080, d(750), d(1100), false), new acbg(608, 1072, d(750), e(2), true), new acbg(608, 1072, d(750), e(2), false), new acbg(608, 1072, d(750), d(1500), true), new acbg(608, 1072, d(750), d(1500), false), new acbg(608, 1072, d(750), d(1100), false))));
            }
            if (min2 >= 404 && max2 >= 720) {
                sparseArray4.put(3, new ArrayList(amuk.A(new acbg(404, 720, d(400), e(1), true), new acbg(404, 720, d(400), e(1), false), new acbg(404, 720, d(400), d(800), true), new acbg(404, 720, d(400), d(800), false), new acbg(540, 720, d(400), e(1), true), new acbg(540, 720, d(400), e(1), false), new acbg(540, 720, d(400), d(800), true), new acbg(540, 720, d(400), d(800), false), new acbg(400, 720, d(400), e(1), true), new acbg(400, 720, d(400), e(1), false), new acbg(400, 720, d(400), d(800), true), new acbg(400, 720, d(400), d(800), false), new acbg[0])));
            }
            if (min2 >= 272 && max2 >= 480) {
                sparseArray4.put(4, new ArrayList(amuk.y(new acbg(272, 480, d(300), d(700), false), new acbg(272, 480, d(300), d(700), true), new acbg(272, 480, d(300), d(650), false), new acbg(272, 480, d(300), d(650), true), new acbg(360, 480, d(300), d(700), true), new acbg(360, 480, d(300), d(700), false), new acbg(360, 480, d(300), d(650), true), new acbg(360, 480, d(300), d(650), false))));
            }
            if (min2 >= 180 && max2 >= 240) {
                sparseArray4.put(5, new ArrayList(amuk.A(new acbg(204, 360, d(200), d(600), true), new acbg(204, 360, d(200), d(600), false), new acbg(204, 360, d(200), d(550), true), new acbg(204, 360, d(200), d(550), false), new acbg(180, 240, d(200), d(600), true), new acbg(180, 240, d(200), d(600), false), new acbg(180, 240, d(200), d(550), true), new acbg(180, 240, d(200), d(550), false), new acbg(208, 368, d(200), d(600), true), new acbg(208, 368, d(200), d(600), false), new acbg(208, 368, d(200), d(550), true), new acbg(208, 368, d(200), d(550), false), new acbg[0])));
            }
            ArrayList arrayList = new ArrayList(amuk.u(new acbf(d(128), true), new acbf(d(128), false), new acbf(d(64), true), new acbf(d(64), false)));
            MediaCodecInfo[] codecInfos = this.g.getCodecInfos();
            MediaFormat p = p(true, false);
            MediaFormat p2 = p(false, false);
            MediaFormat o = o(true);
            MediaFormat o2 = o(false);
            int i = 0;
            while (i < codecInfos.length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i];
                if (mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (m(supportedTypes, "video/avc")) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
                        r(capabilitiesForType, sparseArray3, p, p2);
                        r(capabilitiesForType, sparseArray4, p, p2);
                    }
                    if (m(supportedTypes, "audio/mp4a-latm")) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("audio/mp4a-latm");
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            acbf acbfVar2 = (acbf) arrayList.get(i2);
                            MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
                            MediaFormat mediaFormat = p;
                            MediaFormat mediaFormat2 = true != acbfVar2.a ? o2 : o;
                            j(mediaFormat2, acbfVar2);
                            if (capabilitiesForType2.isFormatSupported(mediaFormat2)) {
                                acbfVar2.e = true;
                            }
                            i2++;
                            codecInfos = mediaCodecInfoArr;
                            p = mediaFormat;
                        }
                    }
                }
                i++;
                codecInfos = codecInfos;
                p = p;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                acbf acbfVar3 = (acbf) arrayList.get(i3);
                if (acbfVar3.e) {
                    this.f = acbfVar3;
                    break;
                }
                i3++;
            }
            SparseArray sparseArray5 = new SparseArray(4);
            this.d = sparseArray5;
            l(sparseArray3, sparseArray5);
            SparseArray sparseArray6 = new SparseArray(4);
            this.e = sparseArray6;
            l(sparseArray4, sparseArray6);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(":ENCODING_PROFILE_CACHE_VERSION");
            edit.remove(":ENCODING_PROFILE_CACHE_VALUE");
            edit.apply();
            try {
                JSONObject jSONObject3 = new JSONObject();
                acbf acbfVar4 = this.f;
                aqxo.p(acbfVar4.e);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("OBJECT_KEY_CHANNEL_COUNT", acbfVar4.c);
                jSONObject4.put("OBJECT_KEY_SAMPLE_RATE", acbfVar4.b);
                jSONObject4.put("OBJECT_KEY_MAX_BITRATE", acbfVar4.d);
                jSONObject4.put("OBJECT_KEY_SPECIFY_PROFILE", acbfVar4.a);
                jSONObject3.put("OBJECT_KEY_AUDIO_PARAMS", jSONObject4);
                jSONObject3.put("OBJECT_KEY_VIDEO_LANDSCAPE_PARAMS_ARRAY", q(this.d));
                jSONObject3.put("OBJECT_KEY_VIDEO_PORTRAIT_PARAMS_ARRAY", q(this.e));
                str = jSONObject3.toString();
            } catch (Exception e2) {
                Log.e("EncodingProfiles", "Could not cache encoding profiles", e2);
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            edit.putInt(":ENCODING_PROFILE_CACHE_VERSION", 13);
            edit.putString(":ENCODING_PROFILE_CACHE_VALUE", str);
            edit.apply();
        }
    }

    public static int a(MediaFormat mediaFormat) {
        mediaFormat.getClass();
        String str = b;
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return 0;
    }

    public static int b(MediaFormat mediaFormat) {
        mediaFormat.getClass();
        String str = a;
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return 0;
    }

    public static int c(MediaFormat mediaFormat) {
        mediaFormat.getClass();
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    static int d(int i) {
        return i * 1000;
    }

    static int e(int i) {
        return i * 1000000;
    }

    public static acbh h(Context context, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        if (c == null) {
            c = new acbh(context.getApplicationContext(), sharedPreferences, mediaCodecList);
        }
        return c;
    }

    private static final void j(MediaFormat mediaFormat, acbf acbfVar) {
        mediaFormat.setInteger("bitrate", acbfVar.d);
        long j = acbfVar.b * acbfVar.c;
        mediaFormat.setInteger("max-input-size", (int) (((j + j) * 50) / 1000));
        mediaFormat.setInteger("channel-count", acbfVar.c);
        mediaFormat.setInteger("channel-mask", acbfVar.c == 1 ? 16 : 12);
        mediaFormat.setInteger("sample-rate", acbfVar.b);
    }

    private static final void k(MediaFormat mediaFormat, acbg acbgVar) {
        mediaFormat.setInteger("bitrate", acbgVar.e);
        mediaFormat.setInteger("width", acbgVar.b);
        mediaFormat.setInteger("height", acbgVar.c);
        mediaFormat.setInteger(b, acbgVar.f);
        mediaFormat.setInteger(a, acbgVar.d);
    }

    private static final void l(SparseArray sparseArray, SparseArray sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    acbg acbgVar = (acbg) arrayList.get(i2);
                    if (acbgVar.g) {
                        sparseArray2.put(keyAt, acbgVar);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    private static final boolean m(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    private static final void n(SparseArray sparseArray, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            int i2 = jSONObject.getInt("OBJECT_KEY_QUALITY");
            acbg acbgVar = new acbg(jSONObject.getInt("OBJECT_KEY_WIDTH"), jSONObject.getInt("OBJECT_KEY_HEIGHT"), jSONObject.getInt("OBJECT_KEY_MIN_BITRATE"), jSONObject.getInt("OBJECT_KEY_MAX_BITRATE"), jSONObject.getBoolean("OBJECT_KEY_SPECIFY_PROFILE"));
            acbgVar.g = true;
            sparseArray.put(i2, acbgVar);
        }
    }

    private static final MediaFormat o(boolean z) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 0, 0);
        if (z) {
            createAudioFormat.setInteger("aac-profile", 2);
        }
        return createAudioFormat;
    }

    private static final MediaFormat p(boolean z, boolean z2) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", 0, 0);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("channel-count", 1);
        createVideoFormat.setInteger("i-frame-interval", 2);
        if (z2) {
            createVideoFormat.setInteger("frame-rate", 30);
        }
        if (z) {
            createVideoFormat.setInteger("profile", 32);
        }
        return createVideoFormat;
    }

    private static final JSONArray q(SparseArray sparseArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            acbg acbgVar = (acbg) sparseArray.get(keyAt);
            aqxo.p(acbgVar.g);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("OBJECT_KEY_QUALITY", keyAt);
            jSONObject.put("OBJECT_KEY_WIDTH", acbgVar.b);
            jSONObject.put("OBJECT_KEY_HEIGHT", acbgVar.c);
            jSONObject.put("OBJECT_KEY_MIN_BITRATE", acbgVar.d);
            jSONObject.put("OBJECT_KEY_MAX_BITRATE", acbgVar.f);
            jSONObject.put("OBJECT_KEY_SPECIFY_PROFILE", acbgVar.a);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private static final void r(MediaCodecInfo.CodecCapabilities codecCapabilities, SparseArray sparseArray, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) sparseArray.get(sparseArray.keyAt(i));
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                acbg acbgVar = (acbg) arrayList.get(i2);
                MediaFormat mediaFormat3 = true != acbgVar.a ? mediaFormat2 : mediaFormat;
                k(mediaFormat3, acbgVar);
                if (codecCapabilities.isFormatSupported(mediaFormat3)) {
                    acbgVar.g = true;
                }
            }
        }
    }

    public final MediaFormat f() {
        acbf acbfVar = this.f;
        if (acbfVar == null) {
            return null;
        }
        MediaFormat o = o(acbfVar.a);
        j(o, this.f);
        return o;
    }

    public final boolean i(int i) {
        SparseArray sparseArray;
        SparseArray sparseArray2 = this.d;
        return (sparseArray2 == null || sparseArray2.get(i) == null || this.f == null || (sparseArray = this.e) == null || sparseArray.get(i) == null || this.f == null) ? false : true;
    }

    public final MediaFormat g(int i, boolean z) {
        acbg acbgVar = (acbg) (z ? this.e : this.d).get(i);
        if (acbgVar == null) {
            return null;
        }
        MediaFormat p = p(acbgVar.a, true);
        k(p, acbgVar);
        return p;
    }
}
