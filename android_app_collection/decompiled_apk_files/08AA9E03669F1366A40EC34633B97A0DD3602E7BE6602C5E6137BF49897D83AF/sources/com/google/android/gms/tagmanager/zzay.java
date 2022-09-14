package com.google.android.gms.tagmanager;

import java.util.Arrays;
/* loaded from: classes.dex */
final class zzay {
    final byte[] zzaxw;
    final String zzny;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(String str, byte[] bArr) {
        this.zzny = str;
        this.zzaxw = bArr;
    }

    public final String toString() {
        String str = this.zzny;
        int hashCode = Arrays.hashCode(this.zzaxw);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("KeyAndSerialized: key = ");
        sb.append(str);
        sb.append(" serialized hash = ");
        sb.append(hashCode);
        return sb.toString();
    }
}
