package defpackage;
/* compiled from: PG */
/* renamed from: tvg  reason: default package */
/* loaded from: classes4.dex */
public enum tvg {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);
    
    public final int d;

    tvg(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static tvg a(int i) {
        if (i != 0) {
            if (i == 1) {
                return ADD_DOWNLOAD_TRANSFORM;
            }
            if (i == 2) {
                return USE_CHECKSUM_ONLY;
            }
            StringBuilder sb = new StringBuilder(39);
            sb.append("Unknown MDD FileKey version:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return NEW_FILE_KEY;
    }
}
