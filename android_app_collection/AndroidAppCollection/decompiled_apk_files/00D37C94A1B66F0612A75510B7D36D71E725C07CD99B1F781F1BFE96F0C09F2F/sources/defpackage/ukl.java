package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ukl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ukl {
    public final /* synthetic */ ukn a;

    public /* synthetic */ ukl(ukn uknVar) {
        this.a = uknVar;
    }

    public final ukj a(Object obj) {
        ukp ukpVar;
        ukn uknVar = this.a;
        if (zgd.Z(obj).a) {
            if (ukn.a == null) {
                ukn.a = new ukp(ukm.a, uknVar.b.getString(R.string.og_google_one_account_a11y));
            }
            ukpVar = ukn.a;
        } else {
            ukpVar = null;
        }
        return new ukj(ukpVar);
    }
}
