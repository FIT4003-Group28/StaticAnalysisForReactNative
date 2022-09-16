package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
/* compiled from: PG */
/* renamed from: afad  reason: default package */
/* loaded from: classes.dex */
public abstract class afad {
    public static boolean g(afad afadVar, afad afadVar2) {
        if (afadVar != afadVar2) {
            if (afadVar != null && afadVar2 != null) {
                afac afacVar = (afac) afadVar;
                afac afacVar2 = (afac) afadVar2;
                if (afacVar.c != afacVar2.c || !TextUtils.equals(afacVar.b, afacVar2.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public static afad h(int i, int i2, Format format, String str) {
        return new afac(i, i2, format, str);
    }

    public abstract int a();

    public abstract Format b();

    public abstract String c();

    public abstract int d();

    public TrackGroup e() {
        throw null;
    }

    public pvf f() {
        throw null;
    }
}
