package defpackage;

import android.app.Activity;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bdmb  reason: default package */
/* loaded from: classes3.dex */
public class bdmb {
    public bdma a;
    public bdlz b;
    public final Activity c;
    private final String d;
    private final axru e;
    private final axrx f;

    public bdmb(String str, bdma bdmaVar, bdlz bdlzVar, Activity activity, axru axruVar, axrx axrxVar) {
        this.d = str;
        this.a = bdmaVar;
        this.b = bdlzVar;
        this.c = activity;
        this.e = axruVar;
        this.f = axrxVar;
    }

    public final boolean a() {
        return this.e.a(this.d);
    }

    public final boolean b() {
        bdma bdmaVar = bdma.NOT_STARTED;
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            if (a()) {
                this.b = bdlz.GRANTED;
                return true;
            }
            this.b = bdlz.DENIED_UNKNOWN;
            if (Build.VERSION.SDK_INT >= 23) {
                this.a = bdma.STARTED_NOT_RESPONDED;
                String str = this.d;
                this.f.b(str, new bdly(this, str, this.c.shouldShowRequestPermissionRationale(str)));
            } else {
                this.a = bdma.NOT_STARTED;
            }
            return false;
        } else if (ordinal == 1) {
            this.a = bdma.NOT_STARTED;
            boolean a = a();
            if (a) {
                this.b = bdlz.GRANTED;
            }
            return a;
        } else if (ordinal == 2) {
            this.a = bdma.NOT_STARTED;
            return true;
        } else if (ordinal != 3) {
            return false;
        } else {
            this.a = bdma.NOT_STARTED;
            return false;
        }
    }
}
