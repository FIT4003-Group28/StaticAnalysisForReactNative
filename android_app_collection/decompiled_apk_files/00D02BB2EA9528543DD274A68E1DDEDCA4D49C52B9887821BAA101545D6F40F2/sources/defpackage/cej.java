package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
/* compiled from: PG */
/* renamed from: cej  reason: default package */
/* loaded from: classes.dex */
public final class cej implements cen<AssetFileDescriptor> {
    @Override // defpackage.cen
    public final /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
    }
}
