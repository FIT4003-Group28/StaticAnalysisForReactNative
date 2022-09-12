package defpackage;

import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cel  reason: default package */
/* loaded from: classes4.dex */
public final class cel implements cen<ByteBuffer> {
    @Override // defpackage.cen
    public final /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        mediaMetadataRetriever.setDataSource(new cek(byteBuffer));
    }
}
