package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
/* compiled from: PG */
/* renamed from: hoh  reason: default package */
/* loaded from: classes3.dex */
public final class hoh {
    public final View a;
    public final Resources b;
    public final hof c;
    public final RecordingInfo d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final acti h;
    public final dt i;

    public hoh() {
    }

    public hoh(View view, Resources resources, hof hofVar, RecordingInfo recordingInfo, boolean z, boolean z2, boolean z3, acti actiVar, dt dtVar) {
        this.a = view;
        this.b = resources;
        this.c = hofVar;
        this.d = recordingInfo;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = actiVar;
        this.i = dtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hoh) {
            hoh hohVar = (hoh) obj;
            if (this.a.equals(hohVar.a) && this.b.equals(hohVar.b) && this.c.equals(hohVar.c) && this.d.equals(hohVar.d) && this.e == hohVar.e && this.f == hohVar.f && this.g == hohVar.g && this.h.equals(hohVar.h) && this.i.equals(hohVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 176 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("SetupParameter{root=");
        sb.append(valueOf);
        sb.append(", resources=");
        sb.append(valueOf2);
        sb.append(", reelEditTopBarCallback=");
        sb.append(valueOf3);
        sb.append(", recordingInfo=");
        sb.append(valueOf4);
        sb.append(", isTextEnabled=");
        sb.append(z);
        sb.append(", isTrimEnabled=");
        sb.append(z2);
        sb.append(", isSaveEnabled=");
        sb.append(z3);
        sb.append(", interactionLogger=");
        sb.append(valueOf5);
        sb.append(", fragmentActivity=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
