package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ma  reason: default package */
/* loaded from: classes7.dex */
public class ma extends lv {
    private final WeakReference<mb> a;

    public ma(mb mbVar) {
        this.a = new WeakReference<>(mbVar);
    }

    @Override // defpackage.lw
    public final void a(String str, Bundle bundle) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(1, str, bundle);
        }
    }

    @Override // defpackage.lw
    public void b() {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(8, null, null);
        }
    }

    @Override // defpackage.lw
    public final void c(PlaybackStateCompat playbackStateCompat) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(2, playbackStateCompat, null);
        }
    }

    @Override // defpackage.lw
    public void d(MediaMetadataCompat mediaMetadataCompat) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(3, mediaMetadataCompat, null);
        }
    }

    @Override // defpackage.lw
    public void e(List<MediaSessionCompat$QueueItem> list) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(5, list, null);
        }
    }

    @Override // defpackage.lw
    public void f(CharSequence charSequence) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(6, charSequence, null);
        }
    }

    @Override // defpackage.lw
    public void g(Bundle bundle) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(7, bundle, null);
        }
    }

    @Override // defpackage.lw
    public void h(ParcelableVolumeInfo parcelableVolumeInfo) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(4, parcelableVolumeInfo != null ? new mf(parcelableVolumeInfo.b) : null, null);
        }
    }

    @Override // defpackage.lw
    public final void i(int i) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(9, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.lw
    public final void j(boolean z) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(11, Boolean.valueOf(z), null);
        }
    }

    @Override // defpackage.lw
    public final void k(int i) {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(12, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.lw
    public final void l() {
        mb mbVar = this.a.get();
        if (mbVar != null) {
            mbVar.d(13, null, null);
        }
    }
}
