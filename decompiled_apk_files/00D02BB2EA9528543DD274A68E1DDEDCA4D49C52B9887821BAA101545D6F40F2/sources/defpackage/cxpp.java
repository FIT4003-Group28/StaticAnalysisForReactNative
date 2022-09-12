package defpackage;

import android.util.Log;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxpp  reason: default package */
/* loaded from: classes5.dex */
public final class cxpp<T> implements chv<T> {
    private final String a;
    private final cxpr b;
    private final Channel c;

    public cxpp(String str, cxpr cxprVar, Channel channel) {
        this.a = str;
        this.b = cxprVar;
        this.c = channel;
    }

    @Override // defpackage.chv
    public final boolean Nl(bwx bwxVar) {
        if (Log.isLoggable("AvatarGlideListener", 6) && String.valueOf(this.a).length() == 0) {
            new String("Could not load avatar: ");
        }
        Channel channel = this.c;
        if (channel != null) {
            this.b.d(channel.m(), this.c.f());
            return true;
        }
        this.b.d(null, "");
        return true;
    }

    @Override // defpackage.chv
    public final boolean Nm(T t, int i) {
        this.b.b.setDrawDefaultSilhouette(false, 0, true);
        return false;
    }
}
