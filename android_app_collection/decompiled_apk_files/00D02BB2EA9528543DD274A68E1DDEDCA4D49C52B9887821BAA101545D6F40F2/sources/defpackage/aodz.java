package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aodz  reason: default package */
/* loaded from: classes2.dex */
public class aodz implements aody {
    private final aodo a;
    private final aodo b;
    private final boolean c;

    public aodz(Activity activity, cqat cqatVar, aoeb aoebVar, boolean z, Runnable runnable) {
        this.a = aodo.d(activity, cqatVar, aoebVar.a().a(), false, activity.getString(R.string.MAPS_ACTIVITY_START_TIME), runnable);
        this.b = aodo.d(activity, cqatVar, aoebVar.a().b(), aoebVar.b() == 2, activity.getString(R.string.MAPS_ACTIVITY_END_TIME), runnable);
        this.c = z;
    }

    @Override // defpackage.aody
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aody
    public Boolean d() {
        return Boolean.valueOf(this.b.e());
    }

    @Override // defpackage.aody
    /* renamed from: e */
    public aodo a() {
        return this.a;
    }

    @Override // defpackage.aody
    /* renamed from: f */
    public aodo b() {
        return this.b;
    }

    public boolean g() {
        return h().d().a();
    }

    public aogq h() {
        return aogq.c(this.a.f(), this.b.f());
    }
}
