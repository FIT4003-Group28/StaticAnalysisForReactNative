package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends ahyf implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b a;
    public boolean b;
    private TextView d;
    private boolean e;

    public f(Context context) {
        super(context);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        e eVar = new e(this, context);
        eVar.setBackgroundColor(-16777216);
        LayoutInflater.from(context).inflate(R.layout.embed_host_app_verification_service_error_overlay, eVar);
        this.d = (TextView) eVar.findViewById(R.id.embed_host_app_verification_error_text_view);
        return eVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        if (!aa(1) || !nI()) {
            return;
        }
        this.d.setText(true != this.b ? R.string.non_retriable_host_app_verification_service_error_message : R.string.retriable_host_app_verification_service_error_message);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void g() {
        this.e = false;
        W();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void l(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void m(boolean z) {
        this.b = z;
        this.e = true;
        Y(1);
        Z();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.e;
    }
}
