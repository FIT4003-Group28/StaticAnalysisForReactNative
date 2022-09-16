package defpackage;

import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector;
/* compiled from: PG */
/* renamed from: ahsa  reason: default package */
/* loaded from: classes.dex */
public final class ahsa extends akaw {
    final HeadsetSelector.HeadsetInfo a;

    public ahsa(Context context, HeadsetSelector.HeadsetInfo headsetInfo) {
        super(context, headsetInfo.getDisplayName());
        this.a = headsetInfo;
    }
}
