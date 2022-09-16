package defpackage;

import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: ipq  reason: default package */
/* loaded from: classes3.dex */
final class ipq {
    public final Object a;
    public final Object b;
    public final PaneBackStack c;
    public final Fragment$SavedState d;
    public final Fragment$SavedState e;
    public final PaneDescriptor f;
    public final boolean g;
    public final boolean h;

    public ipq() {
    }

    public ipq(Object obj, Object obj2, PaneBackStack paneBackStack, Fragment$SavedState fragment$SavedState, Fragment$SavedState fragment$SavedState2, PaneDescriptor paneDescriptor, boolean z, boolean z2) {
        this.a = obj;
        this.b = obj2;
        this.c = paneBackStack;
        this.d = fragment$SavedState;
        this.e = fragment$SavedState2;
        this.f = paneDescriptor;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipq) {
            ipq ipqVar = (ipq) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(ipqVar.a) : ipqVar.a == null) {
                Object obj3 = this.b;
                if (obj3 != null ? obj3.equals(ipqVar.b) : ipqVar.b == null) {
                    PaneBackStack paneBackStack = this.c;
                    if (paneBackStack != null ? paneBackStack.equals(ipqVar.c) : ipqVar.c == null) {
                        Fragment$SavedState fragment$SavedState = this.d;
                        if (fragment$SavedState != null ? fragment$SavedState.equals(ipqVar.d) : ipqVar.d == null) {
                            Fragment$SavedState fragment$SavedState2 = this.e;
                            if (fragment$SavedState2 != null ? fragment$SavedState2.equals(ipqVar.e) : ipqVar.e == null) {
                                PaneDescriptor paneDescriptor = this.f;
                                if (paneDescriptor != null ? paneDescriptor.equals(ipqVar.f) : ipqVar.f == null) {
                                    if (this.g == ipqVar.g && this.h == ipqVar.h) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) ^ (-721379959)) * 1000003;
        Object obj2 = this.b;
        int hashCode2 = (hashCode ^ (obj2 == null ? 0 : obj2.hashCode())) * 1000003;
        PaneBackStack paneBackStack = this.c;
        int hashCode3 = (hashCode2 ^ (paneBackStack == null ? 0 : paneBackStack.hashCode())) * 1000003;
        Fragment$SavedState fragment$SavedState = this.d;
        int hashCode4 = (hashCode3 ^ (fragment$SavedState == null ? 0 : fragment$SavedState.hashCode())) * 1000003;
        Fragment$SavedState fragment$SavedState2 = this.e;
        int hashCode5 = (hashCode4 ^ (fragment$SavedState2 == null ? 0 : fragment$SavedState2.hashCode())) * 1000003;
        PaneDescriptor paneDescriptor = this.f;
        if (paneDescriptor != null) {
            i = paneDescriptor.hashCode();
        }
        int i2 = 1237;
        int i3 = (((hashCode5 ^ i) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        boolean z = this.g;
        boolean z2 = this.h;
        int length = "null".length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 186 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("RetainedState{superState=");
        sb.append("null");
        sb.append(", masterState=");
        sb.append(valueOf);
        sb.append(", detailState=");
        sb.append(valueOf2);
        sb.append(", detailBackStack=");
        sb.append(valueOf3);
        sb.append(", masterSavedState=");
        sb.append(valueOf4);
        sb.append(", detailSavedState=");
        sb.append(valueOf5);
        sb.append(", detailRetainedDescriptor=");
        sb.append(valueOf6);
        sb.append(", showingDetail=");
        sb.append(z);
        sb.append(", startedInOfflineMode=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
