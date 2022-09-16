package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cqi  reason: default package */
/* loaded from: classes3.dex */
public final class cqi implements cqj {
    private final /* synthetic */ int a;

    public cqi() {
    }

    public cqi(int i) {
        this.a = i;
    }

    @Override // defpackage.cqj
    public final /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = this.a;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new cqh((ByteBuffer) obj));
        } else if (i == 1) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } else {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }
}
