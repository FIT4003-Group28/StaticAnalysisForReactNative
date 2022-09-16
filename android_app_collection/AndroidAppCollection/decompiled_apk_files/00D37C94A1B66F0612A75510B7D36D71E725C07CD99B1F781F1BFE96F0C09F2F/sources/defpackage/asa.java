package defpackage;

import android.media.VolumeProvider;
/* compiled from: PG */
/* renamed from: asa  reason: default package */
/* loaded from: classes2.dex */
final class asa extends VolumeProvider {
    final /* synthetic */ asd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asa(asd asdVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = asdVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.a.b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.a.c(i);
    }
}
