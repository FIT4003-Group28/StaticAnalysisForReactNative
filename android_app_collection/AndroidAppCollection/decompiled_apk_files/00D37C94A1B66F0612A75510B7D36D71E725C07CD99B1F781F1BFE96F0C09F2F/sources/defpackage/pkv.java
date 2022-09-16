package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pkv  reason: default package */
/* loaded from: classes4.dex */
public final class pkv {
    public final int c;
    private final int[] e;
    public static final pkv a = new pkv(new int[]{2}, 8);
    private static final pkv d = new pkv(new int[]{2, 5, 6}, 8);
    public static final int[] b = {5, 6, 18, 17, 14, 7, 8};

    public pkv(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.e = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.e = new int[0];
        }
        this.c = i;
    }

    public static pkv a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i = pxi.a;
        if (("Amazon".equals(pxi.c) || "Xiaomi".equals(pxi.c)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        if (pxi.a < 29 || !pxi.S(context)) {
            if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
                return a;
            }
            return new pkv(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new pkv(pku.a(), 8);
    }

    public final boolean b(int i) {
        return Arrays.binarySearch(this.e, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkv)) {
            return false;
        }
        pkv pkvVar = (pkv) obj;
        return Arrays.equals(this.e, pkvVar.e) && this.c == pkvVar.c;
    }

    public final int hashCode() {
        return this.c + (Arrays.hashCode(this.e) * 31);
    }

    public final String toString() {
        int i = this.c;
        String arrays = Arrays.toString(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
