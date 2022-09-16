package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsra  reason: default package */
/* loaded from: classes4.dex */
public class bsra implements bsso {
    private static final dcqe a = dcqe.c("bsra");
    private final dwii b;
    private final cjtd c;
    private final Activity d;
    private final cklf e;

    public bsra(Activity activity, cklf cklfVar, dwij dwijVar) {
        this.d = activity;
        dwii b = dwii.b(dwijVar.b);
        this.b = b == null ? dwii.UNKNOWN : b;
        this.c = cjtd.a(dtxy.bE);
        this.e = cklfVar;
    }

    @Override // defpackage.bsso
    public String a() {
        dwii dwiiVar = dwii.UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal != 1) {
            return (ordinal == 2 || ordinal == 3) ? this.d.getString(R.string.RESERVATION_SEARCH_NO_RESULTS) : "";
        }
        return this.d.getString(R.string.CONTACT_SEARCH_NO_RESULTS);
    }

    @Override // defpackage.bsso
    public String b() {
        return this.d.getString(R.string.PERSONAL_RESULT_LEARN_MORE);
    }

    @Override // defpackage.bsso
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.bsso
    public cqkl d() {
        dwii dwiiVar = dwii.UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            this.e.a("maps_android_contacts");
        } else if (ordinal == 2 || ordinal == 3) {
            this.e.a("find_reservations");
        } else {
            bvoo.h("Invalid personal query type: %s", this.b);
        }
        return cqkl.a;
    }
}
