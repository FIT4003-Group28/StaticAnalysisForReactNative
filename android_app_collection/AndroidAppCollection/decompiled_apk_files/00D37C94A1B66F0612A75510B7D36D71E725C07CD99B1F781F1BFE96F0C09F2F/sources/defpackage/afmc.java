package defpackage;

import android.media.MediaCodecInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: afmc  reason: default package */
/* loaded from: classes.dex */
final class afmc extends afmb {
    @Override // defpackage.afmb
    protected final /* bridge */ /* synthetic */ String b(Object obj) {
        return ((osv) obj).a;
    }

    @Override // defpackage.afmb
    protected final List c(String str, boolean z) {
        return oty.a(str, z);
    }

    @Override // defpackage.afmb
    protected final /* bridge */ /* synthetic */ MediaCodecInfo.CodecProfileLevel[] d(Object obj) {
        return ((osv) obj).b.profileLevels;
    }
}
