package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cxqk  reason: default package */
/* loaded from: classes5.dex */
public final class cxqk {
    public static void a(Activity activity, Chip chip, Channel channel, String str) {
        if (channel.k()) {
            str = channel.b(activity);
        } else if (TextUtils.isEmpty(str)) {
            str = channel.i(activity);
        }
        chip.setText(str);
    }
}
