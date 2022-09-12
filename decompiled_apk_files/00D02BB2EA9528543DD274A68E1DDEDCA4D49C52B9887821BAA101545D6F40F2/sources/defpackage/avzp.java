package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avzp  reason: default package */
/* loaded from: classes3.dex */
public class avzp {
    public final Context a;
    public final avza b;
    public final avzo c;
    private final avyx d;
    private final avzm e;

    public avzp(Application application, avyx avyxVar, avza avzaVar, avzo avzoVar, avzm avzmVar) {
        this.a = application;
        this.d = avyxVar;
        this.b = avzaVar;
        this.c = avzoVar;
        this.e = avzmVar;
    }

    public final cqtd a(dltm dltmVar, boolean z) {
        if (z) {
            return cqrt.g(2131232822, ibm.k());
        }
        int b = this.c.b(dltmVar) - 1;
        if (b == 0) {
            return cqrt.g(2131232676, ibm.w());
        }
        if (b != 2) {
            if (b != 3) {
                if (b != 4) {
                    if (b != 5) {
                        if (b != 6) {
                            if (b != 8 && b != 9) {
                                return cqrt.f(2131232822);
                            }
                            return cqrt.g(2131232981, ibm.C());
                        }
                    }
                }
            }
            return cqrt.g(2131231683, ibm.w());
        }
        return cqrt.g(2131231680, ibm.w());
    }

    public final CharSequence b(dltm dltmVar) {
        if (dltmVar.r) {
            return c(dltmVar, true, false);
        }
        return d(dltmVar);
    }

    public final CharSequence c(dltm dltmVar, boolean z, boolean z2) {
        switch (this.c.b(dltmVar) - 1) {
            case 3:
                return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_WAITING_TO_SAVE);
            case 4:
                if (z2) {
                    return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_SAVING_PROGRESS, Integer.valueOf(dltmVar.f));
                }
                return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_SAVING);
            case 5:
                return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_WAITING_TO_UPDATE);
            case 6:
                if (z2) {
                    return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_UPDATING_PROGRESS, Integer.valueOf(dltmVar.f));
                }
                return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_UPDATING);
            case 7:
                return this.a.getString(true != z ? R.string.OFFLINE_REGION_LIST_STATUS_SAVED : R.string.OFFLINE_REGION_LIST_STATUS_SAVED_SHORT, Long.valueOf(bvop.i(dltmVar.j)), DateFormat.getMediumDateFormat(this.a).format(Long.valueOf(dltmVar.h)));
            case 8:
                int a = dlth.a(dltmVar.e);
                if (a == 0 || a != 3) {
                    return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_FAILED);
                }
                return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_CANCELED);
            case 9:
                return this.a.getString(R.string.OFFLINE_REGION_LIST_STATUS_EXPIRED);
            default:
                return "";
        }
    }

    public final CharSequence d(dltm dltmVar) {
        long j = dltmVar.i;
        dlug dlugVar = dltmVar.c;
        if (dlugVar == null) {
            dlugVar = dlug.c;
        }
        return this.a.getString(R.string.OFFLINE_FORMATTED_DOWNLOAD_SIZE, Long.valueOf(e(j, dlugVar)));
    }

    public final long e(long j, dlug dlugVar) {
        if (j == 0) {
            dcdc<akqs> b = this.e.a(dlugVar).b();
            int size = b.size();
            double d = dcyn.a;
            for (int i = 0; i < size; i++) {
                d += b.get(i).g();
            }
            return this.d.a((long) (d * 6371009.0d * 6371009.0d));
        }
        return bvop.i(j);
    }
}
