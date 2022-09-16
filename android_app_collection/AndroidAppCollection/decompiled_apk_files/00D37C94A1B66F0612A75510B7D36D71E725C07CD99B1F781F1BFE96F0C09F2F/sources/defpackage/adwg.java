package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: adwg  reason: default package */
/* loaded from: classes.dex */
public final class adwg {
    public PlayerResponseModel a;
    private int b;

    public adwg() {
    }

    public adwg(adwh adwhVar) {
        this.b = adwhVar.b;
        this.a = adwhVar.a;
    }

    public final adwh a() {
        int i = this.b;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: autonavMode");
        }
        return new adwh(i, this.a);
    }

    public final void b(int i) {
        if (i != 0) {
            this.b = i;
            return;
        }
        throw new NullPointerException("Null autonavMode");
    }
}
