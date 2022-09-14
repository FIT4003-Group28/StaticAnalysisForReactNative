package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwqf  reason: default package */
/* loaded from: classes4.dex */
public class bwqf implements bwol {
    private final dzsj<byej> a;
    private final Context b;

    public bwqf(dzsj<byej> dzsjVar, Context context) {
        this.a = dzsjVar;
        this.b = context;
    }

    @Override // defpackage.bwol
    public cqkl a() {
        this.a.a().j(false, null);
        return cqkl.a;
    }

    @Override // defpackage.bwol
    public String b() {
        return this.b.getString(R.string.TRAFFIC_HUB_LAUNCHER_TEXT);
    }
}
