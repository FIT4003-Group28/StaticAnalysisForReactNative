package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aiem  reason: default package */
/* loaded from: classes.dex */
public class aiem extends aiek {
    private int a;

    public aiem(aiev aievVar, fgj fgjVar) {
        super(aievVar, fgjVar);
        this.a = 0;
    }

    @Override // defpackage.aiep
    public aiqk a(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        return new aiqk(aiqj.INSERT, playbackStartDescriptor, aijpVar);
    }

    @Override // defpackage.aiek, defpackage.aiqi
    public final boolean n(int i) {
        return true;
    }

    @Override // defpackage.aiqi
    public final int u() {
        return this.a;
    }

    @Override // defpackage.aiqi
    public final void v(int i) {
        this.a = i;
    }
}
