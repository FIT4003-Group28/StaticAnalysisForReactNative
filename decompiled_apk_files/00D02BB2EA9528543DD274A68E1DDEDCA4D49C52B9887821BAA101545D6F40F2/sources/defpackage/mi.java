package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: mi  reason: default package */
/* loaded from: classes7.dex */
public final class mi {
    public final mc a;
    public final ConcurrentHashMap<mb, Boolean> b = new ConcurrentHashMap<>();

    public mi(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = new me(context, mediaSessionCompat$Token);
    }
}
