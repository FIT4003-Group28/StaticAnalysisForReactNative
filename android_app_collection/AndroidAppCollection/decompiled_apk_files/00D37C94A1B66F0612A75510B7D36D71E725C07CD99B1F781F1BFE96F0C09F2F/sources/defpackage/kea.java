package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kea  reason: default package */
/* loaded from: classes3.dex */
public final class kea {
    public final int a;
    public final ControlsState b;
    public final ggt c;
    public final ezx d;
    public final keb e;
    public final ControlsOverlayStyle f;
    private final String g;

    public kea() {
    }

    public kea(int i, ControlsState controlsState, ggt ggtVar, ezx ezxVar, String str, keb kebVar, ControlsOverlayStyle controlsOverlayStyle) {
        this.a = i;
        this.b = controlsState;
        this.c = ggtVar;
        this.d = ezxVar;
        this.g = str;
        this.e = kebVar;
        this.f = controlsOverlayStyle;
    }

    public static kdz a() {
        kdz kdzVar = new kdz();
        kdzVar.c = ezx.NONE;
        kdzVar.a = ControlsState.b();
        kdzVar.b(0);
        kdzVar.d = null;
        kdzVar.b = null;
        kdzVar.e = keb.a(0L, 0L, 0L, 0L);
        kdzVar.f = null;
        return kdzVar;
    }

    public final kdz b() {
        kdz kdzVar = new kdz();
        kdzVar.c = this.d;
        kdzVar.e = this.e;
        kdzVar.b(this.a);
        kdzVar.b = this.c;
        kdzVar.d = this.g;
        kdzVar.a = this.b;
        kdzVar.f = this.f;
        return kdzVar;
    }

    public final ampq c() {
        ggt ggtVar = this.c;
        return ggtVar == null ? amon.a : ampq.j(ggtVar.a().c);
    }

    public final ampq d() {
        ggt ggtVar = this.c;
        return ggtVar == null ? amon.a : ampq.j(ggtVar.a().d);
    }

    public final boolean equals(Object obj) {
        ControlsState controlsState;
        ggt ggtVar;
        ezx ezxVar;
        String str;
        keb kebVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kea) {
            kea keaVar = (kea) obj;
            if (this.a == keaVar.a && ((controlsState = this.b) != null ? controlsState.equals(keaVar.b) : keaVar.b == null) && ((ggtVar = this.c) != null ? ggtVar.equals(keaVar.c) : keaVar.c == null) && ((ezxVar = this.d) != null ? ezxVar.equals(keaVar.d) : keaVar.d == null) && ((str = this.g) != null ? str.equals(keaVar.g) : keaVar.g == null) && ((kebVar = this.e) != null ? kebVar.equals(keaVar.e) : keaVar.e == null)) {
                ControlsOverlayStyle controlsOverlayStyle = this.f;
                ControlsOverlayStyle controlsOverlayStyle2 = keaVar.f;
                if (controlsOverlayStyle != null ? controlsOverlayStyle.equals(controlsOverlayStyle2) : controlsOverlayStyle2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        ControlsState controlsState = this.b;
        int i2 = 0;
        int hashCode = (i ^ (controlsState == null ? 0 : controlsState.hashCode())) * 1000003;
        ggt ggtVar = this.c;
        int hashCode2 = (hashCode ^ (ggtVar == null ? 0 : ggtVar.hashCode())) * 1000003;
        ezx ezxVar = this.d;
        int hashCode3 = (hashCode2 ^ (ezxVar == null ? 0 : ezxVar.hashCode())) * 1000003;
        String str = this.g;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        keb kebVar = this.e;
        int hashCode5 = (hashCode4 ^ (kebVar == null ? 0 : kebVar.hashCode())) * 1000003;
        ControlsOverlayStyle controlsOverlayStyle = this.f;
        if (controlsOverlayStyle != null) {
            i2 = controlsOverlayStyle.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str = this.g;
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 143 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Model{inlinePlaybackState=");
        sb.append(i);
        sb.append(", controlsState=");
        sb.append(valueOf);
        sb.append(", currentInlineVideo=");
        sb.append(valueOf2);
        sb.append(", playerViewMode=");
        sb.append(valueOf3);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", videoTimes=");
        sb.append(valueOf4);
        sb.append(", controlsOverlayStyle=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
