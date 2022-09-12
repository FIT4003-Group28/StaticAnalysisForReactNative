package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byjs  reason: default package */
/* loaded from: classes4.dex */
public class byjs implements byij {
    private final Context a;
    private final ros b;

    public byjs(Activity activity, ros rosVar) {
        this.a = activity;
        this.b = rosVar;
    }

    @Override // defpackage.byij
    public String a() {
        return this.a.getString(R.string.TRAFFIC_HUB_SET_UP_COMMUTE_CARD_TITLE);
    }

    @Override // defpackage.byij
    public String b() {
        return this.a.getString(R.string.TRAFFIC_HUB_SET_UP_COMMUTE_CARD_SUBTITLE);
    }

    @Override // defpackage.byij
    public String c() {
        return this.a.getString(R.string.TRAFFIC_HUB_SET_UP_COMMUTE_CARD_BUTTON_TEXT);
    }

    @Override // defpackage.byij
    public cqkl d() {
        this.b.m();
        return cqkl.a;
    }
}
