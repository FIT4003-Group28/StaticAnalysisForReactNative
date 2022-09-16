package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aiqk  reason: default package */
/* loaded from: classes.dex */
public final class aiqk {
    public static final aiqk a = new aiqk(aiqj.NEXT);
    public static final aiqk b = new aiqk(aiqj.PREVIOUS);
    public static final aiqk c = new aiqk(aiqj.AUTOPLAY);
    public static final aiqk d = new aiqk(aiqj.AUTONAV);
    public final aiqj e;
    public final PlaybackStartDescriptor f;
    public final aijp g;

    private aiqk(aiqj aiqjVar) {
        this(aiqjVar, null, null, null);
    }

    public aiqk(aiqj aiqjVar, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, byte[] bArr) {
        this.e = aiqjVar;
        this.f = playbackStartDescriptor;
        this.g = aijpVar;
    }

    public static final int a(boolean z) {
        return z ? 2 : 1;
    }

    public aiqk(aiqj aiqjVar, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        this(aiqjVar, playbackStartDescriptor, aijpVar, null);
    }
}
