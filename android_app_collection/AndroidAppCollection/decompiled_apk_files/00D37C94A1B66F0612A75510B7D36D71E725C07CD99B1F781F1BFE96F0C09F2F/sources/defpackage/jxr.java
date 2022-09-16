package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jxr  reason: default package */
/* loaded from: classes3.dex */
public final class jxr implements ahxz {
    public final dt a;
    public final jxt b;
    public final jxq c;

    public jxr(dt dtVar, jxq jxqVar) {
        this.a = dtVar;
        jxt jxtVar = new jxt(dtVar.getString(R.string.audio_tracks_title), new jxp(this));
        this.b = jxtVar;
        jxtVar.e = akf.a(dtVar, 2131231746);
        this.c = jxqVar;
    }
}
