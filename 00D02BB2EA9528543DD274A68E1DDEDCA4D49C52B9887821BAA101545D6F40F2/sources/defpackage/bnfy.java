package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.place.updates.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnfy  reason: default package */
/* loaded from: classes3.dex */
public final class bnfy implements cdix {
    final /* synthetic */ bngi a;
    final /* synthetic */ Executor b;
    final /* synthetic */ Activity c;

    public bnfy(bngi bngiVar, Executor executor, Activity activity) {
        this.a = bngiVar;
        this.b = executor;
        this.c = activity;
    }

    @Override // defpackage.cdix
    public final void a() {
        Executor executor = this.b;
        Activity activity = this.c;
        cjxu.h(executor, activity, activity.getString(R.string.PHOTO_UPDATE_DELETE_FAILURE));
        this.a.d().v();
    }

    @Override // defpackage.cdix
    public final void b() {
        Executor executor = this.b;
        Activity activity = this.c;
        cjxu.h(executor, activity, activity.getString(R.string.PHOTO_UPDATE_DELETE_SUCCESS));
        this.a.d().v();
    }
}
