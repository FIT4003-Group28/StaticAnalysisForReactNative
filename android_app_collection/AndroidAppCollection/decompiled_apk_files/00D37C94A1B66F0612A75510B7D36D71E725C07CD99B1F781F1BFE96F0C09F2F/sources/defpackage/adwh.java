package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: adwh  reason: default package */
/* loaded from: classes.dex */
public final class adwh {
    public final PlayerResponseModel a;
    public final int b;

    public adwh() {
    }

    public adwh(int i, PlayerResponseModel playerResponseModel) {
        this.b = i;
        this.a = playerResponseModel;
    }

    public final adwg a() {
        return new adwg(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adwh)) {
            return false;
        }
        adwh adwhVar = (adwh) obj;
        int i = this.b;
        int i2 = adwhVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            PlayerResponseModel playerResponseModel = this.a;
            PlayerResponseModel playerResponseModel2 = adwhVar.a;
            if (playerResponseModel != null ? playerResponseModel.equals(playerResponseModel2) : playerResponseModel2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            int i2 = (i ^ 1000003) * 1000003;
            PlayerResponseModel playerResponseModel = this.a;
            return i2 ^ (playerResponseModel == null ? 0 : playerResponseModel.hashCode());
        }
        throw null;
    }

    public final String toString() {
        String c = adih.c(this.b);
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(c.length() + 41 + String.valueOf(valueOf).length());
        sb.append("MdxAutonavState{autonavMode=");
        sb.append(c);
        sb.append(", nextVideo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
