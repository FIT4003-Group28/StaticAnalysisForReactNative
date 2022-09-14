package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: sup  reason: default package */
/* loaded from: classes7.dex */
public class sup implements suo {
    private final String a;

    public sup(Activity activity, boolean z) {
        String string;
        if (z) {
            string = activity.getString(ssv.AVAILABILITY_AND_PRICE_TIME_ANCHORING_DISCLAIMER);
        } else {
            string = activity.getString(ssv.AVAILABILITY_TIME_ANCHORING_DISCLAIMER);
        }
        this.a = string;
    }

    @Override // defpackage.suo
    public String a() {
        return this.a;
    }
}
