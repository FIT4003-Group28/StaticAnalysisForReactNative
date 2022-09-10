package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: apqu  reason: default package */
/* loaded from: classes2.dex */
public final class apqu implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof apqt) {
            apqt apqtVar = apqt.VIDEO_ASPECT_RATIO_HINT;
            switch (((apqt) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Float)) {
                        return false;
                    }
                    ((apqr) view).setVideoAspectRatioHint((Float) obj);
                    return true;
                case 1:
                    if (!(view instanceof apqr) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((apqr) view).setVideoDebug(((Boolean) obj).booleanValue());
                    return true;
                case 2:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Long)) {
                        return false;
                    }
                    ((apqr) view).setVideoEndPositionInMillis((Long) obj);
                    return true;
                case 3:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof apnj)) {
                        return false;
                    }
                    ((apqr) view).setVideoEventListener((apnj) obj);
                    return true;
                case 4:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof String)) {
                        return false;
                    }
                    ((apqr) view).setVideoLoggingId((String) obj);
                    return true;
                case 5:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Integer)) {
                        return false;
                    }
                    ((apqr) view).setVideoFormatId((Integer) obj);
                    return true;
                case 6:
                    if (!(view instanceof apqr) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((apqr) view).setVideoPlay(((Boolean) obj).booleanValue());
                    return true;
                case 7:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof apnk)) {
                        return false;
                    }
                    ((apqr) view).setVideoPlaybackController((apnk) obj);
                    return true;
                case 8:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof apqp)) {
                        return false;
                    }
                    ((apqr) view).setVideoScalingMode((apqp) obj);
                    return true;
                case 9:
                    if (!(view instanceof apqr) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((apqr) view).setVideoSound(((Boolean) obj).booleanValue());
                    return true;
                case 10:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof String)) {
                        return false;
                    }
                    ((apqr) view).setVideoThumbnailUrl((String) obj);
                    return true;
                case 11:
                    if (!(view instanceof apqr)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof String)) {
                        return false;
                    }
                    ((apqr) view).setVideoUrl((String) obj);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof apqt) {
            apqt apqtVar = apqt.VIDEO_ASPECT_RATIO_HINT;
            if (((apqt) cqkuVar).ordinal() != 7 || !(view instanceof apqr)) {
                return false;
            }
            ((apqr) view).setVideoPlaybackController(null);
            return true;
        }
        return false;
    }
}
