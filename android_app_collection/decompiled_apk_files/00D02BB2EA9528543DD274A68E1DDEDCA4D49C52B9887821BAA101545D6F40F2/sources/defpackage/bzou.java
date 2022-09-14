package defpackage;

import android.content.Context;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: bzou  reason: default package */
/* loaded from: classes4.dex */
final class bzou implements cqdi {
    private final Context a;

    public bzou(Context context) {
        this.a = context;
    }

    @Override // defpackage.cqdi
    public final dyhi a(String str, int i) {
        return dyjw.a(str, i, new ExperimentalCronetEngine.Builder(this.a).mo32build()).c();
    }
}
