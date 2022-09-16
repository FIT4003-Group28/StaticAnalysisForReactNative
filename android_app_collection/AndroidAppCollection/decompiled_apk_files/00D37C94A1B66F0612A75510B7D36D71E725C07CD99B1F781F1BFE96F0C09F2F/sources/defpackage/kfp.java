package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kfp  reason: default package */
/* loaded from: classes3.dex */
public final class kfp extends ContentObserver {
    public static final Uri a = Settings.System.CONTENT_URI;
    private final int b;
    private final int c;
    private final AudioManager d;
    private final aynw e;

    public kfp(Context context, aynw aynwVar) {
        super(new Handler());
        this.e = aynwVar;
        this.c = 3;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.d = audioManager;
        this.b = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = this.b - this.d.getStreamVolume(this.c);
        if (streamVolume != 0) {
            this.e.a(Integer.valueOf(streamVolume));
        }
    }
}
