package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kdz  reason: default package */
/* loaded from: classes3.dex */
public final class kdz {
    public ControlsState a;
    public ggt b;
    public ezx c;
    public String d;
    public keb e;
    public ControlsOverlayStyle f;
    private Integer g;

    public final kea a() {
        Integer num = this.g;
        if (num == null) {
            throw new IllegalStateException("Missing required properties: inlinePlaybackState");
        }
        return new kea(num.intValue(), this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }
}
