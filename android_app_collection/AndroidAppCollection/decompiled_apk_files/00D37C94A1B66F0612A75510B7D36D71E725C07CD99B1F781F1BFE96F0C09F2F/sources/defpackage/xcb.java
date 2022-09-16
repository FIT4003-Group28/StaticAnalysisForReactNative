package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: xcb  reason: default package */
/* loaded from: classes4.dex */
public final class xcb {
    public static final xcb a = b("", null, false);
    public final xdi b;
    public final wzw c;

    public xcb() {
    }

    public xcb(xdi xdiVar, wzw wzwVar) {
        this.b = xdiVar;
        this.c = wzwVar;
    }

    public static xcb a(String str, PlayerResponseModel playerResponseModel) {
        return new xcb(c(str, playerResponseModel, false), wzw.a());
    }

    public static xcb b(String str, PlayerResponseModel playerResponseModel, boolean z) {
        return new xcb(c(str, playerResponseModel, z), wzw.a());
    }

    public static xdi c(String str, PlayerResponseModel playerResponseModel, boolean z) {
        String str2 = "";
        if (true == TextUtils.isEmpty(str)) {
            str = str2;
        }
        boolean z2 = false;
        boolean z3 = playerResponseModel != null && playerResponseModel.F();
        if (playerResponseModel != null && playerResponseModel.E()) {
            z2 = true;
        }
        if (true != TextUtils.isEmpty(str)) {
            str2 = str;
        }
        return new xdi(str2, z3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xcb) {
            xcb xcbVar = (xcb) obj;
            if (this.b.equals(xcbVar.b) && this.c.equals(xcbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("ExternalContextModel{organicPlaybackContext=");
        sb.append(valueOf);
        sb.append(", adVideoPlaybackContext=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
