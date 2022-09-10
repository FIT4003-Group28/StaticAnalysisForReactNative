package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vzg  reason: default package */
/* loaded from: classes7.dex */
public final class vzg {
    static final long a = TimeUnit.HOURS.toMillis(2);
    static final String b;
    private static final String c;
    private final Context d;
    private final cqat e;
    private final PendingIntent f;
    private final BroadcastReceiver g = new vzf();
    private final jzv h;
    private final dxio<aukk> i;

    static {
        String canonicalName = vzg.class.getCanonicalName();
        b = canonicalName;
        c = String.valueOf(canonicalName).concat(".CLEAR");
    }

    public vzg(Context context, cqat cqatVar, jzv jzvVar, dxio<aukk> dxioVar) {
        this.d = context;
        this.e = cqatVar;
        this.f = PendingIntent.getBroadcast(context, dpyv.RESUME_NAVIGATION.dm, new Intent().setAction(c), 268435456);
        this.h = jzvVar;
        this.i = dxioVar;
    }

    public final void a() {
        in.a(this.d).c(b, dpyv.RESUME_NAVIGATION.dm);
        ((AlarmManager) this.d.getSystemService("alarm")).cancel(this.f);
    }

    public final void b(amte amteVar, int i, String str) {
        Intent putExtra = afft.a(this.d).putExtra("ResumeNavigationIntent_TRIP_INDEX", i);
        Bundle bundle = new Bundle();
        bundle.putSerializable("ResumeNavigationIntent_DIRECTIONS_STORAGE_ITEM", amteVar);
        putExtra.putExtra("ResumeNavigationIntent_DIRECTIONS_STORAGE_ITEM", bundle);
        PendingIntent activity = PendingIntent.getActivity(this.d, dpyv.RESUME_NAVIGATION.dm, putExtra, 268435456);
        ib ibVar = new ib(this.d);
        ibVar.h(true);
        ibVar.g = activity;
        ibVar.l(this.d.getString(R.string.RESUME_NAVIGATION));
        ibVar.k(str);
        ibVar.n(this.f);
        ibVar.k = -1;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = amteVar.c(i).ordinal();
        if (ordinal == 0) {
            ibVar.t(2131232615);
        } else if (ordinal == 1) {
            ibVar.t(2131232606);
        } else if (ordinal == 2) {
            ibVar.t(2131232628);
        } else if (ordinal == 5) {
            ibVar.t(2131231607);
        } else {
            ibVar.t(2131232805);
        }
        ibVar.B = this.d.getResources().getColor(R.color.quantum_googgreen);
        this.h.d(dpyv.RESUME_NAVIGATION.dm, ibVar, putExtra, this.d.getString(R.string.RESUME_NAVIGATION), str);
        if (ako.a()) {
            this.i.a().a(false);
            ibVar.G = "OtherChannel";
        }
        in.a(this.d).e(b, dpyv.RESUME_NAVIGATION.dm, ibVar.b());
        ((AlarmManager) this.d.getSystemService("alarm")).set(3, this.e.e() + a, this.f);
        this.d.registerReceiver(this.g, new IntentFilter(c));
    }
}
