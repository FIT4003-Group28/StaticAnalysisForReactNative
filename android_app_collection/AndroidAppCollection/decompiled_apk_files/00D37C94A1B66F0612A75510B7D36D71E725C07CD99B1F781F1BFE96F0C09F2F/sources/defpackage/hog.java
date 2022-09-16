package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
/* compiled from: PG */
/* renamed from: hog  reason: default package */
/* loaded from: classes3.dex */
public final class hog {
    public View a;
    public Resources b;
    public hof c;
    public RecordingInfo d;
    public Boolean e;
    public Boolean f;
    public acti g;
    public dt h;
    private Boolean i;

    public final void b(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final hoh a() {
        Resources resources;
        hof hofVar;
        RecordingInfo recordingInfo;
        Boolean bool;
        View view = this.a;
        if (view == null || (resources = this.b) == null || (hofVar = this.c) == null || (recordingInfo = this.d) == null || (bool = this.e) == null || this.i == null || this.f == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" root");
            }
            if (this.b == null) {
                sb.append(" resources");
            }
            if (this.c == null) {
                sb.append(" reelEditTopBarCallback");
            }
            if (this.d == null) {
                sb.append(" recordingInfo");
            }
            if (this.e == null) {
                sb.append(" isTextEnabled");
            }
            if (this.i == null) {
                sb.append(" isTrimEnabled");
            }
            if (this.f == null) {
                sb.append(" isSaveEnabled");
            }
            if (this.g == null) {
                sb.append(" interactionLogger");
            }
            if (this.h == null) {
                sb.append(" fragmentActivity");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hoh(view, resources, hofVar, recordingInfo, bool.booleanValue(), this.i.booleanValue(), this.f.booleanValue(), this.g, this.h);
    }
}
