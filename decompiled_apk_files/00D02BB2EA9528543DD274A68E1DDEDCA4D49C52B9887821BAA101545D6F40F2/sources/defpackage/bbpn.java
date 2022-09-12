package defpackage;
/* compiled from: PG */
/* renamed from: bbpn  reason: default package */
/* loaded from: classes3.dex */
class bbpn extends dbrh<dfwn, dgge> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dfwn b(dgge dggeVar) {
        dgge dggeVar2 = dggeVar;
        dfwn dfwnVar = dfwn.IMAGE_UNKNOWN;
        switch (dggeVar2.ordinal()) {
            case 0:
                return dfwn.IMAGE_UNKNOWN;
            case 1:
                return dfwn.IMAGE_INTERNET;
            case 2:
                return dfwn.IMAGE_ALLEYCAT;
            case 3:
                return dfwn.IMAGE_FIFE;
            case 4:
                return dfwn.IMAGE_PANORAMIO;
            case 5:
                return dfwn.METADATA_GEO_PHOTO_SERVICE;
            case 6:
                return dfwn.VIDEO_YOUTUBE;
            case 7:
                return dfwn.KEYHOLE;
            case 8:
                return dfwn.IMAGE_CONTENT_FIFE;
            case 9:
                return dfwn.IMAGE_ALLEYCAT_SEARCH;
            case 10:
                return dfwn.MEDIA_GUESSABLE_FIFE;
            default:
                String valueOf = String.valueOf(dggeVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgge c(dfwn dfwnVar) {
        dfwn dfwnVar2 = dfwnVar;
        dgge dggeVar = dgge.IMAGE_UNKNOWN;
        switch (dfwnVar2.ordinal()) {
            case 0:
                return dgge.IMAGE_UNKNOWN;
            case 1:
                return dgge.IMAGE_INTERNET;
            case 2:
                return dgge.IMAGE_ALLEYCAT;
            case 3:
                return dgge.IMAGE_FIFE;
            case 4:
                return dgge.IMAGE_PANORAMIO;
            case 5:
                return dgge.METADATA_GEO_PHOTO_SERVICE;
            case 6:
                return dgge.VIDEO_YOUTUBE;
            case 7:
                return dgge.KEYHOLE;
            case 8:
                return dgge.IMAGE_CONTENT_FIFE;
            case 9:
                return dgge.IMAGE_ALLEYCAT_SEARCH;
            case 10:
                return dgge.MEDIA_GUESSABLE_FIFE;
            default:
                String valueOf = String.valueOf(dfwnVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
