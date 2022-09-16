package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awgr  reason: default package */
/* loaded from: classes3.dex */
public class awgr extends awgc {
    private final Context a;

    public awgr(Context context, awgb awgbVar, int i, bvoh bvohVar) {
        super(awgbVar, 1);
        this.a = context;
    }

    @Override // defpackage.awgc, defpackage.awgq
    public Boolean f() {
        return Boolean.valueOf(j());
    }

    @Override // defpackage.awgc, defpackage.awgq
    public Boolean g() {
        return Boolean.valueOf(j());
    }

    @Override // defpackage.awgq
    public String i() {
        return this.a.getString(R.string.OFFLINE_MAPS_SETTINGS_STORAGE_SETTINGS_SD_DESCRIPTION, Long.valueOf(bvop.i(bvog.l(this.a))));
    }

    public boolean j() {
        try {
            return bvog.k(this.a);
        } catch (bvof unused) {
            return false;
        }
    }
}
