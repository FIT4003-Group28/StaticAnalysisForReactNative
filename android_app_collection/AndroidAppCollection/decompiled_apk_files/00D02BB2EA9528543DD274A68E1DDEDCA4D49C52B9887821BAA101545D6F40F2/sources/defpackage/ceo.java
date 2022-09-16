package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: ceo  reason: default package */
/* loaded from: classes.dex */
public final class ceo implements cen<ParcelFileDescriptor> {
    @Override // defpackage.cen
    public final /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
    }
}
