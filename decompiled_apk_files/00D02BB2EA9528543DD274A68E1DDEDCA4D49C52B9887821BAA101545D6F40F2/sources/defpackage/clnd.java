package defpackage;

import android.os.Build;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: clnd  reason: default package */
/* loaded from: classes5.dex */
public final class clnd {
    public static final String a;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("ExoPlayerLib/2.12.1 (Linux;Android ");
        sb.append(str);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.12.1");
        a = sb.toString();
        new HashSet();
    }
}
