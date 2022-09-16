package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
/* compiled from: PG */
/* renamed from: ahqx  reason: default package */
/* loaded from: classes.dex */
public final class ahqx implements View.OnClickListener, ahqw {
    public ahqv a;
    private final TouchImageView b;

    public ahqx(TouchImageView touchImageView) {
        this.b = touchImageView;
        touchImageView.setOnClickListener(this);
    }

    @Override // defpackage.ahqw
    public final void a(boolean z) {
        zag.o(this.b, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ahqv ahqvVar = this.a;
        if (ahqvVar != null) {
            ahqvVar.c();
        }
    }
}
