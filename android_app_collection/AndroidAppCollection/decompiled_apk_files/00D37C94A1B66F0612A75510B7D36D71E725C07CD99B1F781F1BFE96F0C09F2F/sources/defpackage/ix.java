package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
/* compiled from: PG */
/* renamed from: ix  reason: default package */
/* loaded from: classes3.dex */
final class ix extends iw {
    public ix(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.iu
    public final MediaSession s(Context context, String str) {
        return new MediaSession(context, str, null);
    }
}
