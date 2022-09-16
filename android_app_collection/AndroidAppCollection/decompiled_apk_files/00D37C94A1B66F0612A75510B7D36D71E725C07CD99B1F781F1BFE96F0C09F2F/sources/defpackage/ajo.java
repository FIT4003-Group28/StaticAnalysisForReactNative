package defpackage;

import android.app.ActivityOptions;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ajo  reason: default package */
/* loaded from: classes.dex */
public final class ajo extends akd {
    private final ActivityOptions a;

    public ajo(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // defpackage.akd
    public final Bundle a() {
        return this.a.toBundle();
    }
}
