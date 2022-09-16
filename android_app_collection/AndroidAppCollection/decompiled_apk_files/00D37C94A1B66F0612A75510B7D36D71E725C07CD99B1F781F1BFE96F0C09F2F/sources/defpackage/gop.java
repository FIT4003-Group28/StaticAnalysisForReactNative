package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
/* compiled from: PG */
/* renamed from: gop  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gop implements ampg {
    public final /* synthetic */ GalFlowActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ gop(GalFlowActivity galFlowActivity) {
        this.a = galFlowActivity;
    }

    public /* synthetic */ gop(GalFlowActivity galFlowActivity, int i) {
        this.b = i;
        this.a = galFlowActivity;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            this.a.a((Intent) obj);
            return gor.PENDING;
        }
        this.a.a((Intent) obj);
        return gor.PENDING;
    }
}
