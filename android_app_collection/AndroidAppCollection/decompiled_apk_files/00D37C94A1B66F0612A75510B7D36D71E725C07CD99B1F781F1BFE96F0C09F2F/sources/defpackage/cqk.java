package defpackage;
/* compiled from: PG */
/* renamed from: cqk  reason: default package */
/* loaded from: classes3.dex */
final class cqk extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public cqk() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
