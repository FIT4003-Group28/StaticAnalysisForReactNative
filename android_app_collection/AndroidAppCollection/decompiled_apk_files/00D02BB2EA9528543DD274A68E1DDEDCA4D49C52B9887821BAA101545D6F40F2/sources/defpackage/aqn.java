package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqn  reason: default package */
/* loaded from: classes2.dex */
public final class aqn {
    final Bundle a;
    List<String> b;
    List<IntentFilter> c;

    public aqn(Bundle bundle) {
        this.a = bundle;
    }

    public static aqn u(Bundle bundle) {
        if (bundle != null) {
            return new aqn(bundle);
        }
        return null;
    }

    public final String a() {
        return this.a.getString("id");
    }

    public final List<String> b() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
        return this.b;
    }

    public final String c() {
        return this.a.getString("name");
    }

    public final String d() {
        return this.a.getString("status");
    }

    public final Uri e() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final boolean f() {
        return this.a.getBoolean("enabled", true);
    }

    public final int g() {
        return this.a.getInt("connectionState", 0);
    }

    public final boolean h() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final IntentSender i() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public final List<IntentFilter> j() {
        k();
        return this.c;
    }

    final void k() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("controlFilters");
            this.c = parcelableArrayList;
            if (parcelableArrayList != null) {
                return;
            }
            this.c = Collections.emptyList();
        }
    }

    public final int l() {
        return this.a.getInt("playbackType", 1);
    }

    public final int m() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int n() {
        return this.a.getInt("deviceType");
    }

    public final int o() {
        return this.a.getInt("volume");
    }

    public final int p() {
        return this.a.getInt("volumeMax");
    }

    public final int q() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int r() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final Bundle s() {
        return this.a.getBundle("extras");
    }

    public final boolean t() {
        k();
        return !TextUtils.isEmpty(a()) && !TextUtils.isEmpty(c()) && !this.c.contains(null);
    }

    public final String toString() {
        return "MediaRouteDescriptor{ id=" + a() + ", groupMemberIds=" + b() + ", name=" + c() + ", description=" + d() + ", iconUri=" + e() + ", isEnabled=" + f() + ", connectionState=" + g() + ", controlFilters=" + Arrays.toString(j().toArray()) + ", playbackType=" + l() + ", playbackStream=" + m() + ", deviceType=" + n() + ", volume=" + o() + ", volumeMax=" + p() + ", volumeHandling=" + q() + ", presentationDisplayId=" + r() + ", extras=" + s() + ", isValid=" + t() + ", minClientVersion=" + this.a.getInt("minClientVersion", 1) + ", maxClientVersion=" + this.a.getInt("maxClientVersion", Integer.MAX_VALUE) + " }";
    }
}
