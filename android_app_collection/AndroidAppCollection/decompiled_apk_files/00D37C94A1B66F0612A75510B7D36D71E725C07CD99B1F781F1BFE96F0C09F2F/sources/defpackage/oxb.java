package defpackage;

import android.media.MediaDrm;
/* compiled from: PG */
/* renamed from: oxb  reason: default package */
/* loaded from: classes4.dex */
final class oxb implements MediaDrm.OnEventListener {
    final /* synthetic */ owz a;

    public oxb(owz owzVar) {
        this.a = owzVar;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.a.g(bArr, i);
    }
}
