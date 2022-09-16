package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clrd  reason: default package */
/* loaded from: classes5.dex */
public final class clrd {
    public static final clrd a = new clrd(new int[]{2}, 8);
    private static final clrd c = new clrd(new int[]{2, 5, 6}, 8);
    public final int b;
    private final int[] d;

    public clrd(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.d = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.d = new int[0];
        }
        this.b = i;
    }

    public static clrd a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (cmny.a < 17 || !"Amazon".equals(cmny.c) || Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) != 1) {
            if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
                return a;
            }
            return new clrd(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return c;
    }

    public final boolean b(int i) {
        return Arrays.binarySearch(this.d, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clrd)) {
            return false;
        }
        clrd clrdVar = (clrd) obj;
        return Arrays.equals(this.d, clrdVar.d) && this.b == clrdVar.b;
    }

    public final int hashCode() {
        return this.b + (Arrays.hashCode(this.d) * 31);
    }

    public final String toString() {
        int i = this.b;
        String arrays = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
