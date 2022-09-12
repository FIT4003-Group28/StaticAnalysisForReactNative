package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ciru  reason: default package */
/* loaded from: classes4.dex */
public class ciru implements cirt {
    private final Activity a;
    private final boolean b;

    public ciru(Activity activity, boolean z) {
        this.a = activity;
        this.b = z;
    }

    @Override // defpackage.cirt
    public String a() {
        if (this.b) {
            return this.a.getString(R.string.CZ_MODERATE_EDIT_MODE_FINISHED_STATE_HEADER);
        }
        return this.a.getString(R.string.CZ_FINISHED_STATE_HEADER);
    }

    @Override // defpackage.cirt
    public String b() {
        if (this.b) {
            return this.a.getString(R.string.CZ_MODERATE_EDIT_MODE_FINISHED_STATE_SUBHEADER);
        }
        return this.a.getString(R.string.CZ_FINISHED_STATE_SUBHEADER);
    }
}
