package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: vut  reason: default package */
/* loaded from: classes4.dex */
final class vut implements vuu {
    private final /* synthetic */ int c;

    public vut() {
    }

    public vut(int i) {
        this.c = i;
    }

    @Override // defpackage.vuu
    public final vuv a(int[] iArr, VideoMetaData videoMetaData) {
        if (this.c == 0) {
            return new vux(iArr, videoMetaData);
        }
        Arrays.sort(iArr);
        return new vqd(iArr);
    }
}
