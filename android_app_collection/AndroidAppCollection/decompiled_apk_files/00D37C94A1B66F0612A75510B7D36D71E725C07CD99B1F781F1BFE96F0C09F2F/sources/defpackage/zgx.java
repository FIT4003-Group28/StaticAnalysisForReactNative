package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: zgx  reason: default package */
/* loaded from: classes4.dex */
public final class zgx extends ContentObserver {
    public static final Uri a = Settings.System.CONTENT_URI;
    public final ContentResolver b;
    public final Handler c;
    public final AtomicInteger d;
    public Integer e;
    public ankt f;
    private final AudioManager g;

    public zgx(Context context, Handler handler) {
        super(handler);
        this.d = new AtomicInteger();
        this.g = (AudioManager) context.getSystemService("audio");
        this.b = context.getContentResolver();
        this.c = handler;
    }

    public final synchronized void a() {
        this.e = Integer.valueOf(this.g.getStreamVolume(3));
    }

    @Override // android.database.ContentObserver
    public final synchronized void onChange(boolean z) {
        a();
    }
}
