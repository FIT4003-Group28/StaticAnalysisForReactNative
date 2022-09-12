package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awge  reason: default package */
/* loaded from: classes3.dex */
public class awge extends awgc {
    private final Context a;

    public awge(Context context, awgb awgbVar, int i) {
        super(awgbVar, 1);
        this.a = context;
    }

    @Override // defpackage.awgq
    public String i() {
        return this.a.getString(R.string.OFFLINE_MAPS_SETTINGS_DOWNLOAD_PREFERENCE_WIFI_OR_NETWORK);
    }
}
