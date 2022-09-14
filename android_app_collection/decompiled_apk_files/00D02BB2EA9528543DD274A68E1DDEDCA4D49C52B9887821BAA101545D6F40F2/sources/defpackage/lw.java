package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
/* compiled from: PG */
/* renamed from: lw  reason: default package */
/* loaded from: classes7.dex */
public interface lw extends IInterface {
    void a(String str, Bundle bundle);

    void b();

    void c(PlaybackStateCompat playbackStateCompat);

    void d(MediaMetadataCompat mediaMetadataCompat);

    void e(List<MediaSessionCompat$QueueItem> list);

    void f(CharSequence charSequence);

    void g(Bundle bundle);

    void h(ParcelableVolumeInfo parcelableVolumeInfo);

    void i(int i);

    void j(boolean z);

    void k(int i);

    void l();
}
