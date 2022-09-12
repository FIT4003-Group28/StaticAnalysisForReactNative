package defpackage;

import java.util.function.Function;
/* renamed from: art  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class art implements Function {
    static final Function a = new art();

    private art() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        char c;
        String str = (String) obj;
        int hashCode = str.hashCode();
        if (hashCode == -2065577523) {
            if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 956939050) {
            if (hashCode == 975975375 && str.equals("android.media.intent.category.LIVE_VIDEO")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                c = 0;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : "android.media.route.feature.REMOTE_PLAYBACK" : "android.media.route.feature.LIVE_VIDEO" : "android.media.route.feature.LIVE_AUDIO";
    }
}
