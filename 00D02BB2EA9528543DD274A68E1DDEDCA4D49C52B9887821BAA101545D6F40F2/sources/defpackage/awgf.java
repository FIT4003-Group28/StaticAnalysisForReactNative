package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awgf  reason: default package */
/* loaded from: classes3.dex */
public class awgf extends awgc {
    private final Context a;

    public awgf(Context context, awgb awgbVar, int i, bvoh bvohVar) {
        super(awgbVar, 0);
        this.a = context;
    }

    @Override // defpackage.awgc, defpackage.awgq
    public Boolean a() {
        return true;
    }

    @Override // defpackage.awgc, defpackage.awgq
    public String b() {
        return this.a.getString(R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_PHONE_DESCRIPTION_PART_2);
    }

    @Override // defpackage.awgq
    public String i() {
        return this.a.getString(R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_PHONE_DESCRIPTION, Long.valueOf(bvop.i(bvog.d(this.a))));
    }
}
